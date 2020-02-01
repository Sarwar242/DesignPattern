package rootfindingmethods;

public abstract class Methods {
	
	private double a;
	public Methods(double a) {
	
		this.a = a;
	}
	private double b;
	public Methods(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public abstract double getMethodRoot();
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
}
