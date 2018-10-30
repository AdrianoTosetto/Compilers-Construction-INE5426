import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.automata.LexerATNFactory;

public class StructSymbol extends StructDefinitionSymbol {
	boolean initialized = false;
	private String structDefName;
	private int size = 1;
	public StructSymbol(String name, ArrayList<Symbol> fields) {
		super(name, fields);
		t = Symbol.Types.STRUCT_VARIABLE;
	}
	
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.structDefName + " " + name + " {\n");
		for (Symbol field : getFields()) {
			if(field.t == Symbol.Types.STRUCT_VARIABLE || field.t == Symbol.Types.STRUCT_DEFINITION)
				sb.append("\t\t" + field.toString() + "\n");
			else
				sb.append("\t" + field.toString() + "\n");
		}
		
		sb.append("}" + "[" + size +"]");
		
		return sb.toString();
	}

	public String getStructDefName() {
		return structDefName;
	}

	public void setStructDefName(String structDefName) {
		this.structDefName = structDefName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public String getFieldType(String field) {
		
		
		
		return "";
	}
	public Symbol findFieldByName(String name) {
		
		for(Symbol s: getFields()) {
			if(s.name.equals(name)) {
				return s;
			}
		}
		return null;
	}
	public Symbol findFieldByField(String fieldAccessToken) {
		String[] fields = fieldAccessToken.split("\\.");
		int i = 1;
		Symbol s = this.findFieldByName(fields[1]);
		System.out.println(s);
		for(i = 2; i < fields.length; i++) {
			s = this.findFieldByName(fields[i]);
			System.out.println(s);
		}
		
		return null;
	}

}
