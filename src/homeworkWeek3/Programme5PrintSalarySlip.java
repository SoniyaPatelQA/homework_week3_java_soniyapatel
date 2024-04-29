package homeworkWeek3;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * <p>
 * Print in following format
 * <p>
 * _______________________________
 * |           Salary Slip         |
 * |______________________________|
 * | Employee Id     : 2564        |
 * | Employee Name   : Jay          |
 * |______________________________|
 * | Basic Salary    : 25000.0     |
 * | HRA 10%         : 2500.0      |
 * | TA 8%           : 2250.0      |
 * | DA 9%           : 2000.0      |
 * | PF - 20&        : 5000.0      |
 * |______________________________|
 * | Gross Salary    : 26750.0    |
 * |==============================|
 */

public class Programme5PrintSalarySlip {

    public void printSalarySlip(int empId, String empName, double basicSalary) {

        double hra = basicSalary * 10 / 100;
        double da = basicSalary * 8 / 100;
        double ta = basicSalary * 9 / 100;
        double pf = basicSalary * 20 / 100;
        double grossSal = basicSalary + hra + da + ta - pf;

        System.out.println(" _______________________________");
        System.out.println("|             Salary Slip       |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id         :" + empId + "     |");
        System.out.println("| Employee Name       :" + empName + "      |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary        :" + basicSalary + "  |");
        System.out.println("| HRA 10%             :" + hra + "   |");
        System.out.println("| TA 8%               :" + ta + "   |");
        System.out.println("| DA 9%               :" + da + "   |");
        System.out.println("| PF - 20&            :" + pf + "   |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary        :" + grossSal + "  |");
        System.out.println("|===============================|");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int empId = scn.nextInt();
        scn.skip("\\R?");
        System.out.print("Enter Employee Name: ");
        String empName = scn.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scn.nextDouble();
        scn.close();
        Programme5PrintSalarySlip obj = new Programme5PrintSalarySlip();
        obj.printSalarySlip(empId, empName, basicSalary);

    }
}
