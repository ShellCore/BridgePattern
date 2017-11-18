package com.shellcore.android.bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SandwichAbstract openSandwich = new Sandwich(new OpenSandwich(), "Jamón", "Queso");
        openSandwich.make();

        SandwichAbstract closedSandwich = new Sandwich(new ClosedSandwich(), "Jamón", "Queso");
        closedSandwich.make();

        SandwichAbstract doubleSandwich = new Sandwich(new DoubleSandwich(), "Milanesa", "Piña");
        doubleSandwich.make();
    }
}
