package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		// TitularDaContaComparator titularComparator = new
		// TitularDaContaComparator();
		// lista.sort(new TitularDaContaComparator()); melhorando o codigo acima
		lista.sort(null);// foi ultilizado o sort natural, implementado na
							// classe pai compareTo.

		// ---- metodos do java anterior ao java8 de comparação
		// Collections.sort(lista, new TitularDaContaComparator());
		// Collections.sort(lista); utilizando o segundo sort com ordem
		// natural,implementado na classe pai comparato
		// Collections.reverse(lista);inverte ordenação
		// Collections.shuffle(lista); embaralha ordenação
		// Collections.rotate(lista,2); rotaciona a ordem pegando do ultimo e
		// subindo para oprimeiro o primeiro sendo segundo e sucessivamente
		System.out.println("---------");

		for (Conta conta : lista) {
			System.out.println(conta + " , " + conta.getTitular().getNome());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		// metodologia de comparação usando a classe Integer, utilizando seu metodo de comparação compare
		return Integer.compare(c1.getNumero(), c2.getNumero());

		// metodologia de comparação subitraindo um valor de outro sendo iguais retorna zero
		// return c1.getNumero() - c2.getNumero();
		
		// metodologia de comparação usando If
		// if (c1.getNumero() < c2.getNumero()) {
		
		// return -1;
		// }
		//
		// if (c1.getNumero() > c2.getNumero()) {
		// return 1;
		// }
		//
		// return 0;
	}

}
