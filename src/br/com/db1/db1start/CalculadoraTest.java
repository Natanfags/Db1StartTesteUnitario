package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveSomar() {
		Calculadora	calculadora = new Calculadora();
		int resultado = calculadora.soma(4, 2);
		Assert.assertEquals(6, resultado);
		
		System.out.println("soma: " + resultado);
	}
	
	@Test
	public void deveSubtrair() {
		Calculadora	calculadora = new Calculadora();
		int resultado = calculadora.subtrai(4, 2);
		Assert.assertEquals(2, resultado);
		
		System.out.println("subtração: " + resultado);
	}
	
	@Test
	public void deveMultiplicar() {
		Calculadora	calculadora = new Calculadora();
		int resultado = calculadora.multiplica(4, 2);
		Assert.assertEquals(8, resultado);
		
		System.out.println("multiplicação: " + resultado);
	}
	
	@Test
	public void deveDividir() {
		Calculadora	calculadora = new Calculadora();
		int resultado = calculadora.divide(4, 2);
		Assert.assertEquals(2,resultado);
		System.out.println("Divisão: " + resultado);
	}
}	