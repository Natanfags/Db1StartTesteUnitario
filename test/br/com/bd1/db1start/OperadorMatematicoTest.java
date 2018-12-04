package br.com.bd1.db1start;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.OperadorMatematico;

public class OperadorMatematicoTest {
	
	@Test
	public void deveMostrarOMaiorEntreDoisNumeros() {
		OperadorMatematico operador = new OperadorMatematico();
		double textoTransformado = operador.maiorEntreDoisNumeros(6.0, 5.0);
		Assert.assertEquals(6.0, 0.0, textoTransformado);
	}
	
	@Test
	public void deveMostrarOMaiorEntreTresNumeros() {
		OperadorMatematico operador = new OperadorMatematico();
		double textoTransformado = operador.maiorEntreTresNumeros(4.0, 5.0, 6.0);
		Assert.assertEquals(6.0, 0, textoTransformado);
	}
	
	@Test
	public void deveCalcularAMediaEntreTresNumeros() {
		OperadorMatematico operador = new OperadorMatematico();
		double textoTransformado = operador.mediaEntreTresNumeros(2.0, 2.0, 2.0);
		Assert.assertEquals(2.0, 0.0, textoTransformado);
	}
	
	@Test
	public void deveCalcularAAreaDoTrinangulo() {
		OperadorMatematico operador = new OperadorMatematico();
		double textoTransformado = operador.areaDoTrinagulo(5.0, 3.0);
		Assert.assertEquals(15.0, 0.0, textoTransformado);
	}
	
}