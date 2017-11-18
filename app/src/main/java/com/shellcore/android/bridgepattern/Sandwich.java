package com.shellcore.android.bridgepattern;

/**
 * Created by Shell on 18/11/2017.
 */

public class Sandwich extends SandwichAbstract {

    private String filling1;
    private String filling2;

    public Sandwich(SandwichInterface sandwichInterface, String filling1, String filling2) {
        super(sandwichInterface);
        this.filling1 = filling1;
        this.filling2 = filling2;
    }

    @Override
    public void make() {
        sandwichInterface.makeSandwich(filling1, filling2);
    }
}
