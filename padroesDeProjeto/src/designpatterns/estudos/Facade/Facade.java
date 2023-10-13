package designpatterns.estudos.Facade;

import designpatterns.estudos.subsistema1.crm.CrmService;
import designpatterns.estudos.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperaEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
