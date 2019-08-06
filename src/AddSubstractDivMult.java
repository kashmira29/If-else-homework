import java.util.Scanner;

public class AddSubstractDivMult {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter first number");
        int a = scanner.nextInt();
        System.out.println( "Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter the operator +,-,*,/ ");
        char operator = scanner.next().charAt(0);
        //Addition
        if ( operator == '+'){
            System.out.println("Addition of two numbers: " + (a+b));
        }
        //Subtraction
        else if (operator == '-'){
            System.out.println("Subtraction of two numbers: " + (a-b));
        }
        //Multiplication
        else if (operator == '*'){
            System.out.println("Multiplication of two numbers: " + (a*b));
        }
        //Division
        else if (operator == '/'){
            System.out.println("Division of two numbers: " + (a/b));
        }
        //Error if not from any operator
        else {
            System.out.println("Error: Please Enter Valid Operator from list.");
        }

    }
}
