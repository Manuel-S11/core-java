package com.engine.entity;

import java.math.BigDecimal;

public class Tea extends BeverageInfo{


    public Tea(
            String name,
            String category,
            String brand,
            double price,
            boolean isAvailable,
            String orderCount,
            String temperature,
            BeverageType beverageType
    ) {
        super(
                name,
                category,
                brand,
                price,
                isAvailable,
                orderCount,temperature,
                beverageType
        );

    }
    @Override
    public String brew() {

        String brewing = "Pour hot water over your tea leaves, let them steep for three minutes, then strain and enjoy your drink";
//        IO.println(brewing);
        return brewing;
    }

}
