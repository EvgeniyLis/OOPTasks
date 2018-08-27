package shapes.model;

public class Circle {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}
	public double getSquare() {
		return Math.PI*r*r;
	}
	public double getPerim() {
		return 2*Math.PI*r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + "] and perimetr = "+getPerim()+" and square = "+getSquare();
	}
}
