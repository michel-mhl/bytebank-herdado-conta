package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		// generics
		ArrayList<Conta> lista = new ArrayList<>();
		ArrayList<String> nomes = new ArrayList<String>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		System.out.println(lista.size());

		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);
		System.out.println(lista.size());

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("----------------");

		for (Conta contasRef : lista) {
			System.out.println(contasRef);

		}
		
		for (Conta agencias : lista){
//			String agencia = agencias.to;
			System.out.println(agencias.getAgencia());
		}
		
		ArrayList list = new ArrayList(26); //capacidade inicial
		list.add("RJ");
		list.add("SP");
		//outros estados
		ArrayList nova = new ArrayList(list); //criando baseado na primeira lista
		
		nova.add("Distrito Federal");
		list.add("MG");
		
		System.out.println(nova);
		System.out.println(list);
		
	}

}
