package PA11;
public class Cuboid extends Shape{
	//Volume of a Cube/Rectangular Prism: A = l * w * h
	//Surface Area of a Cube/Rectangular Prism = 2((h * w) + (l * w) + (h * l))
	protected double l; //length
	protected double w; //width
	protected double h; //height
	protected int c = 2; //constant multiple
	public Cuboid(String name, double l, double h, double w) {
		super(name, ShapeType.CUBOID);
		this.l = l;
		this.h = h;
		this.w = w;
	}
	@Override
	public double surfaceArea() {
		double sa; //surface area
		sa = c * ((h * w) + (l * w) + (h * l));
		return sa;
	}
	@Override
	public double volume() {
		double v; //volume
		v = l * w * h;
		return v;
	}
}