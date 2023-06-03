package data;

public abstract class Attribute {
	private String name;
	private int index;

	// costruttore con parametri
	Attribute(String name,int index) {
	this.name = name;
	this.index= index;
	
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public String toString() {
		return name;
	}

	

}