package com.demo.demo03;

public class Fu {
    public int num = 10;
    public final int num2 = 20;

    public final void show(){

    }
}

class Zi extends Fu{
    int age = 10;
//    public void show(){
//        num = 100;
//        System.out.println("num");
//
//        num2 = 200;
//        System.out.println("num2");
//    }
}

class FinalDemo{
    public static void main(String[] args) {
        final Zi z = new Zi();
//        z.show();
        System.out.println(z.age);
        z.age = 100;
        System.out.println(z.age);

//        z = new Zi();

    }
}