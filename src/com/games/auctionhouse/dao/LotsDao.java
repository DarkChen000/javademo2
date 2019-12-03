package com.games.auctionhouse.dao;

import com.games.auctionhouse.pojo.Lots;
import java.util.Arrays;

public class LotsDao {
  /*  private int goodsID;//商品序号
    private String goodsPrice;//商品价格
    private String goodsNumber;//商品数目
    private String goodsName;//商品名称
    private String goodsDescription;//商品描述*/
  //初始化
    protected static Lots[]lots;
    private  static Lots[] phb;
    static {
        //把排行榜初始化
        phb =new Lots[100];
        //放入拍卖行商品
        //第一个商品
        Lots lot =new Lots();
        lots =new Lots[100];
        lot=new Lots();
        lot.setGoodsID(1);
        lot.setGoodsName("圣女的祝福  ");
        lot.setGoodsNumber(3);
        lot.setGoodsDescription("可对一人使用祝福，接受祝福的人可得到好运");
        lot.setGoodsPrice(6666);
        lots[0]=lot;
        //第二个商品
        Lots lot2 =new Lots();
        lot2.setGoodsID(2);
        lot2.setGoodsName("红黄蓝        ");
        lot2.setGoodsNumber(5);
        lot2.setGoodsDescription("可发射三种元素子弹，造成冰冻，火焰，雷电伤害");
        lot2.setGoodsPrice(188);
        lots[1]=lot2;
        //第三个商品
        Lots lot3 =new Lots();
        lot3.setGoodsID(3);
        lot3.setGoodsName("冰霜剑        ");
        lot3.setGoodsNumber(2);
        lot3.setGoodsDescription("可以发射子弹冰冻敌人，剑体挥舞时可反弹子弹。特殊效果：可与火焰箭合体形成雷电剑");
        lot3.setGoodsPrice(666);
        lots[2]=lot3;
        //第四个商品
        Lots lot4 =new Lots();
        lot4=new Lots();
        lot4.setGoodsID(4);
        lot4.setGoodsName("火焰剑        ");
        lot4.setGoodsNumber(2);
        lot4.setGoodsDescription("可以发射子弹灼烧敌人，剑体挥舞时可反弹子弹。特殊效果：可与冰霜箭合体形成雷电剑");
        lot4.setGoodsPrice(888);
        lots[3]=lot4;
        //第五个商品
        Lots lot5 =new Lots();
        lot5=new Lots();
        lot5.setGoodsID(5);
        lot5.setGoodsName("誓约胜利之剑 ");
        lot5.setGoodsNumber(10);
        lot5.setGoodsDescription("将所有者的魔力变换成光，再从往下挥的剑的前端如光束一般地放出来破坏万物。");
        lot5.setGoodsPrice(9999);
        lots[4]=lot5;
        //第六个商品
        Lots lot6=new Lots();
        lot6=new Lots();
        lot6.setGoodsID(6);
        lot6.setGoodsName("神秘便当   ");
        lot6.setGoodsNumber(20);
        lot6.setGoodsDescription("向便当里投入金币，稍后几秒，即可新鲜出炉一份随机便当，居家旅行必备！！");
        lot6.setGoodsPrice(633);
        lots[5]=lot6;
        //第七个商品
        Lots lot7=new Lots();
        lot7=new Lots();
        lot7.setGoodsID(7);
        lot7.setGoodsName("小叮当的任意门");
        lot7.setGoodsNumber(20);
        lot7.setGoodsDescription("使用此门可到达你想到达的任何地方");
        lot7.setGoodsPrice(633);
        lots[6]=lot7;
        //第八个商品
        Lots lot8=new Lots();
        lot8=new Lots();
        lot8.setGoodsID(8);
        lot8.setGoodsName("美梦之境   ");
        lot8.setGoodsNumber(5);
        lot8.setGoodsDescription("此物可让使用者睡上美美的一觉！失眠者必备！！");
        lot8.setGoodsPrice(999);
        lots[7]=lot8;
        //第九个商品
        Lots lot9=new Lots();
        lot9=new Lots();
        lot9.setGoodsID(9);
        lot9.setGoodsName("素颜相机   ");
        lot9.setGoodsNumber(5);
        lot9.setGoodsDescription("此物可拍到所有人的素颜！每日限使用三次");
        lot9.setGoodsPrice(886);
        lots[8]=lot9;
        //第十个商品
        Lots lot10=new Lots();
        lot10=new Lots();
        lot10.setGoodsID(10);
        lot10.setGoodsName("甜蜜戒指   ");
        lot10.setGoodsNumber(5);
        lot10.setGoodsDescription("在爱人之间使用，可增强彼此之间爱意");
        lot10.setGoodsPrice(8888);
        lots[9]=lot10;
        //第十一个商品
        Lots lot11=new Lots();
        lot11=new Lots();
        lot11.setGoodsID(11);
        lot11.setGoodsName("辉辉的耳机  ");
        lot11.setGoodsNumber(1);
        lot11.setGoodsDescription("可让人听音乐更享受");
        lot11.setGoodsPrice(66);
        lots[10]=lot11;
        //第十二个商品
        Lots lot12=new Lots();
        lot12=new Lots();
        lot12.setGoodsID(12);
        lot12.setGoodsName("辉辉的杯子  ");
        lot12.setGoodsNumber(1);
        lot12.setGoodsDescription("让你时刻喝到热水");
        lot12.setGoodsPrice(88);
        lots[10]=lot12;
    }
    //商品排行榜
    public static void  RankingLis(){
        Lots[] temporary = new Lots[1];
        System.arraycopy(lots,0,phb,0,lots.length);
        for (int i = 0; i < phb.length-1; i++) {
            for (int j = i+1; j < phb.length; j++) {
                if(phb[i]!=null && phb[j]!=null){
                    if(phb[i].getGoodsPrice()<phb[j].getGoodsPrice()){
                        temporary[0]=phb[i];
                        phb[i]=phb[j];
                        phb[j]=temporary[0];
                    }
                }
            }
        }

    }
    public static void phb(){
        int n =1;
        for (int i = 0; i < 10; i++) {
            if(phb[i]!=null){
                System.out.println("商品序号："+ n +"\t"+"商品名称："+phb[i].getGoodsName()+"\t"+"商品价格："+phb[i].getGoodsPrice());
                n++;
            }
        }
    }


