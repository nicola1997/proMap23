package data;

import utility.ArraySet;

public abstract class Item {
	private Attribute attribute;
	private Object value;

	// costruttore con parametri
	Item(Attribute attribute, Object value) {
		this.attribute = attribute;
		this.value = value;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "value";
	}

	abstract double distance(Object a);

	public void update(Data data, ArraySet clusteredData) {
		this.value = data.computePrototype(clusteredData, attribute);
	}

}
