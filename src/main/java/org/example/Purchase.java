package org.example;

import java.util.HashMap;
import java.util.Map;

public class Purchase {
    //лучше использовать private и не указывать конкретные данные new Purchase[4]
/*    protected String title;
    protected int count;
    protected Purchase[] purchases = new Purchase[4];*/

    private final Map<String, Integer> products;
    private final Map<String, Integer> purchases = new HashMap<>();

    public Purchase() {
        Data data = Data.getInstance();
        products = data.getProducts();
    }

    public void addPurchase(String title, int count) {
     /*   for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count, products);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }*/
        purchases.put(title, purchases.getOrDefault(title, 0) + count);
    }

/*    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }*/

    public void printStart() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
        System.out.println("Введите два слова: название товара и количество. Или end");
    }


    public void printTotal() {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Map.Entry<String, Integer> entryMap : purchases.entrySet()) {
            System.out.println("\t" + entryMap.getKey() + " " + entryMap.getValue()
                    + " шт. в сумме " + (entryMap.getValue() * products.get(entryMap.getKey()) + " руб."));
            sum += (long) entryMap.getValue() * products.get(entryMap.getKey());
        }
        System.out.println("ИТОГО: " + sum);
    }
}