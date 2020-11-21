import java.util.*;

public class Main {
	//INSTANCIAMOS SCANNER
	static Scanner sc = new Scanner(System.in);
		
	//VARIABLES STATIC
	static String nombre = "";
	static int edad = 0;
	static String dni = "";
	static Usuario jorge = new Usuario();
	static boolean checkDni = false;
	
	//AQUI IMPLEMENTAMOS EL METODO PARA PEDIR LOS DATOS DEL USUARIO
	private static void pedimosDatos() {
		
		do {
			System.out.println("Introduce tu nombre: ");
			nombre = sc.nextLine();
		}while(nombre.isEmpty());
		jorge.setNombre(nombre);
		
		do {	
			System.out.println("Introduce tu edad: ");
			edad = sc.nextInt();
		}while(edad == 0);
		jorge.setEdad(edad);
			
		do {
			System.out.println("Introduce tu DNI: ");
			dni = sc.next();
			if(jorge.setDNI(dni)) {//Si setDNI devuelve true seteamos el dni
				jorge.setDNI(dni);
				System.out.println(dni);
			}else {
				
				System.out.println("El DNI ingresado no es valido");
			}
		}while(!jorge.setDNI(dni) || dni.isEmpty());
	
	};
	
	//FUNCION PARA MOSTRAR LAS OPCIONES Y RETORNAR LA SELECCIONADA
	private static int mostrarOpciones() {
		int option = 0;
		
		System.out.println("Realiza una accion ");
		System.out.println("1 Introduce un nuevo gasto ");
		System.out.println("2 Introduce un nuevo ingreso ");
		System.out.println("3 Mostrar gastos ");
		System.out.println("4 Mostrar ingresos ");
		System.out.println("5 Mostrar saldo ");
		System.out.println("0 Salir ");
		option = sc.nextInt();
		
		return option;
	};
	
	//METODO MAIN
	public static void main(String[] args) {
		//DEFINIMOS VARIABLES
		String desc = "";
		double cant = 0;
		int option = 0;
		//LLAMAMOS A LA FUNCION QUE PIDE LOS DATOS
		pedimosDatos();
		//INSTANCIAMOS LA CUENTA
		Cuenta miCuenta = new Cuenta(jorge);
		//MIENTRAS NO SE SELECCIONE SALIR SE EJECUTARA ESTE BLOQUE
		do {
			//LLAMAMOS AL METODO PARA MOSTRAR LAS OPCIONES
			option = mostrarOpciones();
			switch( option ) {//SWITCH PARA LAS OPCIONES DISPONIBLES
			
				case 1:
					System.out.println("Detalles del gasto.");
					System.out.println("Concepto: ");
					
					do {//MIENTRAS NO SE INTRODUZCA CONCEPTO
						desc = sc.nextLine();
					}while(desc.isEmpty());
					
					System.out.println("Cantidad: ");
					cant = sc.nextDouble();
						
					miCuenta.addGastos(desc, cant);//AÑADIMOS EL GASTO
					break;
					
				case 2:
					System.out.println("Detalles del ingreso.");
					System.out.println("Concepto: ");
					
					do {//MIENTRAS NO SE INTRODUZCA CONCEPTO
						desc = sc.nextLine();
					}while(desc.isEmpty());
					
					System.out.println("Cantidad: ");
					cant = sc.nextDouble();		
						
					miCuenta.addIngresos(desc, cant);//AÑADIMOS EL INGRESO
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
					System.out.println(miCuenta.toString());
					break;
					
				case 0:
					System.out.println("Fin del programa.");
					System.out.println("Gracias por usar la aplicacion.");
					break;
					
				default:
					System.out.println("Opcion desconocida.");
					break;
				}
					
		} while(option != 0);//MIENTRAS LA OPCION SELECCIONADA NO SEA 0 SEGUIMOS MOSTRANDO EL MENU DE OPCIONES
		
		sc.close();//CERRAMOS SCANNER
	}

}
