package controller;

public class LinhaSomaThread extends Thread {
    private int[] linha;
    private int idLinha;

    public LinhaSomaThread(int[] linha, int idLinha) {
        this.linha = linha;
        this.idLinha = idLinha;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int num : linha) {
            soma += num;
        }
        System.out.println("Linha " + idLinha + " - Soma: " + soma);
    }
}