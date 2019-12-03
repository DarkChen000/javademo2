package com.games.auctionhouse.dao;

import com.games.auctionhouse.pojo.Lots;
import com.games.auctionhouse.pojo.Users;

import static com.games.auctionhouse.dao.LotsDao.lots;

public class UserDao {
    //定义私有静态用户数组
    protected static Users[] u;
    static {
        u = new Users[10];
    }
    //判断用户是否存在
    public Users selectByName(String username){
        for (int i = 0; i < u.length; i++) {
            if(u[i] != null){
                if(u[i].getUserName().equals(username)){
                    return u[i];
                }
            }
        }
        return null;
    }
    //把用户数据放入数组，注册
    public int addone(Users users){
        for (int i = 0; i < u.length; i++) {
            if(u[i]==null){
                u[i]=users;
                return 1;
            }
        }
        return 0;
    }
    //用户进行登录
    public int login(String uname,String psd){
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(u[i].getUserName().equals(uname) && u[i].getUserPsd().equals(psd)){
                    return 1;
                }
            }
        }
        return -1;
    }
    //查找用户信息
    public Users show(String name,String psd){
        //非空判断
        if(name==null || psd==null){
            return null;
        }
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(u[i].getUserName().equals(name)&&u[i].getUserPsd().equals(psd)){
                    return u[i];
                }
            }
        }
        return null;
    }


    //充值金币,充值成功返回1，充值失败返回-1
    public  int reCharge(int m, String uname, String psd){
        if(m>0 && m<=10000){
            for (int i = 0; i < u.length; i++) {
                if(u[i]!=null){
                    if(u[i].getUserName().equals(uname)&&u[i].getUserPsd().equals(psd)){
                        int a =u[i].getMoney();
                        int h=a+m;
                        u[i].setMoney(h);
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
    //用户将商品上架
    public int addGoods(String uname,String goodsname,int price,String description){
        for (int j = 0; j < u.length; j++) {
            if(u[j].getUserName().equals(uname)){
                for (int i = 0; i < lots.length; i++) {
                    if(lots[i]== null){
                        Lots ls =new Lots();
                        ls.setGoodsID(i+1);
                        ls.setGoodsDescription(description);
                        ls.setGoodsPrice(price);
                        ls.setGoodsName(goodsname);
                        lots[i]=ls;
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
}
