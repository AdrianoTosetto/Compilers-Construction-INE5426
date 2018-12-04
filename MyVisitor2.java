//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.*;

import com.sun.javafx.collections.MappingChange.Map;

import jdk.internal.org.objectweb.asm.Type;
import sun.text.normalizer.SymbolTable;

public class MyVisitor2 extends CaronteBaseVisitor {
    public ParseTreeProperty<String> productionNames = new ParseTreeProperty<>();
    public ParseTreeProperty<String> types = new ParseTreeProperty<>();
    public ParseTreeProperty<Boolean> isBreakable = new ParseTreeProperty<>();
    public ParseTreeProperty<ArrayList<Symbol>> scope = new ParseTreeProperty<>();
    public ArrayList<String> expressionStack = new ArrayList<>();
    public int labelCount = 0;
    public int variableCount = 1;
    HashMap<String, Integer> variablesHashMap = new HashMap<String, Integer>();

    ArrayList<Symbol> symbolTable = new ArrayList<Symbol>();
    
    String code = 	".class public GlobalClass\n"+
    				".super java/lang/Object\n" +
    				".method <init>()V\n"+
    				".limit stack 1\n"+
    				".limit locals 1\n"+
    				".var 0 is this LGlobalClass; from Label0 to Label1\n"+
    				"Label0:\n"+
    				".line 1\n"+
    				"aload_0\n"+
    				"invokespecial java/lang/Object/<init>()V\n"+
    				"Label1:\n"+
    				"return\n"+
    				".end method\n";

    
    public enum Errors{
    		FUNCTION_NOT_DECLARED,
    		VARIABLE_NOT_DECLARED,
    		STRUCT_NOT_DECLARED,
    		FUNCTION_RETURN_TYPE_NOT_APPROPRIATE_FOR_EXPRESSION,
    		SYMBOL_WAS_NOT_DECLARED
    }
    
    @Override
    public Object visitInicio(CaronteParser.InicioContext ctx) {
    	isBreakable.put(ctx, false);
    	productionNames.put(ctx,"inicio");
    	
    	ArrayList<ParseTree> allNodes = new ArrayList<>();
    	allNodes.add(ctx);
    	
    	
    	while (!allNodes.isEmpty()) {
    		ParseTree nextNode = allNodes.remove(0);
    		isBreakable.put(nextNode, false);
    		for (int i = 0; i < nextNode.getChildCount(); i++) {
        		allNodes.add(nextNode.getChild(i));
        	}
    	}
    	
    	return visitChildren(ctx);
    }

    @Override
    public Object visitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx) {
    	String functionName = ctx.getChild(0).getText();
    	
    	if (functionName.equals("print")) {
    		this.code += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
    		visitChildren(ctx);
    		this.code += "invokevirtual java/io/PrintStream/println(I)V\n";
    	} else {
    		this.code += "aload 0\n";
    		visitChildren(ctx);
    		this.code += "invokevirtual GlobalClass/"+functionName+"(I)I\n";
    	}
    	ParseTree funcParams = ctx.getChild(2);
    	ArrayList<Integer> sizes = new ArrayList<Integer>();
    	ArrayList<String> types = new ArrayList<String>();
    	//System.out.println(ctx.Nome());
    	int i = 0;
    	while(true) {
    		try {
    			String paramName = funcParams.getChild(i).getText();
    			String paramType = Utils.getTypeValue(funcParams.getChild(i).getText());
    			
    			// its an expression
    			//System.out.println(paramType);
    			if (paramType.equals("Unknown")) {
    				ArrayList<String> tokens = 
    						(ArrayList<String>) (Utils.splitExpressionIntoTokens(paramName));
    				i+=2;
    			} else {
	    			int size = 1;
	    			sizes.add(size);
	    			types.add(paramType);
	    			//System.out.println(paramType);
	    			i+=2;
    			}
    		}catch(Exception e) {
    			break;
    		}
    	}
    	if(!functionDeclared(functionName, types, sizes)) {
    		System.out.println("A função com essa assinatura não foi declarada");
    		//System.exit(0);
    	}
    	//visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitWhile(CaronteParser.WhileContext ctx) {
    	int whileLabel = this.labelCount;
    	this.code += "Label" + this.labelCount++ + ":\n";
    	if (ctx.getChild(1).getClass() == CaronteParser.BinExpContext.class) {
    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.UnariaExpContext.class) {
    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.ExpValuesContext.class) {
    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.ExpPrefixContext.class) {
    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(1));
    	} else {
    		visitChildren((RuleNode)ctx.getChild(1));
    	}
    	int nextLabel = this.labelCount;
    	this.code += "ifeq Label" + this.labelCount++ + "\n";
    	if (ctx.getChild(3).getClass() == CaronteParser.BinExpContext.class) {
    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.UnariaExpContext.class) {
    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.ExpValuesContext.class) {
    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.ExpPrefixContext.class) {
    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(3));
    	} else {
    		visitChildren((RuleNode)ctx.getChild(3));
    	}
    	this.code += "goto Label" + whileLabel + "\nLabel" + nextLabel + ":\n";
    	return null;
    }
    
    @Override
    public Object visitIf(CaronteParser.IfContext ctx) {
    	//visitChildren((CaronteParser.ExpContext) ctx.getChild(1));
    	if (ctx.getChild(1).getClass() == CaronteParser.BinExpContext.class) {
    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.UnariaExpContext.class) {
    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.ExpValuesContext.class) {
    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.ExpPrefixContext.class) {
    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(1));
    	} else {
    		visitChildren((RuleNode)ctx.getChild(1));
    	}
    	//visitChildren(ctx);
