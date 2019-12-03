package com.games.auctionhouse.controller;

import com.games.auctionhouse.service.UserService;

public class UserController {
    UserService um =new UserService();
    //用户注册输入两个参数用户名和密码，注册成功返回信息
    public void register(String name,String psd){
            String s =um.register(name,psd);
            System.out.println(s);
    }
    //用户登录
    public int login(String usename,String psd){
            String a= um.login(usename,psd);
            if(a!=null){
                return 1;
            }
            return -1;
    }
    //展示用户信息
    public void show(String name,String psd){
        String a=um.show(name,psd);
        System.out.println(a);
    }
    //充值金币
    public void recharge(int m, String uname, String psd){
        String recharge =um.recharge(m,uname,psd);
        System.out.println(recharge);
    }
    //用户将商品上架
    public void addGoods(String uname,String goodsname,int price,String description){
        String a = um.addGoods(uname,goodsname,price,description);
        System.out.println(a);
    }
}
