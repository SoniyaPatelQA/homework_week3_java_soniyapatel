package homeworkWeek3;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Programme7CalculateCommission {

    public void salesCommission(int salesAmount) {
        if (salesAmount >= 50000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.35));
        } else if (salesAmount >= 30000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.20));
        } else if (salesAmount >= 20000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.10));
        } else if (salesAmount >= 10000) {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.05));
        } else  {
            System.out.println("commission for '"+salesAmount+"' sales amount = " + (salesAmount * 0.02));
        }
    }

    public void printpersonInfo(int salesId, String sellerName, int salesAmount, int basicSalary) {
        /*System.out.println("SalesId: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + basicSalary);*/
        salesCommission(salesAmount);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter sales id: ");
        int salesId = scn.nextInt();
        scn.skip("\\R?");
        System.out.print("Enter seller's name: ");
        String sellerName = scn.nextLine();
        System.out.print("Enter sales amount: ");
        int salesAmount = scn.nextInt();
        System.out.print("Enter salary basic: ");
        int basicSalary = scn.nextInt();
        scn.close();

        Programme7CalculateCommission obj = new Programme7CalculateCommission();
        obj.printpersonInfo(salesId, sellerName, salesAmount, basicSalary);
    }
}
