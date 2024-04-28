package ClassesQuestao04;

public class ImprimirMatriz {

    public static void print(double[][] matriz) {
        System.out.println("Matriz:");
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                System.out.printf("%5.2f " , matriz[i][j]);
            }
            System.out.println();
        }
    }
}
