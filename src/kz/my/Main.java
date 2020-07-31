package kz.my;

import kz.my.classes.Characteristics;
import kz.my.interfaces.ICharacteristics;

public class Main {

    public static void main(String[] args) {
        Characteristics characteristics = new Characteristics();
        System.out.println(characteristics.calculatePower(444));

    }
}
