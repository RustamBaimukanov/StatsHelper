package kz.my.classes;

import kz.my.interfaces.ICharacteristics;

public class Characteristics implements ICharacteristics {

    private int power;
    private int intelligence;
    private int persistence;
    private int fortitude;
    private int agility;
    private int totalScore=1500;

    @Override
    public int calculate() {
        return 0;
    }

    public int calculatePower(int power){
        int temp = totalScore;
        int counter = 1;
        while (temp != 0){

            counter++;
        }



        return power;
    }
//    @Override
//    public String toString() {
//        return String.valueOf(calculate());
//    }
}
