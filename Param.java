
public class Param extends Symbol{
	private boolean isArray;
	private String type;
	private int size;
	public Param(String name, String type) {
		super(name);
		setArray(false);
		setSize(1);
		this.setType(type);
	}
	public Param(String name, String type, int size) {
		super(name);
		this.setType(type);
		if (size > 1) {
			setArray(true);
			this.setSize(size);
		} else {
			setArray(false);
			this.setSize(1);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("varType = " + this.getType() + "\n");
		sb.append("varName = " + this.name + "\n");
		sb.append("varSize = " + this.getSize() + "\n");
		
		return sb.toString();
	}
	public boolean isArray() {
		return isArray;
	}
	public void setArray(boolean isArray) {
		this.isArray = isArray;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
