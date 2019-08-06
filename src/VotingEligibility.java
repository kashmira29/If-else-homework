import java.util.Scanner;

public class VotingEligibility {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("person is Eligible to vote");
        } else {
            System.out.println("person is not eligible to vote");

        }
    }
}