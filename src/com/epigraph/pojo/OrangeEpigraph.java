package com.epigraph.pojo;

public class OrangeEpigraph extends Epigraph {
    private double adHurt;//物理攻击力
    private double apHurt;//魔法攻击力
    private String adSpeed;//攻速
    private String adChuanTou;//物理穿透
    private String apChuanTou;//魔法穿透
    //第一个
    public void setAdHurt(double adHurt) {
        this.adHurt = adHurt;
    }
    public double getAdHurt() {
        return this.adHurt;
    }
    //第二个
    public void setApHurt(double apHurt) {
        this.apHurt = apHurt;
    }
    public double getApHurt() {
        return apHurt;
    }
    //第三个
    public void setAdSpeed(String adSpeed) {
        this.adSpeed = adSpeed;
    }
    public String getAdSpeed() {
        return this.adSpeed;
    }
    //第四个
    public void setAdChuanTou(String adChuanTou) {
        this.adChuanTou = adChuanTou;
    }
    public String getAdChuanTou() {
        return this.adChuanTou;
    }
    //第五个
    public void setApChuanTou(String apChuanTou) {
        this.apChuanTou = apChuanTou;
    }
    public String getApChuanTou() {
        return this.apChuanTou;
    }

}
