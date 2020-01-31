package lab9;
/**
 * @author jeanniemccarthy
 */
import java.util.*;

public class Methods9 {
	
	public static Map<Integer, String> getMenuIndex(){
		//here lives the Map of index numbers (keys) and titles (values)
		Map<Integer, String> menuIndex = new TreeMap<>();
		menuIndex.put(4, "The Little Prince"); 
		menuIndex.put(5, "The Name of the Wind");
		menuIndex.put(9, "The Way of Kings");
		menuIndex.put(6, "The Secret History");
		menuIndex.put(8, "The Very Hungry Caterpillar");
		menuIndex.put(1, "The Canterbury Tales");
		menuIndex.put(2, "The Golden Compass");
		menuIndex.put(7, "The Twelfth Night");
		menuIndex.put(3, "The Handmaid's Tale");
		return menuIndex;
	}
	
	public static Map<String, Double> getMenu(){
		//here is the Map of titles(keys) and prices (values)
		Map<String, Double> menu = new TreeMap<>();
		menu.put("The Little Prince", 7.99); 
		menu.put("The Name of the Wind", 27.99);
		menu.put("The Way of Kings", 36.99);
		menu.put("The Secret History", 8.99);
		menu.put("The Very Hungry Caterpillar", 14.99);
		menu.put("The Canterbury Tales", 6.99);
		menu.put("The Golden Compass", 11.99);
		menu.put("The Twelfth Night", 4.99);
		menu.put("The Handmaid's Tale", 13.99);
		return menu;
	}
	
	public static void printMenu() {
		//grab the Maps
		Map<Integer, String> menuIndex = getMenuIndex();
		Map<String, Double> menu = getMenu();
		
		//header row of the menu display
		System.out.printf("%-2s| %-27s|  %-4.5s  |\n","#", "Book","Price");
		System.out.println("_________________________________________|");
		
		//loop to display items, using .get for the menu Map items. Added i so would not have to call menuIndex
		int i = 1;
		for (String book : menu.keySet()) {
			System.out.printf("%-2d| %-27s| $%-5.2f  |\n", i++, book, menu.get(book));
			System.out.println(".........................................|");
		}
	}
	
	public static boolean isOnMenu(int userChoice) {
		Map<Integer, String> menuIndex = getMenuIndex();
		return (menuIndex.containsKey(userChoice)) ? true : false;
	}
	
	public static double getAvg(ArrayList<Double> prices) {
		double avg;
		double sum =0;
		for(double price : prices) {
			sum += price;
		}
		avg = sum / prices.size();
		return avg;
	}
	
	public static int getHighIndex(ArrayList<Double> prices) {
		double maxPrice = prices.get(0);
		int highIndex = 0;
		for (int i = 0; i < prices.size(); i++) {
			if (prices.get(i) > maxPrice) {
				maxPrice = prices.get(i);
				highIndex = i;
			}
		}
		return highIndex;
	}
	
	public static int getLowIndex(ArrayList<Double> prices) {
		double minPrice = prices.get(0);
		int lowIndex = 0;
		for (int i = 0; i < prices.size(); i++) {
			if (prices.get(i) < minPrice) {
				minPrice = prices.get(i);
				lowIndex = i;
			}
		}
		return lowIndex;
	}
}

/*TRASH METHODS
 * 	public static void setCart(Integer userChoice) {
		Map<Integer, String> menuIndex = getMenuIndex();
		Map<String, Double> menu = getMenu();
		//add value of menuIndex (title) at key (userChoice) to titles ArrayList
		ArrayList<String> titles = new ArrayList<>();
		titles.add(menuIndex.get(userChoice));
		//add value of menu (price) at key (title) to price ArrayList
		ArrayList<Double> prices = new ArrayList<>();
		prices.add(menu.get(menuIndex.get(userChoice)));
	} 
	public static double getPrice(String userChoice) {
		Map<String, Double> menu = getMenu();
		double price = menu.get(userChoice);
		return price;
	}
 * CHALLENGE Add number system. Prompt user to request menu any time. 
 * Quantity? (Third Array List)
 * 
 */
