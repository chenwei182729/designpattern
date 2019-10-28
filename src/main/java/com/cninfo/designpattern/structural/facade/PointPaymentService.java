package com.cninfo.designpattern.structural.facade;


public class PointPaymentService {

    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + "资金成功");
        return true;
    }
}
