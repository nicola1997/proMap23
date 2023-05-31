package data;
import utility.ArraySet;

class DiscreteAttribute extends Attribute{
	String[] Values;
	//costruttore con parametri
	DiscreteAttribute(String name, int index, String[] Values){ 
		super(name,index);
		this.Values=Values;
	}
	int frequency(Data data, ArraySet idList, String v) {
		
	}
	int getNumberOfDistinctValues(String Value){
		int size= Value.length();
		return size;
	}
	public String[] getValues() {
		return Values;
	}

}
