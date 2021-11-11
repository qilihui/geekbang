package com.example.geekbang.tool;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author qilihui
 * @date 2021/11/11 7:47 下午
 */
@Data
@Accessors(chain = true)
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success() {
        return new Result(0, "OK");
    }

    public static Result success(Object data) {
        return new Result(0, "OK", data);
    }
}
