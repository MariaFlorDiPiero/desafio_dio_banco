package desafio.dio.banco;

public class Conta implements Iconta{
	
	private static int SEQUENCIAL = 1;
	
	protected static final int AGENCIA_PADRAO = 0;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected int limite;
	protected int vencimento;
	protected int fatura;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void depositar () {
		
	}
	
	public void transferir () {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
	
	public void printFatura() {
		
	}
	
	public void imprimirFatura() {
		
		System.out.println(String.format("Fatura Fechada: %d", this.fatura));
		System.out.println(String.format("Vencimento: %d", this.vencimento));
		System.out.println(String.format("Limite: %d", this.limite));
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agência: %d", this.agencia ));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	



}
