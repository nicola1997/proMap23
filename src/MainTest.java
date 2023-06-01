import data.Data;
import data.Attribute;
import data.DiscreteAttribute;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] Values;
		Values= new String[10];
		Attribute a= new DiscreteAttribute("sunny",7,Values); 
		
		
		Data data =new Data();
		String[] Values;
		Values= new String[10];
		Attribute a= new DiscreteAttribute("sunny",7,Values);
		System.out.println();
		System.out.println(data);
		int k=3;
		/*KmeansMiner kmeans=new KmeansMiner(k);
		int numIter=kmeans.kmeans(data);
		System.out.println("Numero di Iterazione:"+numIter);
		System.out.println(kmeans.getC().toString(data));*/
		
		
	}

}
