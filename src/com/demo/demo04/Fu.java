package com.demo.demo04;

class Fu {
    public int num = 100;
    public void show(){
        System.out.println("show Fu");
    }
    public static void function(){
        System.out.println("function Fu");
    }
}

class Zi extends Fu{
    public int num = 1000;
    public int num2 = 200;
    public void show(){
        System.out.println("show Zi");
    }
    public void method(){
        System.out.println("method Zi");
    }
    public static void function(){
        System.out.println("function Zi");
    }
}

class DuoTaiDemo{
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(((Zi) f).num);
//        System.out.println(((Zi) f).num2);
        f.show();
//        ((Zi) f).method();
        f.function();

    }
}