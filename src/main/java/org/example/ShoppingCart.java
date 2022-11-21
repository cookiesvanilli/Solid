package org.example;

import java.util.Map;

public class ShoppingCart {
    public static long sum(Map<String, Integer> prices, Purchase purchase) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase1 : purchase.getPurchase()) {
            if (purchase1 == null) continue;
            long sumOfPurchase = (long) purchase1.getCount() * prices.get(purchase1.getTitle());
            System.out.println("\t" + purchase1.getTitle() + " " + purchase1.getCount() + " шт. в сумме " + (sumOfPurchase) + " руб.");
            sum += sumOfPurchase;
        }
        return sum;
    }
}
