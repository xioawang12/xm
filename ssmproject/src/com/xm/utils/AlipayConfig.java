package com.xm.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "9021000132657612";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDqG9r9JELO+rGQn4kaTCYCq6iiEiVx4HHhJTv7re2athzy5tExIKgEwYLaEwymxudLm2C9zwTX9GxsXnsEdDAzOUjMCkJ+CyToThKuZ9Pix4GIZiiGrCUenSd896J3WwmE3U9xRnX6Z4yRavgCZwMcsbPO9Mh6Q9KYFJ3bmtXZWtGAfzzUw2yWuFoFiF92IKa6yp6gw5EWqIL90XNETQ+pC278eYSpl5vQqrlmTbjKrIxuUcYc/0k1tGxkiXmQQcz8LlcWqvMXxhnq/l/mw00CzMyRoYZlWeiMEwt1mQHiZEm/eB894yIO/37ukTjUIVTF698E20ahZ16w2dZZS+mvAgMBAAECggEAZ4kaOIoo4dENZqCnyfGTferdEZBk7xAMTT5iYNRzGNEhzGs4aTnAFRpf/IIgPkIJWO7GwiskQT3gFa1TSoz4JC9ZeqOu9H+JOxQMPwW8N7d0GhbUJXtMj1WBeUsrlw20EAawc7BtzOiuykE8nhNg1PfiRc0MPMZyBMBZcB3yJcWj/i6pfdkR7xODcVIjbe4plVvd/QoBwfNGZ+dv7zzCSRZpv609jMSClZM8gJVtnZgBCwB8bGrVec4dvb00P1Lo++RG3oHTNVmH8ex8nRH72TBloAUiPTGGuOlwl2zARINOdS+XIgPWLgNAfmLUATZVQidzik8lUnjX7SME2tt9wQKBgQD5aHQG305F4E1KeTXLbzxAWYw+QvcQupH2zCE4cON5gQmqeWkygh7sJKU8wjBEQ6ZElmNE8Gz6yv+kjF2sF6hBWyob2fst1vEUtMKjBTn5CBm58h4RbFwCsIJOr2/ofdevCILjbuGVjDxShz4p4NMn4I+Y5euSCT2TOherWuNaowKBgQDwS+JxahgYJ8dkA7ApDC13YLNuEP3nNIt8esUBUhBUdjiTEStWYEN8NpqzprZg7ZKfb1eCi0MUgW1G7VfOWYRYRRzL7Gk8rOZJA75CV+deMmmY32+m+qeEZX3bpQtswpDRVIvXh0Kf7QWbUyg3r3ORXqQ5z328Ee0TsihA6sMRhQKBgQCWBFol+BOgvDZBYX8WCqZ3HmXY3Xa2vUIm7MnepShuYUtrGvRHyTTIXZJ2ZWea6AYOo1a6lNM4VvpGA5gkd2ZhSXCeqBMJk4wXJFMes3oXbOPskNG9MSx3Aayfn670bR1azwfLvVo7FcsC6Q5fKjhYeB5nnYSApsY+1GaAT38JeQKBgAbGnQQFsdg8hurTD8yYg0+yclzQLdivKp+/9n4rCjrXepDrEwXEgSKnh4U5Vjs1d8T3JsiPlLynSaWOW8N90rWKfV1itTT4yyWT7XGBeQy27zNYWZWjy8V39yySYtgWRG8iqy7QqZhI3reaiK/JSsD2ojrfFvSOrNi5VVk/RXDhAoGBAMELyPwOAejkbYE+gEWPubDRZqhRTj8PcG3pQ6GVqrxvqA0B3MYIeht969wzB1HvLFEPy1vq/aUV0bo46/O/HF67alyiTVIgJXH0IGt9SYMGRm+fbZC5/Hyj2gQySHskl00wiB9wgBZlKStH+mRbWcTpvMAqR25s7WDxDGba16eW";
    
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxwY88hgejN4fU2RSj352kU0gS35yaqXzXyJFge5DJVZ55gZMwhZ8RpKCqIFfG2rADb+eOAZbXsKgKSkg7rrg4OfzhY66TVz1BJkNwMOQD0uhJmCv2KAgKjIhKL/Ii4Jpc2W972ZWx1dqez1uSFMNpzyIYcBBeFb3Q2NHGlaJvIsbUd4ESQklmsBMEhsPWW3yX2uEDPwrRvoXStKKeJsjslb3bnJrMf9Qad2sTIBZPPZzwPjIJZWlLcCrxYjeaHbsLxEmwUG/Yj1QWcnSaOeHt+zHa/Hgi9/aWX4VPPrBCGUhL9fp3PIBJH/HNIQ2G7FwHwwawNCwlD3LJz19VvRcdQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "https://5bb11776.r5.cpolar.top/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/ssmproject/oks/ok";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

