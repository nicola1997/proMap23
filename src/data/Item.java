package data;
import utility.ArraySet;

abstract class Item {
	Attribute attribute;
	Object value;
	//costruttore con parametri
	Item(Attribute attribute,Object value) {
		this.attribute = attribute;
		this.value= value;
	}
	public Attribute getAttribute() {
		return attribute;
	}
	public Object getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Item [value=" + value + "]";
	}
	abstract double distance(Object a);

	void update(Data data, ArraySet clusteredData){
		value =  data.computePrototype(clusteredData,attribute);
	}


}

