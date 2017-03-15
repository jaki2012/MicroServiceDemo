package org.labsse.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijiechu
 * @create on 17/3/14
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SomeApplication {

    @Value("${my.message}")
    private String message;

    @RequestMapping(value = "/getsome", method = RequestMethod.GET)
    public String getsome(){
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class,args);
    }
}
