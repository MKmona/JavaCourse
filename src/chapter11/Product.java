package chapter11;

public interface Product {

    //We are going to create methods that have no bodies because they are abstract. we don't write the word abstract.

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return "no barcode";
    }
}
