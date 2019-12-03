package com.games.auctionhouse;
//import com.games.auctionhouse.utils.AdvertisementUtil;
import com.games.auctionhouse.controller.LotsController;
import com.games.auctionhouse.controller.PayController;
import com.games.auctionhouse.controller.ShopController;
import com.games.auctionhouse.controller.UserController;
import com.games.auctionhouse.dao.LotsDao;
import com.games.auctionhouse.dao.PayDao;
import com.games.auctionhouse.dao.ShopDao;
import com.games.auctionhouse.utils.AuctionUtil;

import java.util.Scanner;
public class ActionTest {
    public static void main(String[] args) {
        //数据初始化
        //创建用户控制层对象
        UserController uc =new UserController();
        //创建拍卖品控制层对象
        LotsController lc = new LotsController();
        //创建购物车控制层对象
        ShopController shop =new ShopController();
        //创建购物车控制层对象
        PayController pc = new PayController();
        Scanner sc =new Scanner(System.in);
        //开始登陆
        while(true){
            //广告
            AuctionUtil.advertisement();
            System.out.println("请根据序号选择你要进行的操作：1.用户注册 2.用户登录 3.退出");
            int menu =sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("请输入你的用户名");
                    String username = sc.next();
                    System.out.println("请输入密码");
                    String psd = sc.next();
                    //进行注册
                    uc.register(username,psd);
                    break;
                case 2:
                    System.out.println("请输入你的用户名");
                    String username2 = sc.next();
                    System.out.println("请输入密码");
                    String psd2 = sc.next();
                    //进行登陆
                    int a= uc.login(username2,psd2);
                    if(a==1){
                      //展示用户信息
                      uc.show(username2,psd2);
                      int xz =1;
                      while (xz !=9){
                          //广告
                      AuctionUtil.advertisement();
                      //菜单栏
//                      "1. 充值金额"+"\t"+"2.全部商品"+"\t"+"3.购物车"+"\t"+"4.上架商品"+"\t"+"5.搜索商品"
//                         +"\t"+"6.我的百宝囊"+"7.个人中心"+"8.退出登录");
                      AuctionUtil.menu();
                       xz =sc.nextInt();
                      switch (xz){
                          //充值金额
                          case 1:
                              int x=1;
                              //充值金额循环
                              while(x==1){
                                  System.out.println("请输入充值金额，一次最多一万");
                                  int cz =sc.nextInt();
                                  //充值
                                  uc.recharge(cz,username2,psd2);
                                  //展示用户信息
                                  uc.show(username2,psd2);
                                  System.out.println("是否再次进行充值：充值请按：1，返回请按：0");
                                  x =sc.nextInt();
                              }
                              break;//退出充值金额
                          //商品详情
                          case 2:
                              //展示商品序号和名称
                              while (true){
                              LotsDao.exhibition();
                              //选择进行操作
                              System.out.println("请选择你需要进行的操作");
                              System.out.println("================\t 1. 商品详情\t=================" +"\n"+
                                      "================\t 2. 选购商品\t================="+"\n"+
                                      "================\t 0. 返回主菜单\t=================");
                              int n =sc.nextInt();
                              //查看商品详情
                              if(n ==1){
                                  //选择用什么方式查看商品详情
                                  System.out.println("请选择以下方式查看");
                                  System.out.println("================\t 1. 商品序号\t=================" +"\n"+
                                          "================\t 2. 商品名称\t================="+"\n"+
                                          "================\t 0. 返回主菜单\t=================");
                                  int y =sc.nextInt();
                                  //通过商品序号进行查看
                                  if(y==1){
                                      //通过输入序号可循环查看商品名称
                                      int num=1;
                                      while(num==1){
                                          System.out.println("请输入商品序号");
                                          int xh =sc.nextInt();
                                          lc.goodsDetails(y);
                                          System.out.println("是否继续查看其它商品，查看请按：1，返回上一级请按：0");
                                          num =sc.nextInt();
                                      }
                                  }else if(y == 2){ //通过商品名称进行查看详情
                                      //通过输入名称可循环查看商品名称
                                      int num=1;
                                      while(num == 1){
                                          System.out.println("请输入商品全部名称");
                                          String name =sc.next();
                                          lc.search(name);
                                          System.out.println("是否继续查看其它商品，查看请按：1，返回上一级请按：0");
                                          num =sc.nextInt();
                                      }
                                  }else {
                                      break;//返回主菜单
                                  }
                              }else if(n == 2){
                                  //循环购买商品
                                  int h=1;
                                  while (h!=0){
                                      LotsDao.exhibition();
                                      System.out.println("请输入你想要购买的商品序号");
                                      int sp =sc.nextInt();
                                      shop.addGoods(username2,sp);
                                      System.out.println("是否继续添加商品：添加商品请按：1，返回上一级请按：0");
                                      h=sc.nextInt();
                                  }
                              }else {
                                  break;
                              }
                              }
                              break;
                           //我的购物车
                          case 3:
                              while (true){
                              //购物车商品
                              ShopDao.showGoods(username2);
                              //商品总价
                              int zj= pc.settlement(username2);
                              if(zj>0){
                                  System.out.println("==========\t你的商品总价为"+ zj+"\t==========");
                                  System.out.println("是否继续购买商品：购买商品请按：1，\t删除商品请按：2，\t返回上一级请按：0");
                                  int gm =sc.nextInt();
                               //购买商品
                              if(gm==1){
                                  int pd = pc.judge(username2,zj);
                                  if(pd==1){
                                          PayDao.balance(username2,zj);//支付完成
                                          pc.goodsByTBag(username2);//把商品放入用户车
                                          PayDao.empty(username2);//清空购物车
                                          uc.show(username2,psd2);//展示用户信息
                                          System.out.println("是否继续查看你的百宝囊：查看你的百宝囊请按：1，返回上一级请按：0");
                                          int ck2 = sc.nextInt();
                                          if(ck2==1){
                                              PayDao.show2(username2);
                                              break;
                                          }else {
                                              /*System.out.println("你的百宝囊暂时没有商品");*/
                                              break;
                                          }

                                             }else {
                                             System.out.println("你的余额不足，是否进行充值：充值请按：1，返回请按：0");
                                             int cz=sc.nextInt();
                                             while (cz==1){
                                             System.out.println(" 请输入充值金额，一次最多一万");
                                             int cz2 =sc.nextInt();
                                             uc.recharge(cz2,username2,psd2);
                                             uc.show(username2,psd2);
                                             System.out.println("是否再次进行充值：充值请按：1，返回请按：0");
                                             cz =sc.nextInt();
                                                }
                                       }
                               //删除商品
                              }else if(gm == 2){
                                  System.out.println("请输入你要删除的商品名称");
                                  String shan =sc.next();
                                  int s = shop.reduce(username2,shan);
                                  if(s == 1){
                                      System.out.println("删除成功");
                                  }else {
                                      System.out.println("购物车暂无此商品");
                                  }
                              }
                              else {
                                 break;//用户选择退出
                              }
                              }else{
                                  System.out.println("你的购物车暂时没有商品");
                                  break;//没有商品退出
                              }
                              }
                              break;//case3退出
                          //上架商品
                          case 4:
                              System.out.println("1.上架商品\t 2.返回主菜单");
                              System.out.println("================\t 1. 上架商品\t    =================" +"\n"+
                                      "================\t 2.返回主菜单\t=================");
                              int sj =sc.nextInt();
                              if(sj == 1){
                                  System.out.println("================\t请输入商品名称\t=================");
                                  String goodsName = sc.next();
                                  System.out.println("================\t请输入商品价格\t=================");
                                  int goodsPrice = sc.nextInt();
                                  System.out.println("================\t请输入商品描述\t=================");
                                  String ds = sc.next();
                                  uc.addGoods(username2,goodsName,goodsPrice,ds);
                              }
                              break;
                              //搜索商品
                          case 5:
                                  int ss =1;
                                  while (ss == 1){
                                      System.out.println("================\t请输入商品全部名称\t=================\"");
                                      String name =sc.next();
                                      lc.search(name);
                                      System.out.println("是否继续查看其它商品，查看请按：1，返回上一级请按：0");
                                      ss =sc.nextInt();
                                  }

                             break;
                          //我的百宝囊
                          case 6:
                                  PayDao.show2(username2);

                                  break;
                          //个人中心
                          case 7:
                               uc.show(username2,psd2);
                               break;
                          case 8:
                              LotsDao.RankingLis();
                              LotsDao.phb();
                              break;
                           //退出登录
                          case 9:
                              break;
                            }

                      }

                  }else {
                        System.out.println("登陆失败");
                    }
                    break;
                case 3:
                    break;
            }
        }//结束登录

    }
}
