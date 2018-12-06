package br.com.bd1.db1start;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.db1start.Calculadora;

public class CalculadoraTest {

	@Test
	public void deveSomar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.soma(4, 2);
		Assert.assertEquals(6, resultado);
	}

	@Test
	public void deveSubtrair() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrai(4, 2);
		Assert.assertEquals(2, resultado);
	}

	@Test
	public void deveMultiplicar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplica(4, 2);
		Assert.assertEquals(8, resultado);
	}

	@Test
	public void deveDividir() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.divide(4, 2);
		Assert.assertEquals(2, resultado);
	}

	@Test
	public void deveVerificarPar() {
		Calculadora calculadora = new Calculadora();
		boolean resultado = calculadora.verificaPar(4);
		Assert.assertEquals(true, resultado);
	}

	@Test
	public void deveRetornarMaior() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.numeroMaior(4, 6);
		Assert.assertEquals(6, resultado);
	}

	@Test
	public void deveRetornarImparesAteCem() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.imparesAteCem(95);
		Assert.assertEquals(3, resultado);
	}

}