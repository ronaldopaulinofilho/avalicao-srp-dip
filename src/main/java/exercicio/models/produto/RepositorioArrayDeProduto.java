package exercicio.models.produto;

import java.util.ArrayList;
import java.util.Optional;

import static exercicio.models.produto.TipoProduto.PADRAO;
import static exercicio.models.produto.TipoProduto.SERVICO;


public class RepositorioArrayDeProduto implements RepositorioDeProdutoInterface{

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public RepositorioArrayDeProduto() {
        Produto camisa = new Produto(1, "Camisa",  100, PADRAO,10);
        Produto bermuda = new Produto(2, "Bermuda", 50, SERVICO, 10);
        Produto meia = new Produto(3, "Meia", 20, PADRAO,10);

        produtos.add(camisa);
        produtos.add(bermuda);
        produtos.add(meia);
    }

    public Produto buscarPeloId(Integer idDoProduto) {
        if(idDoProduto == null)
            throw new RuntimeException("A busca nao aceita nulo!");

        Optional<Produto> produto = produtos.stream()
                .filter(prod -> prod.getId() == idDoProduto).findFirst();
        return produto.get();
    }
}
