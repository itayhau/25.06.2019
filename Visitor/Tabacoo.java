
public class Tabacoo implements Visitable {

	private double price;
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public Tabacoo(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tabacoo [price=" + price + "]";
	}

	
	//  calculateHolidayPriceTax
}
