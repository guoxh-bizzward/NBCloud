package org.github.nb.nbcloudos.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.apache.commons.lang3.StringUtils;
import org.github.nb.nbcloudos.config.vo.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.util.Locale;

public class I18nMessageConverter extends FastJsonHttpMessageConverter {
    public I18nMessageConverter(){
        super();
    }
    @Autowired
    private MessageSource messageSource;

    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        if(object instanceof ResultDto){
            ResultDto result = (ResultDto)object;
            if(StringUtils.isBlank(result.getMsg())){
                result.setMsg(
                        messageSource.getMessage(
                                String.valueOf(result.getCode()),
                                new Object[]{},
                                Locale.SIMPLIFIED_CHINESE
                        )
                );
            }
            super.writeInternal(object,outputMessage);
        }else{
            super.writeInternal(object,outputMessage);
        }
    }
}
