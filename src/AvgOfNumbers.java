import java.util.Scanner;

public class AvgOfNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();
        System.out.println("enter third number");
        int c = scanner.nextInt();
        System.out.println("enter fourth number");
        int d = scanner.nextInt();
        System.out.println("enter fifth number");
        int e = scanner.nextInt();
        //calculate average of 5 numbers
        System.out.println("Average of numbers:"+ (a+b+c+d+e)/(float)5);

    }
}
