package com.demo.demo02;

public class Z extends X{
    Y y = new Y();
    Z(){
        System.out.println("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}
