package com.auction_company.utils;
import com.auction_company.pojo.Users;

import java.util.Scanner;
public class Utils {

    public static void login(){
        System.out.println("===================================");
        System.out.println("------~~~欢迎来到万界拍卖会~~~------");
        System.out.println("~~~~请根据您的需求选择相应的选项~~~~");
        System.out.println("1=========用户注册");
        System.out.println("2=========用户登录");
    }

    public static void register(Users[] users,String userName){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                if (users[i].getUserName().equals(userName)){
                    System.out.println("-----------------------------------");
                    System.out.println("===========当前用户:" + users[i].getUserName() + "===========");
                    if (users[i].getMoney()>=0 && users[i].getMoney()<500){
                        users[i].setID("小白");
                    }else if (users[i].getMoney()>=500 && users[i].getMoney()<2000){
                        users[i].setID("小资");
                    }else if (users[i].getMoney()>=2000 && users[i].getMoney()<4000){
                        users[i].setID("地主");
                    }else if (users[i].getMoney()>=4000 && users[i].getMoney()<8000){
                        users[i].setID("土豪");
                    }else if (users[i].getMoney()>=8000){
                        users[i].setID("高富帅");
                    }
                    System.out.println("===========当前余额:" + users[i].getMoney() + "===========");
                    System.out.println("===========当前身份:" + users[i].getID() + "===========");
                }
            }
        }
    }

    public static void function(){
        System.out.println("~~~~请根据您的需求选择相应的选项~~~~");
        System.out.println("-----------------------------------");
        System.out.println("*1*===================查看所有拍品");
        System.out.println("*2*===================搜索拍品");
        System.out.println("*3*===================上架我的拍卖品");
        System.out.println("*4*===================查看我的购物车");
        System.out.println("*5*===================充值");
        System.out.println("*6*===================查看我的百宝囊");
        System.out.println("*7*===================查看价格前十的宝物");
        System.out.println("*8*===================管理我的购物车商品");
        System.out.println("*0*===================退出登录");
    }
}
