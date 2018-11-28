
public class VariableSymbol extends Symbol{
	private int size = 1; // if greater than one => means that is an array
	private String varType;
	private boolean initialized = false;
	private String value;
	public VariableSymbol(String name, String type, int size) {
		super(name);
		this.setSize(size);
		this.varType = type;
	}
	public VariableSymbol(String name) {
		super(name);
		setSize(1);
	}
	public String getVarType() {
		return this.varType;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(varType + " ");
		if (getSize() > 1) {
			sb.append(name + "[" + getSize() + "]");
		} else {
			sb.append(name);
		}
		return sb.toString();
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isInitialized() {
		return initialized;
	}
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}
}
