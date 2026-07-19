package com.engine;

import com.engine.entity.BeverageInfo;
import com.engine.entity.BeverageType;
import com.engine.entity.Tea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        BeverageInfo tea = new Tea(
                "Classic Milk Tea",
                "Bubble Tea",
                "Chatime",
                4,
                true,
                "tea-152",
                "Cold",
                BeverageType.TEA
        );
        tea.prepareBeverageForIceType();

    }

}
