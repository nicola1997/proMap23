package data;

public class Tuple {
	private Item[] tuple;

	Tuple(int size) {
		tuple = new Item[size];
	}

	public int getLength() {
		return tuple.length;
	}

	public Item get(int i) {
		return tuple[i];
	}
	void add(Item c,int i) {
		tuple[i]=c;
	}
	
	double getDistance(Tuple obj) { //da fare 
		return 0;
		
	}


	public void setTuple(Item[] tuple) {
		this.tuple = tuple;
	}

	public String avgDistance(Data data, int[] array) {
		// TODO Auto-generated method stub
		return null;
	} 

	
}
