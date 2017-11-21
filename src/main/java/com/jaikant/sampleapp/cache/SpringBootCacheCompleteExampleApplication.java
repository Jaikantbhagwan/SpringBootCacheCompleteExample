

package com.jaikant.sampleapp.cache;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class SpringBootCacheCompleteExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCacheCompleteExampleApplication.class, args);
    }
}
