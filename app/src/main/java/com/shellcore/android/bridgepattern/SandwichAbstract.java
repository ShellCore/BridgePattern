package com.shellcore.android.bridgepattern;

/**
 * Created by Shell on 18/11/2017.
 */

public abstract class SandwichAbstract {

    protected SandwichInterface sandwichInterface;

    public SandwichAbstract(SandwichInterface sandwichInterface) {
        this.sandwichInterface = sandwichInterface;
    }

    public abstract void make();
}
