package org.github.nb.nbcloudos.config.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultDto<T> implements Serializable {
    private static final Long serialVersionUID = -1L;
    private Integer code;
    private String msg;
    private T data;

    public ResultDto() {
    }

    public ResultDto(Integer code) {
        this.code = code;
    }

    public ResultDto(Integer code, String msg) {
        this(code,msg,null);
    }

    public ResultDto(Integer code, T data) {
        this(code,"",data);
    }

    public ResultDto(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);

    }
}
