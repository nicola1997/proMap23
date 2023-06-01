package data;

import utility.ArraySet;

public class DiscreteAttribute extends Attribute {
	String[] Values;

	// costruttore con parametri
	public DiscreteAttribute(String name, int index, String[] Values) {
		super(name, index);
		this.Values = Values;
	}

	int frequency(Data data, ArraySet idList, String v) {
		for (int i = 0; i < data.getNumberOfExamples(); i++) {
			for (int j = 0; j < 1; j++) {
				if (v.equals(data.getAttributeValue(i, j))) {
					return 1;
				}
			}
		}
		return 0;
	}

	int getNumberOfDistinctValues(String Value) {
		int size = Value.length();
		return size;
	}

	public String[] getValues() {
		return Values;
	}

}
