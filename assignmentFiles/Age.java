package assignmentFiles;
import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = inputAge.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.print("You are " + age + " years old.");
        inputAge.close();
    }
}
