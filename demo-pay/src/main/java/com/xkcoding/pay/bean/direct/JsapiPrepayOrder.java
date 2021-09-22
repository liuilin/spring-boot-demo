package com.xkcoding.pay.bean.direct;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * 除付款码支付场景以外，商户系统先调用该接口在微信支付服务后台生成预支付交易单，
 * 返回正确的预支付交易会话标识后再按Native、JSAPI、APP等不同场景生成交易串调起支付
 */
@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class JsapiPrepayOrder extends PrepayOrder {
    private Payer payer;
}
