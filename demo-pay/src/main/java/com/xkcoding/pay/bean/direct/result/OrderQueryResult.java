package com.xkcoding.pay.bean.direct.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xkcoding.pay.bean.direct.Payer;
import com.xkcoding.pay.bean.direct.PromotionDetail;
import com.xkcoding.pay.bean.direct.SceneInfo;
import com.xkcoding.pay.bean.direct.query.QueryOrderAmount;
import lombok.Data;

import java.util.List;

/**
 * 订单查询结果
 */
@Data
public class OrderQueryResult {
    /**
     * 直连商户申请的公众号或移动应用appid。
     * 示例值：wxd678efh567hg6787
     * [r]
     */
    @JsonProperty("appid")
    private String appId;

    /**
     * 直连商户的商户号，由微信支付生成并下发。
     * 示例值：1230000109
     * [r]
     */
    @JsonProperty("mchid")
    private String mchId;

    /**
     * 商户系统内部订单号，只能是数字、大小写字母_-*且在同一个商户号下唯一，详见【商户订单号】。
     * 示例值：1217752501201407033233368018
     * [r]
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 微信支付系统生成的订单号。（也就是流水号）
     * 示例值：1217752501201407033233368018
     * [o]
     */
    @JsonProperty("transaction_id")
    private String transactionId;

    /**
     * 交易类型，枚举值：
     * JSAPI：公众号支付
     * NATIVE：扫码支付
     * APP：APP支付
     * MICROPAY：付款码支付
     * MWEB：H5支付
     * FACEPAY：刷脸支付
     * 示例值：MICROPAY
     * [r]
     */
    @JsonProperty("trade_type")
    private String tradeType;

    /**
     * 交易状态，枚举值：
     * SUCCESS：支付成功
     * REFUND：转入退款
     * NOTPAY：未支付
     * CLOSED：已关闭
     * REVOKED：已撤销（付款码支付）
     * USERPAYING：用户支付中（付款码支付）
     * PAYERROR：支付失败(其他原因，如银行返回失败)
     * 示例值：SUCCESS
     * [r]
     */
    @JsonProperty("trade_state")
    private String tradeState;

    /**
     * 交易状态描述
     * 示例值：支付失败，请重新下单支付
     * [r]
     */
    @JsonProperty("trade_state_desc")
    private String tradeStateDesc;

    /**
     * 银行类型，采用字符串类型的银行标识。
     * 示例值：CMC
     * [o]
     */
    @JsonProperty("bank_type")
    private String bankType;

    /**
     * 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用
     * 示例值：自定义数据
     * [o]
     */
    private String attach;

    /**
     * 支付完成时间，遵循rfc3339标准格式，格式为YYYY-MM-DDTHH:mm:ss+TIMEZONE，YYYY-MM-DD表示年月日，
     * T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，
     * TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。
     * 例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
     * 示例值：2018-06-08T10:34:56+08:00
     * [o]
     */
    @JsonProperty("success_time")
    private String successTime;

    /**
     * 支付者信息, 当这个数据结构被映射成 回调通知结果时， 选用alternate 指向的名称
     * [r]
     */
    private Payer payer;

    /**
     * 订单金额信息，当支付成功时返回该字段
     * [o]
     */
    private QueryOrderAmount amount;

    /**
     * 支付场景描述
     * [o]
     */
    @JsonProperty("scene_info")
    private SceneInfo sceneInfo;

    /**
     * 优惠功能，享受优惠时返回该字段。
     * [o]
     */
    @JsonProperty("promotion_detail")
    private List<PromotionDetail> promotionDetail;

}