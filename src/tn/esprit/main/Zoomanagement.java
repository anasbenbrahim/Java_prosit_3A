package tn.esprit.main;

import tn.esprit.entities.*;
import tn.esprit.exceptions.InvalidAgeException;
import tn.esprit.exceptions.ZooFullException;

public class Zoomanagement {

    public static void main(String[] args) {

        Animal lion = new Animal("Cats", "Simba", 8, true);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal negativeAgeAnimal = new Animal("Elephant", "Dumbo", -5, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");

        try {
            myZoo.addAnimal(lion);
            System.out.println("Number of animals: " + myZoo.getNbrAnimals());

            myZoo.addAnimal(dog);
            System.out.println("Number of animals: " + myZoo.getNbrAnimals());

            // Attempt to add an animal with a negative age
            myZoo.addAnimal(negativeAgeAnimal);
            System.out.println("Number of animals: " + myZoo.getNbrAnimals());

        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // Add more animals to test zoo fullness
        Animal dog2 = new Animal("Canine", "Buddy", 3, true);
        try {
            myZoo.addAnimal(dog2);
            System.out.println("Number of animals: " + myZoo.getNbrAnimals());
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }


}