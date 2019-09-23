package app;



public class Cuenta {

    protected String titular;
    protected double cantidad;
    public final String ARS = "ARS";

    
    //constructores

    public Cuenta(String titular) {
 
    }

    public Cuenta(String titular, double cantidad) {

    }

    //métodos

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else if (cantidad < 0) {
            this.cantidad = 0;
        }
    }

    public void retirar(double cantidadARetirar) {
        if (cantidadARetirar < this.cantidad && cantidadARetirar < 1500) {
            this.cantidad = this.cantidad - cantidadARetirar; 
            } else if (cantidadARetirar > this.cantidad) {
               System.out.println("sos pobre, boludo");
        }
    }

	@Override
	public String toString() {
		return "ARS="+ cantidad;
	}

    


}