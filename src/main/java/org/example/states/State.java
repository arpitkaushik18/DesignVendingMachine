package org.example.states;

import org.example.exception.InSufficentFundException;
import org.example.exception.NoItemFoundException;
import org.example.model.Coin;
import org.example.model.Item;
import org.example.model.VendingMachine;

import java.util.List;

public abstract class State {

    VendingMachine vendingMachine;

    public State(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void pressInsertCoin(){
        System.out.println("Locked ...");
    }
    public  void pressProductSelectionButton(){
        System.out.println("Locked ...");
    }
    public  void insertCoin(Coin coin){
        System.out.println("Locked ...");
    }
    public  void selectProduct(int code) throws NoItemFoundException, InSufficentFundException {
        System.out.println("Locked ...");
    }

    public List<Coin> refundAmount(){
        System.out.println("Locked ...");
        return null;
    }

    public Integer getChange(){
        System.out.println("Locked ...");
        return null;
    }

    public Item dispenseProduct(Integer codeNumber) throws NoItemFoundException {
        System.out.println("Locked ...");
        return null;
    }

    public void updateInventory(Integer codeNumber){
        vendingMachine.getInventory().updateSoldOutShelf(codeNumber);
    }
}
