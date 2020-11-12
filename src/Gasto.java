

public class Gasto extends Dinero{
	
	public Gasto(double gasto, String description) {
		super(gasto, description);
	}

	
	public String toString() {
		return "Gasto [ dinero = " + dinero + ", description = " + description + " ]";
	}
	
}