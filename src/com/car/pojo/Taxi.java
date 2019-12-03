package com.car.pojo;

public class Taxi extends Car{
    //子类出租车，属性所属公司
    private String company;
    //公有存取方法
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    //调用父类构造方法
    public Taxi(String color,String userName,String company){
        super(color,userName);
        this.company = company;
    }

    //方法重写
    public void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    public final void ride(){
        System.out.println(userName + "的出租车是所属于" + company + "的");
    }

    public String toString(){
        return userName+"拥有一辆"+color+"的出租车";
    }



}
