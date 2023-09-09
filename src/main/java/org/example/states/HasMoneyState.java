package org.example.states;

import org.example.model.Coin;
import org.example.model.VendingMachine;

public class HasMoneyState extends State {
    public HasMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
        System.out.println("We're at Has money State.");
    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.getCoinList().add(coin);
        System.out.println("We've added the coin");
    }

    @Override
    public void pressProductSelectionButton() {
        vendingMachine.setState(new ProductSelectionState(vendingMachine));
    }
}
