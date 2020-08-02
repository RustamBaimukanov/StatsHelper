package kz.my;

public class Main {


    public static void main(String[] args) {
//        Characteristics characteristics = new Characteristics();
//        System.out.println(characteristics.calculatePower(444));
        int power = 1;
//        int totalScore = 41;
        int totalPower = 1;
        int total = 0;
        int tempPower = 0;
        int tempScore = 0;
        int remainder = 0;

//        System.out.println(calculatePower2());


    }
    public static int[] calculatePower2(int totalScore){
        int totalPower = 1;
        int spendedScore = 0;
        int tempPower = 0;
        int tempScore = 0;
        int remainder = 0;
        while (spendedScore < totalScore){
            tempPower = totalPower;
            tempScore = spendedScore;
            totalPower += 1;
            spendedScore += totalPower / 10 +1;
            if (spendedScore > totalScore){
                totalPower = tempPower;
                spendedScore = tempScore;
                break;
            }
            System.out.println("Power:" + totalPower + " Total Score:" + spendedScore);
        }remainder = totalScore - spendedScore;
        return new int[] {remainder, totalPower};
    }
}
