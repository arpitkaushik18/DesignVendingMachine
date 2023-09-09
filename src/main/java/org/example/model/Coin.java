package org.example.model;

public enum Coin {

    ONE_RUPEES(1),

    TWO_RUPEES(2),
    FIVE_RUPEES(5),

    TEN_RUPEES(10);

    public int value;
    Coin(int val){
        this.value = val;
    }
}
