package com.auction_company;

import com.auction_company.pojo.*;
import com.auction_company.utils.*;
import java.util.Scanner;
public class AuctionTest {
    //准备一个用户数组
    static Users[] users;
    //准备一个拍卖物品数组
    static Aution[] aution;
    //一个新用户
    static Users user;
    //购物车数组
    static ShoppingCarts[] shoppingCarts;
    //购物车商品总值
    static int total = 0;
    //准备一个百宝囊数组
    static ShoppingCarts[] bbn;
    //准备一个放拍卖行价格前十的商品的数组
    static Aution[] showQS;

    //程序初始化，准备静态资源
    static {
        //准备一个用户数组
        users = new Users[10];
        //准备一个拍卖物品数组
        aution = new Aution[30];
        //准备一个购物车数组
        shoppingCarts = new ShoppingCarts[5];
        //准备一个百宝囊数组
        bbn = new ShoppingCarts[10];
        //初始化一个放拍卖行价格前十的商品的数组
        showQS = new Aution[aution.length];

        //第一件物品
        Aution a1 = new Aution();
        a1.setGoodsID(1);
        a1.setGoodsName("圈圈的一只臭袜子");
        a1.setGoodsPrice(999);
        a1.setGoodsDetails("足以动心，丝魅天成。夏季清蚊，冬季除燥。居家旅行，必备良品");
        aution[0] = a1;
        //第二件物品
        Aution a2 = new Aution();
        a2.setGoodsID(2);
        a2.setGoodsName("圈圈的另一只臭袜子");
        a2.setGoodsPrice(998);
        a2.setGoodsDetails("双袜合璧，可探天机。");
        aution[1] = a2;
        //第三件物品
        Aution a3 = new Aution();
        a3.setGoodsID(3);
        a3.setGoodsName("古达的戟");
        a3.setGoodsPrice(888);
        a3.setGoodsDetails("英雄古达的戟，与使命共存的武器，可大幅削减强韧度。");
        aution[2] = a3;
        //第四件物品
        Aution a4 = new Aution();
        a4.setGoodsID(4);
        a4.setGoodsName("流放者大刀");
        a4.setGoodsPrice(750);
        a4.setGoodsDetails("守护战士们安眠的法兰守卫，其中一人挥舞的大刀，也是他身为流放者的证明。");
        aution[3] = a4;
        //第五件物品
        Aution a5 = new Aution();
        a5.setGoodsID(5);
        a5.setGoodsName("芙丽德大镰刀");
        a5.setGoodsPrice(500);
        a5.setGoodsDetails("芙丽德修女使用的大镰刀，弯曲刀身带有一层淡淡的绘画寒气，盾牌难以抵挡它的攻击");
        aution[4] = a5;
        //第六件物品
        Aution a6 = new Aution();
        a6.setGoodsID(6);
        a6.setGoodsName("艾雷德尔蔷薇");
        a6.setGoodsPrice(599);
        a6.setGoodsDetails("绘画世界里，神父为了以血镇火，所使用的蔷薇软鞭，同时是武器，也是奇迹触媒");
        aution[5] = a6;
        //第七件物品
        Aution a7 = new Aution();
        a7.setGoodsID(7);
        a7.setGoodsName("狼骑士大剑");
        a7.setGoodsPrice(450);
        a7.setGoodsDetails("法兰的狼血之主，被深渊黑暗玷污的骑士大剑，狼骑士是初始深渊的监视者，而这把剑能对黑暗下属发挥极大的威力");
        aution[6] = a7;
        //第八件物品
        Aution a8 = new Aution();
        a8.setGoodsID(8);
        a8.setGoodsName("洛斯里克军旗");
        a8.setGoodsPrice(588);
        a8.setGoodsDetails("过去用来高举洛斯里克图纹的旗杆，骑士们仰望的军旗，其残留下来的产物。前端有尖锐装饰，因此可以作为枪使用");
        aution[7] = a8;
        //第九件物品
        Aution a9 = new Aution();
        a9.setGoodsID(9);
        a9.setGoodsName("月光大剑");
        a9.setGoodsPrice(799);
        a9.setGoodsDetails("以白龙希斯之名流传的传说中的魔龙武器，将重攻击蓄积到极限后，能释放出月光激流。妖王欧斯罗埃斯随着自己的执着追寻月光，不过却连一眼都没有看到");
        aution[8] = a9;
        //第十件物品
        Aution a10 = new Aution();
        a10.setGoodsID(10);
        a10.setGoodsName("大龙牙");
        a10.setGoodsPrice(470);
        a10.setGoodsDetails("把古龙牙齿直接当作武器的大槌，可以与坚石大盾一起当成是哈维尔的遗物，能赋予使用者魔力及火属性抵抗力");
        aution[9] = a10;
        //第十一件物品
        Aution a11 = new Aution();
        a11.setGoodsID(11);
        a11.setGoodsName("恶魔爪痕");
        a11.setGoodsPrice(1150);
        a11.setGoodsDetails("恶魔王子在最后一刻点燃的火焰，本质为混沌，化成爪痕状的武器。同时是挥舞火焰刃的武器，也是咒术之火。");
        aution[10] = a11;
        //第十二件物品
        Aution a12 = new Aution();
        a12.setGoodsID(12);
        a12.setGoodsName("孪生王子大剑");
        a12.setGoodsPrice(970);
        a12.setGoodsDetails("从洛斯里克和洛里安两位孪生王子的灵魂诞生出的对剑，已被结合的难以分离。他们原来是因为诅咒而结合，但如此以来反而能慰藉他们。");
        aution[11] = a12;
        //第十三件物品
        Aution a13 = new Aution();
        a13.setGoodsID(13);
        a13.setGoodsName("制裁大剑");
        a13.setGoodsPrice(2199);
        a13.setGoodsDetails("教宗沙力万左手所持的剑，是代表月亮制裁的仪式用剑，那股魔力的性质与其是像月亮，不如是近于魔法。那比暗月更为深沉的深蓝色，可是说是魔法师沙力万的本质。");
        aution[12] = a13;
        //第十四件物品
        Aution a14 = new Aution();
        a14.setGoodsID(14);
        a14.setGoodsName("罪业大剑");
        a14.setGoodsPrice(2099);
        a14.setGoodsDetails("剑宗沙力万右手所持的剑，是代表罪业火焰的仪式用剑，很久以前，年轻魔法师沙力万在原理伊鲁席尔的地底下，发现罪业之都和不熄火焰，从那之后，他心中不曾熄灭的野心之火，更是猛烈燃烧。");
        aution[13] = a14;
        //第十五件物品
        Aution a15 = new Aution();
        a15.setGoodsID(15);
        a15.setGoodsName("法兰大剑");
        a15.setGoodsPrice(1599);
        a15.setGoodsDetails("深渊的监视者们挥舞的大剑，是与独特短刀的组合，特殊的成对武器。短刀为主的独特剑术为特征，双手持刀时，左手攻击能看见其特色，法兰的不死队知名的剑术与狼狩猎时相似，能大肆打乱敌人步调");
        aution[14] = a15;
        //第十六件物品
        Aution a16 = new Aution();
        a16.setGoodsID(16);
        a16.setGoodsName("猎龙剑枪");
        a16.setGoodsPrice(3999);
        a16.setGoodsDetails("神的时代的猎龙武器，是十字枪的原型，共同拥有剑和枪的特质。从无名王者仍是猎龙战神的时候，就一直由他持有，具有巨大的雷电力量。");
        aution[15] = a16;
        //第十七件物品
        Aution a17 = new Aution();
        a17.setGoodsID(17);
        a17.setGoodsName("风暴曲剑");
        a17.setGoodsPrice(2399);
        a17.setGoodsDetails("带有风暴龙力量的曲剑，成为古龙同盟的无名王者，在他余生与风暴龙成为战友，当龙被打倒时，他将其灵魂纳为己有。在神的时代，那是战友间才有的习俗。");
        aution[16] = a17;
        //第十八件物品
        Aution a18 = new Aution();
        a18.setGoodsID(18);
        a18.setGoodsName("老王大槌");
        a18.setGoodsPrice(800);
        a18.setGoodsDetails("老恶魔王的大槌，是古老的伊扎里斯的知名武器，还蕴藏着混沌火焰的力量残渣，可以引起岩浆喷发。");
        aution[17] = a18;
        //第十九件物品
        Aution a19 = new Aution();
        a19.setGoodsID(19);
        a19.setGoodsName("阿尔特斯枪");
        a19.setGoodsPrice(1100);
        a19.setGoodsDetails("藏于大树内部的诅咒之一，穿刺阿尔特斯公爵的可怕武器。枪身缠满犹如爬墙虎的腐肉，拥有强烈毒性，打倒敌人时可以恢复血量。");
        aution[18] = a19;
        //第二十件物品
        Aution a20 = new Aution();
        a20.setGoodsID(20);
        a20.setGoodsName("盖尔大剑");
        a20.setGoodsPrice(3499);
        a20.setGoodsDetails("奴隶骑士盖尔的大剑，唯一一把他一直带在身边的武器。原来是用来处刑的断头剑，因为经历多次战斗，剑刃有大缺口，并沾满血与黑暗。");
        aution[19] = a20;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //注册登录
            Utils.login();
            int select = sc.nextInt();
            //各功能选择
            switch (select) {
                case 1:
                    System.out.println("---请输入用户名---");
                    String userName1 = sc.next();
                    System.out.println("---请输入密码---");
                    String password1 = sc.next();
                    int answer1 = zc(userName1, password1, users);
                    if (answer1 == -1) {
                        System.out.println("---用户名已存在---");
                        break;
                    } else if (answer1 == -2) {
                        System.out.println("---注册失败---");
                        break;
                    } else {
                        System.out.println("---注册成功---");
                        System.out.println("---请重新登录---");
                        break;
                    }
                case 2:
                    System.out.println("---请输入用户名---");
                    String userName = sc.next();
                    System.out.println("---请输入密码---");
                    String password = sc.next();
                    int answer2 = login(userName, password, users);
                    if (answer2 == -1) {
                        System.out.println("---用户名或密码错误！请重新登录---");
                        break;
                    } else {
                        System.out.println("---登陆成功---");

                        while (true) {
                            //头部显示
                            Utils.register(users, userName);
                            //功能导航
                            Utils.function();
                            //用户选择功能
                            int answer3 = sc.nextInt();
                            //判断要不要退出登录
                            if (answer3 == 0){
                                break;
                            }
                            //如果不退出，显示功能界面
                            switch (answer3) {
                                case 1:
                                    //查看所有拍卖品，并可以把感兴趣的放入购物车
                                    while (true) {
                                        allAution(aution);
                                        System.out.println("-------------------------------------------");
                                        System.out.println("请输入感兴趣的卖品序号以查看其详情,返回上一级请输入0");
                                        //查看选择的商品详情
                                        int answer4 = sc.nextInt();
                                        if (answer4 != 0) {
                                            selectAution(answer4, aution);

                                            //判断购物车是否已满
                                            if (shoppingCarts[shoppingCarts.length-1] != null) {
                                                System.out.println("购物车已满，不可再添加");
                                            } else {
                                                System.out.println("购买请输入1，返回上一级请输入0");
                                                //购买放入购物车
                                                int answer5 = sc.nextInt();
                                                //把选中的物品放入购物车
                                                shoppingCar(userName, answer4, answer5, aution, shoppingCarts);
                                                //重新排序卖品
                                                sortAution(aution);
                                            }
                                        }else {
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //搜索卖品
                                    System.out.println("请输入您想搜索的物品名字：");
                                    //输入名字
                                    String findGoodsName = sc.next();
                                    findGoodsName(findGoodsName, aution, shoppingCarts, userName);
                                    break;
                                case 3:
                                    //上架自己的拍卖品
                                    //判断账户金额是否大于5000
                                    int a = moreMoney(users,userName);
                                    if (a != 1){
                                        System.out.println("-------------------------------");
                                        System.out.println("您账户金额不足5000，无法享用上架拍卖品特权，请充值后再试");
                                    }else {
                                        //上架卖品
                                        System.out.println("请输入您想拍卖的物品名字：");
                                        String goodsName = sc.next();
                                        System.out.println("请输入您的拍卖品的价格：");
                                        int goodsPrice = sc.nextInt();
                                        System.out.println("请输入您的拍卖品详情：");
                                        String goodsDetails = sc.next();
                                        //上架
                                        putUpGoods(goodsName,goodsPrice,goodsDetails,aution);
                                    }
                                    break;
                                case 4:
                                    //查看我的购物车
                                    showShoppingCarts(userName, shoppingCarts,total);
                                    System.out.println("结算请输入1，返回上一层请输入0");
                                    int answer8 = sc.nextInt();
                                    buyTotal(answer8,shoppingCarts,users,user,userName,bbn);
                                    break;
                                case 5:
                                    //充值
                                    while (true){
                                        System.out.println("请输入您想充值的数目：");
                                        //充值数目
                                        int answer6 = sc.nextInt();
                                        if (answer6 > 2000){
                                            System.out.println("-------------------------");
                                            System.out.println("单笔充值最多2000元，请重新输入！");
                                        }else{
                                            System.out.println("您本次充值数额为：" + answer6 + "，确认请输入1，返回请输入0");
                                            //是否确认
                                            int answer7 = sc.nextInt();
                                            invest(answer6, answer7, userName, users, user);
                                            break;
                                        }
                                    }
                                    break;
                                case 6:
                                    //显示自己的百宝囊
                                    showBBN(bbn,userName);
                                    break;
                                case 7:
                                    //查看拍卖行价格前十的商品
                                    showQS(aution,showQS);
                                    break;
                                case 8:
                                    //管理我的购物车，删除不想要的商品
                                    while (true){
                                        showShoppingCarts(userName,shoppingCarts,total);
                                        System.out.println("-------------------------------------------");
                                        System.out.println("清空您的购物车请输入1，删除指定商品请输入2，返回上一级请输入0");
                                        int answer9 = sc.nextInt();
                                        if (answer9 == 1){
                                            deleteShoppingCarts1(userName,shoppingCarts);
                                            System.out.println("---------------------------------");
                                            System.out.println("您的购物车已清空");
                                            break;
                                        }else if (answer9 == 2){
                                            while (true){
                                                System.out.println("请输入您想删除的商品序号：");
                                                int answer10 = sc.nextInt();
                                                deleteShoppingCarts2(answer10,userName,shoppingCarts,aution);
                                                System.out.println("---------------------------------");
                                                System.out.println("您选的商品已从您的购物车中移除");
                                                //重新给购物车排序
                                                sortShoppingCarts(shoppingCarts);
                                                System.out.println("---------------------------------");
                                                System.out.println("是否继续，继续请输入1，返回请输入0");
                                                int answer11 = sc.nextInt();
                                                if (answer11 == 0){
                                                    break;
                                                }
                                            }
                                            break;
                                        }else if (answer9 == 0){
                                            break;
                                        }else {
                                            System.out.println("---------------------------------");
                                            System.out.println("输入无效数字！");
                                        }
                                    }
                                    break;

                                default:
                                    //其他
                                    System.out.println("输入无效，请重新输入");
                                    break;
                            }
                        }
                    }
            }
        }
    }

    //用户注册
    public static int zc(String userName, String password, Users[] users) {
        Users user = new Users();
        user.setUserName(userName);
        user.setPassword(password);
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (userName.equals(users[i].getUserName())) {
                    return -1;
                }
            } else {
                users[i] = user;
                return 1;
            }
        }
        return -2;
    }

    //用户登录判断是否是已有用户
    public static int login(String userName, String password, Users[] users) {
        //判断用户是否存在
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (userName.equals(users[i].getUserName()) && password.equals(users[i].getPassword())) {
                    return 1;
                }
            }
        }
        return -1;
    }

    //查看所有卖品
    public static void allAution(Aution[] autions) {
        System.out.println("当前拍卖行已有商品如下：");
        System.out.println("-----------------------");
        //遍历数组，展示所有卖品
        for (int i = 0; i < autions.length; i++) {
            if (autions[i] != null) {
                System.out.println("序号：" + (i + 1) + "\t" + "\t" + "商品名称：" + autions[i].getGoodsName());
                System.out.println("------------商品价格：" + autions[i].getGoodsPrice());
            }
        }
    }

    //选择感兴趣的卖品，并展示详情
    public static void selectAution(int answer4, Aution[] aution) {
        for (int i = 0; i < aution.length; i++) {
            if (aution[i] != null) {
                if (aution[i].getGoodsID() == answer4) {
                    System.out.println("商品详情：");
                    System.out.println("----------");
                    System.out.println("商品名字：" + aution[i].getGoodsName() + "\t" + "商品详情：" + aution[i].getGoodsDetails());
                }
            }
        }
    }

    //把心仪的商品放入购物车数组中
    public static void shoppingCar(String userName, int answer4, int answer5, Aution[] aution, ShoppingCarts[] shoppingCarts) {
        ShoppingCarts shop = new ShoppingCarts();
        if (answer5 == 1) {
            for (int i1 = 0; i1 < shoppingCarts.length; i1++) {
                if(shoppingCarts[i1] == null){
                        for (int i = 0; i < aution.length; i++) {
                        if (aution[i] != null) {
                            if (aution[i].getGoodsID() == answer4) {
                                shop.setUserName(userName);
                                shop.setGoodsName(aution[i].getGoodsName());
                                shop.setGoodsPrice(aution[i].getGoodsPrice());
                                shop.setGoodsDetails(aution[i].getGoodsDetails());
                                shoppingCarts[i1] = shop;
                                System.out.println("已放入您的购物车中，请在主界面查看结算");
                                System.out.println("--------------------------------------------------");
                                aution[i] = null;
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }else if (answer5 == 0){

        }else {
            System.out.println("输入无效数字！");
        }
    }

    //查看我的购物车
    public static void showShoppingCarts(String userName,ShoppingCarts[] shoppingCarts,int total){
        System.out.println("您的购物车中有如下商品：");
        for (int i = 0; i < shoppingCarts.length; i++) {
            if (shoppingCarts[i] != null){
                if (shoppingCarts[i].getUserName().equals(userName)){
                    System.out.println((i+1) +"、商品名字："+shoppingCarts[i].getGoodsName()+"\t"+"商品价格："+shoppingCarts[i].getGoodsPrice()+"\t");
                    total = shoppingCarts[i].getGoodsPrice()+total;
                }
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("您购物车中卖品总价为："+total);
    }

    //充值
    public static void invest(int answer6,int answer7,String userName,Users[] users,Users user){
        if (answer7 == 1){
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null){
                    if (users[i].getUserName().equals(userName)){
                        users[i].setMoney(answer6+users[i].getMoney());
                        System.out.println("充值成功！");
                    }
                }
            }
        }
    }

    //搜索卖品
    public static void findGoodsName(String findGoodsName,Aution[] aution,ShoppingCarts[] shoppingCarts,String userName){
        Scanner sc = new Scanner(System.in);
        ShoppingCarts shop = new ShoppingCarts();
        for (int i = 0; i < aution.length; i++) {
            if (aution[i] != null){
                if (aution[i].getGoodsName().equals(findGoodsName)){
                    System.out.println("序号："+aution[i].getGoodsID()+"\t"+"商品名称："+aution[i].getGoodsName()+"\t"+"商品价格："+aution[i].getGoodsPrice()+"\t"+"商品详情："+aution[i].getGoodsDetails());
                    //询问是否购买搜索完成后的物品
                    System.out.println("购买请输入1，返回上一级请输入0");
                    int answer = sc.nextInt();
                    if (answer == 1) {
                        for (int i1 = 0; i1 < shoppingCarts.length; i1++) {
                            if (shoppingCarts[i1] == null){
                                shop.setUserName(userName);
                                shop.setGoodsName(aution[i].getGoodsName());
                                shop.setGoodsPrice(aution[i].getGoodsPrice());
                                shop.setGoodsDetails(aution[i].getGoodsDetails());
                                shoppingCarts[i1] = shop;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    //上架自己的拍卖品
    public static void putUpGoods(String goodsName,int goodsPrice,String goodsDetails,Aution[] aution){
        Aution a = new Aution();
        for (int i = 0; i < aution.length; i++) {
            if (aution[i] == null){
                a.setGoodsID(i+1);
                a.setGoodsName(goodsName);
                a.setGoodsPrice(goodsPrice);
                a.setGoodsDetails(goodsDetails);
                aution[i] = a;
                System.out.println("恭喜您，您的商品已上架成功，可在商品主页中查看您的拍卖品");
                break;
            }
        }
    }

    //显示百宝囊中的物品
    public static void showBBN(ShoppingCarts[] bbn,String userName){
        int a = 1;
        for (int i = 0; i < bbn.length; i++) {
            if (bbn[i] != null){
                if (bbn[i].getUserName().equals(userName)){
                    System.out.println(a + "、商品名称："+bbn[i].getGoodsName()+"\t"+"商品价格："+bbn[i].getGoodsPrice()+"\t"+"商品详情："+bbn[i].getGoodsDetails());
                    a++;
                }
            }
        }
    }

    //购物车结算
    public static void buyTotal(int answer8,ShoppingCarts[] shoppingCarts,Users[] users,Users user,String userName,ShoppingCarts[] bbn){
        Scanner sc = new Scanner(System.in);
        //定义一个购物车商品总额
        int j = 0;
        //定义百宝囊数组序号
        int m = 0;
        if (answer8 == 1){
            for (int i = 0; i < shoppingCarts.length; i++) {
                if (shoppingCarts[i] != null){
                    if (shoppingCarts[i].getUserName().equals(userName)){
                        j = j + shoppingCarts[i].getGoodsPrice();
                    }
                }
            }
            //判断账户余额是否足以支付，不够是否充值，金额够了之后结算
            while (true){
                for (int i = 0; i < users.length; i++) {
                    if (users[i] != null){
                        if (users[i].getUserName().equals(userName)){
                            if (j > users[i].getMoney()){
                                System.out.println("余额不足，请充值！");
                                System.out.println("充值请输入1，返回上一级请输入0");
                                int a = sc.nextInt();
                                if (a == 1){
                                    //充值
                                    System.out.println("请输入您想充值的数目：");
                                    //充值数目
                                    int answer6 = sc.nextInt();
                                    System.out.println("您本次充值数额为：" + answer6 + "，确认请输入1，返回请输入0");
                                    int answer7 = sc.nextInt();
                                    invest(answer6,answer7, userName,users,user);
                                    i = 0;
                                    return;
                                }else {
                                    break;
                                }
                            }else{
                                users[i].setMoney(users[i].getMoney() - j);
                                System.out.println("已结算完成！");
                                for (int i1 = 0; i1 < shoppingCarts.length; i1++) {
                                    if (shoppingCarts[i1] != null){
                                        if (shoppingCarts[i1].getUserName().equals(userName)){
                                            for (int i2 = 0; i2 < bbn.length; i2++) {
                                                if (bbn[i2] == null){
                                                    bbn[i2] = shoppingCarts[i1];
                                                    shoppingCarts[i1] = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }break;
            }
        }
    }

    //查看拍卖行前十的商品
    public static void showQS(Aution[] aution,Aution[] showQS){
        //复制
        System.arraycopy(aution,0,showQS,0,aution.length);
        //定义一个序号
        for (int i = 0; i < showQS.length - 1; i++) {
            if (showQS[i] != null){
                for (int j = i + 1;j < showQS.length; j++){
                    if (showQS[j] != null){
                        if (showQS[i].getGoodsPrice() < showQS[j].getGoodsPrice()){
                            Aution[] au = new Aution[1];
                            au[0] = showQS[i];
                            showQS[i] = showQS[j];
                            showQS[j] = au[0];
                        }
                    }
                }
            }
        }
        int a = 1;
        for (int i = 0; i < 10; i++) {
                if (showQS[i] != null){
                    System.out.println(a + "、商品名称："+ showQS[i].getGoodsName() + "\t" + "商品价格：" + showQS[i].getGoodsPrice());
                    System.out.println("------------商品详情：" + showQS[i].getGoodsDetails());
                    a++;
                }
        }
    }

    //清空购物车
    public static void deleteShoppingCarts1(String userName,ShoppingCarts[] shoppingCarts){
        //遍历购物车
        for (int i = 0; i < shoppingCarts.length; i++) {
            if (shoppingCarts[i] != null){
                if (shoppingCarts[i].getUserName().equals(userName)){
                    shoppingCarts[i] = null;
                }
            }
        }
    }

    //删除指定商品
    public static void deleteShoppingCarts2(int answer10,String userName,ShoppingCarts[] shoppingCarts,Aution[] aution){
        Aution au = new Aution();
        for (int i = 0; i < shoppingCarts.length; i++) {
            if (shoppingCarts[i] != null){
                if (shoppingCarts[i].getUserName().equals(userName)){
                    //判断数组底标和要删除的序号关系
                    if (answer10 == i + 1){
                        //把删除的商品重新放回拍卖品数组里面
                        for (int j = 0; j < aution.length; j++) {
                            if (aution[j] == null){
                                au.setGoodsName(shoppingCarts[i].getGoodsName());
                                au.setGoodsPrice(shoppingCarts[i].getGoodsPrice());
                                au.setGoodsDetails(shoppingCarts[i].getGoodsDetails());
                                aution[j] = au;
                                break;
                            }
                        }
                        shoppingCarts[i] = null;
                    }
                }
            }
        }
    }

    //删除指定商品后重新给购物车排序
    public static void sortShoppingCarts(ShoppingCarts[] shoppingCarts){
        for (int i = 0; i < shoppingCarts.length; i++) {
            if (shoppingCarts[i] == null){
                for (int j = i+1; j < shoppingCarts.length; j++) {
                    if (shoppingCarts[j] != null){
                        shoppingCarts[i] = shoppingCarts[j];
                        shoppingCarts[j] = null;
                    }
                    break;
                }
            }
        }
    }

    //判断用户账户金额是否大于5000，不大于5000不能上架自己的拍卖品
    public static int moreMoney(Users[] users,String userName){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                if (users[i].getUserName().equals(userName)){
                    if (users[i].getMoney() >= 5000){
                        return 1;
                    }
                }
            }
        }return -1;
    }

//    拍卖品排序
    public static void sortAution(Aution[] aution){
        for (int i = 0; i < aution.length; i++) {
            if (aution[i] == null){
                for (int j = i+1; j < aution.length; j++) {
                    if (aution[j] != null){
                        aution[i] = aution[j];
                        aution[j] = null;
                    }
                    break;
                }
            }
        }
    }
}
