package estruturadedados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner leiaLivro = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		
		int opcao = 0;
		
		String livro = "";
		
		do {
			
			System.out.println("******************************");
			System.out.println("1 - Nome do livro: ");
			System.out.println("2 - Listar todos os livros: ");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("******************************");
			System.out.println("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1: {
					System.out.println("Opção selecionada: Nome do livro");
					System.out.println("Digite o nome do livro: ");
					
					livro = leiaLivro.next();
					
					pilha.push(livro);
					
					break; 
				}
				
				case 2: {
					System.out.println("Opção selecionada: Listar todos os livros: ");
					
					Iterator<String> iterator = pilha.iterator();
					
					while(iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					
					break; 
				}
				
				case 3: {
					System.out.println("Opção selecionada: Retirar livro da pilha");
					
					if (pilha.size()>0) {
						pilha.pop();
						
					} else {
						System.out.println("A pilha está vazia!");
					}
					
					break;
				}
				
				case 0: {
					System.out.println("Opção selecionada: Sair");
					
					break;
				}
				
				default: {
					System.out.println("Opção inválida!");
					
					break;
					
				}
				
				
			}
			
		} while (opcao != 0);
		
	}

}
