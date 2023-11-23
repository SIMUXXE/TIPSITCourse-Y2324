package model;

public class LandPet extends Animal {
	private String animalSound;

	public String getAnimalSound() {
		return animalSound;
	}

	public void setAnimalSound(String animalSound) {
		this.animalSound = animalSound;
	}

	public LandPet(String name, double dimension, String animalSound) {
		super(name, dimension);
		this.animalSound = animalSound;
	}

	@Override
	public String toString() {
		return "I'm a %s and I'm %s m and I go like %s".formatted(name, dimension, animalSound);
	}
}
