package com.car.pojo;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("蓝色","张小明");
        Car car2 = new Car("蓝色","张小明");
        boolean a = Car.equals(car1,car2);
        car1.use();//父类方法
        System.out.println("car1和car2的应用比较：" + a);

        System.out.println("======================================");

        Car t1 = new Taxi("蓝色","张小明","长生公司");
        ((Taxi) t1).ride();
        t1.use();//方法重写
        String b = t1.toString();
        System.out.println(b);

        System.out.println("======================================");

        Car h1 = new HomeCar("紫色","孙二娘",7);
        ((HomeCar) h1).display();
        ((HomeCar) h1).display(7);//方法重载
    }

}
