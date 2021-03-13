package exercicio.validacoes;

import exercicio.Venda;

public class ValidarProdutoNulo implements ValidaVendaInterface {

    public void validar(Venda venda){
        if(venda.produto.getId() == null)
            throw new RuntimeException(" O id é nulo");
    }
}
