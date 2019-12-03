package com.games.auctionhouse.service;

import com.games.auctionhouse.dao.UserDao;
import com.games.auctionhouse.pojo.Users;

public class UserService {
       //创建对象
       private UserDao userDao =new UserDao();
        //注册用户
        public String register(String usename, String psd){
            //参数非空判断
            if(usename==null || psd ==null || usename.equals(null)||psd.equals(null)){
                return null;
            }
            //查看当前用户是否已经注册
            Users users = userDao.selectByName(usename);
            if(users != null){
                return "用户名已存在";
            }
            //注册用户
            Users us1= new Users();
            us1.setUserName(usename);
            us1.setUserPsd(psd);
            us1.setLevel("小白");
            us1.setMoney(0);
            int a= userDao.addone(us1);
            if(a<=0){
                return "注册失败";
            }
            return "注册成功";
        }
        //用户登录
        public String login(String uname,String psd){
            //非空判断
            if(uname == null || psd == null){
                return null;
            }
            int a =userDao.login(uname,psd);
            if(a==-1){
                return null;
            }
            return "登录成功";
        }
        //展示用户信息
    public String show(String name,String psd){
           Users users =userDao.show(name,psd);
           if(users==null){
               return null;
           }
           if(users.getMoney()>100000){
               users.setLevel("富豪");
           }else if(users.getMoney()>=50000){
               users.setLevel("土豪");
           }else if(users.getMoney()>=30000){
               users.setLevel("小资");
           }else if(users.getMoney()>=10000){
               users.setLevel("温饱");
           }else{
               users.setLevel("小白");
           }
            return ("======"+name+"：当前身份级别是："+users.getLevel()+"\t"+"======目前的金币是:"+users.getMoney()+"======"
            );
    }
     //充值金币
    public String recharge(int m, String uname, String psd){
            int h= userDao.reCharge(m,uname,psd);
            if(h==-1){
                return "充值失败，充值金额一次最多一万";
            }
            return "充值成功";
    }
    //用户将商品上架
    public String addGoods(String uname,String goodsname,int price,String description){
            int a = userDao.addGoods(uname,goodsname,price,description);
            if(a == -1){
                return "商品上架失败";
            }
            return "商品已成功上架！";
    }
}
