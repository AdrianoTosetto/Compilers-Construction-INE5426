import java.util.ArrayList;

public class Scope extends Symbol {
	private ArrayList<Symbol> scopeSymbols = new ArrayList<Symbol>();

	public Scope(String name) {
		super(name);
	}
	
	public void addSymbol(Symbol s) {
		this.scopeSymbols.add(s);
	}

}
