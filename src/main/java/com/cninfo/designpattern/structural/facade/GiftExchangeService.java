package com.cninfo.designpattern.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointPaymentService pointPaymentService;
    private ShippingService shippingService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService) {
        this.pointPaymentService = pointPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvalible(pointsGift)) {
            //资格校验通过
            if (pointPaymentService.pay(pointsGift)) {
                //如果支持成功，打印订单号
                String shipGiftNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号" + shipGiftNo);
            }
        }
    }
}
