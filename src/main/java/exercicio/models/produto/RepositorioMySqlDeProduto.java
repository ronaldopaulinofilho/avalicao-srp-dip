package exercicio.models.produto;

import java.util.ArrayList;

public class RepositorioMySqlDeProduto implements RepositorioDeProdutoInterface{

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public RepositorioMySqlDeProduto() {

    }

    public Produto buscarPeloId(Integer idDoProduto) {
        // new COnnection
        // findById()
        return null;
    }
}
