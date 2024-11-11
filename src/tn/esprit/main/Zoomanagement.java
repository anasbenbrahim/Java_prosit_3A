package tn.esprit.main;

import tn.esprit.entities.*;
import tn.esprit.enums.Food;
import tn.esprit.exceptions.InvalidAgeException;
import tn.esprit.exceptions.ZooFullException;

public class Zoomanagement {

    public static void main(String[] args) {
        Aquatic shark = new Aquatic("Fish", "Shark", 5, false, "Ocean");
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 12, true, "Sea", 25.0f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 100.0f);
        Terrestrial lion = new Terrestrial("Mammal", "Lion", 8, true, 4);
        Animal negativeAgeAnimal = new Animal("Elephant", "Dumbo", -5, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");

        try {
            myZoo.addAnimal(lion);
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

        shark.eatMeat(Food.MEAT);
        lion.eatMeatAndPlant(Food.BOTH);
        penguin.eatMeat(Food.MEAT);



    }



}