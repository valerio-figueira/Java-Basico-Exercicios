package com.valerio.cursojava.aula43.labsExer01;

public class Test {

	static void printDescription(String description) {
		System.out.println(description);
	}

	public static void main(String[] args) {		
		Controller c = new Controller();

		// Audi, fili mi, verba sapientium et aenigmata eorum.
		
		ContaEspecial ce = new ContaEspecial();
		ce.setNome(c.setName());
		ce.setConta(c.setAccount());
		ce.setSaldo(120);
		ce.setLimite(10);

		ce.sacarDinheiro(50);
		ce.sacarDinheiro(80);
		ce.depositarDinheiro(0);

		System.out.println(ce); // n�o � preciso chamar o toString

		ContaPoupan�a cp = new ContaPoupan�a();
		cp.setNome("Percival");
		cp.setConta(3806);
		cp.setSaldo(1350);
		cp.atualizarSaldo(0.2); // 0.2%

		printDescription(cp.toString());

		ContaBancaria cb = new ContaBancaria();
		cb.setNome("Dulcin�ia");
		cb.setConta(3807);
		cb.setSaldo(130);

		cb.sacarDinheiro(131);

		printDescription(cb.toString());
	}
}
