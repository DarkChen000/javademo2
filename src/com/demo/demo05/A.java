package com.demo.demo05;

public class A {
    public void show(){show2();}
    public void show2(){
        System.out.println("我");
    }
}
class B extends A{
    public void show(){show2();}
    public void show2(){
        System.out.println("爱");
    }
}
class C extends B{
    public void show(){super.show();}
    public void show2(){
        System.out.println("你");
    }
}
