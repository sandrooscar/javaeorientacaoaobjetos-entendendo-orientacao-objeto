package br.com.bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaSandro = new Conta();
		contaSandro.titular = new Cliente();
		contaSandro.titular.nome = "Sandro Oscar Bugmann";
		contaSandro.deposita(5000);
		System.out.println("Saldo é: " + contaSandro.saldo);
		
		contaSandro.saca(300);
		System.out.println("Saldo é: " + contaSandro.saldo);

		Conta contaCassio = new Conta();
		contaCassio.titular = new Cliente();
		contaCassio.titular.nome = "Cassio Splitter";
		
		if (contaSandro.transfere(2500, contaCassio)) {
			System.out.println("Transferência executada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
	}

}
