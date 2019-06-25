import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CoffeeShop {

	public List<List<ItemFromMenu>> prepareOrder(Order order)
	{
		List<List<ItemFromMenu>> result = new ArrayList<List<ItemFromMenu>>();
		
		FactoryKitchen kitchen = new FactoryKitchen();
		
		for(Map.Entry<String, Integer> item : order.getOrdersFlyWeight())
		{
			kitchen.prepare(item.getKey(), item.getValue());
		}
		
		return result;
	}
	
}
