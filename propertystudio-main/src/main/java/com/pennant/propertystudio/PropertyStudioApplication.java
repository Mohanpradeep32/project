package com.pennant.propertystudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pennant.propertystudio")
public class PropertyStudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyStudioApplication.class, args);
    }
}
