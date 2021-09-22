package com.xkcoding.pay.bean.direct.notify;

import lombok.Getter;
import lombok.Setter;

/**
 * 微信支付回调返回 SUCCESS，否则会一直回调
 *
 * @author liuqiang
 * @since 2021-09-18
 */
@Getter
@Setter
public class NotifyCommonResult {
    private String code;
    private String message;
}
