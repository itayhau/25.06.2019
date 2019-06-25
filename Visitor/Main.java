
public class Main {

	public static void main(String[] args) {

		Liquor vodkaGreyGoose = new Liquor(95);
		System.out.println(vodkaGreyGoose);
		System.out.println( vodkaGreyGoose.accept(new HolidayTaxVisitor()) );
		
		Tabacoo marlboro = new Tabacoo(25);

		System.out.println(marlboro);
		System.out.println( marlboro.accept(new HolidayTaxVisitor()) );
		
	}

}
