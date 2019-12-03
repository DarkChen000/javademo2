package com.games.auctionhouse.service;

import com.games.auctionhouse.dao.ShopDao;

public class ShopService {
    ShopDao sd =new ShopDao();
    //拍卖品放入购物车,传入用户姓名，商品序号
    public String addGoods(String uname,int num){
        int n =sd.addGoods(uname,num);
        if(n==-1){
            return "购物车已满，不能再加入商品！！";
        }
        return "已加入购物车";
    }
    //清理购物车产品
    public int reduce(String uName,String goodsName){
       return sd.reduce(uName,goodsName);
    }
}
