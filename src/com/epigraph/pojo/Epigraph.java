package com.epigraph.pojo;

public class Epigraph {
    protected String ename;//铭文名字
    protected int level;//铭文等级
    protected String color;//铭文颜色
    protected String type;//铭文类型
    //第一个
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEname() {
        return this.ename;
    }
    //第二个
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel(){
        return this.level;
    }
    //第三个
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    //第四个
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}
