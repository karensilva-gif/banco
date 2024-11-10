package banco;
abstract public class Conta {
  // Atributos
  protected String numero;
  protected double saldo;

  // Métodos
  protected String getNumero() {
    return numero;
  }

  protected void setNumero(String value) {
    numero = value;
  }

  protected double getSaldo() {
    return saldo;
  }

  protected void setSaldo(double value) {
    saldo = value;
  }

  // Métodos abstratos
  abstract void creditar(double valor);
  abstract void debitar(double valor);
}

// Essa classe é uma classe abstrata em Java, projetada para representar uma conta bancária genérica.

// Abstract: indica que a classe Conta é abstrata, ou seja, ela não pode ser instanciamente diretamente. Serve como base para outras classes que herdarão dela.

// Métodos abstratos creditar e debitar, ou seja, eles são definidos sem implementação. Isso significa que qualquer classe que herde de Conta precisará implementar esses métodos.

// Funcionalidades - Creditar deverá adicionar um valor ao saldo e debitar deverá subtrair um valor, mas os detalhes de como isso acontece serão definidos nas subclasses
