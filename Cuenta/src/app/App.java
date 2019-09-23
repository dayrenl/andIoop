package app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cuenta");
        
        List<Cuenta> cuentas = new ArrayList<Cuenta>();

        Cuenta cta = new Cuenta("Mariana", 3000.00);
            cta.retirar(1300);
            cuentas.add(cta);
            System.out.println("Cuenta " + cta);

        Cuenta cta1 = new Cuenta("Daniela", 2500.50);
            cuentas.add(cta1);
            System.out.println("Cuenta " + cta1);

        Cuenta cta2 = new Cuenta("Day", 999999.74);
            cta2.ingresar(5);
            cuentas.add(cta2);
            System.out.println("Cuenta " + cta);

    }
}