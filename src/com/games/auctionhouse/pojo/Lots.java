package com.games.auctionhouse.pojo;

public class Lots {
    private int goodsID;//商品序号
    private int goodsPrice;//商品价格
    private int goodsNumber;//商品数目
    private String goodsName;//商品名称
    private String goodsDescription;//商品描述
    // 存入和输出商品名称
    public String getGoodsName() {
        return this.goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    // 存入和输出商品序号
    public int getGoodsID() {
        return this.goodsID;
    }
    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }
   // 存入和输出商品价格
    public int getGoodsPrice() {
        return this.goodsPrice;
    }
    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    // 存入和输出商品数目
    public int getGoodsNumber() {
        return this.goodsNumber;
    }
    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
    // 存入和输出商品描述
    public String getGoodsDescription() {
        return this.goodsDescription;
    }
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }
}
