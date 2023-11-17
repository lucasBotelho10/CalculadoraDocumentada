package Calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class CalculadoraJunitTest {
	
	Funcoes calc = new Funcoes(); // declara o objeto calc do tipo Funcoes
	
	@SuppressWarnings("deprecation")
	@Test
	
	
	//Teste funções de somar:
	
	//Função que soma dois valores positivos
	public void SomarDoisValoresPositivos() {
		int somar = calc.somar(10,2); // Cria o objeto somar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(12,somar); // função de teste verificando se o valor de somar será 12. Nesse caso está retornando uma resposta positiva, pois somar retorna 12.  
	}
	
	//Função que soma dois valores sendo um deles 0.
	public void SomarDoisValoresSendoUmZero() {
		int somar = calc.somar(10,0); // Cria o objeto somar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(13,somar); // função de teste verificando se o valor de somar será 13. Nesse caso está retornando uma resposta negativa, pois somar retorna 10.
	}
	
	// Função que soma dois valores sendo ambos deles 0.
	public void SomarDoisValoresSendoAmbosZero() {
		int somar = calc.somar(0,0); // Cria o objeto somar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(0,somar); // função de teste verificando se o valor de somar será 0. Nesse caso está retornando uma resposta positiva, pois somar retorna 0.
	}
	
	//Função que soma dois valores sendo um deles nagativo e outro positivo
	public void SomarDoisValoresSendoUmNegativo() {
		int somar = calc.somar(10,-2); // Cria o objeto somar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(12,somar); // função de teste verificando se o valor de somar será 12. Nesse caso está retornando uma resposta negativa, pois somar retorna 8.
	}
	
	//Função que soma dois vlaores negativos.
 	public void SomarDoisValoresSendoAmbosNegativos() {
		int somar = calc.somar(-10,-8); // Cria o objeto somar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(-18,somar); // função de teste verificando se o valor de somar será -18. Nesse caso está retornando uma resposta positiva, pois somar retorna -18.
	}
	
	//Teste funções de multiplicar:
 	
 	//Função que multiplica dois valores positivos.
	public void MultiplicarDoidValoresPositivos() {
		int multiplicar = calc.multiplicar(5,2); // Cria o objeto multiplicar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(13, multiplicar); // função de teste verificando se o valor de multiplicar será 13. Nesse caso está retornando uma resposta negativa, pois multiplicar retorna 10.
	}
	
	//Função que multiplica dois valores sendo um deles negativo.
	public void MultiplicarDoisValoresSendoUmNegativo() {
		int multiplicar = calc.multiplicar(-5,2); // Cria o objeto multiplicar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(-10, multiplicar); // função de teste verificando se o valor de multiplicar será -10. Nesse caso está retornando uma resposta positiva, pois multiplicar retorna -10.
	}
	
	//Função que multiplica dois valores sendo um deles 0.
	public void MultiplicarDoisValoresSendoUmZero() {
		int multiplicar = calc.multiplicar(5,0); // Cria o objeto multiplicar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(10, multiplicar); // função de teste verificando se o valor de multiplicar será 10. Nesse caso está retornando uma resposta negativa, pois multiplicar retorna 0.
	}
	
	//Função que recebe dois valores sendo ambos 0.
	public void MultiplicarDoisValoresSendoAmbosZero() {
		int multiplicar = calc.multiplicar(0,0); // Cria o objeto multiplicar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(0, multiplicar);  // função de teste verificando se o valor de multiplicar será 0. Nesse caso está retornando uma resposta positiva, pois multiplicar retorna -0.
	}
	
	//Função que multiplica dois valores negativos.
	public void MultiplicarDoisValoresSendoAmbosNegativos() {
		int multiplicar = calc.multiplicar(-5,-2); // Cria o objeto multiplicar que recebe o objeto calc chamando a função somar e recebendo dois valores como parametros.
		
		Assert.assertEquals(-10, multiplicar); // função de teste verificando se o valor de multiplicar será -10. Nesse caso está retornando uma resposta negativa, pois multiplicar retorna 10.
	}
	
	//Teste funções de dividir:
	
	//Função que divide dois valores positivos.
	public void DividirDoisValoresPositivos() {
		int dividir = calc.dividir(10,2); // Cria o objeto dividir que recebe o objeto calc chamando a função dividir e recebendo dois valores como parametros.
		
		
		Assert.assertEquals(6, dividir); // função de teste verificando se o valor de dividir será 6. Nesse caso está retornando uma resposta negativa, pois dividir retorna 5.
	}
	
	//Função que divide dois valores sendo o primeiro 0
	public void DividirDoisValoresSendoPrimeiroZero() {
		int dividir = calc.dividir(0,2);  // Cria o objeto dividir que recebe o objeto calc chamando a função dividir e recebendo dois valores como parametros.
		
		Assert.assertEquals(0, dividir); // função de teste verificando se o valor de dividir será 0. Nesse caso está retornando uma resposta positiva, pois dividir retorna 0.
	}
	
	//Função que divide dosi valores sendo o segundo 0.
	public void DividirDoisValoresSendoSegundoZero() {
//		int dividir = calc.dividir(10,0); // Cria o objeto dividir que recebe o objeto calc chamando a função dividir e recebendo dois valores como parametros.
//		
//		Assert.assertEquals(5, dividir); // função de teste verificando se o valor de dividir será 0. Nesse caso gerará um erro no sistema, pois não é possível dividir um número por zero
	}
	
	//Função que divide dois valores sendo o primeiro negativo.
	public void DividirDoisValoresSendoPrimeiroNegativo() {
		int dividir = calc.dividir(-10,2); // Cria o objeto dividir que recebe o objeto calc chamando a função dividir e recebendo dois valores como parametros.
		
		Assert.assertEquals(5, dividir);  // função de teste verificando se o valor de dividir será 5. Nesse caso está retornando uma resposta negativa, pois dividir retorna -5.
	}
	
	//Função que divide dois valores sendo ambos negativos.
	public void DividirDoisValoresSendoAmbosNegativos() {
		int dividir = calc.dividir(-10,-2); // Cria o objeto dividir que recebe o objeto calc chamando a função dividir e recebendo dois valores como parametros.
		
		Assert.assertEquals(5, dividir); // função de teste verificando se o valor de dividir será 5. Nesse caso está retornando uma resposta positiva, pois dividir retorna 5.
	}
	
	//Teste funções de subtrair:
	
	//Função que subtrai dois valores positivos.
	public void SubtrairDoisValoresPositivos() {
		int subtrair = calc.subtrair(10,5); // Cria o objeto subtrair que recebe o objeto calc chamando a função subtrair e recebendo dois valores como parametros.
		
		Assert.assertEquals(5, subtrair); // função de teste verificando se o valor de subtrair será 5. Nesse caso está retornando uma resposta positiva, pois subtrair retorna 5.
	}
	
	//Função que subtrai dois valores sendo primeiro menor que o segundo.
	public void SubtrairDoisValoresSendoPrimeiroMenor() {
		int subtrair = calc.subtrair(2,10); // Cria o objeto subtrair que recebe o objeto calc chamando a função subtrair e recebendo dois valores como parametros.
		
		Assert.assertEquals(9, subtrair); // função de teste verificando se o valor de subtrair será 9. Nesse caso está retornando uma resposta negativa, pois subtrair retorna -8.
	}
	
	//Função que subtrai dois valores sendo o primeiro negativo.
	public void SubtrairDoisValoresSendoPrimeiroNegativo() {
		int subtrair = calc.subtrair(-10,5); // Cria o objeto subtrair que recebe o objeto calc chamando a função subtrair e recebendo dois valores como parametros.
		
		Assert.assertEquals(-15, subtrair);  // função de teste verificando se o valor de subtrair será -15. Nesse caso está retornando uma resposta positiva, pois subtrair retorna -15.
	}
	
	//Função que recebe dois valores sendo o segundo negativo.
	public void SubtrairDoisValoresSendoSegundoNegativo() {
		int subtrair = calc.subtrair(10,-5); // Cria o objeto subtrair que recebe o objeto calc chamando a função subtrair e recebendo dois valores como parametros.
		
		Assert.assertEquals(10, subtrair); // função de teste verificando se o valor de subtrair será 10. Nesse caso está retornando uma resposta negativa, pois subtrair retorna 15.
	}
	
	//Função que subtrai dois valores sendo ambos negativos.
	public void SubtrairDoisValoresSendoAmbosNegativos() {
		int subtrair = calc.subtrair(-10,-5); // Cria o objeto subtrair que recebe o objeto calc chamando a função subtrair e recebendo dois valores como parametros.
		
		Assert.assertEquals(-5, subtrair); // função de teste verificando se o valor de subtrair será -5. Nesse caso está retornando uma resposta positiva, pois subtrair retorna -5.
	}
	
	
	//Comentários:
	 // Utilizar try/catch para fazer uma verificação se a operação não irá dar erro no programa, como por exemplo a divisão por 0.
	 // Alterar o tipo das funções para float ou double, para que elas possam receber valores não inteiros.
	 // Fazer encapsulamento das funções para não terem acesso direto a elas.
}
