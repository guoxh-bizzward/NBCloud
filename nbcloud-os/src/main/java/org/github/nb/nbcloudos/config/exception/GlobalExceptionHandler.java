package org.github.nb.nbcloudos.config.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public Map<String,Object> globalException(HttpServletResponse response,NullPointerException ex){
        log.info("GlobalExceptionHandler");
        log.info("错误代码:{}",response.getStatus());
        Map<String,Object> result = new HashMap<>(4);
        result.put("status",response.getStatus());
        result.put("message",ex.getMessage());
        return result;
    }
}
