package com.w4d1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.w4d1.configuration.Pizza.ConfigurationBeverage;
import com.w4d1.configuration.Pizza.ConfigurationPizza;
import com.w4d1.products.Beverage;
import com.w4d1.products.Gadget;
import com.w4d1.products.Pizza;


@SpringBootApplication
public class W4d1Application {

	public static void main(String[] args) {
		SpringApplication.run(W4d1Application.class, args);	
	}
	

}
