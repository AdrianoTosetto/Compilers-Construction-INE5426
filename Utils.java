import java.util.ArrayList;
import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class Utils{
	private static String INT_PATTERN = "('-')?[0-9]+";
	private static String STRING_PATTERN = "\".+\"";
	private static String BOOLEAN_PATTERN = "false|true";
	private static String FLOAT_PATTERN = "";
	private static String DOUBLE_PATTERN = "";

	public static boolean isInteger(String integer) {

		return integer.matches(Utils.INT_PATTERN);
	}
	
	public static boolean isString(String string) {

		return string.matches(Utils.STRING_PATTERN);
	}
	public static boolean isBoolean(String bool) {
		
		return bool.matches(Utils.BOOLEAN_PATTERN);
	}
	public static String getTypeValue(String value) {
		if (value.matches(INT_PATTERN)) {
			return "int";
		}
		if (value.matches(STRING_PATTERN)) {
			return "string";
		}
		if(value.matches(BOOLEAN_PATTERN)) {
			return "bool";
		}
		
		
		return "Unknown"; // variable or struct
	}
	public static String[] splitExpressionIntoTokens(String expression) {
		String delimiters = "\\+|-|\\*|/|%";
		
		return expression.split(delimiters);
	}
	public static boolean isSymbol(String symbol) { 
		
		return false;
	}
	/*
	 * normal variable
	 * */
	public static boolean isVar(String token) {
		String pattern = "[aA-z]([aA-z | \\d])*";

		return token.matches(pattern);
	}
	public static void main(String[] args) {
		/*ArrayList<String> symbols = new ArrayList<String>(Arrays.asList(Utils.splitExpressionIntoTokens("3+1 + myint")));
		for (int i = 0; i < symbols.size(); i++) {
			String s = symbols.get(i).replaceAll(" ", "");
			System.out.println(s + " " + Utils.getTypeValue(s));
		}*/
		System.out.println(Utils.isVar("289843j"));
	}
}