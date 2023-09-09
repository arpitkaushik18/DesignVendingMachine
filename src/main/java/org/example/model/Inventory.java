package org.example.model;

import org.example.exception.ItemNotSoldOutException;
import org.example.exception.NoItemFoundException;

public class Inventory {

    ItemShelf[] itemShelves = null;

    public Inventory(int itemCount) {
        this.itemShelves = new ItemShelf[itemCount];
        initializeShelves();
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    private void initializeShelves() {

        int startCode = 101;

        for(int i = 0 ; i < 10 ;i++){
            ItemShelf space = new ItemShelf(startCode,false);
            itemShelves[i] = space;
            startCode+=1;
        }

    }

    public void addItemToShelf(Item item, int code) throws ItemNotSoldOutException {

        for(ItemShelf itemShelf : itemShelves){
            if(itemShelf.getCode() == code){
                if(itemShelf.getSoldOut()){
                    itemShelf.setItem(item);
                }else{
                    throw new ItemNotSoldOutException("Item is not sold out. can not assign item in this shelf");
                }
            }
        }
    }

    public Item getItemFromShelf(int code) throws NoItemFoundException {

        for(ItemShelf itemShelf : itemShelves){
            if(itemShelf.getCode() == code){
               return itemShelf.getItem();
            }
        }

        throw new NoItemFoundException("NO item is there for code. " + code);
    }

    public void updateSoldOutShelf(int code){
        for(ItemShelf itemShelf : itemShelves){
            if(itemShelf.getCode() == code){
                itemShelf.setSoldOut(true);
            }
        }
    }

}
