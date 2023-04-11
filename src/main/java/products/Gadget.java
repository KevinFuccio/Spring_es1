package products;

public class Gadget extends Products {

	public Gadget() {
		super();
	}

	public Gadget(String name, double price) {
		super(name, price);
	}

	@Override
	public String toString() {
		return "Gadget [Name=" + getName() + ",Price=" + getPrice() + "]";
	}
	
}
