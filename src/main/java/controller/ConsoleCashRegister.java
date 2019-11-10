package controller;
import model.Item;
import service.CustomerCheckout;
import java.util.Scanner;


public class ConsoleCashRegister {

    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) throws IllegalAccessException {
        String storeNum;
        String storeName;
        String description;
        double price;
        Item item1;

        System.out.println("Please type the store you are visiting today");
        storeName = keyboard.nextLine();
        System.out.println("Please type the number of the store you are visiting today");
        storeNum = keyboard.nextLine();
        CustomerCheckout customerCheckout = new CustomerCheckout(storeName, storeNum);
        System.out.println("Are you ready to scan an item? Please type Y or N");
        String yesOrNo = keyboard.nextLine();

        while (yesOrNo.equalsIgnoreCase("Y")){
            System.out.println("What is the name of the item?");
            description = keyboard.nextLine();
            System.out.println("What is the price of your item?");
            price = Double.parseDouble(keyboard.nextLine());
            item1 = new Item(description, price);

            customerCheckout.scanAnItem(item1);
            customerCheckout.scanAnItem(description, 4);
            System.out.println("Are you ready to scan another item? Please type Y or N");}

            customerCheckout.endTransaction();

        }




    }

