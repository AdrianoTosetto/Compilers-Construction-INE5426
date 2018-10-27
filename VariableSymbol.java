
public class VariableSymbol extends Symbol{
	private int size = 1; // if greater than one => means that is an array

	public VariableSymbol(String name, int size) {
		super(name);
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	public VariableSymbol(String name) {
		super(name);
		size = 1;
	}
}
