package cn.com.sinosoft.ebusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        System.out.println("===Springboot run===");
        SpringApplication.run(WebApplication.class, args);
    }

}
