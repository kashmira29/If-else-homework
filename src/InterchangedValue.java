import java.util.Scanner;

public class InterchangedValue {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = scanner.nextInt();
        System.out.println("Enter value of y");
        int y = scanner.nextInt();
        System.out.println("Before swapping : \n" + "x = " + x + "\ny = " + y );
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping : \n" + "x = " + x + "\ny = " + y );

    }
}
