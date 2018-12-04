package br.com.bd1.db1start;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.OperadorMatematico;

public class MatematicaTeste {

	@Test
	public void deveMostrarOMarioEnreDoisNumeros() {
		OperadorMatematico operador = new OperadorMatematico();
		double textoTranformado = operador.maiorEntreDoisNumeros(5.1, 6.8);
		Assert.assertEquals(6.8, 0, textoTranformado);
	}

	@Test
	public void deveMostrarOMaiorEntreTresNumeros() {
		OperadorMatematico operador = new OperadorMatematico();
		double textoTranformado = operador.maiorEntreTresNumeros(5.1, 6.8, 7.5);
		Assert.assertEquals(7.5, 0, textoTranformado);
	}
}
