package banco;
public class Banco {
  public static void main(String args[]) {
    // Declarando as variáveis e os tipos
    Conta c1;
    ContaDebEspecial c2, c3;

    // Instanciando Conta Normal
    c1 = new ContaNormal();

    // Definindo
    c1.setNumero(new String("1654-3"));
    c1.setSaldo(500);

    // Instanciando Conta Deb Especial
    c2 = new ContaDebEspecial();
    c3 = new ContaDebEspecial(new String("4067-6"), 2500, 5050);

    // Definindo
    c2.setNumero(new String("4067-6"));
    c2.setSaldo(2500);
    c2.setLimite(1000.67);

    // Imprimindo na tela
    System.out.println("A conta número " + c1.getNumero() + " possui saldo " + c1.getSaldo());

    // Creditando
    c1.creditar(1000);

    // Imprimindo na tela
    System.out.println("Após o crédito de R$ 1000,00, a conta número " + c1.getNumero() + " passou a ter saldo" + c1.getSaldo());

    // Debitando
    c1.debitar(100);

    // Imprimindo na tela
    System.out.println("Após o débito de R$ 100,00 a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());

    System.out.println("");

    System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo());

    // Debitando
    c2.debitar(500);

    // Imprimindo na tela
    System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " Após débito de R$ 500,00");

    System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " e Limite de " + c2.getLimite());

    // Definindo
    c2.setLimite(10000);

    // Imprimindo na tela
    System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " e novo Limite de " + c2.getLimite());
  }
}
