//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.util.ArrayList;

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
    	int i = 0;
    	while(true) {
    		try {
    			System.out.println(funcParams.getChild(i).getText());
    			i+=2;
    		}catch(Exception e) {
    			break;
    		}
    	}
    	return visitChildren(ctx);
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

        }

        //System.out.println(ctx.getChild(3).getRuleContext());
        //System.out.println(ctx.getChild(3).getParent().getText());

        return "";
    }
    
    @Override
    public String visitStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx) {
    	//System.out.println("dlss");
    	return null;
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
    boolean functionDeclared(String functionName) {
    	return false;
    }
    @Override
    public String visitListapar(CaronteParser.ListaparContext ctx) {
    	System.out.println("snmsn");
    	return null;
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
        		System.out.println((FunctionSymbol)s);
        	}
        }
       
    }
}