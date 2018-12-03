package br.com.bd1.db1start;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.OperadorMatematico;

public class MatematicaTeste {
	
	@Test
	public void deveMostrarOMarioEnreDoisNumeros() {
		OperadorMatematico operador= new OperadorMatematico();
		double textoTranformado = operador.maiorEntreDoisNumeros(5.2, 6.1);
		Assert.assertEquals(6.1, textoTranformado);
	}

}
