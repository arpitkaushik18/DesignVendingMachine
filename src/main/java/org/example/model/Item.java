package org.example.model;

public class Item {

    int price;
    ItemType itemType;

    public Item() {
        this.price = 0;
        this.itemType = null;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }


}
