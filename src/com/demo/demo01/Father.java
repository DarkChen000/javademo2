package com.demo.demo01;

//考察继承里子类的构造方法关系

class Father {
    public Father(String name){
        System.out.println("Father的带参构造方法");
    }
}

class Son extends Father{
    public Son(){
        super("随便给");
        System.out.println("Son的无参构造方法");
    }

    public Son(String name){
        this();
        System.out.println("Son的有参构造方法");
    }
}

class ExtentsDemo{
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("====================");
        Son ss = new Son("小白");
    }
}
