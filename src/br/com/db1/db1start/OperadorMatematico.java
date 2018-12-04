package br.com.db1.db1start;

public class OperadorMatematico {

	public double maiorEntreDoisNumeros(double primeiroNumero, double segundoNumero) {
		if (primeiroNumero > segundoNumero) {
			return primeiroNumero;
		}
		return segundoNumero;
	}

	public double maiorEntreTresNumeros(double primeiroNumero, double segundoNumero, double terceiroNumero) {
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			return primeiroNumero;
		} else if (segundoNumero > terceiroNumero) {
			return segundoNumero;
		}
		return terceiroNumero;
	}

}
