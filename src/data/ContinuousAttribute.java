package data;

class ContinuousAttribute extends Attribute {
	private double max;
	private double min;

	ContinuousAttribute(String name, int index, double min, double max) {
		super(name,index);
		this.min = min;
		this.max = max;
	}

	public double getScaledValue(double v) {
		double v1;
		v1=(v-min)/(max-min);
		return v1;
	}
}
