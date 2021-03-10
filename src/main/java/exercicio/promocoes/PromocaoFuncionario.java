package exercicio.promocoes;

import exercicio.models.produto.Produto;

public class PromocaoFuncionario {

    public void aplicar(Produto produto){
        produto.setPreco(produto.getPreco() - 30);
    }
}
