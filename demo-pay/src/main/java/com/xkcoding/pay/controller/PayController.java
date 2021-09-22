package com.xkcoding.pay.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ijpay.core.IJPayHttpResponse;
import com.ijpay.core.enums.RequestMethod;
import com.ijpay.core.kit.PayKit;
import com.ijpay.wxpay.WxPayApi;
import com.ijpay.wxpay.enums.WxApiType;
import com.ijpay.wxpay.enums.WxDomain;
import com.xkcoding.pay.bean.direct.JsapiPrepayOrder;
import com.xkcoding.pay.bean.direct.OrderAmount;
import com.xkcoding.pay.bean.direct.Payer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.X509Certificate;

/**
 * @author liuqiang
 * @since 2021-09-20
 */
@RestController
@RequestMapping
@Slf4j
public class PayController {


    public static final String OPEN_ID = "ocXS14nQx3jExt36NgIlhgZnrXmU";

    public static void main(String[] args) throws JsonProcessingException {
        JsapiPrepayOrder order = JsapiPrepayOrder.builder()
            .amount(OrderAmount.builder().total(100).currency("CNY").build())
            .mchId("1614031817")
            .description("test")
            .notifyUrl("http://33896gn675.qicp.vip:38425/wxpay/notify")
            .payer(Payer.builder().openId(OPEN_ID).build())
            .outTradeNo(String.valueOf(IdUtil.getSnowflake(1, 1).nextId()))
            .goodsTag("WXG")
            .appId("wx459059f0f95c2fac")
            .build();

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(order));

        IJPayHttpResponse response = null;
        try {
            response = WxPayApi.v3(
                RequestMethod.POST,
                WxDomain.CHINA.toString(),
                WxApiType.JS_API_PAY.toString(),
                "1614031817",
                "51EE4623B9CF56AAEB0291303BF1BBC36D9DC7F8",
                "",
                "C:\\Users\\Daniel\\OneDrive\\1614031817_20210913_cert\\apiclient_key.pem",
                objectMapper.writeValueAsString(order)
//                "{\"description\":\"test\",\"amount\":{\"total\":100,\"currency\":\"CNY\"},\"payer\":{\"openid\":\"ocXS14nQx3jExt36NgIlhgZnrXmU\"},\"appid\":\"wx459059f0f95c2fac\",\"mchid\":\"1614031817\",\"out_trade_no\":\"1440130459156746241\",\"notify_url\":\"http://33896gn675.qicp.vip:38425/wxpay/notify\",\"goods_tag\":\"WXG\",\"scene_info\":null}"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("post = " + response.getBody());
    }

    @RequestMapping("/wxpay")
    public void wxpay() {
//        WxPayService
        X509Certificate certificate = PayKit.getCertificate(FileUtil.getInputStream("C:\\Users\\Daniel\\OneDrive\\1614031817_20210913_cert\\apiclient_cert.pem"));
        String serialNo = certificate.getSerialNumber().toString(16).toUpperCase();

        // 构建签名参数
//        String buildSignMessage = PayKit.buildSignMessage(method, urlSuffix, timestamp, nonceStr, body);
// 构建签名参数，也可通过列表传入待签名的参数
//        String buildSignMessage = PayKit.buildSignMessage(ArrayList<String> signMessage)
// 创建签名
//        String signature = PayKit.createSign(buildSignMessage,keyPath);
// 创建签名，整合版
//        String signature = PayKit.createSign(ArrayList<String> signMessage, String keyPath)
    }
}
