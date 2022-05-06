package br.com.bytebank.banco.modelo;

/**
 * Classe representa
 * 
 * @author Michel Gonçalves
 *
 */
public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public abstract void deposita(double valor);

	public static int getTotal() {
		return total;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Agencia inválida");
		}

		if (numero < 1) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criandouma conta "+ this.numero);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode ter valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode ter valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.agencia == outra.agencia && this.numero == outra.numero)
			return true;

		return false;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero:" + this.numero + " Agencia:" + this.agencia + " Saldo:" + this.saldo;
	}
}