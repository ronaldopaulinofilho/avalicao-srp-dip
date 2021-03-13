package exercicio.validacoes;

import exercicio.Venda;

public class ValidarCreditoCliente implements ValidaVendaInterface{

    public void validar(Venda venda){
        if (venda.cliente.getCredito() < venda.produto.getPreco())
            throw new RuntimeException(" O cliente não possui crédito suficiente!");
    }
}
