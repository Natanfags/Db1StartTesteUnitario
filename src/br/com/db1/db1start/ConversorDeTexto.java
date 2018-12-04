package br.com.db1.db1start;

public class ConversorDeTexto {

	public String converteTextoParaMaiuscula(String texto) {
		return texto.toUpperCase();
	}

	public String converteTextoParaMinuscula(String texto) {
		return texto.toLowerCase();
	}

	public int quantidadeDeLetras(String texto) {
		return texto.length();
	}

	public String retiraEspacosEmBrancoDasExtremidades(String texto) {
		return texto.trim();
	}

	public int quantidadeDeLetrasSemEspacoEmBranco(String texto) {
		return texto.trim().length();
	}

	public String retiraPrimeirasQuatroLetras(String nome) {
		return nome.substring(0, 4);
	}

	public String exibeAPartirDaTerceiraLetra(String nome) {
		return nome.substring(3);
	}

	public String exibirSomenteQuatroUltimas(String nome) {
		return nome.substring(10, 14);
	}

	public String substituiNomePorAluno(String nome) {
		return nome.replaceFirst("Natan", "Aluno");
	}

	public  String[] separaStrings(String texto) {
		return texto.split(" ");
	}

	public int contaVogais (String texto){
        int contarVogais = 0;
        texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        return contarVogais;
    }
	
	public String textoInvertido(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}
}

