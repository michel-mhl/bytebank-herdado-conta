package br.com.bytebank.banco.teste;

import javax.swing.JOptionPane;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.teste.TesteConta

//teste.TesteConta FQN =Full qualified name = nome do pacote .nome simples da classe
public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
	
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		ContaCorrente cc2 = new ContaCorrente(1234, 321);
		cc2.deposita(100);
		
		

		cc.transfere(10.0, cp);
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
		// cc.saca(10);
		// System.out.println(cc.getSaldo());
		cp.transfere(100, cc);
		System.out.println("cp" + cp.getSaldo());
		
		System.out.println("testes novo: "+cc2.getSaldo());
		
		Double valor;
		valor = cc2.getSaldo()+ cc.getSaldo();
System.out.println("O saldo das duas contas corrente é :"+ valor);

	}

}
