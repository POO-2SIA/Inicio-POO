package exercicio03;

public class Ponto {
    // atributos ou variáveis de instância
    int x;
    int y;

    // método para calcular e retornar a distância entre dois pontos
    public double calcularDistancia(Ponto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }

    // método para calcular e retornar a distância do ponto até a origem
    public double calcularDistanciaAteOrigem() {
        Ponto p = new Ponto();
        p.x = 0;
        p.y = 0;
        double distancia = calcularDistancia(p);
        return distancia;
    }

    // método para retornar os dados no formato (x, y)
    public String pontoFormatado() {
        return "(" + x + ", " + y + ")";
    }

    // método para retornar o objeto mais próximo da origem
    public Ponto maisProximoDaOrigem(Ponto p1, Ponto p2) {
        double dp1 = p1.calcularDistanciaAteOrigem();
        double dp2 = p2.calcularDistanciaAteOrigem();
        if(dp1 < dp2) {
            return p1;
        }
        return p2;
    }

}
