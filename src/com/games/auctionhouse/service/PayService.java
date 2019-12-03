package com.games.auctionhouse.service;

import com.games.auctionhouse.dao.PayDao;

public class PayService {
    PayDao pd = new PayDao();
    //判断购物车商品总价
    public int  settlement(String uname){
        return pd.settlement(uname);
    }
    //判断用户金额是否可以进行支付
    public int judge(String name,int num){
        return pd.judge(name,num);
    }
    //把购买商品存入百宝囊
    public String  goodsByTBag(String name){
        int a =pd.goodsByTBag(name);
        if (a!=2){
            return "购买失败";
        }
        return "商品已放入您的百宝囊，请注意查收";
    }
}

