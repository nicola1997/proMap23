package data;

abstract class Attribute {
<<<<<<< HEAD
	String name;
	int index;

	// costruttore con parametri
	private Attribute(String name, int index) {
=======
	private String name;
	private int index;

	Attribute(String name, int index) {
>>>>>>> 94e404d2e5c7b3331b0e77f4e408c1b0a05869ae
		this.name = name;
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