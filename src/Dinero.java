
public abstract class Dinero {
	//Variables
	protected double dinero;
	protected String description;
	
	//Consutructores
	public Dinero(double dinero, String description) {
		this.dinero = dinero;
		this.description = description;
	};
	
	//Gets y Sets
	public double getDinero() {
		return this.dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public String getDescripcion() {
		return this.description;
	}
	public void setDescripcion(String descripcion) {
		this.description = descripcion;
	}
}
