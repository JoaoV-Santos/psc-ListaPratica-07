package ClassesQuestao04;

public class DiagonalSecundaria {

        public static void print (double[][] matriz) {
            System.out.println("Valores da diagonal secundária:");
            for (int i = 0; i<4; i++) {
                for (int j = 0; j<4; j++) {
                    if (i + j == 4-1)
                        System.out.printf("%.2f " , matriz[i][j]);
                }
            }


        }

}
