package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name="omkar";
        obj.setName("omkar");
        obj.getName();
    }
}