//    	System.out.println(ctx.getChild(1).getChild(2).getText());
    	if(Utils.isVar(ctx.getChild(1).getText())) {
    		System.out.println("uma variavel");
    	}
    	int nextLabel = this.labelCount;
    	this.code += "ifeq Label" + this.labelCount++ + "\n";
    	if (ctx.getChild(3).getClass() == CaronteParser.BinExpContext.class) {
    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.UnariaExpContext.class) {
    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.ExpValuesContext.class) {
    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.ExpPrefixContext.class) {
    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(3));
    	} else {
    		visitChildren((RuleNode)ctx.getChild(3));
    	}
    	int afterLabel = this.labelCount;
    	this.code += "goto Label" + this.labelCount++ + "\n";
    	this.code += "Label" + nextLabel + ":\n";
    	for (int i = 4; !ctx.getChild(i).getText().equals("end"); i+=2) {
    		if (ctx.getChild(i).getText().equals("then")) continue;
    		if (ctx.getChild(i).getText().equals("elseif")) {
    			System.out.println(ctx.getChild(i).getText());
    			if (ctx.getChild(i+1).getClass() == CaronteParser.BinExpContext.class) {
    	    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(i+1));
    	    	} else if (ctx.getChild(i+1).getClass() == CaronteParser.UnariaExpContext.class) {
    	    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(i+1));
    	    	} else if (ctx.getChild(i+1).getClass() == CaronteParser.ExpValuesContext.class) {
    	    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(i+1));
    	    	} else if (ctx.getChild(i+1).getClass() == CaronteParser.ExpPrefixContext.class) {
    	    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(i+1));
    	    	} else {
    	    		visitChildren((RuleNode)ctx.getChild(i+1));
    	    	}
    	    	nextLabel = this.labelCount;
    	    	this.code += "ifeq Label" + this.labelCount++ + "\n";
    	    	if (ctx.getChild(i+3).getClass() == CaronteParser.BinExpContext.class) {
    	    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(i+3));
    	    	} else if (ctx.getChild(i+3).getClass() == CaronteParser.UnariaExpContext.class) {
    	    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(i+3));
    	    	} else if (ctx.getChild(i+3).getClass() == CaronteParser.ExpValuesContext.class) {
    	    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(i+3));
    	    	} else if (ctx.getChild(i+3).getClass() == CaronteParser.ExpPrefixContext.class) {
    	    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(i+3));
    	    	} else {
    	    		visitChildren((RuleNode)ctx.getChild(i+3));
    	    	}
    	    	this.code += "goto Label" + afterLabel + "\n";
    	    	this.code += "Label" + nextLabel + ":\n";
    		} else {
    			if (ctx.getChild(i+1).getClass() == CaronteParser.BinExpContext.class) {
    	    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(i+1));
    	    	} else if (ctx.getChild(i+1).getClass() == CaronteParser.UnariaExpContext.class) {
    	    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(i+1));
    	    	} else if (ctx.getChild(i+1).getClass() == CaronteParser.ExpValuesContext.class) {
    	    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(i+1));
    	    	} else if (ctx.getChild(i+1).getClass() == CaronteParser.ExpPrefixContext.class) {
    	    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(i+1));
    	    	} else {
    	    		visitChildren((RuleNode)ctx.getChild(i+1));
    	    	}
    		}
    	}
    	this.code += "Label"+afterLabel+":\n";
    	return null;
    }
    
    @Override
    public Object visitFor(CaronteParser.ForContext ctx) {
    	System.out.println(ctx.getChild(4).getClass());
    	visitBinExp((CaronteParser.BinExpContext) ctx.getChild(4));
    	String varName = ctx.getChild(2).getText();
    	
    	this.code += "istore "+this.variableCount+"\n";
    	this.variablesHashMap.put(varName, this.variableCount);
    	this.variableCount++;
    	
    	int whileLabel = this.labelCount;
    	this.code += "Label" + this.labelCount++ + ":\n";
    	visitBinExp((CaronteParser.BinExpContext) ctx.getChild(6));
    	int nextLabel = this.labelCount;
    	this.code += "ifeq Label" + this.labelCount++ + "\n";
    	visitChildren((RuleNode) ctx.getChild(10));
    	visitChildren((RuleNode) ctx.getChild(8));
    	this.code += "goto Label" + whileLabel + "\nLabel" + nextLabel + ":\n";
    	
    	if(ctx.getChild(6).getClass() == CaronteParser.BinExpContext.class) {
    		
    	}
    	// 'for' ((tipovar | 'auto') Nome '=' exp)? ':' (exp)? ':' (comandounico)? 'do' trecho 'end'
//    	int forLabel = this.labelCount;
//    	this.code += "Label" + this.labelCount++ + ":\n";
//    	visitChildren((RuleNode) ctx.getChild(1));
//    	int nextLabel = this.labelCount;
//    	this.code += "ifeq Label" + this.labelCount++ + "\n";
//    	visitChildren((RuleNode) ctx.getChild(3));
//    	this.code += "goto Label" + forLabel + "\nLabel" + nextLabel + ":\n";
    	return null;
    }
    
    @Override
    public Object visitTypedDeclaration(CaronteParser.TypedDeclarationContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	
        String varType = ctx.getChild(0).getText();
        
        String varValue;
        if (ctx.getChildCount() >= 3) {
        	ctx.getChild(3).getText();
        }
//        visitChildren(ctx);
        
        switch(varType) {

            case "boolean":
            	if (ctx.getChildCount() < 3) {
            		String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "bool", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                	currentScope.add(vs);
            	} else if (types.get(ctx.getChild(3)).equals("bool")) {
            		String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "bool", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                	currentScope.add(vs);
            	} else {
            		System.out.println("A variável ``" + ctx.getChild(1).getText() + "`` não pode ser inicializada"+
      					   " com valores do tipo " + types.get(ctx.getChild(3)) + ". Deveria ser boolean."+
      					   " Linha do erro: " + ctx.getStart().getLine());
            		//System.exit(0);
            	}
            break;
            case "int":
            	String varName = ctx.getChild(1).getText();
            	variablesHashMap.put(varName, variableCount);
            	this.code += "istore " + variableCount + "\n";
            	variableCount++;
            	
            break;

            case "double":
            break;

            case "float":

            break;

            case "string":
            break;
            
            case "array":
            	System.out.println("skj");
            	System.out.println(ctx.getChild(0).getText());
            break;

            // this is the case of user types variables, like structs
            default:
            	String structType = ctx.getChild(0).getText();
            	String strctVarName = ctx.getChild(1).getText();
            	
            	//System.out.println("strctVarName "+ strctVarName);
            	/*
            	 * tipo não foi declarado
            	 * */
            	Symbol temp = getSymbol(structType, Symbol.Types.STRUCT_DEFINITION, currentScope);
            	if(temp == null) {
            		System.out.println("essa struct não foi definida");
            		//System.exit(0);
            	} else {
            		if (ctx.getChildCount() < 3) {
                		StructSymbol ss = new StructSymbol(strctVarName, ((StructDefinitionSymbol) temp).getFields());
                    	ss.setStructDefName(structType);
                    	symbolTable.add(ss);
                    	currentScope.add(ss);
                    	break;
                	}
            		
            		//System.out.println(temp);
            		for (Symbol f: ((StructDefinitionSymbol) temp).getFields()) {
            			if(f.t == Symbol.Types.STRUCT_VARIABLE) {
            				//System.out.println("====================================");
            				//System.out.println(((StructSymbol) f).getFields().get(0));
            				//System.out.println(((StructSymbol) f).getFields().get(1));
            				//System.out.println("====================================");
            			}
            		}
            		ParseTree initParamsStruct = ctx.getChild(3).getChild(1);
            		ArrayList<Symbol> fields = ((StructDefinitionSymbol) temp).getFields();
            		int fieldsSize = fields.size();
            		int initParamsSize = initParamsStruct.getChildCount();
            		
            		//System.out.println(initParamsSize);
            		if(fieldsSize != initParamsSize) {
            			//System.out.println(initParamsSize);
            			//System.out.println(fieldsSize);
            			System.out.println("Número de campos não corresponde");
            			//System.exit(0);
            		}
            		for (int i = 0, j = 0; i < fieldsSize && j < initParamsSize; i++, j+=2) {
            			switch (fields.get(i).t) {
            			
						case VARIABLE: {
							if(Utils.isVar(initParamsStruct.getChild(j).getText())) {
								Symbol s = getSymbol(initParamsStruct.getChild(j).getText(), Symbol.Types.VARIABLE, currentScope);
								if(s == null) {
									//System.out.println(initParamsStruct.getChild(j).getText());
									System.out.println("Variável usada na inicialização da estrutura não foi declarada");
									//System.exit(0);
									break;
								} else {
									System.out.println("====" + ((VariableSymbol) s).getVarType());
									if(!((VariableSymbol) s).getVarType().equals(((VariableSymbol)fields.get(i)).getVarType())) {
										System.out.println("Variável não tem o seu tipo compativel com o campo da estrutura sendo inicializado");
										//System.exit(0);
										break;
									}
								}
							}
							String errorMessage = "";
							if(!Utils.getTypeValue(initParamsStruct.getChild(j).getText()).equals(((VariableSymbol)fields.get(i)).getVarType()))	
								errorMessage = "Era esperado o tipo " + ((VariableSymbol)fields.get(i)).getVarType();
								errorMessage = errorMessage+ " mas se obteve " + Utils.getTypeValue(initParamsStruct.getChild(j).getText());
								
								System.out.println(errorMessage);
								System.out.println(initParamsStruct.getChild(j).getText());
								errorMessage = "";
							break;
						}
						default:
							break;
						}
            		}
            	}
            	StructSymbol ss = new StructSymbol(strctVarName, ((StructDefinitionSymbol) temp).getFields());
            	ss.setStructDefName(structType);
            	//System.out.println("------------------");
            	//System.out.println(((VariableSymbol)ss.getFields().get(1)).getVarType());
            	//System.out.println("------------------");
            	symbolTable.add(ss);
            	currentScope.add(ss);
            break;
        }

        parentScope.addAll(currentScope);
        scope.put(ctx.getParent(), parentScope);
        scope.put(ctx, currentScope);
//        return visitChildren(ctx);
        return null;
    }
    @Override
    public Object visitArrayDeclaration(CaronteParser.ArrayDeclarationContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	
    	String typeArray = ctx.getChild(1).getText();
    	String nameArray = ctx.getChild(2).getText();
    	
    	int arraySize = Integer.parseInt(ctx.getChild(4).getText());
    	System.out.println(typeArray);
    	System.out.println(nameArray);
    	VariableSymbol varSym = new VariableSymbol(nameArray, typeArray, arraySize);
    	varSym.t = Symbol.Types.VARIABLE;
    	symbolTable.add(varSym);
    	currentScope.add(varSym);
    	int initSize = ctx.getChild(7).getChildCount();
    	String temp[] = ctx.getChild(7).getText().substring(1, ctx.getChild(7).getText().length()-3).split(",");
    	if(temp.length+1 != arraySize) {
    		System.out.println("Inicialize o array com o número de elementos corretos");
    		//System.exit(0);
    	}
    	
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	scope.put(ctx, currentScope);
    	
//    	return visitChildren(ctx);
    	return null;
    }
    /*
     * token is structVar.field1.field2...fieldN
     * The function check if field1, field2, fieldN exists
     * */
    public boolean fieldAccessInStructIsLegal(String token) {
    	String[] fields = token.split(".");
    	for(int i = 0; i < fields.length; i++) {
    		
    	}
    	return false;
    }
    
    public String checkFieldType(String structToken, ArrayList<Symbol> currentScope) {
    	String[] accessLine = structToken.split("\\.");
    	System.out.println(Arrays.asList(accessLine));
    	StructSymbol ss = (StructSymbol) getSymbol(accessLine[0], Symbol.Types.STRUCT_VARIABLE, currentScope);
    	ArrayList<Symbol> fields = ss.getFields();
    	for(int i = 1; i < accessLine.length; i++) {
    		if(i == accessLine.length-1) {
    			
    		}
    	}
    	
    	return null;
    }
    
    public Symbol getSymbol(String symbolName, Symbol.Types t, ArrayList<Symbol> symbolTable) {
    	for (Symbol e: this.symbolTable) {
    		if(e.name.equals(symbolName) && e.t == t) {
    			return e;
    		}
    	}
    	return null;
    }

    public boolean symbolExists(String symbolName) {
    	
    	return false;
    }
    @Override
    public Object visitStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	
    	String structName = ctx.getChild(1).getText();
    	for (int i = 0; i < symbolTable.size(); i++) {
    		if(symbolTable.get(i).t == Symbol.Types.STRUCT_DEFINITION) {
    			if(symbolTable.get(i).name.equals(structName)) {
    				System.out.println("struct redefinida");
//    				return visitChildren(ctx);
    				return null;
    			}
    		}
    	}
    	int i = 3; // index of the first field
    	ArrayList<Symbol> fields = new ArrayList<Symbol>();
    	while(true) {
    		try {
    			String fieldinfo0 = ctx.getChild(i).getText();
    			Symbol field;
    			if(fieldinfo0.equals("array")) {
    				String fieldType = ctx.getChild(i+1).getText();
    				String fieldName = ctx.getChild(i+2).getText();
    				int fieldSize = Integer.parseInt(ctx.getChild(i+4).getText());
    				int size = Integer.parseInt(ctx.getChild(i+4).getText());
    				i+=7;
    				
    				switch (fieldType) {
						case "int":
							field = new VariableSymbol(fieldName, "int",size);
							field.t = Symbol.Types.VARIABLE;
						break;
						case "string":
							field = new VariableSymbol(fieldName,"string",size);
							field.t = Symbol.Types.VARIABLE;
						break;
						default:
							//System.out.println(fieldName);
							ArrayList<Symbol> innerFields = new ArrayList<Symbol>();
					    	for (int j = 0; j < symbolTable.size(); j++) {
					    		if(symbolTable.get(j).t == Symbol.Types.STRUCT_DEFINITION) {
					    			if(symbolTable.get(j).name.equals(fieldType)) {
					    				StructDefinitionSymbol temp = (StructDefinitionSymbol) symbolTable.get(j);
					    				innerFields = temp.getFields();
					    			}
					    		}
					    	}
					    	StructSymbol ss = new StructSymbol(fieldName,innerFields);
					    	ss.setStructDefName(fieldType);
							ss.t = Symbol.Types.STRUCT_VARIABLE;
							ss.setSize(fieldSize);
							field = ss;
							
						break;
					}
    				
    			} else {
    				String fieldType = fieldinfo0;
    				String fieldName = ctx.getChild(i+1).getText();
    				switch (fieldType) {
						case "int":
							field = new VariableSymbol(fieldName, "int",1);
							field.t = Symbol.Types.VARIABLE;
						break;
						case "string":
							field = new VariableSymbol(fieldName,"string",1);
							field.t = Symbol.Types.VARIABLE;
						break;
						default:
							
							ArrayList<Symbol> innerFields = new ArrayList<Symbol>();
							String structDefName = "";
					    	for (int j = 0; j < symbolTable.size(); j++) {
					    		if(symbolTable.get(j).t == Symbol.Types.STRUCT_DEFINITION) {
					    			if(symbolTable.get(j).name.equals(fieldinfo0)) {
					    				StructDefinitionSymbol temp = (StructDefinitionSymbol) symbolTable.get(j);
					    				//System.out.println(temp.toString());
					    				innerFields = temp.getFields();
					    				structDefName = symbolTable.get(j).name;
					    			}
					    		}
					    	}
					    	//System.out.println(fieldName);
					    	StructSymbol ss = new StructSymbol(fieldName,innerFields);
							ss.setStructDefName(structDefName);
							ss.t = Symbol.Types.STRUCT_VARIABLE;
							field = ss;
							//System.out.println(field);
							//field = null;
					}
    				i+=3;
    			}
    			fields.add(field);
    			
    		}catch(Exception e) {
    			break;
    		}
    	}
    	StructDefinitionSymbol sds = new StructDefinitionSymbol(structName, fields);
    	sds.t = Symbol.Types.STRUCT_DEFINITION;
    	symbolTable.add(sds);
    	currentScope.add(sds);
    	
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	scope.put(ctx, currentScope);
    	
