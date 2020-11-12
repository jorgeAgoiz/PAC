
public class Ingreso extends Dinero {
	
	public Ingreso(double ingreso, String description) {
		super(ingreso, description);
	}
	
	
	public String toString() {
		return "Ingreso [ dinero = " + dinero + ", description = " + description + " ]";
	};	
	
}
