package com.company;

public class Information {
    private int data;
    private String model;
    private int prices;
    private String color;


    public Information(int data, String model, int prices, String color) {
        this.data = data;
        this.model = model;
        this.prices = prices;
        this.color = color;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Information{" +
                "data=" + data +
                ", model='" + model + '\'' +
                ", prices=" + prices +
                ", color='" + color + '\'' +
                '}';
    }
}
