import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        
        ArrayList<String> taskList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        //Menu principal
        do{
            System.out.println("=== Gerenciador de tarefas | Java ===");
            System.out.println("Digite uma das opções abaixo\n");
            System.out.println("1. Ver todas as tarefas");
            System.out.println("2. Adicionar tarefa");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair do programa");

            option = Integer.parseInt(scanner.nextLine());


            switch (option) {
                case 1:

                    if (!taskList.isEmpty()) {
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println(String.format("%s - %s", i + 1, taskList.get(i)));
                        }
                    } else {
                        System.out.println("A lista esta vazia.");
                    }

                    scanner.nextLine();
                    break;

                case 2:

                    System.out.println("Digite a tarefa que você deseja adicionar a lista:");
                    String newTask = scanner.nextLine().trim();
                    taskList.add(newTask);

                    break;

                case 3:

                    System.out.println("Digite a posição da tarefa que você deseja excluir:");
                    int position = Integer.parseInt(scanner.nextLine());
                    taskList.remove(position - 1);

                    break;

                case 4:

                    System.out.println("Saindo do programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (option != 4);

    }
}
