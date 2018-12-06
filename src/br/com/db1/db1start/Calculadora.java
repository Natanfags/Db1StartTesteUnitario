package br.com.db1.db1start;

public class Calculadora {

	public int soma(int primeiroNumero, int segundoNumero) {
		return segundoNumero + primeiroNumero;

	}

	public int subtrai(int primeiroNumero, int segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

	public int multiplica(int primeiroNumero, int segundoNumero) {
		return primeiroNumero * segundoNumero;
	}

	public int divide(int primeiroNumero, int segundoNumero) {
		return primeiroNumero / segundoNumero;
	}

	public boolean verificaPar(int numero) {
		if (numero % 2 != 0) {
			return false;
		} else {
			return true;
		}
	}

	public int numeroMaior(int primeirNumero, int segundoNumero) {
		if (primeirNumero > segundoNumero) {
			return primeirNumero;
		} else {
			return segundoNumero;
		}
	}

	int cont = 0;
	public int imparesAteCem(int numero) {
		for (numero = 0; numero < 100; numero++) {
			if (numero % 2 != 0) {
				cont=+ numero;
				}
		}
		
		return numero;
	}
}