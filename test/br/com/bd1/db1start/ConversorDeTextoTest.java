package br.com.bd1.db1start;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.ConversorDeTexto;

public class ConversorDeTextoTest {

	@Test
	public void deveTransformarParaMaiuscula() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.converteTextoParaMaiuscula("natan fagundes");
		Assert.assertEquals("NATAN FAGUNDES", textoTranformado);
	}

	@Test
	public void deveTransformarParaMinuscula() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.converteTextoParaMinuscula("NATAN FAGUNDES");
		Assert.assertEquals("natan fagundes", textoTranformado);
	}

	@Test
	public void deveContaQuantidadeDeLetras() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		int textoTranformado = conversorDeTexto.quantidadeDeLetras("DB1START");
		Assert.assertEquals(8, textoTranformado);
	}

	@Test
	public void deveRetirarEspaçosEmBrancoDasExtremidades() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.retiraEspacosEmBrancoDasExtremidades(" DB1Start ");
		Assert.assertEquals("DB1Start", textoTranformado);
	}

	@Test
	public void deveContarAQuantidadeDeLetrasSemEspacoEmBranco() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		int textoTranformado = conversorDeTexto.quantidadeDeLetrasSemEspacoEmBranco(" DB1Start ");
		Assert.assertEquals(8, textoTranformado);
	}

	@Test
	public void deveRetirarPrimeirasQuatroLetras() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.retiraPrimeirasQuatroLetras("Natan Fagundes");
		Assert.assertEquals("Nata", textoTranformado);
	}

	@Test
	public void deveExibirAPartirDaTerceiraLetra() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.exibeAPartirDaTerceiraLetra("Natan Fagundes");
		Assert.assertEquals("an Fagundes", textoTranformado);
	}

	@Test
	public void deveExibirAPartirDasQuatroUltimasLetras() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.exibirSomenteQuatroUltimas("Natan Fagundes");
		Assert.assertEquals("ndes", textoTranformado);
	}

	@Test
	public void deveSubstituirNomePorAluno() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.substituiNomePorAluno("Natan Fagundes");
		Assert.assertEquals("Aluno Fagundes", textoTranformado);
	}

	@Test
	public void deveSepararStrings() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String[] textoTranformado = conversorDeTexto.separaStrings("banana maçã melancia");
		Assert.assertEquals("banana maçã melancia", textoTranformado);
		System.out.println(textoTranformado);
	}

	public void deveRetornarQuantidadeDeVogais() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		int textoTranformado = conversorDeTexto.quantidadeDeLetrasSemEspacoEmBranco("testando teste");
		Assert.assertEquals(5, textoTranformado);
		System.out.println(textoTranformado);
	}

	@Test
	public void deveInverterString() {
		ConversorDeTexto conversorDeTexto = new ConversorDeTexto();
		String textoTranformado = conversorDeTexto.textoInvertido("texto");
		Assert.assertEquals("", textoTranformado);
		System.out.println(textoTranformado);
	}

}