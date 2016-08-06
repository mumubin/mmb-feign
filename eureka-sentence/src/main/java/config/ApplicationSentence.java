package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by mmb on 2016/8/3.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ApplicationSentence {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSentence.class,args);
    }
}
