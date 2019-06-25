import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Order {

	private static final int ArrayList = 0;

	List<Map.Entry<String, Integer>> ordersFlyWeight = new ArrayList<Map.Entry<String, Integer>>();  
	
	public List<Map.Entry<String, Integer>> getOrdersFlyWeight() {
		return ordersFlyWeight;
	}

	public void addItem(String nameFlyWeight, int howMany)
	{
		ordersFlyWeight.add(new AbstractMap.SimpleEntry<String, Integer>(nameFlyWeight, howMany));
	}

	// this is not fly weight
	// List<ItemFromMenu> items = new ArrayList<ItemFromMenu>();
//	public void addItem(ItemFromMenu item, int howMany)
//	{
//		
//	}
	
	
}
