import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option;
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.next();
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Introduce tu DNI: ");
		String dni = sc.next();
		
		
		Usuario jorge = new Usuario(nombre, edad, dni);
		//Cuenta miCuenta = new Cuenta(jorge);
		
		System.out.println(jorge.toString());
		
	}

}
