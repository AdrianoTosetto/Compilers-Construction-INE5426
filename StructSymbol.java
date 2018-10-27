import java.util.ArrayList;

public class StructSymbol extends StructDefinitionSymbol {
	boolean initialized = false;
	public StructSymbol(String name, ArrayList<Symbol> fields) {
		super(name, fields);
	}
	
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

}