//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    
    public Object visitAtrib(CaronteParser.AtribContext ctx) {
		
    	visitChildren(ctx);
    	
    	this.code += "istore " + variablesHashMap.get(ctx.getChild(0).getText()) + "\n";
    	
    	return null;
    }

    @Override
    public Object visitFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx) {
    	this.variableCount = 1;
    	this.variablesHashMap.clear();
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	
    	ParseTree params = ctx.getChild(1).getChild(1); // the subtree of params
    	
    	String retType = ctx.getChild(0).getChild(ctx.getChild(0).getChildCount()-2).getText();
    	String functionName = ctx.getChild(0).getChild(ctx.getChild(0).getChildCount()-1).getText();
    	ArrayList<Param> functionParams = new ArrayList<Param>();
    	ArrayList<String> functionParamsTypes = new ArrayList<String>();
    	ArrayList<Integer> paramSizes = new ArrayList<Integer>();
    	
    	int i = 0;
    	
    	while(true) { 
    		try {
    			if(params.getChild(i).getText().equals("array")) {
    				String type = params.getChild(i+1).getText();
    				String varName = params.getChild(i+2).getText();
    				int size = Integer.parseInt(params.getChild(i+4).getText());
    				
    				Param p = new Param(varName, type, size);
    				functionParams.add(p);
    				functionParamsTypes.add(type);
    				paramSizes.add(size);
    				i+=6; // skip the comma
    			} else {
    				String name = params.getChild(i+1).getText();
    				String type = params.getChild(i).getText();
    				Param p = new Param(name, type);
    				functionParams.add(p);
    				functionParamsTypes.add(type);
    				paramSizes.add(1);
    				i+=3; // skip the comma
    			}
    		} catch(Exception e) {
    			break;
    		}
    	}
    	
    	ParseTree lastNode = ctx.getChild(1).getChild(ctx.getChild(1).getChildCount()-2).
        		getChild(ctx.getChild(1).getChild(ctx.getChild(1).getChildCount()-2).getChildCount()-1);
    	
//    	ParseTree lastValue = lastNode.getChildCount() > 1 ? lastNode.getChild(lastNode.getChildCount()-2) : lastNode.getChild(0);
//    	ParseTree lastCommand = lastNode.getChild(0);
    	String returningType;
//    	System.out.println("kkk " + lastNode.getText());
//    	if (lastValue.getText().equals("return") || !lastCommand.getText().equals("return")) returningType = "void";
//    	else returningType = types.get(lastValue.getChild(0));
    	
		String retCode = null;
		String retCode1 = null;
    	if(functionName.equals("main")) {
    		this.code += ".method public static main([Ljava/lang/String;)V\n";
    	    this.code += "new GlobalClass\n"+
    	    "dup\n"+
    	    "invokespecial GlobalClass/<init>()V\n"+
    	    "astore_0\n";
    		retCode1 = "return";
    	} else {
    		this.code += ".method " + functionName + "(";
    		for(i = 0; i < functionParamsTypes.size(); i++) {
    			System.out.println(functionParamsTypes.get(i));
    			if(functionParamsTypes.get(i).equals("int")) {
    				this.code+="I";
    			}
    		}
    		if(retType.equals(("void"))) {
    			retCode = "V";
    			retCode1 = "return";
    		}
    		if(retType.equals(("int"))) {
    			retCode = "I";
    			retCode1 = "ireturn";
    		}
    		if(retType.equals(("boolean"))) {
    			retCode = "ZB";
    		}
    		if(retType.equals(("string"))) {
    			retCode = "S";
    		}
    		this.code += ")"+retCode+"\n";
    	}
		this.code += ".limit stack 100\n";
		this.code += ".limit locals 100\n";
    	visitChildren(ctx);
    	this.code += retCode1 + "\n";
    	this.code += ".end method\n";
    	
    	return null;
    }
    /*
     * checks if a given function is already in the symbol table
     * */
    boolean functionDeclared(String functionName, ArrayList<String> types, ArrayList<Integer> sizes) {
    	boolean matched = false;
    	for (int i = 0; i < symbolTable.size(); i++) {
    		Symbol s = symbolTable.get(i);
    		if (s.t == Symbol.Types.FUNCTION) {
    			FunctionSymbol fs = (FunctionSymbol) s;
    			if (fs.name.equals(functionName)) {
    				int paramsSize = fs.getParams().size();
    				if(types.size() != paramsSize) {
    					System.out.println("Número diferente de params :/");
    					////System.exit(0);
    					continue;
    				}

    				for(int j = 0; j < paramsSize; j++) {
    					if(!types.get(j).equals(fs.getParams().get(j).getType())) {
    						System.out.println(fs.getParams().get(j).getType());
    						System.out.println("Tipo dos parametros não correspondem :/");
    						//System.exit(0);
    						continue;
    					}
    					if(sizes.get(j) != fs.getParams().get(j).getSize()) {
    						System.out.println("Arrays não correspondem em tamanho :/");
    						//System.exit(0);
    						continue;
    					}
    				}
    				return true;
    			}
    		}
    	}
    	return matched;
    }
    @Override
    public Object visitListapar(CaronteParser.ListaparContext ctx) {
//    	System.out.println("=================");
    	for(int i = ctx.children.size()-1; i >= 0; i-=3) {
//    		System.out.print("Nome="+ctx.getChild(i).getText() + " - ");
//    		System.out.println("tipo="+ctx.getChild(i-1).getText());
    		this.variablesHashMap.put(ctx.getChild(i).getText() , this.variableCount);
//    		this.code += "istore " + variableCount + "\n";
//    		this.variableCount++;
    	} 
    	
    	visitChildren(ctx);
    	return null;
    }
    @Override
    public Object visitRepeat(CaronteParser.RepeatContext ctx) {
    	int whileLabel = this.labelCount;
    	this.code += "Label" + this.labelCount++ + ":\n";
    	if (ctx.getChild(1).getClass() == CaronteParser.BinExpContext.class) {
    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.UnariaExpContext.class) {
    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.ExpValuesContext.class) {
    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(1));
    	} else if (ctx.getChild(1).getClass() == CaronteParser.ExpPrefixContext.class) {
    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(1));
    	} else {
    		visitChildren((RuleNode)ctx.getChild(1));
    	}
    	if (ctx.getChild(3).getClass() == CaronteParser.BinExpContext.class) {
    		visitBinExp((CaronteParser.BinExpContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.UnariaExpContext.class) {
    		visitUnariaExp((CaronteParser.UnariaExpContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.ExpValuesContext.class) {
    		visitExpValues((CaronteParser.ExpValuesContext)ctx.getChild(3));
    	} else if (ctx.getChild(3).getClass() == CaronteParser.ExpPrefixContext.class) {
    		visitExpPrefix((CaronteParser.ExpPrefixContext)ctx.getChild(3));
    	} else {
    		visitChildren((RuleNode)ctx.getChild(3));
    	}
    	this.code += "ifeq Label" + whileLabel + "\n";
    	return null;
    }
    
    @Override
    public Object visitExpValues(CaronteParser.ExpValuesContext ctx) {

    	String valueContent = ctx.getText();
    	
    	this.code += "ldc " + valueContent+"\n";
    	expressionStack.add(valueContent);
    	visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitParaExp(CaronteParser.ParaExpContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	
    	types.put(ctx, types.get(ctx.getChild(1)));
    	
//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitVar(CaronteParser.VarContext ctx) { 
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	
    	String varName = ctx.getText();
    	VariableSymbol varSymbol = (VariableSymbol)getSymbol(varName, Symbol.Types.VARIABLE, currentScope);
    	
//    	if (ctx.getParent().getChildCount() > 1) {
//    		if(ctx.getParent().getChild(1).getText().equals("=") && 
//    		    	   ctx.getParent().getChild(0).getText().equals(ctx.getText())) {
//    		    		this.code += "istore " + this.variablesHashMap.get(varName) + "\n";
//    		} else {
//    			this.code += "iload " + this.variablesHashMap.get(varName) + "\n";
//    		}
//    	}
	    	

//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitExpPrefix(CaronteParser.ExpPrefixContext ctx) {
    	String name = ctx.getChild(0).getText();
    	if(!ctx.getChild(0).getText().contains("(")) {
    		this.code += "iload " + variablesHashMap.get(name)+"\n";
    	}
    	//if(getSymbol(name, Symbol.Types.FUNCTION, this.symbolTable) != null) {
    		
    	//}
    	visitChildren(ctx);
    	
    	//System.out.println(ctx.getChild(0).getChild(0).getText());
    	//System.out.println("GHAHAHAHA="+ types.get(ctx.getChild(0).getChild(0)));
    	//System.out.println(types);
    	return null;
    }
    
    public boolean isUnaryOperatorValidForType(String operator, String type) {
    	switch (operator) {
		case "++":
			if(type.equals("boolean") || type.equals("string")) return false;
			return true;
		case "--":
			if(type.equals("boolean") || type.equals("string")) return false;
			return true;
		case "-":
			if(type.equals("boolean") || type.equals("string")) return false;
			return true;
		case "#":
			if(type.equals("string")) return true;
			return false;
		case "not":
			if(type.equals("boolean")) return true;
			return false;
		default:
			return false;
		}    	
    }
    
    @Override
    public Object visitUnariaExp(CaronteParser.UnariaExpContext ctx) {
//    	visitChildren(ctx);
    	String operand = ctx.getChild(1).getText();
    	String operator = ctx.getChild(0).getText();
    	if(operator.equals("++")) {
//	    	this.code += "iconst_1\n";
//	    	//this.code += "iload " + variablesHashMap.get(operand) + "\n";
//	    	this.code += "iadd\n";
//	    	this.code += "istore " + variablesHashMap.get(operand) + "\n";
    		this.code += "iinc " + variablesHashMap.get(operand) + " 1\n";
    	} else if (operator.equals("--")) {
//	    	this.code += "iconst_1\n";
//	    	//this.code += "iload " + variablesHashMap.get(operand) + "\n";
//	    	this.code += "isub\n";
//	    	this.code += "istore " + variablesHashMap.get(operand) + "\n";		
    		this.code += "iinc " + variablesHashMap.get(operand) + " -1\n";
    	}
    	return null;
    }
    @Override
    public Object visitBinExp(CaronteParser.BinExpContext ctx) {
    	visitChildren(ctx);
//    	Set<String> childrenTypes = new HashSet<String>();
//    	
//    	String typeOperandOne = types.get(ctx.getChild(0));
//    	String nameOperandOne = ctx.getChild(0).getText();
//    	String typeOperandTwo = types.get(ctx.getChild(2));
//    	String nameOperandTwo = ctx.getChild(2).getText();
//    	
//    	expressionStack.add(ctx.getChild(1).getText());
    	
    	System.out.println("Operando 1: " + ctx.getChild(0).getText());
    	System.out.println("Operador: " + ctx.getChild(1).getText());
    	System.out.println("Operando 2: " + ctx.getChild(2).getText());
    	
    	if(ctx.getChild(1).getText().equals("+")) {
    		this.code += "iadd\n";
    	}
    	if(ctx.getChild(1).getText().equals("*")) {
    		this.code += "imul\n";
    	}
    	if(ctx.getChild(1).getText().equals("/")) {
    		this.code += "idiv\n";
    	}
    	if(ctx.getChild(1).getText().equals("-")) {
    		this.code += "isub\n";
    	}
    	if(ctx.getChild(1).getText().equals("==")) {
    		this.code += "isub\n";
    		this.code += "ifeq Label"+this.labelCount+"\n";
    		int trueLabel = this.labelCount++;
    		this.code += "iconst_0\ngoto Label"+this.labelCount+"\n";
    		int exitLabel = this.labelCount++;
    		this.code += "Label"+trueLabel+":\niconst_1\nLabel"+exitLabel+":\n";    		
    	}
    	if(ctx.getChild(1).getText().equals(">")) {
    		this.code += "isub\n";
    		this.code += "ifgt Label"+this.labelCount+"\n";
    		int trueLabel = this.labelCount++;
    		this.code += "iconst_0\ngoto Label"+this.labelCount+"\n";
    		int exitLabel = this.labelCount++;
    		this.code += "Label"+trueLabel+":\niconst_1\nLabel"+exitLabel+":\n";    	
    	}
    	if(ctx.getChild(1).getText().equals("<")) {
    		this.code += "isub\n";
    		this.code += "iflt Label"+this.labelCount+"\n";
    		int trueLabel = this.labelCount++;
    		this.code += "iconst_0\ngoto Label"+this.labelCount+"\n";
    		int exitLabel = this.labelCount++;
    		this.code += "Label"+trueLabel+":\niconst_1\nLabel"+exitLabel+":\n";    	
    	}
    	if(ctx.getChild(1).getText().equals("<=")) {
    		this.code += "isub\n";
    		this.code += "ifle Label"+this.labelCount+"\n";
    		int trueLabel = this.labelCount++;
    		this.code += "iconst_0\ngoto Label"+this.labelCount+"\n";
    		int exitLabel = this.labelCount++;
    		this.code += "Label"+trueLabel+":\niconst_1\nLabel"+exitLabel+":\n";    	
    	}
    	if(ctx.getChild(1).getText().equals(">=")) {
    		this.code += "isub\n";
    		this.code += "ifge Label"+this.labelCount+"\n";
    		int trueLabel = this.labelCount++;
    		this.code += "iconst_0\ngoto Label"+this.labelCount+"\n";
    		int exitLabel = this.labelCount++;
    		this.code += "Label"+trueLabel+":\niconst_1\nLabel"+exitLabel+":\n";    	
    	}
    	return null;
    }
    
    public String checkToken(String token, ArrayList<Symbol> currentScope) {
    	Symbol symVar = getSymbol(token, Symbol.Types.VARIABLE, currentScope);
    	Symbol symFun = getSymbol(token, Symbol.Types.FUNCTION, currentScope);
    	Symbol symStr = getSymbol(token, Symbol.Types.STRUCT_VARIABLE, currentScope);
    	Symbol symTyp = getSymbol(token, Symbol.Types.STRUCT_DEFINITION, currentScope);
    	if (symVar != null) {
    		return ((VariableSymbol) symVar).getVarType();
    	}
    	if (symFun != null) {
    		return ((FunctionSymbol) symFun).getRetType();
    	}
    	if (symStr != null) {
    		return ((StructSymbol) symStr).getStructDefName();
    	}
    	if (symTyp != null) {
//    		return  ((StructDefinitionSymbol) symTyp).get
    	}
    	if (Utils.isInteger(token)) {
    		return "int";
    	}
    	if (Utils.isBoolean(token)) {
    		return "boolean";
    	}
    	if (Utils.isString(token)) {
    		return "string";
    	}
    	return "Unknown";
    }
    
    public static void main(String[] args) {
        ANTLRInputStream input = null;
        try {
            input = new ANTLRFileStream("erros_semanticos/int_ini_str.car");
        } catch(Exception e) {
            System.out.println("dsd");
        }
        
        CaronteLexer lexer = new CaronteLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CaronteParser parser = new CaronteParser(tokens);
        ParseTree tree = parser.inicio();
        MyVisitor mv0 = new MyVisitor();
        //mv0.visit(tree);
        
        MyVisitor2 mv = new MyVisitor2();
        mv.scope = mv0.scope;
        mv.visit(tree);
       
        String x = mv.code;
        System.out.println(x);
    }
}