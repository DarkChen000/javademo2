package com.games.auctionhouse.pojo;

import java.util.Arrays;

public class Users {
    private String userName;//用户名
    private String userPsd;//用户密码
    private int money;//用户金币
    private String level;//用户级别
    protected ShoppingCars[] tBag;//百宝囊
    //存入和输出用户姓名
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }
    //存入和输出用户密码
    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }
    public String getUserPsd() {
        return this.userPsd;
    }
    //存入和输出用户金币
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return this.money;
    }
    //存入和输出用户级别
    public void setLevel(String level) {
        this.level = level;
    }
    public String getLevel() {
        return this.level;
    }
    //存入和输出用户拍卖品
    public void settBag(ShoppingCars[] tBag) {
        this.tBag = tBag;
    }
    public ShoppingCars[] gettBag() {
        return this.tBag;
    }
    //展示用户信息

    @Override
    public String toString() {
        return "Users{" +
                "tBag=" + Arrays.toString(tBag) +
                '}';
    }

   /* public static void main(String[] args) {
        Users[] u =new Users[10];
        ShoppingCars scc =new ShoppingCars();
        ShoppingCars [] sc =new ShoppingCars[10];
        scc.setGoodsName("111");
        scc.setGoodsPrice(100);
        scc.setGoodsDescription("很好");
        u[0].gettBag()[0].setGoodsDescription("很好");;
        System.out.println(u[0].gettBag()[0].toString());
    }*/
}
