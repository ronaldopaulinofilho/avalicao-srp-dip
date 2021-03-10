package exercicio;

import exercicio.models.produto.RepositorioArrayDeProduto;
import exercicio.models.produto.RepositorioDeProdutoInterface;

public class Main {


    private Integer idTipoCliente;
    private Integer idDoProduto;

    public static void main(String[] args) throws Exception {
        RepositorioDeProdutoInterface repositorioArrayDeProduto = new RepositorioArrayDeProduto();
        new VendaService(repositorioArrayDeProduto).processarVenda();
    }

}
