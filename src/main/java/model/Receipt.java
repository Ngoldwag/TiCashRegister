package model;

import CsLinkedList.CsLinkedList;

import java.util.Date;

public class Receipt {


    private String storeName;
    private String storeNumber;
    private Double totalPrice;
    private Integer totalItems;
    private Date date;
    private CsLinkedList<Item> itemList;

    public String getStoreName() {
        return storeName;
    }

    public String getStoreNumber() { return storeNumber; } //testtwo

    public Double getTotalPrice() {
        return totalPrice;
    } //testthree

    public Integer getTotalItems() {
        return totalItems;
    } //testfour

    public Date getDate() {
        return date;
    }

    public CsLinkedList<Item> getItemList() {
        return itemList;
    }

    public Receipt(String storeName, String storeNumber) {
        this.storeName = storeName;
        this.storeNumber = storeNumber;
        itemList = new CsLinkedList<Item>();
        totalItems = 0;
        totalPrice = 0.0;
        date = new Date();
    }

    public void add(Item itemToScan) throws IllegalAccessException {
        itemList.add(itemToScan);
        totalPrice += itemToScan.getPrice();
        totalItems++;
    }

}
