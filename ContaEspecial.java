package banco;
abstract public class ContaEspecial extends Conta {
  // atributos
  protected double limite;

  // metodos
  protected void setLimite(double value) {
    limite = value;
  }

  protected double getLimite() {
    return limite;
  }

  public void creditar(double valor) {
    saldo = saldo + valor;
  }
}
