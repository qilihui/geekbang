package com.example.geekbang.tool;

import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson.JSON;
import com.example.geekbang.exception.BizException;

/**
 * @author qilihui
 * @date 2021/10/9 7:17 下午
 */
public class HttpTool {
    private static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.61 Safari/537.36";
    private static final String REFERER = "https://time.geekbang.org/resource?m=1&d=5&c=5&sort=0&order=sort";
    private static final String APPLICATION_JSON = "application/json";
    private static final String COOKIE = "";

    public static <T> String post(String url, T body) {
        String s = body instanceof String ? (String) body : JSON.toJSONString(body);
        return HttpRequest.post(url)
                .header(Header.USER_AGENT, USER_AGENT)
                .header(Header.REFERER, REFERER)
                .header(Header.CONTENT_TYPE, APPLICATION_JSON)
                .header(Header.COOKIE, COOKIE)
                .body(s)
                .execute().body();
    }

    public static <T, R> R post(String url, T body, Class<R> clazz) {
        String s = body instanceof String ? (String) body : JSON.toJSONString(body);
        HttpResponse res = HttpRequest.post(url)
                .header(Header.USER_AGENT, USER_AGENT)
                .header(Header.REFERER, REFERER)
                .header(Header.CONTENT_TYPE, APPLICATION_JSON)
                .header(Header.COOKIE, COOKIE)
                .body(s)
                .execute();
        if (res.getStatus() != HttpStatus.HTTP_OK) {
            throw new BizException("IP 被封");
        }
        return JSON.parseObject(res.body(), clazz);
    }

}
