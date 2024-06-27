
public class Ingreso extends Dinero {

    public Ingreso(double ingreso, String description) {
    	
    	setDinero(ingreso);
        setDescription(description);
    }

    
    public String toString() {
        return "Ingreso  concepto: " + getDescription() + ", cantidad: " +getDinero();
    }
}