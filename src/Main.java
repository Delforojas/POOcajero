
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Declaración de variables.
		Scanner sc = new Scanner(System.in);
       
        Usuario usuario = nuevoUsuario(sc);
        Cuenta cuenta = new Cuenta(usuario);
        int opcion =-1;
        String descripcion;
        double cantidad ;
        
        
//Visualizacion del menu.
//Como el menu debe mostrarse despues de cada operacion lo incluimos en un bucle Do-While
           
        do {
            System.out.println ("(1) Introducir un nuevo gasto: ");
            System.out.println ("(2) Introducir un nuevo ingreso: ");
            System.out.println ("(3) Mostrar gastos: ");
            System.out.println ("(4) Mostrar ingresos: ");
            System.out.println ("(5) Mostrar saldo: ");
            System.out.println ("(0) Salir: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1: {
                    System.out.println("Por favor, introduce la descripción del gasto");
                    descripcion = sc.nextLine();
                    cantidad = verificarCantidad();
                    //Introducimos el gasto a la cuenta
                    //Añadimos el gasto a la cuenta 
                    try {
                        System.out.println("Saldo restante: " + cuenta.addGastos(descripcion, cantidad));
                        System.out.println();
                    } catch (GastoException error) {
                    	// Si no tenemos saldo nos saldrá el mensaje de error
                        System.out.println(error.getMessage());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Por favor, introduce la descripción del ingreso");
                    descripcion = sc.nextLine();
                    cantidad = verificarCantidad();
                    //Añadimos el ingreso a la cuenta 
                    System.out.println("Saldo restante: " + cuenta.addIngresos(descripcion, cantidad));
                    System.out.println();
                    break;
                }
                case 3: {
                	// comprobamos si hay gastos para mostrar
                    if (cuenta.getGastos().isEmpty()) {
                        System.out.println("No hay gastos para mostrar.\n");
                    } else {
                    	// hacemos uso de un for mejorado para recorrer la lista de gastos
                        for (Gasto gasto : cuenta.getGastos()) {
                            System.out.println(gasto.toString());
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                  // comprobamos los ingresos de la lista de ingresos
                    if (cuenta.getIngresos().isEmpty()) {
                        System.out.println("No hay ingresos para mostrar.\n");
                    } else {
                        for (Ingreso ingreso : cuenta.getIngresos()) {
                            System.out.println(ingreso.toString());
                        }
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                	//Mostramos el saldo.
                    System.out.println("El saldo actual de la cuenta es de " + cuenta.getSaldo());
                    break;
                }
                case 0: {
                	// mostramos el fin de programa
                    System.out.println("Fin del programa.nGracias por utilizar la aplicación de M03B en el curso 2s2223.");
                    sc.close();
                    break;
                }
            }
        } while (opcion != 0);
	    
		
        
}
//Creamos metodo para verificar las cantidades.
private static double verificarCantidad() {
	boolean verificar = false;
	double valor = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Introduce la cantidad");
		try {
			valor = sc.nextDouble();
			verificar = true;
		} catch (Exception e) {
			verificar = false;
			sc.nextLine();
			System.out.println("Las cantidades deben ir en formato europeo ####,##");
		}
	} while (!verificar);
	sc.nextLine();
	return valor;
}
//Creación del usuario
//Introducción de los datos del usuario , utilizando los getter en la clase usuario. 
private static Usuario nuevoUsuario (Scanner sc){

    Usuario usuario = new Usuario();

    System.out.print("Introduzca el nombre: ");
    String nombre = sc.nextLine();
    usuario.setNombre(nombre);

    System.out.print("Introduzca la edad: ");
    int edad = sc.nextInt();
    usuario.setEdad(edad);
//Solicitamos el DNI hasta que introduzca uno correcto 
    
    boolean esDNIValido =false ;
    String DNI = sc.nextLine();
    
    do {
    	System.out.print("Introduzca DNI: ");
        DNI = sc.nextLine();
        esDNIValido = usuario.setDNI(DNI);
        

        if (!esDNIValido) {
            System.out.println("DNI introducido incorrecto");
            System.out.println("Vuelva a introducir un DNI.");
        }
    } while (!esDNIValido);
    System.out.println("Usuario creado correctamente");
    System.out.println(usuario);
    return usuario;

            }

       }