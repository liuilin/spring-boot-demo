package com.xkcoding.pay.bean.direct.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 正常 预下单 返回结果。
 */
@Data
public class PrepayResult {

    /**
     * 预支付交易会话标识。
     * 示例值：wx201410272009395522657a690389285100
     */
    @JsonProperty("prepay_id")
    private String prepayId;

}
