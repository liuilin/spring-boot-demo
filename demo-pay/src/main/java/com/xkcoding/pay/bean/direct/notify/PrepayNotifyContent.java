package com.xkcoding.pay.bean.direct.notify;

import com.xkcoding.pay.bean.direct.result.OrderQueryResult;
import lombok.Data;

/**
 * 预付款回调通知，解密后的真实收据。
 * 属性结果和查询订单接口返回值属性相同
 */
@Data
public class PrepayNotifyContent extends OrderQueryResult {

}
