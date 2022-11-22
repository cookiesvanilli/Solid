package org.example;

public class Purchase {
    private final String title;
    private int count;


    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }


    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}