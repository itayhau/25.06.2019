
public class Main {

	public static void main(String[] args) {

		RealATM atm = new RealATM();
		System.out.println(atm.getTotalCash());
		System.out.println(atm.withdraw(1000));
		atm.insertCard();
		
		ProxyATM proxy = new ProxyATM();
		System.out.println(proxy.getTotalCash());
		System.out.println(proxy.isWorking());
	}

}
