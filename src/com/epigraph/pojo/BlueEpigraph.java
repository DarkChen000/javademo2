package com.epigraph.pojo;

public class BlueEpigraph extends Epigraph{
    private double maxHP;//最大生命
    private double hfHP;//每5秒回血
    private double speed;//移速
    private String adBlood;//物理吸血
    private String apBlood;//法术吸血
    //第一个
    public void setMaxHP(double maxHP) { this.maxHP = maxHP; }
    public double getMaxHP() {
        return this.maxHP;
    }
    //第二个
    public void setHfHP(double hfHP) {
        this.hfHP = hfHP;
    }
    public double getHfHP() {
        return this.hfHP;
    }
    //第三个
    public void setSpeed(double speed) { this.speed = speed; }
    public double getSpeed() {
        return this.speed;
    }
    //第四个
    public void setAdBlood(String adBlood) {
        this.adBlood = adBlood;
    }
    public String getAdBlood() {
        return this.adBlood;
    }
    //第五个
    public void setApBlood(String apBlood) {
        this.apBlood = apBlood;
    }
    public String getApBlood() {
        return this.apBlood;
    }
}
