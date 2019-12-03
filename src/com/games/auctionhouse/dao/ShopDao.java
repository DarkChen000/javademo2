package com.games.auctionhouse.dao;

import com.games.auctionhouse.pojo.ShoppingCars;

import static com.games.auctionhouse.dao.LotsDao.lots;

public class ShopDao {
    //初始化购物车数组
    protected static  ShoppingCars[] sc;
    /*static LotsDao ld =new LotsDao();*/
    static {
        sc = new ShoppingCars[10];
    }
    //拍卖品放入购物车,传入用户姓名，商品序号
    public int addGoods(String uname,int num){
        ShoppingCars ssc = new ShoppingCars();
        for (int i = 0; i < lots.length; i++) {
            if(lots[i]!=null){
                if(num == lots[i].getGoodsID()){
                    for (int j = 0; j < sc.length; j++) {
                        if(sc[j] == null){
                            ssc.setUserName(uname);
                            ssc.setGoodsName(lots[i].getGoodsName());
                            ssc.setGoodsPrice(lots[i].getGoodsPrice());
                            ssc.setGoodsDescription(lots[i].getGoodsDescription());
                            sc[j] = ssc;
                            return 1;
                        }
                    }
                }
            }
        }
        return -1;
    }
    //展示购物车商品
    public static void showGoods(String uname){
        for (int i = 0; i < sc.length; i++) {
            /*if(sc[0]== null ){
                System.out.println("你的购物车暂时没有商品！");
                break;
            }*/
            if(sc[i]!=null){
                if(sc[i].getUserName().equals(uname)){
                    System.out.println("商品名称："+sc[i].getGoodsName()+"\t"+"商品价格："+sc[i].getGoodsPrice()+"\t"
                            +  "商品描述："+sc[i].getGoodsDescription()+"\t");
                }
            }
        }

    }
    //清理购物车产品
    public int reduce(String uName,String goodsName){
        for (int i = 0; i < sc.length; i++) {
            if(sc[i]!=null){
                if(sc[i].getUserName().equals(uName) && sc[i].getGoodsName().equals(goodsName)){
                    sc[i]=null;
                    return 1;
                }
            }
        }
        return -1;
    }
}
