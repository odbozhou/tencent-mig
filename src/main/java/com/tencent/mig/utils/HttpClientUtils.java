package com.tencent.mig.utils;/**
 * Created by jiajia on 2018/7/7.
 */

import org.asynchttpclient.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;

/**
 * @author jiajia
 * @version V1.0
 * @Description: http请求客户端
 * @date 2018/7/7 10:47
 */
public class HttpClientUtils {

    private static final Logger log = LoggerFactory.getLogger(HttpClientUtils.class);

    private static AsyncHttpClient asyncHttpClient = Dsl.asyncHttpClient();

    public static String get(String url) {
        Request request = Dsl.get(url).build();
        ListenableFuture<Response> responseListenableFuture = asyncHttpClient.executeRequest(request);
        Response response = null;
        try {
            response = responseListenableFuture.get();
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        } catch (ExecutionException e) {
            log.error(e.getMessage());
        }
        if (null == response) {
            log.info("response is null");
            return null;
        }
        String responseBody = response.getResponseBody();
        log.debug("responseBody: {}", responseBody);
        return responseBody;
    }
}
