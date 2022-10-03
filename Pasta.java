
public class Pasta {

	private String flavors;
	private String pastaTypes;
	
	public String getFlavors() {
		return flavors;
	}
	public void setFlavors(String flavors) {
		this.flavors = flavors;
	}
	public String getPastaTypes() {
		return pastaTypes;
	}
	public void setPastaTypes(String pastaTypes) {
		this.pastaTypes = pastaTypes;
	}
	@Override
	public String toString() {
		return "Pasta [flavors=" + flavors + ", pastaTypes=" + pastaTypes + "]";
	}
	
	
	
	
	
}