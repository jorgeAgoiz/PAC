import java.util.*;


public class Cuenta {
	
	//VARIABLES
	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
	
	//CONSTRUCTOR
	public Cuenta(Usuario usuario){
		this.usuario = usuario;
		this.saldo = 0;
		this.gastos = new ArrayList<Gasto>();
		this.ingresos = new ArrayList<Ingreso>();
	};
	
	//GETTERS Y SETTERS
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
	}
	
	public List<Ingreso> getIngresos(){
		return this.ingresos;
	};
	
	public List<Gasto> getGastos() {
		return this.gastos;
	};

	//METODOS ESPECIALES
	public double addIngresos(String description, double cantidad) {
		Ingreso ingreso = new Ingreso(cantidad, description);
		this.ingresos.add(ingreso);
		this.saldo += cantidad;
		
		return this.saldo;
	};
	
	public double addGastos(String description, double cantidad) {
		
		try{
			
			if(this.saldo < cantidad) {
				throw new GastoException();
			};
			
			Gasto gasto = new Gasto(cantidad, description);
			this.gastos.add(gasto);
			this.saldo -= cantidad;
			return this.saldo;
			
		} catch (GastoException e){
			System.out.println(e);
			return this.saldo;
		}
		
	};
	
	//METODO TO STRING
	public String toString() {
		return this.usuario.toString() + "\n" + this.saldo;
	};
	
	
}