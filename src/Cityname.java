import java.util.Scanner;

public class Cityname {
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter cityname");
    char c = scanner.nextLine().charAt(0);
    //if city names between a to f is valid otherwise invalid
    if (c =='a' || c =='b' || c =='c' || c=='d' || c=='e' || c =='f' ){
        System.out.println("City name :" + "valid");
    } else {
        System.out.println("City name:" + "invalid");
    }

    }
}


