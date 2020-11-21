
public class Usuario {//CLASE USUARIO
	
	//VARIABLES
	private String nombre;
	private int edad;
	private String DNI;
	
	//CONSTRUCTORES
	public Usuario() {
		
	};
	
	public Usuario(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dni;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return this.nombre;
	};
	public void setNombre(String nombre) {
		this.nombre = nombre;
	};
	
	public int getEdad() {
		return this.edad;
	};
	public void setEdad(int edad) {
		this.edad = edad;
	};
	
	public String getDNI() {
		return this.DNI;
	};
	
	//METODO SET ESPECIAL
	public boolean setDNI(String DNI) {
		
		if( DNI.matches("^[0-9]{8}[a-zA-Z]$") || DNI.matches("^[0-9]{8}[-][a-zA-Z]$" )){//Indicamos los caracteres validos
            this.DNI = DNI;//Si son validos seteamos el DNI
            return true;
        } else {
            return false;
        }   
	};
	
	//METODO TO STRING
	public String toString() {
		return "Usuario: [ nombre = " + nombre + ", edad = " + edad + ", DNI = " + DNI + "]";
	};
	
	
	
	
}
