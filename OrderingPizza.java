import java.util.ArrayList;

public class OrderingPizza {

	private double totalOrderCost;
	
	private final ArrayList<Pizza> pizzas;
	
	public OrderingPizza(ArrayList<Pizza> pizzas) {
		this.pizzas= pizzas;
	}
	
	
	public void calculateTotalOrderCost() {

		
		
	for (Pizza pizza: pizzas) {
		switch ( pizza.getFlavors()) {
		case Constant.Pizza_flavor_Vegan: 
			switch(pizza.getSizes()) {
			case (Constant.Pizza_Size_Large):
				totalOrderCost += Constant.Pizza_flavor_Vegan_Cost * 3;
				break;
			case Constant.Pizza_Size_Medium:
				totalOrderCost += Constant.Pizza_flavor_Vegan_Cost * 2;
				break;
			case Constant.Pizza_Size_Small:
				totalOrderCost += Constant.Pizza_flavor_Vegan_Cost * 1;
				break;
			}
		case Constant.Pizza_flavor_Vegetarian:
			switch(pizza.getSizes()) {
			case (Constant.Pizza_Size_Large):
				totalOrderCost += Constant.Pizza_flavor_Vegetarian_Cost  * 3;
				break;
			case Constant.Pizza_Size_Medium:
				totalOrderCost += Constant.Pizza_flavor_Vegetarian_Cost * 2;
				break;
			case Constant.Pizza_Size_Small:
				totalOrderCost += Constant.Pizza_flavor_Vegetarian_Cost * 1;
				break;
			}
		case Constant.Pizza_flavor_Nonveg:
			switch(pizza.getSizes()) {
			case (Constant.Pizza_Size_Large):
				totalOrderCost += Constant.Pizza_flavor_Nonveg_Cost * 3;
				break;
			case Constant.Pizza_Size_Medium:
				totalOrderCost += Constant.Pizza_flavor_Nonveg_Cost * 2;
				break;
			case Constant.Pizza_Size_Small:
				totalOrderCost += Constant.Pizza_flavor_Nonveg_Cost * 1;
				break;
			}
		}
		
		int totalToppings = pizza.getToppings().size();
		totalOrderCost += totalToppings * Constant.Topping_Cost;
		
	}
		
}


	public double getTotalOrderCost() {
		return totalOrderCost;
	}
	
	public void displayOrder() {
		for( Pizza pizza: pizzas) {
			System.out.println("Ordered a pizza size:  " + pizza.getSizes()+" flavors: "+ pizza.getFlavors()+" crust: "+ pizza.getCrusts()+" with topping "+pizza.getToppings());
			System.out.println("");
		}
		System.out.println("Total order cost "+ getTotalOrderCost());
		System.out.println("");
	}
	
	
	
}	
