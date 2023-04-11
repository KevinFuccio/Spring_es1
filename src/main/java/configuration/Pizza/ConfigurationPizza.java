package configuration.Pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import products.Pizza;
import topping.PizzaPersonalizzata;

@Configuration
public class ConfigurationPizza {
	@Bean
	public Pizza margherita() {
		return new Pizza();
	}
	@Bean
	@Scope("prototype")
	public Pizza capricciosa() {
		return new Pizza("capricciosa",10d);
	}
	@Bean
	@Scope("prototype")
	public Pizza stagioni() {
		return new Pizza("4 stagioni",12.50);
	}
	@Bean
	@Scope("prototype")
	public Pizza frutti_di_mare() {
		return new Pizza("frutti di mare",14.50);
	}
	@Bean
	@Scope("prototype")
	public PizzaPersonalizzata condimento(Pizza pizza,String condimento) {
		return new PizzaPersonalizzata(pizza,condimento);
	}
	
}
