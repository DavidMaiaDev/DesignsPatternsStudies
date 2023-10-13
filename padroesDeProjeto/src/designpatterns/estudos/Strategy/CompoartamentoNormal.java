package designpatterns.estudos.Strategy;

public class CompoartamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
