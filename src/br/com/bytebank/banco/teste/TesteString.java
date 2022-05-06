package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

//		String nome = "Alura";// objeto literal
//
//		String outro = nome.replace("Al", "aL");
//		String outroChar = nome.replace('A', 'a');// quando so a uma letra usa-se aspas simples ''
//		char c = nome.charAt(2);// buscando o char na posição 2 
//		int pos = nome.indexOf("ur"); //buscando o valor da posicao dos caracteres ur
//		String sub = nome.substring(1); // buscando somente o substring apos a posicao no caso 1 , retornando lura
//	    String vazio =" "; // valida se String é vazio 
//	    String vazioOutro = vazio.trim();// traz o retorno sem espaços 
//	    String nomeN = "Michel";
//	    
////	    String nome1 = "Mario";
////	    nome1 = nome1.replace('o', 'a');
////	    System.out.println(nome1);
//	    
//	    System.out.println(nomeN.contains("Mic")); //valida se contem 
//	    System.out.println(vazio.isEmpty()); //valida se esta vazio
//		System.out.println(nome);
//		System.out.println(outro);
//		System.out.println(outroChar);
//		System.out.println(c);
//		System.out.println(pos);
//		System.out.println(sub);
//		System.out.println(nome.length());
//		
//		for (int i = 0; i < nome.length(); i++) { //for que percorre a string com valor Alura, que se inicia com zero e vai ate o valor de caracter 5 alura. 
//			System.out.println(nome.charAt(i));
//		}

//		String texto = "Socorram";
//		texto = texto.concat("-");
//		texto = texto.concat("me");
//		texto = texto.concat(", ");
//		texto = texto.concat("subi ");
//		texto = texto.concat("no ");
//		texto = texto.concat("ônibus ");
//		texto = texto.concat("em ");
//		texto = texto.concat("Marrocos");
//		System.out.println(texto); 
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-"); //acrescenta dados a nova posição da string 
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString(); //apresenta a string no todo, e referencia ela em uma outra string para ser apresentado 
		System.out.println(texto);
		
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al"); //stringBuilder implementa e vice versa a CharSequence 

		nome = nome.replace("AL", cs);

		System.out.println(nome);
		
		
	}
}