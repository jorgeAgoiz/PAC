
public class Usuario {
	//Variables
	private String nombre;
	private int edad;
	private String DNI;
	
	//Constructors
	public Usuario(String nombre, int edad, String DNI) {
		this.nombre = nombre;
		this.edad = edad;
		
		if(setDNI(DNI)) {//Si el dni es correcto lo asignamos
			this.DNI = DNI;
		}else {//Si no es correcto lanzamos error
			throw new Error("DNI no valido");
		}
		
	}
	
	//Getters y Setters
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
	public boolean setDNI(String DNI) {
		
		//Convertimos la letra a mayusculas
		DNI = DNI.toUpperCase();
		
		//Pasamos el String a un array de caracteres
		char[] letras = new char[DNI.length()-1];
		letras = DNI.toCharArray();
		
		//Variables boolean
		boolean checkNums = true;
		boolean checkLetter = true;
		
		//Recorremos caracter a caracter y comprobamos los numeros 
		//del DNI
		for (int x = 0; x < letras.length-1; x++) {
			
			if (letras[x] > 58 || letras[x] < 47) {
				checkNums = false;
			}
		}
		
		//Aqui comprobamos si el ultimo caracter es una Letra
		if ( letras[letras.length-1] < 65 || letras[letras.length-1] > 90 ) {
			
				checkLetter = false;
			};
			
		//Si los dos son true, devolvemos true
		return checkNums && checkLetter;
	};
	
	//Metodo toString
	public String toString() {
		return "Usuario [ nombre = " + nombre + ", edad = " + edad + ", DNI = " + DNI + "]";
	};
	
	
	
	
}
