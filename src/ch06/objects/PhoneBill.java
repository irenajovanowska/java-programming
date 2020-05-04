package ch06.objects;
/* A phone bill should have id, base cost, number of allotted minutes, and number of minutes used
 * One should be able to calculate the overage, tax and total and also print the itemized bill
 * Include constructors: default, id-only, all fields.
 * No matter which constructor is used - all fields should be set.
 * Create a class that instantiates a phone bill and prints the itemized bill.
 */

public class PhoneBill {
    //Fields (characteristics)
    int billID;
    double baseCost;
    int allocatedMinutes;
    int minutesUsed;

    //Initializing constructors
    public PhoneBill(){
        billID = 0;
        baseCost = 30;
        allocatedMinutes = 200;
        minutesUsed = 200;
    }

    public PhoneBill(int id) {
        this.billID = id;
        baseCost = 30;
        allocatedMinutes = 200;
        minutesUsed = 200;
    }

    public PhoneBill(int invoiceId, double baseFee, int minutesFree, int minutesToPay) {
        this.billID = invoiceId;
        this.baseCost = baseFee;
        this.allocatedMinutes = minutesFree;
        this.minutesUsed = minutesToPay;
    }

    //Getter and setter methods for each field
    public int getBillID(){
        return billID;
    }

    public void setBillID(int id) {
        this.billID = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double base) {
        this.baseCost = base;
    }

    public int getAllocatedMinutes() {
        return allocatedMinutes;
    }

    public void setAllocatedMinutes(int minutes) {
        this.allocatedMinutes = minutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutes) {
        this.minutesUsed = minutes;
    }

    //Methods (Actions)
    public double calculateOverage() {
        if(minutesUsed <= allocatedMinutes) {
            return 0;
        }
        double overageRate = .25;
        double minutesOverage = minutesUsed - allocatedMinutes;
        return overageRate * minutesOverage;
    }

    public double calculateTax() {
        double taxRate = .15;
        return taxRate * (baseCost + calculateOverage());
    }

    public void calculateTotalAndDisplayBill() {
        double total = baseCost + calculateOverage() + calculateTax();
        System.out.println("Phone Bill ID: " + billID);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Rate: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax Rate: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
