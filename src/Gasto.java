

public class Gasto extends Dinero {
	 
	 public Gasto(double gasto, String description){
		    super.dinero = gasto;
			super.description = description;
	 }
	 
	 
	 
	 public String toString(){
	     return "Gasto: "+ getDescription()+  ", cantidad:" + getDinero() ;
	 }
	 
	}


