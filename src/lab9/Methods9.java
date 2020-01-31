package lab9;
/**
 * @author jeanniemccarthy
 */
import java.util.*;

public class Methods9 {
	
	public static Map<String, Double> getMenu(){
		Map<String, Double> menu = new TreeMap<>();
		menu.put("a", 7.99); //The Little Prince
		menu.put("b", 27.99);//The Name of the Wind
		menu.put("c", 36.99);//The Way of Kings
		menu.put("d", 8.99);//The Secret History
		menu.put("e", 14.99);//The Very Hungry Caterpillar
		menu.put("f", 6.99);//The Canterbury Tales
		menu.put("g", 11.99);//The Golden Compass
		menu.put("h", 4.99);//The Twelfth Night
		menu.put("i", 13.99);//The Handmaid's Tale
		return menu;
	}
	
	public static void printMenu() {
		Map<String, Double> menu = getMenu();
		System.out.printf("%-27s|  %-4.5s  |\n","Book","Price");
		System.out.println("_____________________________________|");
		for (String book : menu.keySet()) {
			System.out.printf("%-27s| $%-5.2f  |\n", book, menu.get(book));
			System.out.println(".....................................|");
		}
	}
	
	public static double getPrice(String userChoice) {
		Map<String, Double> menu = getMenu();
		double price = menu.get(userChoice);
		return price;
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
	
	public static boolean isOnMenu(String userChoice) {
		Map<String, Double> menu = getMenu();
		return (menu.containsKey(userChoice)) ? true : false;
	}
}
/* Use Validator
 * CHALLENGE Add number system. Prompt user to request menu any time. 
 * Quantity? (Third Array List)
 * 
 */
