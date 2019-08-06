import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int i = scanner.nextInt();
        //Find out given number is positive,negative or zero
        if (i > 0) {
            System.out.println("Given value is"+ " "+"positive number");
        } else if (i < 0) {
            System.out.println("Given value is"+ "  "+ "negative number");
        } else {
            System.out.println("Given value is"+" "+"zero");


        }
    }
}

