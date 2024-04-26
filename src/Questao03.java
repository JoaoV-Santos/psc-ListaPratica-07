/*Faça programa para jogar o jogo da velha. Ele deve permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar sua peça
(‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e, determinar automaticamente quando o jogo terminou e quem foi o vencedor
(jogador 1 ou jogador 2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela. Sugestão: Utilizar uma classe
para representar o jogo.
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] exemplo = {{1,2,3},{4,5,6},{7,8,9}};
        char[][] quadrado = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
        System.out.println("Insira o nome do jogador 1:");
        String jogador1 = in.nextLine();
        System.out.println("Insira o nome do jogador 2:");
        String jogador2 = in.nextLine();
        String jogador = "";
        char jogada = '0';

        System.out.println("\nInforme a posição em que deseja jogar seguido do símbolo conforme exemplo abaixo (o primeiro jogador sempre começa com x):");

        for (int[] vetor : exemplo) {
            for (int n : vetor) {
                System.out.printf("%2d ", n);
            }
            System.out.println();
        }
        String l1 = " ", l2 = " ", l3 = " ";
        String c1 = " ", c2 = " ", c3 = " ";
        String d1 = " ", d2 = " ";


        int turno = 1;
        int alternador = -1;
        String jogadorAtual = null;
        int verificador = 0;
        while (true) {
            System.out.println();
            if (turno == 1) {
                jogadorAtual = jogador1;
                System.out.println("Vez do (a) " + jogadorAtual);
            }
            else if (turno == -1) {
                jogadorAtual = jogador2;
                System.out.println("Vez do (a) " + jogadorAtual);
            }

            System.out.println("Escolha uma posição:");
            int posicao = in.nextInt();
            int l = 0, c = 0;
            switch (posicao) {
                case 1:
                    l = 0;
                    c = 0;
                    break;
                case 2:
                    l = 0;
                    c = 1;
                    break;
                case 3:
                    l = 0;
                    c = 2;
                    break;
                case 4:
                    l = 1;
                    c = 0;
                    break;
                case 5:
                    l = 1;
                    c = 1;
                    break;
                case 6:
                    l = 1;
                    c = 2;
                    break;
                case 7:
                    l = 2;
                    c = 0;
                    break;
                case 8:
                    l = 2;
                    c = 1;
                    break;
                case 9:
                    l = 2;
                    c = 2;
                    break;
            }
            if (quadrado[l][c] == '_') {
                jogada = in.next().charAt(0);
                if (turno == 1 && jogada == 'x') {
                    quadrado[l][c] = jogada;
                    turno *= -1;
                }
                else if (turno == -1 && jogada == 'o') {
                    quadrado[l][c] = jogada;
                    turno *= -1;
                }
                else
                    System.out.println("Jogada Inválida");

            }
            else {
                System.out.println("Posição já escolhida.");
            }
            System.out.println();
            for (char[] vetor : quadrado) {
                for (char n : vetor) {
                    System.out.printf("%2c ", n);
                }
                System.out.println();
            }
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
            String[] diagonais = {l1, l2, l3, c1, c2, c3, d1, d2};
            for (int i = 0; i < diagonais.length; i++) {
                if (diagonais[i].equals("xxx") || diagonais[i].equals("ooo"))
                    break;
            }

            for (int i = 0; i < 8; i++) {
                if (diagonais[i].substring(diagonais[i].length() - 3).equals("xxx")) {
                    verificador = 1;
                }
            }
            boolean velha = velha(quadrado,0);
            if (velha == true) {
                System.out.println("\nDeu Velha!");
                break;
            }
            if (verificador == 1) {
                System.out.println("\n" + jogadorAtual + " venceu!!!");
                break;
            }

        }

        in.close();
    }
    public static boolean velha(char[][] tabuleiro, int contador) {
        for (char[] vetor : tabuleiro) {
            for (char jogada : vetor) {
                if (jogada != '_')
                    contador++;
            }
        }
        if (contador == 9) {
            return true;
        }
        else
            return false;
    }
}
