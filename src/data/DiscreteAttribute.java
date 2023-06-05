package data;

import utility.ArraySet;

public class DiscreteAttribute extends Attribute {
	String[] Values;

	// costruttore con parametri
	public DiscreteAttribute(String name, int index, String[] Values) {
		super(name, index);
		this.Values = Values;
	}

	public int frequency(Data data, ArraySet idList, String v) {
		int c = 0;
		for (int i = 0; i < data.getNumberOfExamples(); i++) {

			if (v.equals(data.getAttributeValue(i,super.getIndex()))) {				
				idList.add(i);
				c++;
			}
		}
		return c;
	}

	int getNumberOfDistinctValues(String Value) {
		int size = Value.length();
		return size;
	}

	public String[] getValues() {
		return Values;
	}

	public String getValue(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
