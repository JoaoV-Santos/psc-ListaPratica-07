/*Crie um programa que recebe uma matriz de 4x4 de números de ponto flutuante, preencha a matriz e, depois exiba:
Os valores da diagonal principal.
Os valores da diagonal secundária.
A matriz transposta.
*/

import ClassesQuestao04.DiagonalPrincipal;
import ClassesQuestao04.DiagonalSecundaria;
import ClassesQuestao04.ImprimirMatriz;
import ClassesQuestao04.Matriz;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] matrizLocal = Matriz.preencherMatriz();

        System.out.println("\nEscolha uma das opções abaixo:\n" +
                "1.Imprimir matriz\n" +
                "2.Imprimir valores da diagonal principal\n" +
                "3.Imprimir valores da diagonal secundária");
        int opcao = in.nextInt();

        switch (opcao) {
            case 1:
                ImprimirMatriz.print(matrizLocal);
                break;
            case 2:
                DiagonalPrincipal.print(matrizLocal);
                break;
            case 3:
                DiagonalSecundaria.print(matrizLocal);
                break;
            default:
                System.out.println("Opção Inválida!");
        }

        in.close();
    }
}
