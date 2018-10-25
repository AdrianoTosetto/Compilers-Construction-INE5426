
public class Symbol {
	
	public String name;
	
	public enum Types {
		FUNCTION,
		VARIABLE,
		STRUCT
	}
	Types t;
	
	public Symbol(String name) {
		this.name = name;
	}
	public Symbol(String name, Types t) {
		this.name = name;
		this.t = t;
	}

}
