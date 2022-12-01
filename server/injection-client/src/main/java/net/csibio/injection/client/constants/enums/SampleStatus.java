package net.csibio.injection.client.constants.enums;

public enum SampleStatus {

    /**
     * 有效
     */
    VALID(1, "有效"),

    /**
     *
     */
    INVALID(2, "无效");

    private Integer code;
    private String message;

    SampleStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
