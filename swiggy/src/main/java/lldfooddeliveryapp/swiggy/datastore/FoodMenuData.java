package lldfooddeliveryapp.swiggy.datastore;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import lldfooddeliveryapp.swiggy.model.FoodMenu;
import lldfooddeliveryapp.swiggy.model.MenuItem;

import lombok.Getter;

@Component
@Getter
public class FoodMenuData {
	private Map<String, FoodMenu> foodMenuById = new HashMap<>();
    private Map<String, String> foodMenuIdByRestaurantId = new HashMap<>();
    private Map<String, MenuItem> menuItemById = new HashMap<>();
}
