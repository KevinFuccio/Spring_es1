package configuration.Pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import products.Beverage;

@Configuration
public class ConfigurationBeverage {
	@Bean
	public Beverage CocaCola() {
		return new Beverage("Coca-Cola",2.50);
	}
	@Bean
	@Scope("prototype")
	public Beverage acqua() {
		return new Beverage("Acqua",1);
	}
	@Bean
	@Scope("prototype")
	public Beverage sprite() {
		return new Beverage("Sprite",2);
	}
}
