package cliente;

import banco.Cuenta;
public class CuentaVIP extends Cuenta {
  private double limiteCredito;

    public CuentaVIP(String titular, double limite, double saldo ) {
        super(titular, saldo, "VIP", "VIP-001");
        this.limiteCredito = limite;
      }
     public void mostrarinfoVIP() {
    System.out.println( "tipo"+tipo);
    System.out.println("numero de cuenta"+numeroCuenta);
    System.out.println("Titular: " + getTitular());
    System.out.println("limite de credito: " + limiteCredito);
    }


}