    //查看商品
    public static  void exhibition(){
        for (int i = 0; i < lots.length; i++) {
            if(lots[i]!=null){
                System.out.println("商品序号:"+lots[i].getGoodsID()+"\t"+"商品名称:"+lots[i].getGoodsName()
                        +"\t" +"商品价格:"+lots[i].getGoodsPrice());
            }
        }
    }
    //查看商品的详细信息
    public String goodsDetails(int num){
        for (int i = 0; i < lots.length; i++) {
            if(lots[i]!=null){
                if(num ==lots[i].getGoodsID()){
                    return "商品序号:"+lots[i].getGoodsID()+"\t"+"商品名称:"+lots[i].getGoodsName()+"\t"
                            +"商品价格:"+lots[i].getGoodsPrice()+"\t"+"商品数量:"+lots[i].getGoodsNumber()+"\t"+
                            "商品描述"+lots[i].getGoodsDescription();
                }

            }
        }
        return null;
    }
    //搜索拍卖品
    public String search(String name){
        for (int i = 0; i < lots.length; i++) {
            if(lots[i]!=null){
                if(lots[i].getGoodsName().equals(name)){
                    return "商品序号:"+lots[i].getGoodsID()+"\t"+"商品名称:"+lots[i].getGoodsName()+"\t"
                            +"商品价格:"+lots[i].getGoodsPrice()+"\t"+"商品数量:"+lots[i].getGoodsNumber()+"\t"+
                            "商品描述:"+lots[i].getGoodsDescription();
                }

            }
        }
        return null;
    }

}
