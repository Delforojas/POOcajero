import java.util.ArrayList;
import java.util.List;


public class Cuenta  {
        private double saldo;
        private Usuario usuario;
        private ArrayList<Gasto>gastos ;
        private ArrayList<Ingreso>ingresos ;
	
       public Cuenta (Usuario usuario) {
    	   this.setUsuario(usuario);
    	   this.setSaldo(0);
    	   gastos = new ArrayList<>();
   		   ingresos = new ArrayList<>();
    	   
    	   
    	   
       }
      
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public double addGastos(String description,double cantidad) throws GastoException{
		
		if (cantidad> saldo){
			throw new GastoException();
		}
		gastos.add (new Gasto (cantidad ,description));
		saldo-=cantidad;
		return saldo;
	}
		
    public double addIngresos(String description,double cantidad) {
    	ingresos.add(new Ingreso (cantidad, description));
    	saldo+=cantidad;
    	return saldo;
    }
		
		public List<Ingreso>  getIngresos() {
			return ingresos;
		}
		
	    
	    public List<Gasto> getGastos() {
	    return gastos;
        }
	
	
        
		
	
	@Override
	public String toString() {
		return 
		"Informacion de la cuenta." +
        "\n-El usuario "+ usuario.getNombre()+" tiene un Saldo de : " + getSaldo();
        
	}
		
}		
		
	