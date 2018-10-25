import java.util.ArrayList;

public class FunctionSymbol extends Symbol{
	private ArrayList<Param> params;

	public FunctionSymbol(String name, ArrayList<Param> params) {
		super(name);
		this.params = params;
	}
	public String toString() {
		StringBuilder  sb = new StringBuilder();
		
		for (int i = 0; i < params.size(); i++) {
			sb.append(params.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
