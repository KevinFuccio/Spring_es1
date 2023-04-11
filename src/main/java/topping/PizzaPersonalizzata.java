package topping;

import products.Pizza;

public class PizzaPersonalizzata {
	private Pizza pizza;

	public PizzaPersonalizzata(Pizza pizza,String condimento) {
		switch(condimento){
		case "patatine":
			this.pizza = pizza;
			this.pizza.setPrice(this.pizza.getPrice()+1);
			this.pizza.setCondimento(condimento);
			break;
		
		case "ketchup":
			this.pizza = pizza;
			this.pizza.setPrice(this.pizza.getPrice()+0.20);
			this.pizza.setCondimento(condimento);
			break;
		
		case "maionese":
			this.pizza = pizza;
			this.pizza.setPrice(this.pizza.getPrice()+0.50);
			this.pizza.setCondimento(condimento);
			break;
		}
		
	}

	@Override
	public String toString() {
		return "PizzaPersonalizzata [pizza=" + pizza + "]";
	}
	
	
	
}
