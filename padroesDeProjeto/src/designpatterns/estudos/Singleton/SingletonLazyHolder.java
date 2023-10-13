package designpatterns.estudos.Singleton;

import static designpatterns.estudos.Singleton.SingletonLazyHolder.InstanceHolder.instancia;

/**
 * Singleton "Lazy Holder".
 */
public class SingletonLazyHolder {
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return instancia;
    }
    static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
}