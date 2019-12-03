package com.epigraph;

import java.util.Scanner;
import com.epigraph.pojo.*;

public class EpigraphTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users[]  us= new Users[10];//用户信息数组

        //建立符文数组
        OrangeEpigraph[] orange = new OrangeEpigraph[5];//橙色数组
        BlueEpigraph[] blue = new BlueEpigraph[5];//蓝色数组
        GreenEpigraph[] green = new GreenEpigraph[5];//绿色数组
        //第一个橙色符文
        OrangeEpigraph orangeEpigraph1 = new OrangeEpigraph();
        orangeEpigraph1.setEname("勇气");
        orangeEpigraph1.setLevel(1);
        orangeEpigraph1.setColor("橙色");
        orangeEpigraph1.setType("攻击");
        ((OrangeEpigraph) orangeEpigraph1).setAdHurt(0.6);
        orange[0] = orangeEpigraph1;
        //第二个橙色符文
        OrangeEpigraph orangeEpigraph2 = new OrangeEpigraph();
        orangeEpigraph2.setEname("斗志");
        orangeEpigraph2.setLevel(1);
        orangeEpigraph2.setColor("橙色");
        orangeEpigraph2.setType("攻击");
        ((OrangeEpigraph) orangeEpigraph2).setApHurt(1.1);
        orange[1] = orangeEpigraph2;
        //第三个橙色符文
        OrangeEpigraph orangeEpigraph3 = new OrangeEpigraph();
        orangeEpigraph3.setEname("猛攻");
        orangeEpigraph3.setLevel(1);
        orangeEpigraph3.setColor("橙色");
        orangeEpigraph3.setType("攻速");
        ((OrangeEpigraph) orangeEpigraph3).setAdSpeed("0.4%");
        orange[2] = orangeEpigraph3;
        //第一个蓝色符文
        BlueEpigraph blueEpigraph1 = new BlueEpigraph();
        blueEpigraph1.setEname("活力");
        blueEpigraph1.setLevel(1);
        blueEpigraph1.setColor("蓝色");
        blueEpigraph1.setType("生命");
        ((BlueEpigraph) blueEpigraph1).setMaxHP(15);
        blue[0] = blueEpigraph1;
        //第二个蓝色符文
        BlueEpigraph blueEpigraph2 = new BlueEpigraph();
        blueEpigraph2.setEname("治疗");
        blueEpigraph2.setLevel(1);
        blueEpigraph2.setColor("蓝色");
        blueEpigraph2.setType("生命");
        ((BlueEpigraph) blueEpigraph2).setHfHP(3);
        blue[1] = blueEpigraph2;
        //第三个蓝色符文
        BlueEpigraph blueEpigraph3 = new BlueEpigraph();
        blueEpigraph3.setEname("疾行");
        blueEpigraph3.setLevel(1);
        blueEpigraph3.setColor("蓝色");
        blueEpigraph3.setType("移速");
        ((BlueEpigraph) blueEpigraph3).setSpeed(3);
        blue[2] = blueEpigraph3;
        //第一个绿色符文
        GreenEpigraph greenEpigraph1 = new GreenEpigraph();
        greenEpigraph1.setEname("应激");
        greenEpigraph1.setLevel(1);
        greenEpigraph1.setColor("绿色");
        greenEpigraph1.setType("冷却缩减");
        ((GreenEpigraph) greenEpigraph1).setCoolingRedution("0.2%");
        green[0] = greenEpigraph1;
        //第二个绿色符文
        GreenEpigraph greenEpigraph2 = new GreenEpigraph();
        greenEpigraph2.setEname("坚壁");
        greenEpigraph2.setLevel(2);
        greenEpigraph2.setColor("绿色");
        greenEpigraph2.setType("物理防御");
        ((GreenEpigraph) greenEpigraph2).setAdDefense(2.5);
        green[1] = greenEpigraph2;
        //第三个绿色符文
        GreenEpigraph greenEpigraph3 = new GreenEpigraph();
        greenEpigraph3.setEname("幻盾");
        greenEpigraph3.setLevel(2);
        greenEpigraph3.setColor("绿色");
        greenEpigraph3.setType("法术防御");
        ((GreenEpigraph) greenEpigraph3).setApDefense(2.5);
        green[2] = greenEpigraph3;
        //用户登录注册
        while (true){
            Users users = new Users();
            Epigraph[] epi = new Epigraph[9];
            System.out.println("==============================");
            System.out.println("~~~欢迎来到符文大陆~~~");
            System.out.println("召唤师，请输入您的名字：");
            String user = sc.next();
            //用户注册
            int yzm = register(user,us,users);
            if (yzm == 1) {
                //提取用户数据
                for (int i =0;i<us.length;i++){
                    if (us[i] != null){
                        if (us[i].getUsername().equals(user)){
                            System.out.println("您的符文力量是：");
                            System.out.println(us[i].getUser());
                        }
                    }
                }
            } else if (yzm == -1) {
                System.out.println("人数已满");
                break;
            }else {
                System.out.println("登陆成功");
                int num = 0;
                while (true){
                    System.out.println("符文共分为以下种类：");
                    //展示全部符文
                    showFuWen(orange,blue,green);
                    System.out.println("召唤师，请选择您需要的符文颜色,切勿重复选择：");
                    //判断是否输入过此颜色
                    String selectColor = choose(epi);
                    //展示不同颜色的符文
                    selectColor(selectColor,orange,blue,green);
                    //选择具体名字的符文
                    selectType(selectColor,orange,blue,green,users,epi);
                    num++;
                    if (num == 3) {
                        System.out.println("==============================");
                        System.out.println("~~恭喜召唤师，您已全部挑选完成~~");
                        break;
                    }
                }
            }
        }
    }


    //用户登录
    public static int register(String user,Users[] us,Users users){
        users.setUsername(user);
        for (int i=0;i<us.length;i++){
            if (us[i] != null){
                if (us[i].getUsername().equals(user)){//如果已经注册，返回用户数据
                    return 1;
                }
            }else {
                us[i] = users;
                return 2;//未注册过的，存入
            }
        }return -1;
    }
    //展示符文
    public static void showFuWen(OrangeEpigraph[] orange,BlueEpigraph[] blue,GreenEpigraph[] green){
        for (int showOrange = 0;showOrange<orange.length;showOrange++){
            if (orange[showOrange] != null){
                System.out.println("符文名字："+orange[showOrange].getEname()+"\t"+"符文等级"+orange[showOrange].getLevel()+"\t"+"符文颜色："+orange[showOrange].getColor()+"\t"+"符文类型："+orange[showOrange].getType());
            }
        }
        for (int showBlue = 0;showBlue<orange.length;showBlue++){
            if (blue[showBlue] != null){
                System.out.println("符文名字："+blue[showBlue].getEname()+"\t"+"符文等级"+blue[showBlue].getLevel()+"\t"+"符文颜色："+blue[showBlue].getColor()+"\t"+"符文类型："+blue[showBlue].getType());
            }
        }
        for (int showGreen = 0;showGreen<orange.length;showGreen++){
            if (green[showGreen] != null){
                System.out.println("符文名字："+green[showGreen].getEname()+"\t"+"符文等级"+green[showGreen].getLevel()+"\t"+"符文颜色："+green[showGreen].getColor()+"\t"+"符文类型："+green[showGreen].getType());
            }
        }
    }

    //选择颜色
    public static void selectColor(String selectColor,OrangeEpigraph[] orange,BlueEpigraph[] blue,GreenEpigraph[] green){
        if (selectColor.equals("橙色")){
            for (int show = 0;show<orange.length;show++){
                if (orange[show] != null){
                    System.out.println("名字："+orange[show].getEname()+"\t"+"等级"+orange[show].getLevel()+"\t"+"颜色："+orange[show].getColor()+"\t"+"类型："+orange[show].getType()+"\t"+"物攻："+orange[show].getAdHurt()+"\t"+"魔攻"+orange[show].getApHurt()+"\t"+"攻速"+orange[show].getAdSpeed()+"\t"+"\t"+"物理穿透"+orange[show].getAdChuanTou()+"\t"+"\t"+"魔法穿透"+orange[show].getApChuanTou());
                }
            }
        }
        if (selectColor.equals("蓝色")){
            for (int show = 0;show<blue.length;show++){
                if (blue[show] != null){
                    System.out.println("名字："+blue[show].getEname()+"\t"+"等级"+blue[show].getLevel()+"\t"+"颜色："+blue[show].getColor()+"\t"+"类型："+blue[show].getType()+"\t"+"最大生命："+blue[show].getMaxHP()+"\t"+"每5秒回血"+blue[show].getHfHP()+"\t"+"移速"+blue[show].getSpeed()+"\t"+"\t"+"物理吸血"+blue[show].getAdBlood()+"\t"+"\t"+"魔法吸血"+blue[show].getApBlood());
                }
            }
        }
        if (selectColor.equals("绿色")){
            for (int show = 0;show<green.length;show++){
                if (green[show] != null){
                    System.out.println("名字："+green[show].getEname()+"\t"+"等级"+green[show].getLevel()+"\t"+"颜色："+green[show].getColor()+"\t"+"类型："+green[show].getType()+"\t"+"冷却缩减："+green[show].getCoolingRedution()+"\t"+"物理防御"+green[show].getAdDefense()+"\t"+"魔法防御"+green[show].getApDefense()+"\t"+"\t"+"暴击率"+green[show].getCrit()+"\t"+"\t"+"暴击效果"+green[show].getCritEffect());
                }
            }
        }

    }

    //选择具体符文
    public static void selectType(String selectColor,OrangeEpigraph[] orange,BlueEpigraph[] blue,GreenEpigraph[] green,Users us,Epigraph[] epi){
        Scanner sc = new Scanner(System.in);
        int num1 = 1;//第几个
        int num2 = 0;//控制个数不超过三个
        if (selectColor.equals("橙色")) {
            while (true) {
                System.out.println("请选择具体名字的符文，同种颜色不得选择超过3个，当前为第" + num1 + "个：");
                String select = sc.next();
                for (int show = 0; show < orange.length; show++) {
                    if (orange[show] != null) {
                        if (select.equals(orange[show].getEname())) {
                            epi[num1 - 1] = orange[show];
                            num1++;
                            num2++;
                        }
                    }
                }
                if (num2 == 3) {
                    System.out.println("是否确定您的选择，确定输入1，不确定输入0");
                    int a = sc.nextInt();
                    if (a == 1){
                        us.setUser(epi);
                        break;
                    }else {
                        System.out.println("请重新选择：");
                        num1 = 1;
                        num2 = 0;
                    }
                }
            }
        }else if (selectColor.equals("蓝色")) {
            while (true) {
                System.out.println("请选择具体名字的符文，同种颜色不得选择超过3个，当前为第" + num1 + "个：");
                String select = sc.next();
                for (int show = 0; show < blue.length; show++) {
                    if (blue[show] != null) {
                        if (select.equals(blue[show].getEname())) {
                            epi[num1 + 2] = blue[show];
                            num1++;
                            num2++;
                        }
                    }
                }
                if (num2 == 3) {
                    System.out.println("是否确定您的选择，确定输入1，不确定输入0");
                    int a = sc.nextInt();
                    if (a == 1){
                        us.setUser(epi);
                        break;
                    }else {
                        System.out.println("请重新选择：");
                        num1 = 1;
                        num2 = 0;
                    }
                }
            }
        }else if (selectColor.equals("绿色")) {
            while (true) {
                System.out.println("请选择具体名字的符文，同种颜色不得选择超过3个，当前为第" + num1 + "个：");
                String select = sc.next();
                for (int show = 0; show < green.length; show++) {
                    if (green[show] != null) {
                        if (select.equals(green[show].getEname())) {
                            epi[num1 + 5] = green[show];
                            num1++;
                            num2++;
                        }
                    }
                }
                if (num2 == 3) {
                    System.out.println("是否确定您的选择，确定输入1，不确定输入0");
                    int a = sc.nextInt();
                    if (a == 1){
                        us.setUser(epi);
                        break;
                    }else {
                        System.out.println("请重新选择：");
                        num1 = 1;
                        num2 = 0;
                    }
                }
            }
        }
    }

    //判断是否输入过颜色
    public static String choose(Epigraph[] epi){
        while (true){
            Scanner sc = new Scanner(System.in);
            String selectColor = sc.next();
            int m = 0;
            for (;m<epi.length;m++){
                if (epi[m] != null){
                    if (selectColor.equals(epi[m].getColor())){
                        System.out.println("选择重复，请重新选择：");
                        String selectColor2 = sc.next();
                        selectColor = selectColor2;
                        m = 0;
                    }
                }
            }
            if (m==epi.length){
                return selectColor;
            }
        }
    }
}
