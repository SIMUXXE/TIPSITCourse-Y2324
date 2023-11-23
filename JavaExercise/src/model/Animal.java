package model;

public class Animal {
	protected String name;
	protected double dimension;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public Animal(String name, double dimension) {
		super();
		this.name = name;
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "I'm a %s and I'm %s m".formatted(name, dimension);
	}
}