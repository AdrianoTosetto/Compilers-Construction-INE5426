
public class VariableSymbol extends Symbol{
	private int size = 1; // if greater than one => means that is an array
	private String varType;
	public VariableSymbol(String name, String type, int size) {
		super(name);
		this.size = size;
		this.varType = type;
		// TODO Auto-generated constructor stub
	}
	public VariableSymbol(String name) {
		super(name);
		size = 1;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(varType + " ");
		if (size > 1) {
			sb.append(name + "[" + size + "]");
		} else {
			sb.append(name);
		}
		return sb.toString();
	}
}
