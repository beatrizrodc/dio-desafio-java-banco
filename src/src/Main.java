public class Main {
    public static void main(String[] args) {

        Cliente beatriz = new Cliente();
        beatriz.setNome("Beatriz");

        Conta cc = new ContaCorrente(beatriz);
        cc.depositar(300.00);
        cc.sacar(35.00);

        Conta poupanca = new ContaPoupança(beatriz);
        poupanca.depositar(250.00);
        poupanca.transferir(80.00, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
