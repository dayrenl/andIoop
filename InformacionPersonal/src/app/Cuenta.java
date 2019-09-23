package app;

/**
 * Cuenta
 */
public class Cuenta {

    protected String titular;
    protected double cantidad;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.equals("NADIE"))
            return;
        this.titular = titular;
            
    }

   

    
}