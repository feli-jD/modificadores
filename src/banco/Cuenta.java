 package banco;
 public class Cuenta {

    private String Titular;
    double Saldo;
    protected String tipo;
    public String numeroCuenta;

    public Cuenta(String Titular, double Saldo, String tipo, String numeroCuenta) {
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
    }
    public String getTitular() {
        return Titular;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void depositar (double monto) {
        if (monto > 0) {
        Saldo += monto;
        System.out.println("depósito de " + monto + "realizadp.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de cuenta: " + numeroCuenta);
    }
 }