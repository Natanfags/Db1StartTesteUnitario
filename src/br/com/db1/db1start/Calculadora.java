package br.com.db1.db1start;

public class Calculadora {
	
//1 - FUM que some dois números
	public int soma(int primeiroNumero,int segundoNumero) {
		return segundoNumero + primeiroNumero;

	}
	
//2 - FUM que subtraia dois números
	public int subtrai(int primeiroNumero, int segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
//3 - FUM que multiplique dois números 
	public int multiplica(int primeiroNumero, int segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
//4 - FUM que divida dois números
	public int divide(int primeiroNumero, int segundoNumero) {
		return primeiroNumero / segundoNumero;
	}

//5 - FUM que diga se o número é par
	public boolean verificaPar(int numero) {
		if (numero % 2 != 0) {
		return false;
		}else {
			return true;
		}
	}
	
//6 - FUM que receba dois números e diga qual é o maior
	public int numeroMaior(int primeirNumero, int segundoNumero) {
		if (primeirNumero > segundoNumero) {
			return primeirNumero;
		}else {
			return segundoNumero;
		}
	}
//7 - FUM que a partir de um valor inicial, mostre os números de ímpares até 100. 
	public int imparesAteCem(int numero) {
		if(numero % 2 != 0) {
			while (numero < 100);
			numero++;
		}return numero;
	}

}