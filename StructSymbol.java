import java.util.ArrayList;

public class StructSymbol extends StructDefinitionSymbol {
	boolean initialized = false;
	public StructSymbol(String name, ArrayList<Symbol> fields) {
		super(name, fields);
		t = Symbol.Types.STRUCT_VARIABLE;
	}
	
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " {\n");
		for (Symbol field : getFields()) {
			sb.append("\t" + field.toString() + "\n");
		}
		
		sb.append("}");
		
		return sb.toString();
	}

}
