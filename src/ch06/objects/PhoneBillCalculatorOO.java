package ch06.objects;
/* A phone bill should have id,base cost, number of allotted minutes, and number of minutes used
 * One should be able to calculate the overage, tax and total and also print the itemized bill
 * Include constructors: default, id-only, all fields.
 * No matter which constructor is used - all fields should be set.
 * Create a class that instantiates a phone bill and prints the itemized bill.
 */

public class PhoneBillCalculatorOO {
    public static void main(String args[]) {
        PhoneBill bill = new PhoneBill(21012020);
        bill.setMinutesUsed(230);
        bill.calculateTotalAndDisplayBill();
    }
}
