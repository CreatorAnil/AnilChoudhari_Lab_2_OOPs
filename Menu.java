import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Pizza> pizzas = new ArrayList<>();
		
		System.out.println("how many pizza you want");
		
		int totalPizzas = scanner.nextInt();
		
		for (int i=0; i< totalPizzas;++i) {
			
			Pizza pizza = new Pizza();
			
			ArrayList<String> toppings = new ArrayList<>();
			
			String pizzaSize;
			System.out.println("Enter the Size of pizzas Large,Medium, Small");
			pizzaSize = scanner.next();
			pizza.setSizes(pizzaSize);
			
			String pizzaCurst;
			System.out.println("Enter the type of curst  Thin or Thick");
			pizzaCurst = scanner.next();
			pizza.setCrusts(pizzaCurst);
			
			String pizzaFlavour;
			System.out.println("Enter the flavour Vegan, Vegetarian, Nonveg");
			pizzaFlavour = scanner.next();
			pizza.setFlavors(pizzaFlavour);
			
			int totalToppings;
			System.out.println("Enter how many number of topping you want ");
			totalToppings = scanner.nextInt();
			
			for (int j = 0;j<totalToppings;++j) {
				System.out.println("enter the topping:Cheese, Mushroom, Tomato, Jalapeno, Spinach ");
				String topping = scanner.next();
				toppings.add(topping);
			}
			
			pizza.setToppings(toppings);
			pizzas.add(pizza);
			
		}
		
		OrderingPizza order = new OrderingPizza(pizzas);
		order.calculateTotalOrderCost();
		order.printOrderSummary();
		
	}

}
