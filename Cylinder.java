package PA11;
public class Cylinder extends Shape{
	//Volume of a Cylinder: V = pi * r^2 * h
	//Surface Area of a Cylinder: SA = 2((pi * r * h) + (pi * r^2))
	protected double r; //radius
	protected double r2 = Math.pow(r, 2); //radius squared
	protected double h; //height
	protected double p = Math.PI; //pi constant
	protected double c = 2; //constant multiple
	public Cylinder(String name, double r, double h) {
		super(name, ShapeType.CYLINDER);
		this.r = r;
		this.h = h;
	}
	@Override
	public double surfaceArea() {
		double sa; //surface area
		sa = c * ((p * r * h) + (p * r2));
		return sa;
	}
	@Override
	public double volume() {
		double v; //volume
		v = p * r2 * h;
		return v;
	}
}