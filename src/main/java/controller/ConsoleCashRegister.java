package controller;
import CsLinkedList.CsLinkedList;
import model.Item;
import model.Receipt;
import service.CustomerCheckout;
import java.util.Scanner;
//fix totalitems
//fix totalprice
public class ConsoleCashRegister {

    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) throws IllegalAccessException {
        String storeName;
        String description;
        double price;
        Item item1;
        String yesOrNo = "y";

        System.out.println("Please type the store you are visiting today");
        storeName = keyboard.nextLine();
        System.out.println("Please type the number of the store you are visiting today");
        String storeNum = keyboard.nextLine();
        CustomerCheckout customerCheckout = new CustomerCheckout(storeName, storeNum);
        System.out.println("Are you ready to scan an item? Please type Y or N");
        yesOrNo = keyboard.nextLine();

        while ("Y".equalsIgnoreCase(yesOrNo)) {
            String amount = "1";
            System.out.println("What is the name of the item? Quantity preceded by a comma please! ");
            description = keyboard.nextLine();

            int amount1 = 0;
            if (description.contains(",")) {
                String parts[] = description.split("\\,");
                amount = parts[1];
                 try {
                     amount1 = Integer.parseInt(amount);
                 } catch (NumberFormatException e){
                     System.out.println("That was invalid, please type a number.");
                 }
                description = parts[0];
                price = amount1;

            } else amount1 = 1;

            System.out.println("What is the price of your item?");
            price = Double.parseDouble(keyboard.nextLine());
            item1 = new Item(description, price);
            for( int i =0;i<amount1-1; i++){
                //item1 = new Item(description, price);
                customerCheckout.scanAnItem(item1);
            }

            customerCheckout.scanAnItem(item1);
            System.out.println("Are you ready to scan another item? Please type Y or N");
            yesOrNo = keyboard.nextLine();

        }

            Receipt receipt = customerCheckout.endTransaction();
            System.out.println(receipt);

        }




    }

