package com.xkcoding.pay.bean.direct.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 查询结果如果有值，则返回。
 */
@Data
public class QueryGoodsDetail {

    /**
     * 这个字段只有在查询返回。
     * 商品编码
     * 示例值：M1006
     * [r]
     */
    @JsonProperty("goods_id")
    private String goodsId;

    /**
     * 用户购买的数量
     * 示例值：1
     */
    private Integer quantity;

    /**
     * 商品单价，单位为分
     * 示例值：828800
     * [r]
     */
    @JsonProperty("unit_price")
    private Integer unitPrice;

    /**
     * 商品优惠金额
     * 示例值：0
     * [r]
     */
    @JsonProperty("discount_amount")
    private Integer discountAmount;

    /**
     * 商品备注信息
     * 示例值：商品备注信息
     * [o]
     */
    @JsonProperty("goods_remark")
    private String goodsRemark;

}
