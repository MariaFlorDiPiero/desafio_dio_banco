package desafio.dio.banco;

public class CartaoCredito extends Conta {
	
	public CartaoCredito (Cliente cliente) {
		super(cliente);
		
	}
	
	public void printFatura() {
		System.out.println("Fatura do Cartão de Crédito");
		super.imprimirFatura();
	}
		
}

