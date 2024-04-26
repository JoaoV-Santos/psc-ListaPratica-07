import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //char[][] quadrado = new char[3][3];
        char[][] quadrado = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
        System.out.println("Insira o nome do jogador 1:");
        String jogador1 = in.nextLine();
        System.out.println("Insira o nome do jogador 2:");
        String jogador2 = in.nextLine();
        String jogador = "";
        char jogada = '0';

        System.out.println("\nInforme um número para cada posição do quadrado conform o exemplo abaixo:");

        for (char[] vetor : quadrado) {
            for (char n : vetor) {
                System.out.printf("%2c ", n);
            }
            System.out.println();
        }
        String l1 = "", l2 = "", l3 = "";
        String c1 = "", c2 = "", c3 = "";
        String d1 = "", d2 = "";
        String[] diagonais = {l1, l2, l3, c1, c2, c3, d1, d2};

        int turno = 1;
        int alternador = -1;
        while (true) {
            if (alternador == 0)
                alternador = -1;
            System.out.println();
            if (turno == 1)
                System.out.println("Vez do (a) " + jogador1);
            else if (turno == -1)
                System.out.println("Vez do (a) " + jogador2);

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
            for (char[] vetor : quadrado) {
                for (char n : vetor) {
                    System.out.printf("%2c ", n);
                }
                System.out.println();
            }
            int cont2 = 2;
            for (int i = 0; i < 3; i++) {
                l1 += jogada;
                l2 += quadrado[1][i];
                l3 += quadrado[2][i];
                c1 += quadrado[i][0];
                c2 += quadrado[i][1];
                c3 += quadrado[i][2];
                d1 += quadrado[i][cont2--];
                d2 += quadrado[i][i];
            }

            for (int i = 0; i < diagonais.length; i++) {
                if (diagonais[i].equals("xxx") || diagonais[i].equals("ooo"))
                    break;
            }

            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(d1);
            System.out.println(d2);

        }

        /*for (int[] vetor : quadrado) {
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



        in.close();*/
    }
}
