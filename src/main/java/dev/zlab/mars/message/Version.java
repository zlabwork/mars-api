package dev.zlab.mars.message;

public class Version {

    private Integer code = 0;
    private String message = "";
    private String data = "";

    public Version(Integer code, String message, String data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }
}
