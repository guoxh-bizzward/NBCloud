package os.cloud.publogin;


import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScans(value = {@MapperScan("os.cloud.publogin.*.dao")})
public class PubLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(PubLoginApplication.class, args);
    }

}
