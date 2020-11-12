import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.next();
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Introduce tu DNI: ");
		String dni = sc.next();
		
		
		Usuario jorge = new Usuario(nombre, edad, dni);
		Cuenta miCuenta = new Cuenta(jorge);
		
		String desc;
		double cant;
		
		
		do {
			
			System.out.println("Realiza una nueva acción ");
			System.out.println("1 Introduce un nuevo gasto ");
			System.out.println("2 Introduce un nuevo ingreso ");
			System.out.println("3 Mostrar gastos ");
			System.out.println("4 Mostrar ingresos ");
			System.out.println("5 Mostrar saldo ");
			System.out.println("0 Salir ");
			option = sc.nextInt();
			
			
			switch( option ) {
			
				case 1:
					System.out.println("Detalles del gasto.");
					System.out.println("Cantidad: ");
					cant = sc.nextDouble();
					
					System.out.println("Concepto: ");
					desc = sc.next();
					
					miCuenta.addGastos(desc, cant);
					break;
					
				case 2:
					System.out.println("Detalles del ingreso.");
					System.out.println("Cantidad: ");
					cant = sc.nextDouble();
					
					System.out.println("Concepto: ");
					desc = sc.next();
					
					miCuenta.addIngresos(desc, cant);
					break;
					
				case 3:
					System.out.println("Gastos de la cuenta: ");
					System.out.println(miCuenta.getGastos());
					break;
					
				case 4:
					System.out.println("Ingresos de la cuenta: ");
					System.out.println(miCuenta.getIngresos());
					break;
					
				case 5:
					System.out.println("Saldo actual: ");
					System.out.println(miCuenta.toString());
					break;
				case 0:
					System.out.println("Fin del programa.");
					System.out.println("Gracias por usar la aplicación.");
					break;
				default:
					System.out.println("Opcion desconocida.");
					
				}
				
			
		} while(option != 0);
		
	}

}
