package com.zg.lowcode.util;

import lombok.Data;

/**
 * @author 赵刚
 */
@Data
public class ApiResponse<T> {
    private int code;
    private String type;
    private String message;
    private T result;

    public ApiResponse(int code, String type, String message, T result) {
        this.code = code;
        this.type = type;
        this.message = message;
        this.result = result;
    }

    public static <T> ApiResponse<T> success(String message, T result) {
        return success(200, message, result);
    }

    public static <T> ApiResponse<T> success(int code, String message, T result) {
        return new ApiResponse<>(code, "success", message, result);
    }

    public static <T> ApiResponse<T> error(String message) {
        return error(500, message);
    }

    public static <T> ApiResponse<T> error(int code, String message) {
        return new ApiResponse<>(code, "error", message, null);
    }

    public static <T> ApiResponse<T> warning(String message) {
        return warning(300, message);
    }

    public static <T> ApiResponse<T> warning(int code, String message) {
        return new ApiResponse<>(code, "warning", message, null);
    }

}