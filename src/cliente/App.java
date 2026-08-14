package cliente;

import banco.Cuenta;

public class App {
    public static void main(String[] args)  {
        Cuenta c = new Cuenta("Juan", 1000, "Ahorro", "AH-001");
    
         System.out.println(c.numeroCuenta);
         System.out.println(c.getTitular());
         System.out.println(c.getSaldo());
         
         c.depositar(10000000);
         c.mostrarInformacion();

         CuentaVIP VIP = new CuentaVIP("Pedro", 5000, 2000);
         VIP.mostrarinfoVIP();

         System.out.println("----");
         Banco banco = new Banco();
         banco.agregarCuenta(c);
        }
     
}
