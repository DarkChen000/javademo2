package com.car.pojo;

public class Car {
    //父类，参数有颜色、车主姓名
    protected String color;
    protected String userName;

    //有参构造
    public Car(String color,String userName){
        this.color = color;
        this.userName = userName;
    }

    //普通成员方法
    public void use(){
        System.out.println("我是机动车");
    }

    public static boolean equals(Car car1,Car car2){
        if (car1.color.equals(car2.color) && car1.userName.equals(car2.userName)){
            return true;
        }
        return false;
    }

    public String toString(){
        return null;
    }


//    public String getColor() {
//        return this.color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getUserName() {
//        return this.userName;
//    }
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
}
