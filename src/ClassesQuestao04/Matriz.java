package ClassesQuestao04;

import java.util.Scanner;

public class Matriz {


    public static double[][] preencherMatriz () {
        double[][] matrizGerada = new double[4][4];
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os 16 números com os quais deseja preencher a matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizGerada[i][j] = in.nextDouble();
            }
        }
        return matrizGerada;
    }
}
