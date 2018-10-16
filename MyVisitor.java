//package CaronteMilGrau;
//import CaronteMilGrau.CaronteParser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.tree.*;

public class MyVisitor extends CaronteBaseVisitor {

    @Override

    public String visitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx) {
        System.out.println(ctx.getChild(0));

        return "penis";
    }
    public static void main(String[] args) {
        ANTLRInputStream input = new ANTLRInputStream("void main(): f(); end");
        CaronteLexer lexer = new CaronteLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CaronteParser parser = new CaronteParser(tokens);
        ParseTree tree = parser.inicio();

        System.out.println(new MyVisitor().visit(tree));
    }
}