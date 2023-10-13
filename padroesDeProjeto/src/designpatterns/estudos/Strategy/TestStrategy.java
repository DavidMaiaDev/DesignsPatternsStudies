package designpatterns.estudos.Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        CompoartamentoNormal normal = new CompoartamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
    }
}
