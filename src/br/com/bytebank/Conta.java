package br.com.bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) { 
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saca(valor)) {
			contaDestino.deposita(valor);
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}
