package view;

import java.util.Random;
import controller.LinhaSomaThread;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        Random random = new Random();

        // Preenchendo a matriz com números aleatórios (0 a 100)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }

        // Criando e iniciando as threads para cada linha da matriz
        for (int i = 0; i < 3; i++) {
            Thread thread = new LinhaSomaThread(matriz[i], i);
            thread.start();
        }
    }
}
