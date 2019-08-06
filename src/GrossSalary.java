import java.util.Scanner;

public class GrossSalary {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //Employee ID
        System.out.println("enter employee id:");
        String employeeId = scanner.next();
        //Employee Name
        System.out.println("enter employee name:");
        String name =scanner.next();
        //basic salary
        System.out.println("enter basic salary:");
        double salary = scanner.nextDouble();;
        //calculate HRA= 10% of salary
        double HRA = ((salary*10)/100);
        System.out.println("HRA of salary: "+ HRA);
        //calculate DA of salary = 8% of salary
        double DA =((salary*8)/100);
        System.out.println("DA of salary:" + DA);
        //calculate TA of salary = 9% of salary
        double TA =((salary*9)/100);
        System.out.println("TA of salary:" + TA);
        //calculate PF of salary = 20% of salary
        double PF =((salary*20)/100);
        System.out.println("PF of salary:" + PF);
        //Gross salary
        double grossSalary = (salary+HRA+TA+DA-PF);
        System.out.println("Gross salary:"+ grossSalary);















    }
}
