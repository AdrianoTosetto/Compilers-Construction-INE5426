//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.*;

import sun.text.normalizer.SymbolTable;

public class MyVisitor extends CaronteBaseVisitor {
    public ParseTreeProperty<String> productionNames = new ParseTreeProperty<>();
    ArrayList<Symbol> symbolTable = new ArrayList<Symbol>();

    @Override
    public Object visitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx) {
    	
    	String functionName = ctx.getChild(0).getText();
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
    						(ArrayList<String>) Arrays.asList(Utils.splitExpressionIntoTokens(paramName));
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
    public String visitTypedDeclaration(CaronteParser.TypedDeclarationContext ctx) {
        String varType = ctx.getChild(0).getText();
        String varValue = ctx.getChild(3).getText();
        switch(varType) {

            case "boolean":

            break;
            case "int":
                if(Utils.isInteger(varValue)) {
                    System.out.println("hmm a correct integer");
                } else {
                    System.out.println("hmm not a integer");
                }

            break;

            case "double":
            break;

            case "float":

            break;

            case "string":

            break;
            
            case "array":
            break;

            // this is the case of user types variables, like structs
            default:
            	System.out.println();
            	//StructDefinitionSymbol sds = new StructDefinitionSymbol(name, fields)

        }

        //System.out.println(ctx.getChild(3).getRuleContext());
        //System.out.println(ctx.getChild(3).getParent().getText());

        return "";
    }
    
    @Override
    public Object visitStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx) {
    	
    	String structName = ctx.getChild(1).getText();
    	int i = 3; // index of the first field
    	while(true) {
    		try {
    			String fieldinfo0 = ctx.getChild(i).getText();
    			Symbol field;
    			if(fieldinfo0.equals("array")) {
    				String fieldType = ctx.getChild(i+1).getText();
    				String fieldName = ctx.getChild(i+2).getText();
    				int size = Integer.parseInt(ctx.getChild(i+4).getText());
    				i+=7;
    				
    				switch (fieldType) {
						case "int":
							field = new VariableSymbol(fieldName, "int",size);
						break;
						case "string":
							field = new VariableSymbol(fieldName,"string",size);
						break;
						default:
							field = null;
						break;
					}
    				
    			} else {
    				String fieldType = fieldinfo0;
    				String fieldName = ctx.getChild(i+1).getText();
    				switch (fieldType) {
						case "int":
							field = new VariableSymbol(fieldName, "int",1);
						break;
						case "string":
							field = new VariableSymbol(fieldName,"string",1);
						break;
						default:
							field = null;
						break;
					}
    				i+=3;
    			}
    			field.t = Symbol.Types.STRUCT_DEFINITION;
    			System.out.println(field);
    			symbolTable.add(field);
    		}catch(Exception e) {
    			break;
    		}
    	}
    	return visitChildren(ctx);
    }
    
    @Override
    public Object visitFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx) {
    	
    	ParseTree params = ctx.getChild(1).getChild(1); // the subtree of params
    	
    	String retType = ctx.getChild(0).getChild(0).getText();
    	String functionName = ctx.getChild(0).getChild(1).getText();
    	ArrayList<Param> functionParams = new ArrayList<Param>();
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
    				i+=6; // skip the comma
    			} else {
    				String name = params.getChild(i+1).getText();
    				String type = params.getChild(i).getText();
    				Param p = new Param(name, type);
    				functionParams.add(p);
    				i+=3; // skip the comma
    			}
    		} catch(Exception e) {
    			break;
    		}
    	}
    	
    	
    	FunctionSymbol fs = new FunctionSymbol(functionName, functionParams);
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
    public String visitVar(CaronteParser.VarContext ctx) { 

        //System.out.println(ctx.getChild(0).getText());
        return "";
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
        
        for (Symbol s: mv.symbolTable) {
        	if (s.t == Symbol.Types.FUNCTION) {
        		//System.out.println((FunctionSymbol)s);
        	}
        }
       
    }
}