package ch05.methods;

/* Calculate the final total of someone's cell phone bill
 * The operator inputs the plan fee and number of overage minutes
 * Each overage minute is charged $0.25
 * Tax subtotal rate is 15%
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Phone Bill Calculation \nEnter your plan fee:");
        double basicCharge = scanner.nextDouble();

        System.out.println("Enter number of overage minutes:");
        int overageMinutes = scanner.nextInt();
        scanner.close();

        double overageCharge = calculateOverage(overageMinutes);
        double tax = calculateTax(basicCharge + overageCharge);
        double total = calculateTotal(basicCharge + overageCharge, tax);

        System.out.println("Phone Bill Statement" +
                "\nPlan: $" + String.format("%.2f", basicCharge) + "" +
                "\nOverage: $" + String.format("%.2f", overageCharge) + "" +
                "\nTax: $" + String.format("%.2f", tax) + "" +
                "\nTotal: $" + String.format("%.2f",total));
    }
    public static double calculateOverage(int extraMinutes) {
        double overageRate = .25;
        return extraMinutes * overageRate;
    }
    public static double calculateTax(double subtotal) {
        int taxRate = 15;
        return subtotal / 100 * taxRate;
    }
    public static double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }
}
