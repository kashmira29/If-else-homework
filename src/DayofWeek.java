import java.util.Scanner;

public class DayofWeek {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        //input number and find out day of the week using if else
        if ( n == 1){
            System.out.println("today is Monday");
        }
        else if ( n == 2){
            System.out.println("today is Tuesday");
        }
        else if  ( n == 3){
            System.out.println("today is Wednesday");
        }
        else if  ( n == 4){
            System.out.println("today is Thursday");
        }
        else if  ( n == 5) {
            System.out.println("today is Friday");
        }
        else if  ( n == 6) {
            System.out.println("today is Saturday");
        }
        else if  ( n == 7) {
            System.out.println("today is Sunday");
        }
        else {
            System.out.println("Error");
        }

    }
}
