/*Crie uma matriz M com dimensões 3x3, de inteiros. Em seguida, preencha a matriz e  verifique se a matriz é um quadrado mágico
 * . Uma matriz é um quadrado mágico quando a soma de todas as suas linhas, todas as suas colunas, sua diagonal principal e sua diagonal
 * secundária resultam no mesmo valor.*/

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] quadrado = new int[3][3];
        char[][] exemplo = {{'X', 'X', 'X'}, {'X', 'X', 'X'}, {'X', 'X', 'X'}};

        System.out.println("\nInforme um número para cada posição do quadrado conform o exemplo abaixo:");

        int cont = 1;
        for (char[] vetor : exemplo) {
            for (char n : vetor) {
                System.out.printf("%2c%d", n , cont);
                cont++;
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j< 3; j++) {
                quadrado[i][j] = in.nextInt();
            }
        }

        for (int[] vetor : quadrado) {
            for (int n : vetor) {
                System.out.printf("%2d ", n);
            }
            System.out.println();
        }

        int l1 = 0, l2 = 0, l3 = 0;
        int c1 = 0, c2 = 0, c3 = 0;
        int d1 = 0, d2 = 0;

        int cont2 = 2;
        for (int i = 0; i < 3; i++) {
            l1 += quadrado[0][i];
            l2 += quadrado[1][i];
            l3 += quadrado[2][i];
            c1 += quadrado[i][0];
            c2 += quadrado[i][1];
            c3 += quadrado[i][2];
            d1 += quadrado[i][cont2--];
            d2 += quadrado[i][i];
        }

        if (l1==l2&&l2==l3&&l3==c1&&c1==c2&&c2==c3&&c3==d1&&d1==d2)
            System.out.println("\nÉ um quadrado mágico!");
        else
            System.out.println("\nNão é um quadrado mágico!");


        in.close();
    }
}
