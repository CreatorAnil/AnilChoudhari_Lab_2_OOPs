import java.util.ArrayList;

public class OrderingPasta {
	private double totalOrderCost;
	
	private final ArrayList<Pasta> pastas;

	public OrderingPasta( ArrayList<Pasta> pastas) {
		this.pastas = pastas;
	}
	
	public void calculateTotalOrderCost() {
		
		for(Pasta pasta: pastas) {
			switch(pasta.getFlavors()) {
			case Constant.Pasta_flavor_WhiteSauce:
				totalOrderCost += Constant.Pasta_flavor_WhiteSauce_cost;
				break;
			case Constant.Pasta_flavor_RedSauce:
				totalOrderCost += Constant.Pasta_flavor_RedSauce_cost;
			}
		}
		
	}

	public double getTotalOrderCost() {
		return totalOrderCost;
	}

	public void displayOrder() {
		for(Pasta pasta:pastas) {
			System.out.println("Order of pasta with flavors "+pasta.getFlavors()+" and type of "+pasta.getPastaTypes());
			System.out.println("");
		}
		System.out.print("total order cost "+getTotalOrderCost());
		System.out.println("");
	}
	
	
	
	
	
	
}
