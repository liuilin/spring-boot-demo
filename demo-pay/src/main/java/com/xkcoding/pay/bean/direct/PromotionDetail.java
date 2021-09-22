package com.xkcoding.pay.bean.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xkcoding.pay.bean.direct.query.QueryGoodsDetail;
import lombok.Data;

/**
 * 促销优惠功能，享受优惠时返回该字段，该字段在查询订单状态时返回。
 */
@Data
public class PromotionDetail {
    /**
     * 券ID
     * 示例值：109519
     * [r]
     */
    @JsonProperty("coupon_id")
    private String couponId;

    /**
     * 优惠名称
     * 示例值：单品惠-6
     * [o]
     */
    private String name;

    /**
     * GLOBAL：全场代金券
     * SINGLE：单品优惠
     * 示例值：GLOBAL
     * [o]
     */
    private String scope;

    /**
     * CASH：充值
     * NOCASH：预充值
     * 示例值：CASH
     * [o]
     */
    private String type;

    /**
     * 优惠券面额
     * 示例值：100
     * [r]
     */
    private Integer amount;

    /**
     * 活动ID
     * 示例值：931386
     * [o]
     */
    @JsonProperty("stock_id")
    private String stockId;

    /**
     * 微信出资，单位为分
     * 示例值：0
     * [o]
     */
    @JsonProperty("wechatpay_contribute")
    private Integer wechatPayContribute;

    /**
     * 商户出资，单位为分
     * 示例值：0
     * [o]
     */
    @JsonProperty("merchant_contribute")
    private Integer merchantContribute;

    /**
     * 其他出资，单位为分
     * 示例值：0
     * [o]
     */
    @JsonProperty("other_contribute")
    private Integer otherContribute;

    /**
     * CNY：人民币，境内商户号仅支持人民币。
     * 示例值：CNY
     * [o]
     */
    private String currency;

    /**
     * 单品列表信息
     * [o]
     */
    @JsonProperty("goods_detail")
    private QueryGoodsDetail goodsDetail;
}
