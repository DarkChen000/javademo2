package com.epigraph.pojo;

public class GreenEpigraph extends Epigraph{
    private String coolingRedution;//冷却缩减
    private double adDefense;//物理防御
    private double apDefense;//魔法防御
    private String crit;//暴击率
    private String critEffect;//暴击效果
    //第一个
    public void setCoolingRedution(String coolingRedution) {
        this.coolingRedution = coolingRedution;
    }
    public String getCoolingRedution() {
        return this.coolingRedution;
    }
    //第二个
    public void setAdDefense(double adDefense) {
        this.adDefense = adDefense;
    }
    public double getAdDefense() { return this.adDefense; }
    //第三个
    public void setApDefense(double apDefense) {
        this.apDefense = apDefense;
    }
    public double getApDefense() {
        return this.apDefense;
    }
    //第四个
    public void setCrit(String crit) {
        this.crit = crit;
    }
    public String getCrit() {
        return this.crit;
    }
    //第五个
    public void setCritEffect(String critEffect) {
        this.critEffect = critEffect;
    }
    public String getCritEffect() {
        return this.critEffect;
    }
}
