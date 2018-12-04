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

	public int imparesAteCem(int numero) {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
			}
		}
		return numero;
	}
}