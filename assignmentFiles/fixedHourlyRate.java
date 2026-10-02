package assignmentFiles;
import java.util.Scanner;

public class fixedHourlyRate {
    public static void main(String[] args) {
        Scanner inputHours = new Scanner(System.in);
        System.out.println("1 hour = 3,000 IDR.");
        System.out.println("Your parked hours:");
        int parkedHours = inputHours.nextInt();
        int totalFee = parkedHours * 3000;
        System.out.println("Your total fee is " + totalFee + " IDR.");
        inputHours.close();
    }
}
