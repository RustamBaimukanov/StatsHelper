package kz.my.classes;

import kz.my.interfaces.ICharacteristics;

public class Characteristics implements ICharacteristics {

    private int power;
    private int intelligence;
    private int persistence;
    private int fortitude;
    private int agility;

    @Override
    public int calculate() {
        return 0;
    }

    public int calculatePower(int power){



        return power;
    }
//    @Override
//    public String toString() {
//        return String.valueOf(calculate());
//    }
}
