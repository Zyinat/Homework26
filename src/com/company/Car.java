package com.company;

public class Car {
    private int Id;
    private int number;

    public Car(int id, int number) {
        Id = id;
        this.number = number;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", number=" + number +
                '}';
    }
}

