package br.com.db1.db1start;

public class ConversorDeTexto {

//1 - FUM que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String converteTextoParaMaiuscula(String texto) {
		return texto.toUpperCase();
	}

//2 - FUM que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String converteTextoParaMinuscula(String texto) {
		return texto.toLowerCase();
	}

//3 - FUM que receba DB1START e retorne a quantidade de letras que existe nesta palavra
	public int quantidadeDeLetras(String texto) {
		return texto.length();
	}

//4 - FUM que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe 
	public String retiraEspacosEmBrancoDasExtremidades(String texto) {
		return texto.trim();
	}

//5 - FUM que retorne o item 4 com a mesma quantidade de letras do item 3.
	public int quantidadeDeLetrasSemEspacoEmBranco(String texto) {
		return texto.trim().length();
	}

//6 - FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
	public String retiraPrimeirasQuatroLetras(String nome) {
		return nome.substring(0, 4);
	}

//7 - FUM que receba o seu nome completo e exiba a partir da terceira letras do seu nome
	public String exibeAPartirDaTerceiraLetra(String nome) {
		return nome.substring(3);
	}

//8 - FUM que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
	public String exibirSomenteQuatroUltimas(String nome) {
		return nome.substring(10, 14);
	}

//9 - FUM que receba o seu nome completo e substitua o seu  primeiro nome por ALUNO/ALUNA
	public String substituiNomePorAluno(String nome) {
		return nome.replaceFirst("Natan", "Aluno");
	}

//10 - FUM que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
	public String[] separaStrings(String texto) {
		return texto.toString().split(" ");
	}

//11 - FUM que receba um texto e exiba quantas vogais tem no texto

//12 - FUM que receba um texto e devolva ele invertido
	public String textoInvertido(String texto) {
		return texto = new StringBuilder().reverse().toString();
	}
}

//Exercícios de Texto (String)