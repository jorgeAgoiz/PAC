
public class Gasto extends Dinero{
	//CONSTRUCTOR
	public Gasto(double gasto, String description) {
		this.dinero = gasto;
		this.description = description;
	}

	@Override
	public String toString() {
		return "GASTO ==> dinero : " + dinero + ", description : " + description + " \n";
	}
	
}