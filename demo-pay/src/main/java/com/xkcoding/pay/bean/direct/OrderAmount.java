package com.xkcoding.pay.bean.direct;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * 描述订单金额
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderAmount {
    /**
     * 订单总金额，单位为分。
     * 示例值：100
     * 当为合单支付时， 名称为 'total_amount'
     * [r]
     */
    private Integer total;

    /**
     * CNY：人民币，境内商户号仅支持人民币。
     * 示例值：CNY
     * [o]
     */
    private String currency;
}
