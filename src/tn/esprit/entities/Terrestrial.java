package tn.esprit.entities;

import tn.esprit.enums.Food;
import tn.esprit.interfaces.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeatAndPlant(Food var1) {

    }
}
