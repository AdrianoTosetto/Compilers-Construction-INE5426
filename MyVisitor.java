//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.*;

import jdk.internal.org.objectweb.asm.Type;
import sun.text.normalizer.SymbolTable;

public class MyVisitor extends CaronteBaseVisitor {
    public ParseTreeProperty<String> productionNames = new ParseTreeProperty<>();
    public ParseTreeProperty<String> types = new ParseTreeProperty<>();
    public ParseTreeProperty<Boolean> isBreakable = new ParseTreeProperty<>();
    public ParseTreeProperty<ArrayList<Symbol>> scope = new ParseTreeProperty<>();

    ArrayList<Symbol> symbolTable = new ArrayList<Symbol>();
    
    String code = 	".class public GlobalClass\n"+
    				".super java/lang/Object\n";
    
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
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	//if(ctx.getStart().getLine());
    	String functionName = ctx.getChild(0).getText();
    	
    	FunctionSymbol fs = (FunctionSymbol)getSymbol(functionName, Symbol.Types.FUNCTION, currentScope);
    	
    	if (!functionName.equals("print")) {
    		System.out.println(fs.getRetType());
        	
        	if(fs == null) {
        		System.out.println("Função ``" +functionName+"`` não foi declarada. Linha: " + ctx.getStart().getLine());
        		System.exit(0);
        	} else {
        		types.put(ctx, fs.getRetType()+"");
        	}
    	} else {
    		types.put(ctx, "void");
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
    				checkTokensTypes(tokens);
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
    		System.exit(0);
    	}
//    	return visitChildren(ctx);
    	return null;
    }
    public boolean checkTokensTypes(ArrayList<String> tokens) {
    	
    	
    	return false;
    }
    public String getTokenType(String type) {
    	return "";
    }
    
    @Override
    public Object visitDo(CaronteParser.DoContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	
    	if (!isBreakable.get(ctx)) {
    		String lastCommand = ctx.getChild(1).getChild(ctx.getChild(1).getChildCount()-1).
    								getChild(0).getText();
    		if (lastCommand.equals("break")) {
    			System.out.println("Seção inquebrável. Linha do erro: " + ctx.getStart().getLine());
    			System.exit(0);
    		}
    	}
    	
//    	System.out.println("kkk");
//    	System.out.println(scope.get(ctx.getParent()));
//    	System.out.println(scope.get(ctx));
    	
//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitWhile(CaronteParser.WhileContext ctx) {
    	isBreakable.put(ctx, true);
    	return visitChildren(ctx);
    }
    
    @Override
    public Object visitIf(CaronteParser.IfContext ctx) {
    	visitChildren(ctx);
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	
    	if (!isBreakable.get(ctx)) {
    		String lastCommand = ctx.getChild(1).getChild(ctx.getChild(1).getChildCount()-1).
    								getChild(0).getText();
    		if (lastCommand.equals("break")) {
    			System.out.println("Seção inquebrável. Linha do erro: " + ctx.getStart().getLine());
    			System.exit(0);
    		}
    	}
    	
//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitFor(CaronteParser.ForContext ctx) {
    	isBreakable.put(ctx, true);
    	return visitChildren(ctx);
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
            		System.exit(0);
            	}
            break;
            case "int":
            	if (ctx.getChildCount() < 3) {
            		String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "int", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                	currentScope.add(vs);
            	} else if (types.get(ctx.getChild(3)).equals("int")) {
            		String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "int", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                	currentScope.add(vs);
            	} else {
            		System.out.println("A variável ``" + ctx.getChild(1).getText() + "`` não pode ser inicializada"+
     					   " com valores do tipo " + types.get(ctx.getChild(3)) + ". Deveria ser int."+
     					   " Linha do erro: " + ctx.getStart().getLine());
            		System.exit(0);
            	}
            break;

            case "double":
            break;

            case "float":

            break;

            case "string":
            	if (ctx.getChildCount() < 3) {
            		String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "string", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                	currentScope.add(vs);
            	} else if (types.get(ctx.getChild(3)).equals("string")) {
            		String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "string", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                	currentScope.add(vs);
            	} else {
            		System.out.println("A variável ``" + ctx.getChild(1).getText() + "`` não pode ser inicializada"+
      					   " com valores do tipo " + types.get(ctx.getChild(3)) + ". Deveria ser string."+
      					   " Linha do erro: " + ctx.getStart().getLine());
            		System.exit(0);
            	}
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
            		System.exit(0);
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
            			System.exit(0);
            		}
            		for (int i = 0, j = 0; i < fieldsSize && j < initParamsSize; i++, j+=2) {
            			switch (fields.get(i).t) {
            			
						case VARIABLE: {
							if(Utils.isVar(initParamsStruct.getChild(j).getText())) {
								Symbol s = getSymbol(initParamsStruct.getChild(j).getText(), Symbol.Types.VARIABLE, currentScope);
								if(s == null) {
									//System.out.println(initParamsStruct.getChild(j).getText());
									System.out.println("Variável usada na inicialização da estrutura não foi declarada");
									System.exit(0);
									break;
								} else {
									System.out.println("====" + ((VariableSymbol) s).getVarType());
									if(!((VariableSymbol) s).getVarType().equals(((VariableSymbol)fields.get(i)).getVarType())) {
										System.out.println("Variável não tem o seu tipo compativel com o campo da estrutura sendo inicializado");
										System.exit(0);
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
    		System.exit(0);
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
    public Object visitFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	
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
    	
    	ParseTree lastValue = lastNode.getChildCount() > 1 ? lastNode.getChild(lastNode.getChildCount()-2) : lastNode.getChild(0);
    	ParseTree lastCommand = lastNode.getChild(0);
    	String returningType;
//    	System.out.println("kkk " + lastNode.getText());
    	if (lastCommand.getText().equals("break")) {System.out.println("Impossível quebrar função. Linha do erro: " + ctx.getStart().getLine()); System.exit(0);}
    	if (lastValue.getText().equals("return") || !lastCommand.getText().equals("return")) returningType = "void";
    	else returningType = types.get(lastValue.getChild(0));
    	
    	//System.out.println(lastCommand.getText());
    	//System.out.println(returningType);
    	
    	if (!returningType.equals(retType)) {
    		System.out.println("Função " + functionName + " não pode retornar com tipo " + returningType + ". Linha do erro: "+
    						   ctx.getStart().getLine());
    		System.exit(0);
    	}
    	
    	FunctionSymbol fs = new FunctionSymbol(functionName, functionParams);
    	fs.setRetType(retType);
    	//System.out.println("retType = " + retType);
    	if(functionDeclared(functionName, functionParamsTypes, paramSizes)) {
    		System.out.println("Função já declarada!");
    		System.exit(0);
    	}
    	fs.t = Symbol.Types.FUNCTION;
    	symbolTable.add(fs);
    	parentScope.add(fs);
    	
    	scope.put(ctx.getParent(), parentScope);
    	if(functionName.equals("main")) {
    		this.code += ".method public static main([Ljava/lang/String;)V\n";
    	} else {
    		this.code += ".method " + functionName + "(";
    		for(i = 0; i < functionParamsTypes.size(); i++) {
    			System.out.println(functionParamsTypes.get(i));
    			if(functionParamsTypes.get(i).equals("int")) {
    				this.code+="I";
    			}
    		}
    		String retCode = null;
    		if(retType.equals(("void"))) {
    			retCode = "V";
    		}
    		if(retType.equals(("int"))) {
    			retCode = "I";
    		}
    		if(retType.equals(("boolean"))) {
    			retCode = "ZB";
    		}
    		if(retType.equals(("string"))) {
    			retCode = "S";
    		}
    		this.code += ")"+retCode+"\n";
    	}
    	
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
    					System.exit(0);
    					continue;
    				}

    				for(int j = 0; j < paramsSize; j++) {
    					if(!types.get(j).equals(fs.getParams().get(j).getType())) {
    						System.out.println(fs.getParams().get(j).getType());
    						System.out.println("Tipo dos parametros não correspondem :/");
    						System.exit(0);
    						continue;
    					}
    					if(sizes.get(j) != fs.getParams().get(j).getSize()) {
    						System.out.println("Arrays não correspondem em tamanho :/");
    						System.exit(0);
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
    	visitChildren(ctx);
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitExpValues(CaronteParser.ExpValuesContext ctx) {
    	visitChildren(ctx);
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
//    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	
    	String valueContent = ctx.getText();
    	
    	types.put(ctx, Utils.getTypeValue(valueContent));
    	
//    	return visitChildren(ctx);
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
    	
    	if(varName.contains(".")) {
        	/*
        	 * O nome é um estrutura
        	 * */
    		String structName = varName.split("\\.")[0];
    		//System.out.println("===>"+structName);
    		StructSymbol ss  = (StructSymbol) getSymbol(structName, Symbol.Types.STRUCT_VARIABLE, currentScope);
    		if(ss == null) {
    			System.out.println("A Struct ``" + structName + "`` não foi anteriormente declarada. Linha: " + ctx.getStart().getLine());
    			System.exit(0);
    		} else {
    			/*
    			 * verificar se o campo existe, se sim, verificar o tipo dele
    			 * */
    			
	   			/*int i = 2;
	   			String[] tt = varName.split("\\.");
	   			Symbol s = ss.findFieldByName(tt[1]);
	   			while(s.t == Symbol.Types.STRUCT_VARIABLE) {
	   				s = ((StructSymbol) s).findFieldByName(tt[i]);
	   				i++;
	   			}
	   			System.out.println("TIPO DA VARIÁVEL: "+((VariableSymbol)s).getVarType());*/
    		}
    		
    	} else {
    		ParseTree type = ctx.getParent().getChild(0);
    		ParseTree isReturn = ctx.getParent().getParent().getParent().getParent().getChild(0);

//    		System.out.println("kkk " + type.getText());
//    		System.out.println("opa " + isReturn.getText());
//    		System.out.println("ata " + varName);
    		/*
    		 * O nome é uma variavel normal
    		 * */
//    		System.out.println(varSymbol);
    		if(varSymbol == null && type == ctx || varSymbol == null && isReturn.getText().equals("return")) {
	    		System.out.println("Variável ``"+varName+"`` não foi declarada. Linha do erro: " + ctx.getStart().getLine());
	    		System.exit(0);
	    	} else if (!isReturn.getText().equals("return")) {
	    		types.put(ctx, type.getText());
	    	} else {
	    		types.put(ctx, varSymbol.getVarType());
	    	}
    	}

//    	return visitChildren(ctx);
    	return null;
    }
    
    @Override
    public Object visitExpPrefix(CaronteParser.ExpPrefixContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	types.put(ctx, types.get(ctx.getChild(0).getChild(0)));
    	
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
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	String type = types.get(ctx.getChild(1));
    	String operator = ctx.getChild(0).getText();
    	if(!isUnaryOperatorValidForType(operator, type)) {
    		System.out.println("O operador " + operator + " não pode ser usado em conjunto com o tipo " + 
    		type+". Linha: " + ctx.getStart().getLine()
    				);
    		System.exit(0);
    	} else {
    		types.put(ctx, type);
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitBinExp(CaronteParser.BinExpContext ctx) {
    	if (isBreakable.get(ctx.getParent())) isBreakable.put(ctx, true);
    	else isBreakable.put(ctx, false);
    	visitChildren(ctx);
    	ArrayList<Symbol> parentScope = (scope.get(ctx.getParent()) == null) ? new ArrayList<>() : scope.get(ctx.getParent());
    	ArrayList<Symbol> currentScope = (scope.get(ctx) == null) ? new ArrayList<>() : scope.get(ctx);
    	parentScope.addAll(currentScope);
    	scope.put(ctx.getParent(), parentScope);
    	
    	Set<String> childrenTypes = new HashSet<String>();
    	
    	String typeOperandOne = types.get(ctx.getChild(0));
    	String nameOperandOne = ctx.getChild(0).getText();
    	String typeOperandTwo = types.get(ctx.getChild(2));
    	String nameOperandTwo = ctx.getChild(2).getText();
    	
    	if(typeOperandOne == null) {
    		System.out.println("Operando " +nameOperandOne + " não foi anteriormente definido. Linha: " + ctx.getStart().getLine());
    		System.exit(0);
    		types.put(ctx, "invalid");
    		return null;
    	}
    	if(typeOperandTwo == null) {
    		System.out.println("Operando " +nameOperandTwo + " não foi anteriormente definido. Linha: "+ ctx.getStart().getLine());
    		System.exit(0);
    		types.put(ctx, "invalid");
    		return null;
    	}
    		
    	if(!typeOperandOne.equals(typeOperandTwo)) {
    		System.out.println("Operandos ``"+nameOperandOne+"`` e ``"+nameOperandTwo+"`` não têm o mesmo tipo. Linha: "
    				+ctx.getStart().getLine());
    		System.exit(0);
    		types.put(ctx, "invalid");
    	} else {
    		/*
    		 * tipo da expressão binária está ok, marca esse nodo com o tipo
    		 * */
    		
    		types.put(ctx, typeOperandOne);
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

        MyVisitor mv = new MyVisitor();
        mv.visit(tree);
        String x = mv.code;
        System.out.println(x);
    }
}