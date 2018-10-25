
public class Param extends Symbol{
	private boolean isArray;
	private String type;
	private int size;
	public Param(String name, String type) {
		super(name);
		isArray = false;
		size = 1;
		this.type = type;
	}
	public Param(String name, String type, int size) {
		super(name);
		this.type = type;
		if (size > 1) {
			isArray = true;
			this.size = size;
		} else {
			isArray = false;
			this.size = 1;
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("varType = " + this.type + "\n");
		sb.append("varName = " + this.name + "\n");
		sb.append("varSize = " + this.size + "\n");
		
		return sb.toString();
	}

}
