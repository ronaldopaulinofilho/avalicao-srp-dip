package exercicio.validacoes;

import exercicio.Venda;

public class ValidarQuantidadeProdutoEmEstoque {

    public void validar(Venda venda){
        if (venda.produto.getQuantidade() <= 0 )
            throw new RuntimeException(" O produto não possui quantidade suficiente!");
    }
}
