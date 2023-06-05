package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import utility.ArraySet;

public class Data {
// Le visibilità di classi , attributi e metodi devono essere decise dagli studenti	
	Object data[][];
	int numberOfExamples;
	Attribute attributeSet[];

	public Data() {

		// data

		data = new Object[14][5];

		data[0][0] = new String("sunny");
		data[1][0] = new String("sunny");
		data[2][0] = new String("sunny");
		data[3][0] = new String("rain");
		data[4][0] = new String("rain");
		data[5][0] = new String("rain");
		data[6][0] = new String("rain");
		data[7][0] = new String("rain");
		data[8][0] = new String("rain");
		data[9][0] = new String("rain");
		data[10][0] = new String("overcast");
		data[11][0] = new String("overcast");
		data[12][0] = new String("overcast");
		data[13][0] = new String("overcast");

		data[0][1] = new String("hot");
		data[1][1] = new String("hot");
		data[2][1] = new String("hot");
		data[3][1] = new String("mild");
		data[4][1] = new String("mild");
		data[5][1] = new String("mild");
		data[6][1] = new String("mild");
		data[7][1] = new String("mild");
		data[8][1] = new String("mild");
		data[9][1] = new String("mild");
		data[10][1] = new String("cold");
		data[11][1] = new String("cold");
		data[12][1] = new String("cold");
		data[13][1] = new String("cold");

		data[0][2] = new String("high");
		data[1][2] = new String("high");
		data[2][2] = new String("high");
		data[3][2] = new String("normal");
		data[4][2] = new String("normal");
		data[5][2] = new String("normal");
		data[6][2] = new String("normal");
		data[7][2] = new String("normal");
		data[8][2] = new String("normal");
		data[9][2] = new String("normal");
		data[10][2] = new String("high");
		data[11][2] = new String("high");
		data[12][2] = new String("high");
		data[13][2] = new String("high");

		data[0][3] = new String("weak");
		data[1][3] = new String("weak");
		data[2][3] = new String("weak");
		data[3][3] = new String("strong");
		data[4][3] = new String("strong");
		data[5][3] = new String("strong");
		data[6][3] = new String("strong");
		data[7][3] = new String("strong");
		data[8][3] = new String("strong");
		data[9][3] = new String("strong");
		data[10][3] = new String("strong");
		data[11][3] = new String("strong");
		data[12][3] = new String("strong");
		data[13][3] = new String("strong");

		data[0][4] = new String("no");
		data[1][4] = new String("no");
		data[2][4] = new String("no");
		data[3][4] = new String("yes");
		data[4][4] = new String("yes");
		data[5][4] = new String("yes");
		data[6][4] = new String("yes");
		data[7][4] = new String("yes");
		data[8][4] = new String("yes");
		data[9][4] = new String("yes");
		data[10][4] = new String("yes");
		data[11][4] = new String("yes");
		data[12][4] = new String("yes");
		data[13][4] = new String("yes");

		// numberOfExamples

		numberOfExamples = 14;

		// explanatory Set

		attributeSet = new Attribute[5];

		String outLookValues[] = new String[3];
		String temperatureValues[] = new String[8];
		String umidityValues[] = new String[3];
		String windValues[] = new String[3];
		String playValues[] = new String[3];

		outLookValues[0] = "overcast";
		outLookValues[1] = "rain";
		outLookValues[2] = "sunny";

		temperatureValues[0] = "30.30";
		temperatureValues[1] = "30.00";
		temperatureValues[2] = "13.00";
		temperatureValues[3] = "0.10";
		temperatureValues[4] = "0.00";
		temperatureValues[5] = "12.00";
		temperatureValues[6] = "12.50";
		temperatureValues[7] = "29.21";

		umidityValues[0] = "high";
		umidityValues[1] = "normal";
		windValues[0] = "weak";
		windValues[1] = "strong";
		playValues[0] = "yes";
		playValues[1] = "no";

		attributeSet[0] = new DiscreteAttribute("Outlook", 0, outLookValues);
		attributeSet[1] = new DiscreteAttribute("Temperature", 1, temperatureValues);
		attributeSet[2] = new DiscreteAttribute("Umidity", 2, umidityValues);
		attributeSet[3] = new DiscreteAttribute("Wind", 3, windValues);
		attributeSet[4] = new DiscreteAttribute("Play", 4, playValues);

	}

	public int getNumberOfExamples() {
		return numberOfExamples;
	}

	public int getNumberOfAttributes() {
		return this.attributeSet.length;

	}

	public Attribute[] getAttributeSchema() {
		return this.attributeSet;
	}

	public Object getAttributeValue(int exampleIndex, int attributeIndex) {
		return this.data[exampleIndex][attributeIndex];
	}

	@Override
	public String toString() {
		String result = Arrays.toString(attributeSet) + "\n";
		for (int i = 0; i < data.length; i++) {
			result = result + i + ": " + Arrays.toString(data[i]) + "\n";
		}
		return result;
	}

	public static void main(String args[]) {
		Data trainingSet = new Data();
		System.out.println(trainingSet);

	}

	Object computePrototype(ArraySet idList, Attribute attribute) {

		return computePrototype(idList, (DiscreteAttribute) attribute);

	}

	/*
	 * public String computePrototype(ArraySet<Integer> idList, DiscreteAttribute
	 * attribute) { HashMap<String, Integer> frequencies = new HashMap<>();
	 * 
	 * // Calcola le frequenze dei valori dell'attributo for (int i = 0; i <
	 * idList.size(); i++) { int id = idList.get(i); String value =
	 * attribute.getValue(id); frequencies.put(value,
	 * frequencies.getOrDefault(value, 0) + 1); }
	 * 
	 * 
	 * // Trova il valore più frequente String mostFrequentValue = null; int
	 * maxFrequency = 0;
	 * 
	 * for( Map.Entry<String, Integer> entry:frequencies.entrySet()) { String value
	 * = entry.getKey(); int frequency = entry.getValue();
	 * 
	 * if (frequency > maxFrequency) { mostFrequentValue = value; maxFrequency =
	 * frequency; } }
	 * 
	 * return mostFrequentValue; }
	 */

	/*
	 * public Tuple getItemSet(int index) { Tuple tuple = new
	 * Tuple(explanatorySet.length); for (int i = 0; i < explanatorySet.length; i++)
	 * tuple.add(new DiscreteItem(explanatorySet[i], (String) data[index][i]), i);
	 * return tuple;
	 * 
	 * }
	 */
	public int[] simpling(int k) {
		int centroidIndexes[] = new int[k];
		// choose k random different centroids in data.
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for (int i = 0; i < k; i++) {
			boolean found = false;
			int c;
			do {
				found = false;
				c = rand.nextInt(getNumberOfExamples());
				// verify that centroid[c] is not equal to a centroide
				// already stored in CentroidIndexes
				for (int j = 0; j < i; j++)
					if (compare(centroidIndexes[j], c)) {
						found = true;
						break;
					}
			} while (found);
			centroidIndexes[i] = c;
		}
		return centroidIndexes;

	}

	private boolean compare(int i, int j) { // da provare
		if (data[i] == data[j]) {
			return true;
		}
		return false;
	}

	public Tuple getItemSet(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
