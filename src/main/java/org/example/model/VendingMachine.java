package org.example.model;

import org.example.states.IdealState;
import org.example.states.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private Inventory inventory;
    private List<Coin> coinList;
    private State state;


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public VendingMachine() {
        this.inventory = new Inventory(10);
        this.coinList = new ArrayList<>();
        this.state = new IdealState(this);
    }
}
