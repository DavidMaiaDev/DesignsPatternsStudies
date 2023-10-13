package designpatterns.estudos.subsistema2.cep;


public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperaEstado(String cep){
        return "PB";
    }
    public String recuperarCidade(String cep){
        return "Pirpirituba";
    }
}

