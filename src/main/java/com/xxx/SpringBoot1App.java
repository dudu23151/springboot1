package com.xxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBoot1App 
{
    public static void main( String[] args )
    {
        System.out.println(" SpringBoot1App Hello World!" );
        SpringApplication.run(SpringBoot1App.class, args);
    }
    
    @Bean
    @LoadBalanced
    public RestTemplate restTemplete(){
    	return new RestTemplate();
    }
}
