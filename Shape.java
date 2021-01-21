package PA11;
// the abstract class Shape goes in this file
public abstract class Shape implements IShape{
	protected String name;
	protected ShapeType type;
	public Shape(String name, ShapeType type) {
		this.name = name;
		this.type = type;
	}
	@Override
	public String name() {
		return name;
	}
	@Override
	public ShapeType type() {
		return type;
	}
	@Override
	public double surfaceArea() {
		return 0;
	}
	@Override
	public double volume() {
		return 0;
	}
	public String toString() {
		return String.format("%s: \n\tSurface Area = %f, \n\tVolume = %f", name, surfaceArea(), volume());
	}
}