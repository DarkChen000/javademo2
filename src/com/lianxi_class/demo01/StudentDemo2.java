package com.lianxi_class.demo01;

public class StudentDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("萝莉",27);
        Student s2 = new Student("萝莉",27);
        System.out.println(s1 == s2);
        Student s3 = s1;
        System.out.println(s1 == s3);
        System.out.println("-------------------------");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s3));
        Student s4 = new Student("秋明",30);
        System.out.println(s1.equals(s4));

        Demo d = new Demo();
        System.out.println(s1.equals(d));

    }
}
    class Demo{}

