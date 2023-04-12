package com.w4d1.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.w4d1.configuration.Pizza.ConfigurationBeverage;
import com.w4d1.configuration.Pizza.ConfigurationPizza;
import com.w4d1.orders.Order;
import com.w4d1.orders.State_Enum;
import com.w4d1.orders.Table;
import com.w4d1.orders.configuration.OrderConfig;
import com.w4d1.products.Beverage;
import com.w4d1.products.Gadget;
import com.w4d1.products.Pizza;
import com.w4d1.products.Products;


@Component
public class OrderRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
//	menuPizza("capricciosa");
//	menuBeverage("CocaCola");
//	aggiungiCondimento(menuPizza("capricciosa"),"patatine");
//	getMenu();
		nuovoOrdine();
		
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
	public static Pizza aggiungiCondimento(Pizza name,String condimento) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationPizza.class);
		Pizza b1 = (Pizza) appContext.getBean("condimento",name,condimento);
		System.out.println(b1);
		appContext.close();
		return b1;
	}
	public static Order nuovoOrdine() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(OrderConfig.class);
		Order b1 = (Order) appContext.getBean("newOrder",order(),3,table());
		System.out.println(b1);
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
	
	public static List<Products> order(){
		List<Products> pizze = new ArrayList();
		pizze.add(menuPizza("margherita"));
		pizze.add(menuPizza("margherita"));
		pizze.add(menuPizza("margherita"));
		return pizze;
		
	}
	public static Table table() {
		return new Table(5, State_Enum.Available);
	}
}
