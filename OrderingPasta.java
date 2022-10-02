import java.util.ArrayList;

public class OrderingPasta {
	private double totalOrderCost;
	
	private final ArrayList<Pasta> pastas;

	public OrderingPasta( ArrayList<Pasta> pastas) {
		this.pastas = pastas;
	}
	
	public void calculateTotalOrderCost() {
		
		final int whiteSauce = 10;
		final int redSauce   = 20;
		
		for(Pasta pasta: pastas) {
			switch(pasta.getFlavors()) {
			case "WhiteSauce":
				totalOrderCost = whiteSauce;
				break;
			case "RedSauce":
				totalOrderCost = redSauce;
			}
		}
		
	}

	public double getTotalOrderCost() {
		return totalOrderCost;
	}

	public void printOrder() {
		for(Pasta pasta:pastas) {
			System.out.println("Order of pasta with flavors "+pasta.getFlavors()+" and type of"+pasta.getPastaTypes());
			System.out.println("");
		}
		System.out.print("total order cost "+getTotalOrderCost());
		System.out.println("");
	}
	
	
	
	
	
	
}
