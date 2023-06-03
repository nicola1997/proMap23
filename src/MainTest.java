import data.Attribute;
import data.DiscreteAttribute;
import data.ContinuousAttribute;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] Values;
		Values = new String[10];
		Attribute a = new DiscreteAttribute("sunny", 7, Values);

		/*
		 * Data data =new Data(); String[] Values1; Values1= new String[10]; Attribute
		 * a1= new DiscreteAttribute("sunny",7,Values1); System.out.println();
		 * System.out.println(data); int k=3;
		 */
		/*
		 * KmeansMiner kmeans=new KmeansMiner(k); int numIter=kmeans.kmeans(data);
		 * System.out.println("Numero di Iterazione:"+numIter);
		 * System.out.println(kmeans.getC().toString(data));
		 */

		ContinuousAttribute a1 = new ContinuousAttribute("Eta",3,10,20);
		
		System.out.print(a1.getScaledValue(15));

	}

}
