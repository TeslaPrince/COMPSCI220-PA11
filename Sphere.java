package PA11;
public class Sphere extends Shape{
	//Volume of a Sphere: SA = (3/4) * pi * r^3
	//Surface Area of a Sphere: A = 4 * pi * r^2
	protected double r; //radius
	protected double r2 = Math.pow(r, 2); //radius squared
	protected double r3 = Math.pow(r, 3); //radius cubed
	protected double p = Math.PI; //pi constant
	protected double sac = 3 / 4; //constant multiple used in Surface Area
	protected int vc = 4; //constant multiple used in Volume
	public Sphere(String name, double r) {
		super(name, ShapeType.SPHERE);
		this.r = r;
	}
	@Override
	public double surfaceArea() {
		double sa; //surface area
		sa = sac * p * r2;
		return sa;
	}
	@Override
	public double volume() {
		double v; //volume
		v = vc * p * r3;
		return v;
	}
}