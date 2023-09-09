package org.example.states;

import org.example.exception.NoItemFoundException;
import org.example.model.Item;
import org.example.model.VendingMachine;

public class DispenseState extends State {
    public DispenseState(VendingMachine vendingMachine) {
        super(vendingMachine);
        System.out.println("We're at Dispense State");
    }

    @Override
    public Item dispenseProduct(Integer codeNumber) throws NoItemFoundException {
        Item itemFromShelf = vendingMachine.getInventory().getItemFromShelf(codeNumber);
        System.out.println("Product has been dispensed.");
        vendingMachine.getInventory().updateSoldOutShelf(codeNumber);
        updateInventory(codeNumber);
        return itemFromShelf;
    }
}
