import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){

        //evenOdd using turnery operator(? :)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number:");
        int num2 = scanner.nextInt();

        String evenOdd = (num1 % 2 == 0) ? "even" : "odd";
        System.out.println("First Number " + num1 +"  " +"is"+ "  "  + evenOdd);
        String evenOdd2 = (num2 % 2 == 0) ? "even" : "odd";
        System.out.println("Second Number " + num2 +"  " +"is"+ "  "  + evenOdd2);










    }


}
