//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.*;

public class MyVisitor extends CaronteBaseVisitor {
    public ParseTreeProperty<String> productionNames = new ParseTreeProperty<>();

    @Override
    public String visitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx) {
        //productionNames.put();
        System.out.println("alkss");
        return "";
    }

    @Override
    public String visitTypedDeclaration(CaronteParser.TypedDeclarationContext ctx) {
        if (ctx.getChild(0).getText().equals("int")) {
            try {
                String strNumber = ctx.getChild(3).getText();
                Integer.parseInt(strNumber);
            }catch(Exception e) {
                String strNumber = ctx.getChild(3).getText().replaceAll("\"", "");
                System.out.println(strNumber + " is not a number");
            }
        }
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

            // this is the case of user types variables, like structs
            default:

        }

        //System.out.println(ctx.getChild(3).getRuleContext());
        //System.out.println(ctx.getChild(3).getParent().getText());

        return "";
    }
    
    @Override
    public String visitStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx) {
    	System.out.println("dlss");
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

        new MyVisitor().visit(tree);
    }
}