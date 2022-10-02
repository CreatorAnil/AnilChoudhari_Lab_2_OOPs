import java.util.ArrayList;

public class OrderingPizza {

	private double totalOrderCost;
	
	private final ArrayList<Pizza> pizzas;
	
	public OrderingPizza(ArrayList<Pizza> pizzas) {
		this.pizzas= pizzas;
	}
	
	
	public void calculateTotalOrderCost() {
		final double costPerTopping = 1;
		
		final String sizes;
		
		final int veganCost = 15;
		final int vegetarianCost=20;
		final int nonVeg= 25;
	
	for (Pizza pizza: pizzas) {
		switch ( pizza.getFlavors()) {
		case "Vegan": 
			switch(pizza.getSizes()) {
			case "Large":
				totalOrderCost = veganCost * 3;
				break;
			case "Medium":
				totalOrderCost = veganCost * 2;
				break;
			case "Small":
				totalOrderCost = veganCost * 1;
				break;
			}
		case "Vegetarian":
			switch(pizza.getSizes()) {
			case "Large":
				totalOrderCost = vegetarianCost * 3;
				break;
			case "Medium":
				totalOrderCost = vegetarianCost * 2;
				break;
			case "Small":
				totalOrderCost = vegetarianCost * 1;
				break;
			}
		case "Nonveg":
			switch(pizza.getSizes()) {
			case "Large":
				totalOrderCost = nonVeg * 3;
				break;
			case "Medium":
				totalOrderCost = nonVeg * 2;
				break;
			case "Small":
				totalOrderCost = nonVeg * 1;
				break;
			}
		}
		
		int totalToppings = pizza.getToppings().size();
		totalOrderCost += totalToppings * costPerTopping;
		
	}
		
}


	public double getTotalOrderCost() {
		return totalOrderCost;
	}
	
	public void printOrder() {
		for( Pizza pizza: pizzas) {
			System.out.println("Ordered a pizza size:  " + pizza.getSizes()+" flavors: "+ pizza.getFlavors()+" crust: "+ pizza.getCrusts()+" with topping "+pizza.getToppings());
			System.out.println("");
		}
		System.out.println("Total order cost "+ getTotalOrderCost());
		System.out.println("");
	}
	
	
	
}	
