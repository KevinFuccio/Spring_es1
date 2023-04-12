package com.w4d1.orders.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.w4d1.orders.Order;
import com.w4d1.orders.State;
import com.w4d1.orders.Table;
import com.w4d1.products.Products;

@Configuration
public class OrderConfig {
	@Bean
	@Scope("prototype")
	public Order newOrder(List<Products> list,int nOP,Table table) {
		return new Order("ordine eseguito", list, State.In_progress, nOP, table);
	}
}
