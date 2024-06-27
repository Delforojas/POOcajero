
public class Usuario {
    private String nombre;
    private int edad;
    private String DNI;

 

public Usuario() {
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getDNI() {
	return DNI;
}
public boolean setDNI(String DNI) {
	String regex ="^[0-9]{8}-?[a-z]{1}$";
    boolean esDnivalido = false;
	
	if(DNI.matches(regex)){
		this.DNI = DNI;
		esDnivalido = true;
	}
	return esDnivalido;
}




@Override
public String toString() {
    return  
            "Nuevo usuario :\n" 
    		+"Nombre : "+nombre+ " edad : " + edad + " DNI : " + DNI ; 
             
            
}
}