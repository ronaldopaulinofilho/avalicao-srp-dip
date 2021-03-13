package exercicio.promocoes;

import exercicio.models.produto.Produto;

public class PromocaoPessoaJuridica implements PromocaoInterface {

    public void aplicar(Produto produto){
        produto.setPreco(produto.getPreco() - 20);
    }
}
