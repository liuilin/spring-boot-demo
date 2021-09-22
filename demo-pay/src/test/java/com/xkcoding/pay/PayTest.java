package com.xkcoding.pay;

import cn.hutool.core.map.MapUtil;
import com.ijpay.core.enums.RequestMethod;
import com.ijpay.core.kit.WxPayKit;
import com.ijpay.wxpay.WxPayApi;
import com.ijpay.wxpay.enums.WxApiType;
import com.ijpay.wxpay.enums.WxDomain;
import org.junit.Test;

import java.util.Map;

/**
 * @author liuqiang
 * @since 2021-09-21
 */
public class PayTest extends SpringBootDemoPayApplicationTests{
    String keyPath = "C:\\Users\\Daniel\\OneDrive\\1614031817_20210913_cert\\apiclient_cert.pem";// 私钥证书
    String mchId = "1614031817";
    String serialNo = "51EE4623B9CF56AAEB0291303BF1BBC36D9DC7F8";
    String body = ""; // 请求报文主体,没有查询参数。
    String platformCertPath = "C:\\Users\\Daniel\\OneDrive\\1614031817_20210913_cert\\apiclient_key.pem";//微信平台证书 验证签名时需要使用

    @Test
    public void v3Get() {
        // 获取平台证书列表
        try {
            Map<String, Object> result = WxPayApi.v3Execution(
                RequestMethod.GET,
                WxDomain.CHINA.toString(),
                WxApiType.GET_CERTIFICATES.toString(),
                mchId,
                serialNo,
                keyPath,
                body
            );

            String serialNumber = MapUtil.getStr(result, "serialNumber");
            String body = MapUtil.getStr(result, "body");
            int status = MapUtil.getInt(result, "status");

            System.out.println("serialNumber:" + serialNumber);
            System.out.println("status:" + status);
            // 根据证书序列号查询对应的证书来验证签名结果
            boolean verifySignature = WxPayKit.verifySignature(result, platformCertPath);

            System.out.println("verifySignature:" + verifySignature + "\nbody:" + body);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
