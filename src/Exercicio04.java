import java.util.Scanner;

public class Exercicio04 {
	static int maiorValor=0;
	static int indiceMaiorValor=0;
	static int valorTotal = 0;
	static int quantidadeProdutos = 0;
	static int capacidadeCarrinho = 5;
	static int vetCarrinhoValores[] = new int[capacidadeCarrinho];
	static String vetCarrinhoNomes[] = new String[capacidadeCarrinho];  
	static String buscaNome;

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		for(int n =0; n<100; n++) {
		System.out.println("");
		System.out.println("");
		System.out.println("Você entrou em nosso sistema de compras: ");
		System.out.println("Digite 1 para adicionar produtos ");
		System.out.println("Digite 2 para remover produtos ");
		System.out.println("Digite 3 para calcular o valor total da compra ");
		System.out.println("Digite 4 para exibir a quantidade total de produtos comprados ");
		System.out.println("Digite 5 para exibir o produto de maior valor ");
		System.out.println("Digite 6 para exibir a lista de produtos ");
		System.out.println("Digite para sair do sistema ");
		
		int menu = scanner.nextInt();
		
		
		switch (menu) {
		
		case 1 : 
			for (int i = 0; i<capacidadeCarrinho; i++) {System.out.println("Digite o nome do produto e o valor que você quer adicionar no carrinho: ");
			vetCarrinhoNomes[i] = scanner.next();
			vetCarrinhoValores[i] = scanner.nextInt();
			valorTotal = valorTotal + vetCarrinhoValores[i];
			quantidadeProdutos++;
			
		
			if (vetCarrinhoValores[i]>maiorValor)  {
				maiorValor = vetCarrinhoValores[i];
				indiceMaiorValor = i;
			}
			if (i == vetCarrinhoValores.length-1) {System.out.println("O carrinho está cheio!");}
			
			}
			
			
			break;
			
		case 2 :if (valorTotal != 0 ) {
			System.out.println("Digite o produto que deseja removar do carrinho: ");

			buscaNome = scanner.next();
			for (int i= 0; i<vetCarrinhoNomes.length; i++) {
		if (vetCarrinhoNomes[i].equals(buscaNome)){
				
			vetCarrinhoNomes[i] = "";
			vetCarrinhoValores[i] = 0;}}
			System.out.println("O produto foi removido com sucesso!");
			}else
			{System.out.println("Seu carrinho está vazio");}
		
			break;
			
		case 3 : if(valorTotal!=0) { 
			System.out.println("O valor total de seu carrinho é: " + valorTotal + "R$");
		}else {
			System.out.println("Seu carrinho está vazio");
		}
			break;
			
		case 4 : if(quantidadeProdutos!=0) {
			System.out.println("Você adicionou " + quantidadeProdutos + " produtos ao seu carrinho.");
		}else {
			System.out.println("Seu carrinho está vazio");
		}
			break;
			
		case 5 :
			if (vetCarrinhoNomes[indiceMaiorValor]!= null) {
			System.out.println("O produto de maior valor é o " +vetCarrinhoNomes[indiceMaiorValor] + " que custa "+ maiorValor +  " R$");
			}else {
				System.out.println("Seu carrinho está vazio");
			}
			break;
			
		case 6 : 
			if(quantidadeProdutos!=0) {
			for(int i = 0; i< vetCarrinhoValores.length;i++) {
				System.out.println(vetCarrinhoNomes[i] +" " +vetCarrinhoValores[i] + "R$");
			}}else {System.out.println("Seu carrinho está vazio");
}
			
			break;
			default: 
				System.out.println("");
				System.out.println("");
				System.out.println("Você entrou em nosso sistema de compras: ");
				System.out.println("Digite 1 para adicionar produtos ");
				System.out.println("Digite 2 para remover produtos ");
				System.out.println("Digite 3 para calcular o valor total da compra ");
				System.out.println("Digite 4 para exibir a quantidade total de produtos comprados ");
				System.out.println("Digite 5 para exibir o produto de maior valor ");
				System.out.println("Digite 6 para exibir a lista de produtos ");
				System.out.println("Digite 7 para sair do sistema ");
				break;
			case 7 :
				
				
		}
		
		
		
		
		}
		scanner.close();
	}

}
