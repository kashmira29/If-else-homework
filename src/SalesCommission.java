import java.util.Scanner;

public class SalesCommission {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sales id");
        String id = scanner.next();
        System.out.println("Sales name");
        String name = scanner.next();
        System.out.println("Sales amount");
        double SalesAmount = scanner.nextDouble();
        System.out.println("Salary basic");
        double SalaryBasic = scanner.nextDouble();
        //Sales commission
        if (SalesAmount >= 50000){
            System.out.println("sales commission= 35%");
        } else if (SalesAmount >= 30000){
            System.out.println("Sales commission= 20%");
        } else if (SalesAmount >=20000){
            System.out.println("Sales commission = 10%");
        } else if (SalesAmount >= 10000){
            System.out.println("Sales commission =5%");
        } else {
            System.out.println("Sales commission = 2%");
        }

    }
}
