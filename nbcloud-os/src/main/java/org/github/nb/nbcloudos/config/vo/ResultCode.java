package org.github.nb.nbcloudos.config.vo;

public enum ResultCode {
    SUCCESS(1),
    FAIL(0);

    private int code;

    private ResultCode(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
