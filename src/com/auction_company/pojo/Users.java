package com.auction_company.pojo;

import javax.swing.undo.AbstractUndoableEdit;

public class Users {
    //用户类包括用户名，密码，初始资金，初始身份，百宝囊数组
    private String userName;
    private String password;
    private int money;
    private String ID;
    private ShoppingCarts[] us;

    //存取方法
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }

    public ShoppingCarts[] getUs() {
        return us;
    }
    public void setUs(ShoppingCarts[] us) {
        this.us = us;
    }

    //无参构造
    public Users(){ }
    //有参构造
    public Users(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

}
