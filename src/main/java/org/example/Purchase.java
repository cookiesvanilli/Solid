package org.example;

import java.util.HashMap;
import java.util.Map;

public class Purchase {
    private String title;
    private int count;
    private Purchase[] purchases;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase(int size) {
        this.purchases = new Purchase[size];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public Purchase[] getPurchase() {
        return purchases;
    }
}