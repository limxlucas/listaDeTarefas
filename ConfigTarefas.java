package listaDeTarefas;
import java.util.*;


public class ConfigTarefas {
	
	public static void Menu() {
		
		Scanner ler = new Scanner(System.in); //Ler valores
		System.out.println("[1]Criar Nova Tarefa\n[2]Mostrar tarefas\n[3]Sair\nOpcao");
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); //Ler valores
		List<String> tarefas = new ArrayList<String>(); //Criando lista
		Menu(); //Cabecalho de opcoes
		
		while(true) {
			String opcaoString = ler.nextLine();
			int opcao =  Integer.valueOf(opcaoString);
			
			if (opcao == 1) {
				while(true) {
				System.out.println("Qual o nome da tarefa?");
				String tarefa = ler.nextLine();//AQUI
				tarefas.add(tarefa);
				System.out.println("Adicionar alguma outra tarefa? (0 para NAO, 1 para SIM)");
				String confString = ler.nextLine();
				int conf = Integer.valueOf(confString);
				if(conf == 0) {
					System.out.println("TAREFAS ADICIONADAS COM SUCESSO");
					System.out.println();
					Menu();
					break;
				}
			}
			}
			
			if(opcao == 2) {
				System.out.println();
				for(int i = 0; i < tarefas.size(); i++) {
					System.out.println("Tarefa "+ (i + 1) + " - " + tarefas.get(i));
				}
				System.out.println();
				Menu();
			}
			
			if(opcao == 3) {
				System.out.println("Saindo...");
				break;
			}
		}
	}
}
