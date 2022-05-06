package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22,33);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22,34);
		referencias[1] = cc2;
		
		
	//	int[] refs = {cc1.getNumero(),cc2.getNumero(),cc2.getNumero(),4,5}; outra forma de declarar as referencias de array
//		System.out.println(referencias[1].getNumero());
		
		ContaPoupanca rf =(ContaPoupanca)referencias[1]; //type cast- quando vc tem certeza que essa conta é uma (contaPoupanca), caso contrario o copilador dara um erro de (ClassCastExpretion)na console
		
		System.out.println(cc2.getNumero());
		System.out.println(rf.getNumero());
	}

}
