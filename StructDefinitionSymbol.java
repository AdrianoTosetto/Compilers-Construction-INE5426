import java.util.ArrayList;

public class StructDefinitionSymbol extends Symbol{
	private ArrayList<Symbol> fields;
	public StructDefinitionSymbol(String name, ArrayList<Symbol> fields) {
		super(name);
		this.setFields(fields);
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

	public ArrayList<Symbol> getFields() {
		return fields;
	}

	public void setFields(ArrayList<Symbol> fields) {
		this.fields = fields;
	}

}
