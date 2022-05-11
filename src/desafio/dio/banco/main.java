package desafio.dio.banco;

public class main {
		

	public static void main(final String[] args) {
		ContaCorrente cc = new ContaCorrente(null);
		Conta poupanca = new ContaPoupanca(null);
		Conta CartaoCredito = new CartaoCredito(null);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		CartaoCredito.imprimirFatura();
		
	}

}
