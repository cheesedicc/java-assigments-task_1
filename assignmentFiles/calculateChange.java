package assignmentFiles;
import java.util.Scanner;

public class calculateChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount:");
        int totalAmount = input.nextInt();
        System.out.println("Enter the amount paid:");
        int amountPaid = input.nextInt();
        int change = 0;
        int moneyNeeded = 0;
        if(amountPaid > totalAmount){
            change = amountPaid - totalAmount;
            System.out.println("Your change is " + change + " IDR.");
        }
        else if (amountPaid == totalAmount){
            System.out.println("Thanks for your purchase.");
        }
        else {
            moneyNeeded = totalAmount - amountPaid;
            System.out.println("You need " + moneyNeeded + " IDR more for the purchase.");
        }
        input.close();
    }
}
