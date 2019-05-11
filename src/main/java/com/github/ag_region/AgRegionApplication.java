package com.github.ag_region;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages ="com.github.ag_region")
public class AgRegionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgRegionApplication.class, args);
    }

}
