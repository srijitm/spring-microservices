package com.srijitmitra.demos.account;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;

@Configuration
@EnableRetry
@ComponentScan("com.srijitmitra.demos.account")
public class AccountConfiguration {

	
}
