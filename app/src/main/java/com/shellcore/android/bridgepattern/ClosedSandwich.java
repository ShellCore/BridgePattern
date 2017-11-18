package com.shellcore.android.bridgepattern;

import android.util.Log;

/**
 * Created by Shell on 18/11/2017.
 */

public class ClosedSandwich implements SandwichInterface {

    private static final String TAG = "ClosedSandwich";

    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(TAG, "makeSandwich: " + filling1 + ", " + filling2);
    }
}
