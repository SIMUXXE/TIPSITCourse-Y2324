package model;

public class WaterPer extends Animal{
	private boolean livesInSeaWater;

	public boolean isSeaWater() {
		return livesInSeaWater;
	}

	public void setSeaWater(boolean isSeaWater) {
		this.livesInSeaWater = isSeaWater;
	}

	public WaterPer(String name, double dimension, boolean livesInSeaWater) {
		super(name, dimension);
		this.livesInSeaWater = livesInSeaWater;
	}

	@Override
	public String toString() {
		if(livesInSeaWater)
			return "I'm a %s and I'm %s m and I live in salty water".formatted(name, dimension);
		else
			return "I'm a %s and I'm %s m and I live in fresh water".formatted(name, dimension);
	}
}
