package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        // entrada de dados
        System.out.print("Nome do jogador: ");
        jogador.nome = sc.nextLine();
        System.out.println("Pontuação: ");
        for(int i = 0; i < jogador.score.length; i++) {
            System.out.print("Rodada " + (i+1) + ": " );
            jogador.score[i] = sc.nextInt();
        }

        // saída de dados
        System.out.println();
        System.out.println("Jogador: " + jogador.nome);
        System.out.println("Pontuação total: " + jogador.calcularScoreTotal());

    }
}
