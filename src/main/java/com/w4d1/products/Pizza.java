package com.w4d1.products;

import lombok.ToString;


public class Pizza extends Products {

	private String nutritional_info;
	private Size_Enum size;
	private String condimento;
	
	public Pizza() {
		super();
		super.setName("Margherita");
		super.setPrice(5d);
		this.nutritional_info ="700Kcal";
		this.size = Size_Enum.Normal;
	}

	public Pizza(String name, double price) {
		switch(name) {
		case "capricciosa":
			super.setName(name);
			super.setPrice(price);
			this.nutritional_info ="1000Kcal";
			this.size = Size_Enum.Normal;
			break;
		case "4 stagioni":
			super.setName(name);
			super.setPrice(price);
			this.nutritional_info ="1200Kcal";
			this.size = Size_Enum.Normal;
			break;
		case "frutti di mare":
			super.setName(name);
			super.setPrice(price);
			this.nutritional_info ="1350Kcal";
			this.size = Size_Enum.Normal;
			break;
		}
		
	}
	
	public String getCondimento() {
		return condimento;
	}

	public void setCondimento(String condimento) {
		this.condimento = condimento;
	}

	@Override
	public String toString() {
		return "Pizza [Name= " + getName() + ", Price= " + getPrice() + ", Nutritional_Info= "+ this.nutritional_info +", Size= "+this.size+", condimento= "+this.condimento+"]";
	}
	public static Pizza PizzaPersonalizzata(Pizza pizza,String condimento) {
		switch(condimento){
		case "patatine":
			
			pizza.setPrice(pizza.getPrice()+1);
			pizza.setCondimento(condimento);
			break;
		
		case "ketchup":
			
			pizza.setPrice(pizza.getPrice()+0.20);
			pizza.setCondimento(condimento);
			break;
		
		case "maionese":
			
			pizza.setPrice(pizza.getPrice()+0.50);
			pizza.setCondimento(condimento);
			break;
		}
		return pizza;
	}
	
	
	
}
