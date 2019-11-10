package model;

public class Item {
    private double price;
    private String description;

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Item (String description, double price)
    {
       this.description = description;
        this.price = price;
    }


}
