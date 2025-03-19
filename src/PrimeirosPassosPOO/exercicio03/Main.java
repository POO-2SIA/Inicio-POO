package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        // entrada de dados
        System.out.println("Ponto 1");
        System.out.println("Informe as coordenadas:");
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();

        System.out.println("\nPonto 2");
        System.out.println("Informe as coordenadas:");
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();

        // impressão da distância entre os dois pontos
        System.out.println();
        System.out.println("distância do p1 para o p2: " + p1.calcularDistancia(p2));
        System.out.println("distância do p2 para o p1: " + p2.calcularDistancia(p1));

        // impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("distância de p1 até a origem: " + p1.calcularDistanciaAteOrigem());
        System.out.println("distância de p2 até a origem: " + p2.calcularDistanciaAteOrigem());

        // impressão do ponto mais próximo da origem
        System.out.println();
        Ponto maisProximo = p1.maisProximoDaOrigem(p1, p2);
        System.out.println("ponto mais próximo: " + maisProximo.pontoFormatado());
    }
}
