package com.auction_company.pojo;

public class Aution {
    //拍卖商品类包括商品序号、商品名、商品价格、商品详情
    private int goodsID;
    private String goodsName;
    private int goodsPrice;
    private String goodsDetails;
    //存取方法
    public int getGoodsID() { return goodsID; }
    public void setGoodsID(int goodsID) { this.goodsID = goodsID; }
    public String getGoodsName() { return goodsName; }
    public void setGoodsName(String goodsName) { this.goodsName = goodsName; }
    public int getGoodsPrice() { return goodsPrice; }
    public void setGoodsPrice(int goodsPrice) {this.goodsPrice = goodsPrice; }
    public String getGoodsDetails() { return goodsDetails; }
    public void setGoodsDetails(String goodsDetails) { this.goodsDetails = goodsDetails;
    }

}
