import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double nota[] = new double[3];
		String nomeAluno[] = new String[3];
		
		Scanner scanner = new Scanner(System.in);
		double média= 0;
		
		for (int i=0; i<nota.length;i++) {
			System.out.println("Digite o nome do " + (i+1) + "° aluno.");
			nomeAluno[i] = scanner.next();
			
			System.out.println("Digite a nota do " + (i+1) + "° aluno.");
			
			nota[i] = scanner.nextDouble();
			
			System.out.println(nomeAluno[i] + nota[i]);
			média = nota[i]/nota.length;
			if (nota[i] <7) {
				System.out.println("Chamar o aluno para conversar");
			}
			

	}
		System.out.println(média);

}
}
