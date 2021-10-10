package com.example.geekbang.tool;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author qilihui
 * @date 2021/10/9 5:48 下午
 */
@Slf4j
public class JsonTool {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T parse(String json, Class<T> type) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
            return mapper.readValue(json, type);
        } catch (IOException e) {
            log.error("parse failed. json={} type={}",
                    json, type, e);
            return null;
        }
    }

    public static <T> T parse(InputStream stream, Class<T> type) {
        try {
            return mapper.readValue(stream, type);
        } catch (IOException e) {
            log.error("parse failed. type={} msg={}",
                    type, e);
            return null;
        }
    }
}
