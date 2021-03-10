package exercicio.promocoes;

import exercicio.Venda;
import exercicio.models.produto.Produto;

public class PromocaoPessoaFisica {

    public void aplicar(Produto produto){
        produto.setPreco(produto.getPreco() - 10);
    }
}
