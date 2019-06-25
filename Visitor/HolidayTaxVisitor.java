
public class HolidayTaxVisitor implements Visitor {

	@Override
	public double visit(Liquor liquorItem) {
		return liquorItem.getPrice() * 0.90;
	}

	@Override
	public double visit(Tabacoo tabacco) {
		return tabacco.getPrice() * 1.5;
	}

}
