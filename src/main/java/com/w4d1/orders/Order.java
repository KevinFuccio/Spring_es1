package com.w4d1.orders;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.w4d1.products.Products;
//@PropertySource("classpath:application.properties")
public class Order {
//	@Value("${godfatherpizza.costocoperto}") 
	private double costPerPerson =1;
	private double totalCostOfOrder;
	private static int numberOfOrder;
	private String Note;
	private List<Products> orderedProducts;
	private State state;
	private int numberOfPerson;
	private LocalDate dateOfOrder;
	private Table table;
	
	public Order(String note, List<Products> orderedProducts, State state, int numberOfPerson, Table table) {
		this.Note = note;
		this.orderedProducts = orderedProducts;
		this.state = state;
		this.numberOfPerson = numberOfPerson;
		this.table = table;
		this.dateOfOrder = LocalDate.now();
		this.totalCostOfOrder = sumCalc();
		numberOfOrder++;
	}
	
	private double sumCalc() {
		double calc = this.orderedProducts.stream().map(e -> e.getPrice()).reduce((double) 0, (a,b) -> a+b);
		for (int i = 0; i < this.numberOfPerson; i++) {
			calc += this.costPerPerson;
		}
		return calc;
		
	}

	@Override
	public String toString() {
		return "Order [costPerPerson=" + costPerPerson + ", totalCostOfOrder=" + totalCostOfOrder + ", Note=" + Note
				+ ", state=" + state + ", numberOfPerson=" + numberOfPerson
				+ ", dateOfOrder=" + dateOfOrder + ", table=" + table+ "]";
	}
	
	
}
