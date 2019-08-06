import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class StudentMraksheet {
    public static void main(String args[]) {
        //student details
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Name: ");
        String name = scanner.next();
        System.out.println("enter rollNo: ");
        int rollNo = scanner.nextInt();
        //student's' marks
        System.out.println("enter physics marks: ");
        int a = scanner.nextInt();
        System.out.println("enter biology marks:");
        int b = scanner.nextInt();
        System.out.println("enter mathematics marks:");
        int c = scanner.nextInt();
        //total marks
        int total = (a + b + c );
        System.out.println("total marks:" + total);
        //Percentage
        float percentage = (total*100) / 300;
        //Result
        System.out.println("percentage: "+ percentage);
        if(percentage >= 35){
            System.out.println("Result:"+"pass");
        }
        else if(percentage < 35){
            System.out.println("Result :"+"fail");
        }
        //Grade
        if (percentage >= 80) {
            System.out.println("Grade: " +"A+");
        } else if (percentage >= 60) {
            System.out.println("Grade: "+"A");
        } else if (percentage >= 50) {
            System.out.println("Grade: "+ "B");
        } else if (percentage >= 35) {
            System.out.println("Grade: "+"C");
        }
    }
}




