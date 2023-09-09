package org.example.states;

import org.example.exception.InSufficentFundException;
import org.example.exception.NoItemFoundException;
import org.example.model.Coin;
import org.example.model.Item;
import org.example.model.VendingMachine;

import java.util.List;

public class ProductSelectionState extends State {
    public ProductSelectionState(VendingMachine vendingMachine) {
        super(vendingMachine);
        System.out.println("We're at product selection state");
    }

    @Override
    public void selectProduct(int code) throws NoItemFoundException, InSufficentFundException {

        Item item = vendingMachine.getInventory().getItemFromShelf(code);

        int amountPaidByUser = 0;

        for(Coin coin : vendingMachine.getCoinList()){
                amountPaidByUser += coin.value;
        }

        if(item.getPrice() > amountPaidByUser){

            System.out.println("Money provided by user "+ amountPaidByUser + " item cost : " + item.getPrice() +" are less.");
            refundAmount();
            throw new InSufficentFundException("money is not enough to get product.");

        }else{
            getChange(amountPaidByUser- item.getPrice());
            vendingMachine.setState(new DispenseState(vendingMachine));
        }
    }

    private int getChange(int leftMoney) {
        System.out.println("Please get the left money");
        return leftMoney;
    }

    @Override
    public List<Coin> refundAmount() {
        System.out.println("Please get refund money");
        return vendingMachine.getCoinList();
    }
}
