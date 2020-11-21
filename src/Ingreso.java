
public class Ingreso extends Dinero {
	//CONSTRUCTOR
	public Ingreso(double ingreso, String description) {
		this.dinero = ingreso;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "INGRESO ==> dinero : " + dinero + ", description : " + description + " \n";
	};	
	
}
