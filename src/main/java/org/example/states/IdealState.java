package org.example.states;

import org.example.model.Coin;
import org.example.model.VendingMachine;

import java.util.ArrayList;

public class IdealState extends State{
    public IdealState(VendingMachine vendingMachine) {
        super(vendingMachine);
        System.out.println("We're at ideal state now");
    }

    @Override
    public void pressInsertCoin() {
        System.out.println("Please Insert Coin");
        vendingMachine.setState(new HasMoneyState(vendingMachine));
    }
}
