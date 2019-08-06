import java.util.Scanner;

public class PassFail {
    public static void main(String args[]) {
        //Student Details
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Name: ");
        String name = scanner.next();
        System.out.println("enter rollNo: ");
        int rollNo = scanner.nextInt();
        //Subjects Marks
        System.out.println("enter physics marks: ");
        int a = scanner.nextInt();
        System.out.println("enter biology marks");
        int b = scanner.nextInt();
        System.out.println("enter mathematics marks:");
        int c = scanner.nextInt();
        // Pass or fail result
        if (a >= 35 && b >= 35 && c >= 35 ) {
        System.out.println("Result:"+"pass");
        } else {
        System.out.println("Result:"+"fail");
        }
    }
}























