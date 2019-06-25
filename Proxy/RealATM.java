
public class RealATM implements IAtm , IMonitorService {

	private int totalMoney = 1_000_000;
	
	@Override
	public void desposit(int amount) {
		System.out.println("Getting " + amount);
		
	}

	@Override
	public boolean withdraw(int amount) {
		System.out.println("withdraw " + amount);
		return amount < 1_000_000;	
	}

	@Override
	public void insertCard() {
		System.out.println("Inserting card");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("ejecting card");
		
	}

	@Override
	public int getTotalCash() {
		return totalMoney;
	}

	@Override
	public boolean isWorking() {
		return totalMoney > 0;
	}

	
	
	
}
