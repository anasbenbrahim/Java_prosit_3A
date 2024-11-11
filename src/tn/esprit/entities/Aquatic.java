package tn.esprit.entities;

import tn.esprit.enums.Food;
import tn.esprit.interfaces.Carnivore;

public non-sealed class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("This aquatic eat "+meat+".");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}