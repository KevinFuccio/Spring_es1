package products;

public class Beverage extends Products{
	private String nutritional_info;
	private Size_Enum size;
	public Beverage(String name, double price) {
		switch(name) {
		case "Coca-Cola":
			super.setName(name);
			super.setPrice(price);
			this.nutritional_info ="157Kcal";
			this.size = Size_Enum.Normal;
			break;
		case "Acqua":
			super.setName(name);
			super.setPrice(price);
			this.nutritional_info ="13Kcal";
			this.size = Size_Enum.Normal;
			break;
		case "Sprite":
			super.setName(name);
			super.setPrice(price);
			this.nutritional_info ="98Kcal";
			this.size = Size_Enum.Normal;
			break;
		}
		
	}
	@Override
	public String toString() {
		return "Beverage [Name= " + getName() + ", Price= " + getPrice() + ", Nutritional_Info= "+ this.nutritional_info +", Size= "+this.size+"]";
	}
}
