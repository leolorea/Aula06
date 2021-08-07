import java.util.Random;

public class Exercicio03 {
	public static void main(String[] args) {
		
		int numeros[] = new int[50];
		Random random = new Random(10);
		int contador3e7 =0;
		int contadorPar = 0;
		int contadorMenor3 = 0;
		int contadorImpar = 0;
		
		
		for (int i =0; i<50; i++) {
			
			numeros[i] = random.nextInt(10);
			switch (numeros[i]) {
			
			case 0 : contadorMenor3++;
				break;
			
			case 1: contadorMenor3++;
					contadorImpar++;
				break;
			
			case 2: contadorPar++;
					contadorMenor3++;
					break;
			
			case 3 : contadorImpar++;
					break;
			
			case 4 : contadorPar++;
					contador3e7++;
					break;
					
			case 5 : contadorImpar++;
					contador3e7++;
					break;
					
			case 6 : contadorPar++;
					contador3e7++;
					break;
					
			case 9 :		
			case 7 : contadorImpar++;
					break;
					
			case 8 : contadorPar++;
			break;
			default : 
				System.out.println("Numero invalido");
				break;
			}
	    
			
			
			
			
		}
		System.out.println(contador3e7);
		System.out.println(contadorPar);
		System.out.println(contadorMenor3);
		System.out.println(contadorImpar);
		
	}
		

}

