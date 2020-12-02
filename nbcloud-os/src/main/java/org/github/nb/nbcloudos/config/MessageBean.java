package org.github.nb.nbcloudos.config;

import ch.qos.logback.classic.pattern.MessageConverter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageBean {

    @Bean("messageSource")
    public ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource(){

        return null;
    }

    @Bean
    public MessageConverter messageConverter(){
        MessageConverter messageConverter = new MessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.DisableCircularReferenceDetect);
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");

        return messageConverter;
    }
}
