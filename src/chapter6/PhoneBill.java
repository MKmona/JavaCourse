package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    //Default constructor
    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    //Create 3 constructors
    //Constructor that accepts ID only
    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    //Constructor that accepts all fields
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    //get id method
    public int getId(){
        return id;
    }
    //set id method
    public void setId(int id){
        this.id = id;
    }
    //get basecost method
    public double getBaseCost(){
        return baseCost;
    }
    //set basecost method
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    //get allottedMinutes method
    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    //set allottedMinutes method
    public void setAllottedMinutes(int minutes){
        allottedMinutes = minutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutes) {
        minutesUsed = minutes;
    }
    // Create methods for calculations
    /**************************************************/

    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

///////////////////////////////////////////////
    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    ////////////////////////
    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    ////////////////////////////////////////////////////////////
    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}
