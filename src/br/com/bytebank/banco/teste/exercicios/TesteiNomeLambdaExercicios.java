package br.com.bytebank.banco.teste.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteiNomeLambdaExercicios {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

//		Collections.sort(nomes, new Comparator<String>() {
//
//		    @Override
//		    public int compare(String s1, String s2) {
//		        return s1.length() - s2.length();
//		    }
//		});
		//codigo melhorado com lambda abaixo 
		Collections.sort(nomes,( s1, s2)->  s1.length() - s2.length());
		

		System.out.println(nomes);
		
//		for(int i = 0; i < nomes.size(); i++) {
//		    System.out.println(nomes.get(i));
//		}
		//simplificando o for acima com o lambda 
		Collections.rotate(nomes,2);
		nomes.forEach((nome)-> System.out.println(nome));
	
	}
}
