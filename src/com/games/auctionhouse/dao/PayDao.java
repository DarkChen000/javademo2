package com.games.auctionhouse.dao;
import com.games.auctionhouse.pojo.ShoppingCars;
import com.games.auctionhouse.pojo.Users;

import static com.games.auctionhouse.dao.ShopDao.sc;
import static com.games.auctionhouse.dao.UserDao.u;


public class PayDao {
    ShopDao sd =new ShopDao();
    UserDao ud =new UserDao();
    static ShoppingCars[] sc2;
    static {
        sc2 =new ShoppingCars[10];
    }
//    static int a;
    //拍卖品结算功能
    public int  settlement(String uname){
        int a = 0;
        for (int i = 0; i < sc.length; i++) {
            if(sc[i]!=null){
                if(sc[i].getUserName().equals(uname)){
                    a=sc[i].getGoodsPrice()+a;
                }
            }
        }
        return a;
    }
    //判断用户金额是否足够购买商品总价
    public int judge(String name,int num){
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(u[i].getUserName().equals(name)){
                      if(u[i].getMoney() >= num){
                          return 1;
                      }
                }
            }
        }
        return -1;
    }
   //购买后用户剩余金额
     public static void balance(String name,int num) {
         for (int i = 0; i < u.length; i++) {
             if(u[i]!=null){
                 if(u[i].getUserName().equals(name)){
                     u[i].setMoney(u[i].getMoney()-num);
                 }
             }
         }
     }
    //清空购物车
    public static void empty(String name){
        for (int i = 0; i < sc.length; i++) {
            if(sc[i]!=null){
                if(sc[i].getUserName().equals(name)){
                    sc[i]=null;
                }
            }
        }
    }
    //把购买商品存入百宝囊
    public int  goodsByTBag(String name){
         ShoppingCars tbag =new ShoppingCars ();
        for (int i = 0; i < sc.length; i++) {
            if(sc[i] != null){
                if(sc[i].getUserName().equals(name)){
                    for (int z = 0; z < sc2.length; z++) {
                        if(sc2[z] ==  null){
                            /*tbag.setUserName( name);
                            tbag.setGoodsName( sc[i].getGoodsName());
                            tbag.setGoodsPrice( sc[i].getGoodsPrice());
                            tbag.setGoodsDescription( sc[i].getGoodsDescription());
                            sc2[z] = tbag;*/
                            sc2[z]=sc[i];
                            break;
                        }
                    }

                }

            }
        }
        return 2;
    }
 //展示百宝囊
    public static void show2(String name){
        for (int i = 0; i < sc2.length; i++) {
            if(sc2[0] == null){
                System.out.println("你的百宝囊暂时没有商品！");
                break;
            }
            if(sc2[i]!=null){
                if(sc2[i].getUserName().equals(name)){
                    System.out.println("商品名称："+sc2[i].getGoodsName()+"\t"+
                            "商品价格："+sc2[i].getGoodsPrice()+"\t"
                            +"商品描述："+sc2[i].getGoodsDescription()+"\t");
                }
            }
        }
    }
}
