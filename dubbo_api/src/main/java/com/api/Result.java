package com.api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    public static String SUCCESS_MSG = "SUCC";
    public static String DEFAULT_FAIL_MSG = "FAIL";

    private String code;
    private String msg;
    private String subCode;
    private String subMsg;
    private String sign;

    private Object data;

    private Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;

        this.subCode = "";
        this.subMsg = "";
        this.sign = "";
    }

    /**
     * Return succ result with given data.
     * @return
     */
    public static Result succ() {
        return new Result("0", SUCCESS_MSG, null);
    }

    /**
     * Return succ result with given data.
     * @param msg
     * @return
     */
    public static Result succ(String msg) {
        return new Result("1", msg, null);
    }

    /**
     * Return failed result with given code, msg, and data
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static Result fail(String code, String msg, Object data) {
        return new Result(code, msg, data);
    }
    // 其他省略...
}