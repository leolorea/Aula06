import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String atividade[] = new String[3];
		
		System.out.println("Digite a atividade que foi realizada: ");
		for (int i = 0; i <atividade.length; i++) {
			
		atividade[i] = scanner.next();
		
		}
		
		System.out.println("Digite 1 para exibir as atividades por ordem de digitação, ou 2 para exibir na ordem inversa:");
		
		
		int ordem;
		ordem = scanner.nextInt();
		
		switch (ordem) {
		case 1: 
			for (int i =0; i<atividade.length; i++) {
				
				System.out.println(atividade[i]);
				
			}
			break;
		case 2 :
			
			for (int i =1; i<=3; i++) {
				
				System.out.println(atividade[atividade.length - i]);
				
			}
			
		}

	}

}
