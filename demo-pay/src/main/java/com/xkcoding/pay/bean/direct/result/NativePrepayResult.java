package com.xkcoding.pay.bean.direct.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Native 支付的返回结果。
 */
@Getter
@Setter
public class NativePrepayResult {

    /**
     * 此URL用于生成支付二维码，然后提供给用户扫码支付。
     * 注意：code_url并非固定值，使用时按照URL格式转成二维码即可。
     * 示例值：weixin://wxpay/bizpayurl/up?pr=NwY5Mz9&groupid=00
     */
    @JsonProperty("code_url")
    private String codeUrl;

}
