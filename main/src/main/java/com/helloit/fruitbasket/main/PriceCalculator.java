package com.helloit.fruitbasket.main;

import java.util.List;

/**
 * Created by Student on 6/2/2016.
 */
public class PriceCalculator {

    public double calculateTotalPrice(final Basket basket) {
        double result = 0.0;

        final List<Fruit> fruits = basket.getFruits();
        for (final Fruit item : fruits) {
            result += item.getPrice();
        }


        return result;
    }
}
