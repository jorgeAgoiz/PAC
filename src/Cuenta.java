import java.util.*;


public class Cuenta {
	
	//Variables
	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
	
	//Constructor
	public Cuenta(Usuario usuario){
		this.usuario = usuario;
		this.saldo = 0;
		this.gastos = new ArrayList<Gasto>();
		this.ingresos = new ArrayList<Ingreso>();
	};
	
	//Getters y Setters
	public double getSaldo() {
		return this.saldo;
	};
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	};
	
	public Usuario getUsuario() {
		return this.usuario;
	};
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	};
	
	/*public double addIngresos(String description, double cantidad) {
		
	};
	
	public double addGastos(String description, double cantidad) {
		
	};
	
	public List<Ingreso> getIngresos(){
		
	};
	
	public List<Gasto> getGastos(){
		
	};
	
	public String toString() {
		
	};*/
	
	
}