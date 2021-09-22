package com.xkcoding.pay.bean.direct;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 场景信息支付场景描述
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SceneInfo {
    /**
     * 调用微信支付API的机器IP，支持IPv4和IPv4两种格式的IP地址。
     * 示例值：14.23.150.211
     * [r]
     */
    @JsonProperty("player_client_ip")
    private String playerClientIp;

    /**
     * 商户端设备号（门店号或收银设备ID）。
     * 示例值：013467007045764
     * [o]
     */
    @JsonProperty("device_id")
    private String deviceId;

    /**
     * 商户门店信息
     * [o]
     */
    @JsonProperty("store_info")
    private StoreInfo storeInfo;

    @JsonProperty("h5_info")
    private H5Info h5Info;
}
