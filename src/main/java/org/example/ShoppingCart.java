package org.example;

import java.util.Map;

public class ShoppingCart {
    private static Purchase[] purchases;

    public ShoppingCart(int size) {
        purchases = new Purchase[size];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].getTitle().equals(title)) {
                purchases[i].setCount(purchases[i].getCount() + 1);
                return;
            }
        }
    }

    public Purchase[] getPurchases() {
        return purchases;
    }

    public static long sum(Map<String, Integer> prices, ShoppingCart shoppingCart) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase1 : shoppingCart.getPurchases()) {
            if (purchase1 == null) continue;
            long sumOfPurchase = (long) purchase1.getCount() * prices.get(purchase1.getTitle());
            System.out.println("\t" + purchase1.getTitle() + " " + purchase1.getCount() + " шт. в сумме " + (sumOfPurchase) + " руб.");
            sum += sumOfPurchase;
        }
        return sum;
    }
}
