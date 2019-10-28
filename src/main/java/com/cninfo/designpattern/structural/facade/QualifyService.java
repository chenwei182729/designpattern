package com.cninfo.designpattern.structural.facade;

public class QualifyService {
    public boolean isAvalible(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分通过，库存通过");
        return true;
    }
}
