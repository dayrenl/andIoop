package app;

/**
 * Persona
 */
public class Persona {

    protected String nombre;
    protected int edad;
    protected int dni;
    protected char sexo;
    protected double peso;
    protected double altura;
    public static final int menosUno = -1;
    public static final int cero = 0;
    public static final int uno = 1;

        public Persona() {    
        }

        public Persona(String nombre, int edad, char sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = 'M';
        }

        public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {

        }

        public  int CalcularImc() { 
            double imc = peso / (altura * altura);
            if (imc < 20) {
              return menosUno;  
            } else if (imc > 20 && imc < 25) {
                return cero;
            }
        return uno;
            }

        
        public boolean esMayor() {
           boolean mayor = false;
           if (edad >= 18) {
               return true;
           }
           return mayor;
        }

 
      
}