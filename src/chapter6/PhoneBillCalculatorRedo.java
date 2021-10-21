package chapter6;

public class PhoneBillCalculatorRedo {
    public static void main(String args[]){

        //We have to create an object first because methods in PhoneBill class are non-static
        // we create the object to be able to access methods in that class
        // We use the constructor that accepts ID only
        PhoneBill bill = new PhoneBill(123456);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();

    }
}
