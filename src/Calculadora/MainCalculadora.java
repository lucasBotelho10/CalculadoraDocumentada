
package Calculadora;

public class MainCalculadora {
	public static void main(String[] args) {
		 Funcoes calc = new Funcoes();

	        System.out.println("Soma:");
	        //Cenário de teste 1: Somando dois valores positivos
	        int soma = calc.somar(5,2);
	        System.out.println("Teste 1: " + soma);
	        
	        //Cenário de teste 2: Somando dois valores sendo um zero
	         soma = calc.somar(5,0);
	        System.out.println("Teste 2: " + soma);
	        
	        //Cenário de teste 3: Somando dois valores sendo ambos zero
	         soma = calc.somar(0,0);
	        System.out.println("Teste 3: " + soma);
	        
	        //Cenário de teste 4: Somando dois valores sendo um deles negativo
	        soma = calc.somar(5,-2);
	        System.out.println("Teste 4: " + soma);
	        
	        //Cenário de teste 5: Somando dois valores sendo ambos negativos
	        soma = calc.somar(-5,-2);
	        System.out.println("Teste 5: " + soma);
	        
	        System.out.println("----------------------------------------------");
	        System.out.println("Multiplicação: ");
	        
	        //Cenário de teste 6: Multiplicando dois valores sendo ambos positivos
	        int multiplicar = calc.multiplicar(10,5);
	        System.out.println("Teste 6: " + multiplicar);
	        
	        //Cenário de teste 7: Multiplicando dois valores sendo um deles negativo e outro positivo
	        multiplicar = calc.multiplicar(-10,5);
	        System.out.println("Teste 7: " + multiplicar);
	        
	        //Cenário de teste 8: Multiplicando dois valores sendo um deles positivo e outro zero
	        multiplicar = calc.multiplicar(10,0);
	        System.out.println("Teste 8: " + multiplicar);
	        
	        //Cenário de teste 9: Multiplicando dois valores sendo ambos zero
	        multiplicar = calc.multiplicar(0,0);
	        System.out.println("Teste 9: " + multiplicar);
	        
	        //Cenário de teste 10: Multiplicando dois valores sendo ambos negativos
	        multiplicar = calc.multiplicar(-10,-5);
	        System.out.println("Teste 10: " + multiplicar);
	        
	         System.out.println("----------------------------------------------");
	         
	         System.out.println("Divisão: ");

	        //Cenário de teste 11: Dividindo dois valores positivos
	        int dividir = calc.dividir(10,2);
	        System.out.println("Teste 11: " + dividir);
	        
	        //Cenário de teste 12: Dividindo dois valores sendo o divisor zero e o dividendo um número positivo
	        dividir = calc.dividir(0,2);
	        System.out.println("Teste 12: " + dividir);
	        
	        //Cenário de teste 13: Dividindo dois valores sendo o divisor positivo e o dividendo zero
//	        dividir = calc.dividir(2,0);
//	        System.out.println("Teste 13: " + dividir); // Irá gerar um erro no sistema, pois o dividendo sendo zero não existe
	        
	        //Cenário de teste 14: Dividindo dois valores sendo o divisor negativo e o dividendo positivo
	        dividir = calc.dividir(-10,2);
	        System.out.println("Teste 14: " + dividir);
	        
	        //Cenário de teste 15: Dividindo dois valores sendo ambos negativos
	        dividir = calc.dividir(-10,-2);
	        System.out.println("Teste 15: " + dividir);
	        
	        System.out.println("----------------------------------------------");
	        
	        System.out.println("Subtraçãoo: ");
	        
	        //Cenário de teste 16: Subtraindo dois valores sendo ambos positivos
	        int sub = calc.subtrair(10,2);
	        System.out.println("Teste 16: " + sub);
	        
	        //Cenário de teste 17: Subtraindo dois valores sendo o primeiro menor que o segundo
	        sub = calc.subtrair(2,10);
	        System.out.println("Teste 17: " + sub);
	        
	        //Cenário de teste 18: Subtraindo dois valores sendo o primeiro deles negativo e o segundo positivo
	        sub = calc.subtrair(-10,2);
	        System.out.println("Teste 18: " + sub);
	        
	        //Cenário de teste 19: Subtraindo dois valores sendo o primeiro deles positivos e o segundo negativo
	        sub = calc.subtrair(10,-2);
	        System.out.println("Teste 19: " + sub);
	        
	        //Cenário de teste 20: Subtraindo dois valores sendo ambos negativos
	        sub = calc.subtrair(-10,-2);
	        System.out.println("Teste 20: " + sub);
	      
	}

}
