package com.auction_company.pojo;

public class ShoppingCarts {
    //购物车类，包括用户名，商品名字，商品价格，商品详情
    private String userName;
    private String goodsName;
    private int goodsPrice;
    private String goodsDetails;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public String getGoodsDetails() {
        return goodsDetails;
    }
    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
