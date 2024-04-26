package estruturadedados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao;
		
		String nome;
		
		do {
			
			System.out.println("***********************************");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("***********************************");
			System.out.print("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1: {
				System.out.println("Opção selecionada: Adicionar cliente na fila");
				System.out.print("Digite o nome do cliente: ");
				
				nome = leia.next();
				
				fila.add(nome);
				
				break;
			}
			
			case 2: {
				System.out.println("Opção selecionada: Listar todos os clientes");
		
				Iterator<String> iterator = fila.iterator();
				
				while(iterator.hasNext()){
				   System.out.println(iterator.next());
				}
				
				break;
			}
			
			case 3: {
				System.out.println("Opção selecionada: Retirar cliente da fila");
				
				fila.remove();
		
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
