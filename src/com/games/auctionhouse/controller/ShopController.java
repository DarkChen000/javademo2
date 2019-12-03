package com.games.auctionhouse.controller;

import com.games.auctionhouse.service.ShopService;

public class ShopController {
    ShopService ss = new ShopService();
    public void addGoods(String uname,int num){
        String goods = ss.addGoods(uname,num);
        System.out.println(goods);
    }
    //清理购物车产品
    public int  reduce(String uName,String goodsName){
      return ss.reduce(uName,goodsName);
    }
}
