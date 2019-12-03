package com.games.auctionhouse.controller;

import com.games.auctionhouse.service.PayService;

public class PayController {
    PayService ps =new PayService();
    //判断商品总价
    public int  settlement(String uname){
        return ps.settlement(uname);
    }
    //判断用户金额是否大于商品总价
    public int judge(String name,int num){
        return ps.judge(name,num);
    }
    //拍卖品结算功能,商品总价
   /* public  void settlement(String uname){
        String a = ps .settlement(uname);
        System.out.println(a);
    }*/
    public void  goodsByTBag(String name){
        String a = ps.goodsByTBag(name);
        System.out.println(a);
    }
}
