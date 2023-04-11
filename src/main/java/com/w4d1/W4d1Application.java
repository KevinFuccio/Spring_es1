package com.w4d1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.Pizza.ConfigurationBeverage;
import configuration.Pizza.ConfigurationPizza;
import products.Beverage;
import products.Gadget;
import products.Pizza;
import topping.PizzaPersonalizzata;


@SpringBootApplication
public class W4d1Application {

	public static void main(String[] args) {
		SpringApplication.run(W4d1Application.class, args);
//		menuPizza("capricciosa");
//		menuBeverage("CocaCola");
//		aggiungiCondimento(menuPizza("capricciosa"),"patatine");
		getMenu();
	
		
	}
	public static Pizza menuPizza(String name) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationPizza.class);
		Pizza p1 = (Pizza) appContext.getBean(name);
		appContext.close();
		return p1;
	}
	public static Beverage menuBeverage(String name) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBeverage.class);
		Beverage b1 = (Beverage) appContext.getBean(name);
		appContext.close();
		return b1;
	}
	public static PizzaPersonalizzata aggiungiCondimento(Pizza name,String condimento) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationPizza.class);
		PizzaPersonalizzata b1 = (PizzaPersonalizzata) appContext.getBean("condimento",name,condimento);
		appContext.close();
		return b1;
	}
	
	public static void getMenu() {
		List<Pizza> pizze = new ArrayList();
		pizze.add(menuPizza("margherita"));
		pizze.add(menuPizza("capricciosa"));
		pizze.add(menuPizza("stagioni"));
		pizze.add(menuPizza("frutti_di_mare"));
		List<Beverage> beverage = new ArrayList();
		beverage.add(menuBeverage("CocaCola"));
		beverage.add(menuBeverage("acqua"));
		beverage.add(menuBeverage("sprite"));
		List<Gadget> Gadget = new ArrayList();
		Gadget.add(new Gadget("stella",1.50));
		Gadget.add(new Gadget("distruttore di mondi",10.50));
		Gadget.add(new Gadget("hello kitty",5.50));
		
		System.out.println("MENU \n");
		System.out.println("Pizze:\n");
		pizze.forEach(e -> System.out.println(e.getName()));
		System.out.println("\nBeverage:\n");
		beverage.forEach(e -> System.out.println(e.getName()));
		System.out.println("\nGadget:\n");
		Gadget.forEach(e -> System.out.println(e.getName()));
	}

}
