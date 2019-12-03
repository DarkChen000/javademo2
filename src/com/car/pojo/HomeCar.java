package com.car.pojo;

public final class HomeCar extends Car{
    //子类私家车，属性载客数
    private int num;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    //调用父类构造方法
    public HomeCar(String color,String userName,int num){
        super(color,userName);
        this.num = num;
    }

    public void display(){
        System.out.println(userName + "拥有的" + color + "颜色的私家车，有" + num + "个座位");
    }
    public void display(int num){
        System.out.println("家用汽车大多拥有" + num + "个座位");
    }
}
