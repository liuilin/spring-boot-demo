package com.xkcoding.pay.bean.direct.notify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 通知资源数据
 * json格式，见示例
 */
@Getter
@Setter
public class PrepayNotifyResource {

    /**
     * 对开启结果数据进行加密的加密算法，目前只支持AEAD_AES_256_GCM
     * 示例值：AEAD_AES_256_GCM
     */
    private String algorithm;

    /**
     * Base64编码后的开启/停用结果数据密文
     * 示例值：sadsadsadsad
     */
    @JsonProperty("ciphertext")
    private String cipherText;

    /**
     * 附加数据
     * 示例值：fdasfwqewlkja484w
     */
    @JsonProperty("associated_data")
    private String associatedData;

    /**
     * 加密使用的随机串
     * 示例值：fdasflkja484w
     */
    private String nonce;

}
