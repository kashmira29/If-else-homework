import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //find out alphabet is vowel or consonant
        System.out.println("enter the alphabet:");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Given alphabet is vowel");
        } else {
            System.out.println("Given alphabet is consonant");

        }
    }
}
