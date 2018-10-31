//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
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
    ArrayList<Symbol> symbolTable = new ArrayList<Symbol>();
    
    public enum Errors{
    		FUNCTION_NOT_DECLARED,
    		VARIABLE_NOT_DECLARED,
    		STRUCT_NOT_DECLARED,
    		FUNCTION_RETURN_TYPE_NOT_APPROPRIATE_FOR_EXPRESSION,
    		SYMBOL_WAS_NOT_DECLARED
    }

    @Override
    public Object visitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx) {
    	//if(ctx.getStart().getLine());
    	String functionName = ctx.getChild(0).getText();
    	
    	FunctionSymbol fs = (FunctionSymbol)getSymbol(functionName, Symbol.Types.FUNCTION);
    	
    	if(fs == null) {
    		System.out.println("Função ``" +functionName+"`` não foi declarada. Linha: " + ctx.getStart().getLine());
    	} else {
    		types.put(ctx, fs.getRetType()+"");
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
    	}
    	return visitChildren(ctx);
    }
    public boolean checkTokensTypes(ArrayList<String> tokens) {
    	
    	
    	return false;
    }
    public String getTokenType(String type) {
    	return "";
    }
    @Override
    public Object visitTypedDeclaration(CaronteParser.TypedDeclarationContext ctx) {
        String varType = ctx.getChild(0).getText();
        String varValue = ctx.getChild(3).getText();
        System.out.println(varType);
        visitChildren(ctx);
        switch(varType) {

            case "boolean":

            break;
            case "int":
                if(!Utils.isInteger(varValue)) {
                	 ArrayList<String> tokens = Utils.splitExpressionIntoTokens(varValue);
                	 Errors e = null;
                	 //System.out.println(tokens);
                	 for(String t : tokens) {
                		 boolean symbolFound = false;
                		 /*
                		  * verifica se o símbolo encontrado é uma função
                		  * */
                		 Symbol func = getSymbol(t.split("[(]")[0], Symbol.Types.FUNCTION);
                		 if(func != null) {
                			 symbolFound = true;
                			 if(!((FunctionSymbol)func).getRetType().equals("int")) {
                				 System.out.println("Retorno da função " + t + " não pode ser usado para esta expressão");
                			 }
                		 }
                		 /*
                		  * verifica se é uma veriavel
                		  * */
                		 if(t.contains("[")) {
                			 System.out.println("um array");
                			 String arrayName = t.substring(0, t.length()-3);
                			 System.out.println("Array = " +arrayName);
                			 int arrayIndex = Integer.parseInt(t.substring(t.length()-2, t.length()-1));
                			 System.out.println("index = " + arrayIndex);
                			 VariableSymbol arrayVar = (VariableSymbol)getSymbol(arrayName, Symbol.Types.VARIABLE);
                			 if(arrayIndex > arrayVar.getSize()) {
                				 System.out.println("Index " +arrayIndex +" não existe no vetor " + arrayName);
                			 }
                		 }
                		 Symbol variable = getSymbol(t.trim(), Symbol.Types.VARIABLE);
                		 if(variable != null) {
                			 symbolFound = true;
                			 System.out.println();
                			 if(!((VariableSymbol)variable).getVarType().equals("int")) {
                				 System.out.println("Operando " +t +" Não pode ser");
                			 }
                		 }
                		 String[] tt = t.split("\\.");
                		 //System.out.println(t);
                		 //System.out.println(Arrays.asList(tt));
                		 
                		 String structName = tt[0];
                		 StructSymbol structVariable = (StructSymbol) getSymbol(structName, Symbol.Types.STRUCT_VARIABLE);
                		 System.out.println(Arrays.asList(tt));
                		 if(structVariable != null) {
                			 symbolFound = true;
                			 int i = 2;
                			 Symbol s = structVariable.findFieldByName(tt[1]);
                			 while(s.t == Symbol.Types.STRUCT_VARIABLE) {
                				 s = ((StructSymbol) s).findFieldByName(tt[i]);
                				 i++;
                			 }
                			 if(!((VariableSymbol)s).getVarType().equals("int")) {
                				 System.out.println("Este campo deveria ser um int :/");
                			 }
                		 }
                		 
                		 if(Utils.isInteger(t)) {
                			 symbolFound = true;
                		 }
                		 if(Utils.isString(t)) {
                			 System.out.println();
                		 }
                		 if(!symbolFound) {
                			 System.out.println("O símbolo " + t + " não foi declarado como função ou variável");
                			 e = Errors.SYMBOL_WAS_NOT_DECLARED;
                		 }
                	 }
                } else {
                	String varName = ctx.getChild(1).getText();
                	VariableSymbol vs = new VariableSymbol(varName, "int", 1);
                	vs.t = Symbol.Types.VARIABLE;
                	symbolTable.add(vs);
                }

            break;

            case "double":
            break;

            case "float":

            break;

            case "string":
            	
               if(!Utils.isString(varValue)) {
               	 //System.out.println("hmm not a string");
            	   
               } else {
	               	String varName = ctx.getChild(1).getText();
	               	VariableSymbol vs = new VariableSymbol(varName, "string", 1);
	               	vs.t = Symbol.Types.VARIABLE;
	               	symbolTable.add(vs);
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
            	Symbol temp = getSymbol(structType, Symbol.Types.STRUCT_DEFINITION);
            	if(temp == null) {
            		System.out.println("essa struct não foi definida");
            	} else {
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
            		}
            		for (int i = 0, j = 0; i < fieldsSize && j < initParamsSize; i++, j+=2) {
            			switch (fields.get(i).t) {
            			
						case VARIABLE: {
							if(Utils.isVar(initParamsStruct.getChild(j).getText())) {
								Symbol s = getSymbol(initParamsStruct.getChild(j).getText(), Symbol.Types.VARIABLE);
								if(s == null) {
									//System.out.println(initParamsStruct.getChild(j).getText());
									System.out.println("Variável usada na inicialização da estrutura não foi declarada");
									break;
								} else {
									System.out.println("====" + ((VariableSymbol) s).getVarType());
									if(!((VariableSymbol) s).getVarType().equals(((VariableSymbol)fields.get(i)).getVarType())) {
										System.out.println("Variabel não tem o seu tipo compativel com o campo da estrutura sendo inicializado");
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
            break;

        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitArrayDeclaration(CaronteParser.ArrayDeclarationContext ctx) {
    	
    	String typeArray = ctx.getChild(1).getText();
    	String nameArray = ctx.getChild(2).getText();
    	
    	int arraySize = Integer.parseInt(ctx.getChild(4).getText());
    	System.out.println(typeArray);
    	System.out.println(nameArray);
    	VariableSymbol varSym = new VariableSymbol(nameArray, typeArray, arraySize);
    	varSym.t = Symbol.Types.VARIABLE;
    	symbolTable.add(varSym);
    	int initSize = ctx.getChild(7).getChildCount();
    	String temp[] = ctx.getChild(7).getText().substring(1, ctx.getChild(7).getText().length()-3).split(",");
    	System.out.println(temp.length);
    	if(temp.length+1 != arraySize) {
    		System.out.println("Inicialize o array com o número de elementos corretos");
    	}
    	
    	return visitChildren(ctx);
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
    
    public String checkFieldType(String structToken) {
    	String[] accessLine = structToken.split("\\.");
    	System.out.println(Arrays.asList(accessLine));
    	StructSymbol ss = (StructSymbol) getSymbol(accessLine[0], Symbol.Types.STRUCT_VARIABLE);
    	ArrayList<Symbol> fields = ss.getFields();
    	for(int i = 1; i < accessLine.length; i++) {
    		if(i == accessLine.length-1) {
    			
    		}
    	}
    	
    	return null;
    }
    
    public Symbol getSymbol(String symbolName, Symbol.Types t) {
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
    	String structName = ctx.getChild(1).getText();
    	for (int i = 0; i < symbolTable.size(); i++) {
    		if(symbolTable.get(i).t == Symbol.Types.STRUCT_DEFINITION) {
    			if(symbolTable.get(i).name.equals(structName)) {
    				System.out.println("struct redefinida");
    				return visitChildren(ctx);
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
    	return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx) {
    	
    	ParseTree params = ctx.getChild(1).getChild(1); // the subtree of params
    	
    	String retType = ctx.getChild(0).getChild(0).getText();
    	String functionName = ctx.getChild(0).getChild(1).getText();
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
    	
    	
    	FunctionSymbol fs = new FunctionSymbol(functionName, functionParams);
    	fs.setRetType(retType);
    	System.out.println("retType = " + retType);
    	if(functionDeclared(functionName, functionParamsTypes, paramSizes)) {
    		System.out.println("Função já declarada!");
    	}
    	fs.t = Symbol.Types.FUNCTION;
    	symbolTable.add(fs);
    	
    	return visitChildren(ctx);
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
    					continue;
    				}

    				for(int j = 0; j < paramsSize; j++) {
    					if(!types.get(j).equals(fs.getParams().get(j).getType())) {
    						System.out.println(fs.getParams().get(j).getType());
    						System.out.println("Tipo dos parametros não correspondem :/");
    						continue;
    					}
    					if(sizes.get(j) != fs.getParams().get(j).getSize()) {
    						System.out.println("Arrays não correspondem em tamanho :/");
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
    	return visitChildren(ctx);
    }
    
    @Override
    public Object visitVar(CaronteParser.VarContext ctx) { 
    	
        visitChildren(ctx);
    	String varName = ctx.getText();
    	VariableSymbol varSymbol = (VariableSymbol)getSymbol(varName, Symbol.Types.VARIABLE);
    	if(varSymbol == null) {
    		System.out.println("Variável ``"+varName+"`` não foi declarada. Linha do erro: " + ctx.getStart().getLine());
    	} else {
    		types.put(ctx, varSymbol.getVarType());
    	}

    	return visitChildren(ctx);
    }
    
    @Override
    public Object visitExpPrefix(CaronteParser.ExpPrefixContext ctx) {
    	visitChildren(ctx);
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
		default:
			return false;
		}    	
    }
    
    @Override
    public Object visitUnariaExp(CaronteParser.UnariaExpContext ctx) {
    	visitChildren(ctx);
    	String type = types.get(ctx.getChild(1));
    	String operator = ctx.getChild(0).getText();
    	if(!isUnaryOperatorValidForType(operator, type)) {
    		System.out.println("O operador " + operator + " não pode ser usado em conjunto com o tipo " + 
    		type+". Linha: " + ctx.getStart().getLine()
    				);
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitBinExp(CaronteParser.BinExpContext ctx) {
    	visitChildren(ctx);
    	//types.put(ctx, "testando");
    	//System.out.println("CHILDCOUNT = "+ctx.getChildCount());
    	//String leftSide = ctx.getChild(0).getText();
    	//ArrayList<String> tokens = Utils.splitExpressionIntoTokens(leftSide);
    	
    	//String rightSide = ctx.getChild(2).getText();
    	//System.out.println(ctx.);
    	//System.out.println(leftSide);
    	//System.out.println(rightSide);
    	
//    	System.out.println("kkk" + ctx.children.size());
    	
    	Set<String> childrenTypes = new HashSet<String>();
    	
    	String typeOperandOne = types.get(ctx.getChild(0));
    	String nameOperandOne = ctx.getChild(0).getText();
    	String typeOperandTwo = types.get(ctx.getChild(2));
    	String nameOperandTwo = ctx.getChild(2).getText();
    	if(typeOperandOne == null || typeOperandTwo == null) return null;
    	if(!typeOperandOne.equals(typeOperandTwo)) {
    		System.out.println("Operandos ``"+nameOperandOne+"`` e ``"+nameOperandTwo+"`` não têm o mesmo tipo");
    	} else {
    		/*
    		 * tipo da expressão binária está ok, marca esse nodo com o tipo
    		 * */
    		
    		types.put(ctx, typeOperandOne);
    	}
    	
    	
    	/*ArrayList<ParseTree> leafNodes = new ArrayList(), toVisit = new ArrayList();
    	
    	for (ParseTree child : ctx.children) {
    		toVisit.add(child);
    	}
    	
    	while (toVisit.size() > 0) {
    		ParseTree p = toVisit.remove(0);
    		int childCount = p.getChildCount();
    		if (childCount == 0) {
    			leafNodes.add(p);
    		} else {
    			for (int i = 0; i < childCount; i++) {
    				toVisit.add(p.getChild(i));
    			}
    		}
    	}
    	
    	ArrayList<ParseTree> newLeaves = new ArrayList();
    	
    	
    	for (ParseTree p : leafNodes) {
//    		if (checkToken(p.getText()) == null) {
//    			leafNodes.remove(p);
//    		}
    		if (!(p.getText().equals("+") ||
    				p.getText().equals("-") ||
    				p.getText().equals("(") ||
    				p.getText().equals(")"))) {
    			newLeaves.add(p);
    		}
    	}
    	
    	Set<String> types = new HashSet<String>();
    	
    	for (ParseTree p : newLeaves) {
    		types.add(checkToken(p.getText()));
    	}
    	
    	if (types.contains("Unknown")) {
    		System.out.println("Variável não declarada");
    	}
    	if (types.size() > 1) {
    		System.out.println("Tipos incompatíveis");
    	}
    	
    	System.out.println(types);*/
    	
//    	for (int i = 0; i < ctx.children)
    	
//    	toVisit.add();
    	
//    	while
    	
    	//return visitChildren(ctx);
    	return null;
    }
    
    public String checkToken(String token) {
    	Symbol symVar = getSymbol(token, Symbol.Types.VARIABLE);
    	Symbol symFun = getSymbol(token, Symbol.Types.FUNCTION);
    	Symbol symStr = getSymbol(token, Symbol.Types.STRUCT_VARIABLE);
    	Symbol symTyp = getSymbol(token, Symbol.Types.STRUCT_DEFINITION);
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
        //System.out.println(mv.symbolTable.size());
        for (Symbol s: mv.symbolTable) {
        	//System.out.println(s.t +" " +s.toString());	
        }
       
    }
}