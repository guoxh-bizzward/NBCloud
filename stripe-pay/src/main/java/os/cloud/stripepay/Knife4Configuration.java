package os.cloud.stripepay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Knife4Configuration {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("xxxx")
                        .termsOfServiceUrl("https://www.baidu.com")
                        .contact(new Contact("gxuehe","https://www.baidu.com","gxuehe@aliyun.com"))
                        .version("1.0.0")
                        .build()
                ).groupName("2.x")
                .select()
                .apis(RequestHandlerSelectors.basePackage("os.cloud"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
