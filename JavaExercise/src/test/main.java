package test;
import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.LandPet;
import model.WaterPer;

public class main {
	public static void main(String[] args) {
		ArrayList<Animal> pets = new ArrayList<>();
		pets.add(new Animal("Glabrous heterocephalous", 13));
		pets.add(new Animal("Tardigrade", 00001)); //Vincenzo il tardigrado
		String choice;
		Scanner input = new Scanner(System.in);
		do {
			String name, scream;
			double dim;
			boolean salty;
			System.out.println("insert Animal's name");
			name = input.next();
			System.out.println("insert Animal's dimension");
			dim = input.nextFloat();
			System.out.println("is it a land animal or a water animal? [L/W]");
			if(input.next().equalsIgnoreCase("L")) {
				System.out.println("what sound does it make?");
				scream = input.next();
				LandPet beast = new LandPet(name, dim, scream);
				pets.add(beast);
			}
			else {
				System.out.println("is it a freshwater animal or saltwater animal? [F/S]");
				if(input.next().equalsIgnoreCase("F")) {
					salty = true;
					WaterPer Ffish = new WaterPer(name, dim, salty);
					pets.add(Ffish);
				}
				else {
					salty = false;
					WaterPer Sfish = new WaterPer(name, dim, salty);
					pets.add(Sfish);
				}
			}
			
			System.out.println("Do you want to continue? [Y/N]");
			choice = input.next();
		}while(!choice.equalsIgnoreCase("n")); 
	}
}
