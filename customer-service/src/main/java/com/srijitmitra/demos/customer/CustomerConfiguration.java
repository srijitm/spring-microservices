package com.srijitmitra.demos.customer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;

@Configuration
@EnableRetry
@ComponentScan("com.srijitmitra.demos.customer")
public class CustomerConfiguration {
	
}
