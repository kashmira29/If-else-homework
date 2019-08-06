import java.util.Scanner;

public class AlphabetUppercase {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter alphabet in uppercase:");
        String a = scanner.nextLine();
        //convert to Lowercase
        System.out.println(a.toLowerCase());

    }

}

