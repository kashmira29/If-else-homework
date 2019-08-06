import java.util.Scanner;

public class AlphabetNumSymbol {
    public static void main(String args[]){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("input any value");
        char value = scanner.nextLine().charAt(0);
        //to check given value is alphabet
        if( (value >= 65 && value <= 90) || (value >= 97 && value <= 122)){
            System.out.println("Given value is alphabet");
        } //to check given value is Digit
         else if (value >= 48 && value <= 57) {
            System.out.println("Given value is Digit");
        }
        //to check given value is Symbol
         else {
            System.out.println("Given value is Symbol");
         }

}
}

