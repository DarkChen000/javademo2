package com.lianxi_class.demo01;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("萝莉",17);
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("---------------------");
        System.out.println(s.toString());
        System.out.println("---------------------");

        System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));

        System.out.println(s.toString());

        System.out.println(s);
    }

}
