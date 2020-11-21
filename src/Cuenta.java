import java.util.*;

public class Cuenta {// CLASE CUENTA
	
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
		Ingreso ingreso = new Ingreso(cantidad, description);//Instanciamos un nuevo Ingreso
		this.ingresos.add(ingreso);//Lo añadimos a List ingresos
		this.saldo += cantidad;//Lo sumamos al saldo total de la cuenta
		
		return this.saldo;//Devolvemos el saldo actual
	};
	
	public double addGastos(String description, double cantidad) {
		
		try{//Intentamos este bloque de codigo
			
			if(this.saldo < cantidad) {//Si la cantidad a gastar es mayor que el saldo actual
				throw new GastoException();//Se disparara la exception
			};
			
			Gasto gasto = new Gasto(cantidad, description);//Si todo va bien instanciamos un nuevo Gasto
			this.gastos.add(gasto);//Lo añadimos a la List gastos
			this.saldo -= cantidad;//Lo restamos del saldo
			return this.saldo;//Devolvemos el saldo actual
			
		} catch (GastoException e){//Si salta la exception
			System.out.println(e);//La mostramos por consola
			return this.saldo;
		}	
	};
	
	//METODO TO STRING
	public String toString() {
		return this.usuario.toString() + "\nSaldo actual: " + this.saldo + "\n";
	};
	
	
}