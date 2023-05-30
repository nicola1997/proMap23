package data;

import java.util.*;

abstract class Attribute {
	String name;
	int index;

	// costruttore con parametri
	private Attribute(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	public String toString() {
		return name;
	}

}