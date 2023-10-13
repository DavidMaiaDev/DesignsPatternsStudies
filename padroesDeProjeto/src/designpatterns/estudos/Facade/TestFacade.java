package designpatterns.estudos.Facade;

public class TestFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("David", "12345678");
    }
}
