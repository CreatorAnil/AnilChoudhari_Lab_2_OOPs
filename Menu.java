import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			choice = menu(scanner);
			System.out.println();
			
			if (choice == 1) {

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
				
			else if(choice == 2) {
				ArrayList<Pasta> pastas = new ArrayList<>();
				System.out.println("how many pasta you want");
				
				int totalPasta = scanner.nextInt();
				
				for(int i=0 ; i<totalPasta;++i) {
					 Pasta pasta = new Pasta();
					 
					 String 
				}
				
			}
				
			else {
				System.out.print("Thank you for using our servies. please do visit us ");
			}
			
		}while(choice != 3);
		
	}
		
		public static int menu(Scanner scanner) {
			System.out.println("Welcome to Anil's franchise store");
			System.out.println("1. Order Pizza");
			System.out.println("2. Order Pasta");
			System.out.println("3. Already eat too much");
			
			int choice;
			
			do {
				System.out.print("Enter choice: ");
				choice = scanner.nextInt();
			}while(choice < 1 || choice > 3);
			return choice;
			
		}



}
