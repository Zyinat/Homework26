package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Map<Car,Information>map=new HashMap<>();
        Car car1=new Car(5,5555);
        Information information=new Information(2022,"Tesla",55000,"Chernyi");
        map.put(car1,information);

for (Map.Entry m:map.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
}



    }}