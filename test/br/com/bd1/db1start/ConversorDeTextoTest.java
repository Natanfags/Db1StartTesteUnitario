package br.com.bd1.db1start;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.ConversorDeTexto;

public class ConversorDeTextoTest {

	@Test
	public void deveTransformarParaMaiuscula() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.converteTextoParaMaiuscula("natan fagundes");
		Assert.assertEquals("NATAN FAGUNDES", textoTransformado);
	}

	@Test
	public void deveTransformarParaMinuscula() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.converteTextoParaMinuscula("NATAN FAGUNDES");
		Assert.assertEquals("natan fagundes", textoTransformado);
	}

	@Test
	public void deveContaQuantidadeDeLetras() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		int textoTransformado = conversorDeTexto.quantidadeDeLetras("DB1START");
		Assert.assertEquals(8, textoTransformado);
	}

	@Test
	public void deveRetirarEspaçosEmBrancoDasExtremidades() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.retiraEspacosEmBrancoDasExtremidades(" DB1Start ");
		Assert.assertEquals("DB1Start", textoTransformado);
	}

	@Test
	public void deveContarAQuantidadeDeLetrasSemEspacoEmBranco() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		int textoTransformado = conversorDeTexto.quantidadeDeLetrasSemEspacoEmBranco(" DB1Start ");
		Assert.assertEquals(8, textoTransformado);
	}

	@Test
	public void deveRetirarPrimeirasQuatroLetras() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.retiraPrimeirasQuatroLetras("Natan Fagundes");
		Assert.assertEquals("Nata", textoTransformado);
	}

	@Test
	public void deveExibirAPartirDaTerceiraLetra() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.exibeAPartirDaTerceiraLetra("Natan Fagundes");
		Assert.assertEquals("an Fagundes", textoTransformado);
	}

	@Test
	public void deveExibirAPartirDasQuatroUltimasLetras() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.exibirSomenteQuatroUltimas("Natan Fagundes");
		Assert.assertEquals("ndes", textoTransformado);
	}

	@Test
	public void deveSubstituirNomePorAluno() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.substituiNomePorAluno("Natan Fagundes");
		Assert.assertEquals("Aluno Fagundes", textoTransformado);
	}

	@Test
	public void deveSepararStrings() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String[] textoTransformado = conversorDeTexto.separaStrings("banana maçã melancia");
		Assert.assertArrayEquals(new String[] {"banana", "maçã", "melancia"}, textoTransformado);
	}
	
	@Test
	public void deveRetornarQuantidadeDeVogais() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		int textoTransformado = conversorDeTexto.contaVogais("testando teste");
		Assert.assertEquals(5, textoTransformado);
	}

	@Test
	public void deveInverterString() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTransformado = conversorDeTexto.textoInvertido("texto");
		Assert.assertEquals("otxet", textoTransformado);
	}

}