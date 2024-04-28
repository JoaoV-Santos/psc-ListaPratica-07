package ClassesQuestao04;

public class DiagonalPrincipal {

    public static void print(double[][] matriz) {
        System.out.println("Valores da diagonal principal:");
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                if (i == j)
                    System.out.printf("%.2f " , matriz[i][j]);
            }
        }

    }


}
