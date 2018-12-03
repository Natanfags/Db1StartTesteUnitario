package br.com.bd1.db1start;


import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.Nome;

public class NomeTest {

	@Test
	public void deveTransformarParaMaiuscula() {
		Nome nome = new Nome();
		String valorTranformado = nome.transformaParaLetraMaiuscula("maiko cunha");
		Assert.assertEquals("MAIKO CUNHA", valorTranformado);
		
		System.out.println(valorTranformado);
	}
	
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("MAIKO CUNHA");
		Assert.assertEquals(11, tamanhoDoNome);
		
		System.out.println(tamanhoDoNome);
	}
}