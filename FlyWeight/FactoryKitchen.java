import java.util.ArrayList;
import java.util.List;

public class FactoryKitchen {

	public List<ItemFromMenu> prepare(String itemName, int amount)
	{
		List<ItemFromMenu> result = new ArrayList<ItemFromMenu>();
		for(int i = 0; i < amount; i++)
		{
			switch (itemName)
			{
				case "Coffee": result.add(new ItemFromMenu("Coffee"));
					break;
				case "Breakfast": result.add(new ItemFromMenu("Breakfast"));
					break;
				case "Steak": result.add(new ItemFromMenu("Steak"));
					break;										
				case "Icecream": result.add(new ItemFromMenu("Icecream"));
					break;
			}
		}
		return result;
	}
	
}
