package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, -321);
		c.deposita(200);
		try{
		c.saca(201);
		}catch(SaldoInsuficienteException ex){
			System.out.println("Ex: "+ ex.getMessage());
		}
		System.out.println("Saldo em contaCorrente: "+c.getSaldo());

	}

}
