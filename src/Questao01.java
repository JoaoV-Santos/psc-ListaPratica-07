/*(Loiane - Adaptado) Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal, onde, cada dia do mês deve conter 24 horas, e, para cada
uma destas 24 horas podemos associar uma tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora,
entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] agenda = new String[31][24];
        int dia = 0;
        int hora = 0;
        int opcao = 0;

        System.out.println("__AGENDA__");

        while (true) {
            System.out.println("\n1.Adicionar nova tarefa.\n2.Visualizar tarefa existente.\n3.Sair");

            opcao = in.nextInt();
            in.nextLine();

            String resposta = null;
            switch (opcao) {
                case 1:
                    System.out.println("Informe o dia:");
                    dia = in.nextInt();
                    in.nextLine();
                    System.out.println("Informe a hora:");
                    hora = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite a tarefa a ser adicionada:");
                    agenda[dia-1][hora-1] = in.nextLine();
                    break;
                case 2:
                    System.out.println("Informe o dia:");
                    dia = in.nextInt();
                    in.nextLine();
                    System.out.println("Informe a hora:");
                    hora = in.nextInt();
                    in.nextLine();
                    if (agenda[dia-1][hora-1] != null) {
                        System.out.println("\nTarefa: " + agenda[dia-1][hora-1]);
                    }
                    else {
                        System.out.println("\nNenhuma tarefa adicionada no dia e hora informado. Deseja adicionar um agora?");
                        resposta = in.nextLine();
                        if (resposta.equalsIgnoreCase("sim")) {
                            System.out.println("Digite a tarefa que deseja adicionar:");
                            agenda[dia-1][hora-1] = in.nextLine();
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nInforme uma opção válida.");
                    break;
            }
            if (opcao == 3)
                break;
        }

        in.close();
    }
}
