package kz.my;

import kz.my.classes.Characteristics;
import kz.my.interfaces.ICharacteristics;

public class Main {

    public static void main(String[] args) {
//        Characteristics characteristics = new Characteristics();
//        System.out.println(characteristics.calculatePower(444));
        int power = 1;
        int totalScore = 35;
        int totalPower = 0;

        int x;
        int c = 0;

//        System.out.println(22/10+1);
//        while (power > totalPower){
////            x = (score / 10) + 1;
//            totalPower = totalPower + (score / 10) + 1;
//            score++;
//
////            c++;
//
//            System.out.println(totalPower);
//        }
//        for (int score = 0; score < 11; score++) {
//            totalPower = totalPower + (totalPower / 10) + 1;
//            totalScore -= (totalPower / 10) + 1;
//            System.out.println(totalPower);
//
//        }
//        System.out.println(totalScore);
        while (totalScore >= 0){
            totalPower = totalPower + (totalPower / 10) + 1;
            totalScore -= (totalPower / 10) + 1;
            if(totalScore < 0){
                break;

            }
            power++;
            System.out.println("Total Score:" + totalScore);
            System.out.println("Total power:" + totalPower);
        }
        System.out.println(power);
    }
}
