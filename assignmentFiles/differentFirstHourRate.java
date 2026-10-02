package assignmentFiles;
import java.util.Scanner;

public class differentFirstHourRate {
    public static void main(String[] args) {
        Scanner inputHours = new Scanner(System.in);
        System.out.println("The first hour is 3,000 IDR. Each additional hour after an hour will be 2,000 IDR.");
        System.out.println("Your parked hours:");
        int parkedHours = inputHours.nextInt();
        int totalFee = 0;
        if (parkedHours == 1) {
            totalFee = 3000;
            System.out.println("Your total fee is " + totalFee +  " IDR.");
        } 
        else if (parkedHours == 0){
            System.out.println("Please don't waste my precious time, sir.");
        }
        else {
           totalFee = 3000 + ((parkedHours - 1) * 2000);
           System.out.println("Your total fee is " + totalFee + " IDR.");
        }
        inputHours.close();
    }
}
