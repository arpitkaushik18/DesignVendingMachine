package org.example.model;

public class ItemShelf {

    int code;
    Item item;
    Boolean soldOut;

    public ItemShelf(int code, Boolean soldOut) {
        this.code = code;
        this.soldOut = soldOut;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }
}
