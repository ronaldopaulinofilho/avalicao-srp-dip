package exercicio;

import exercicio.models.cliente.RepositorioArrayDeCliente;
import exercicio.models.cliente.RepositorioDeClienteInterface;
import exercicio.models.produto.RepositorioArrayDeProduto;
import exercicio.models.produto.RepositorioDeProdutoInterface;

public class Main {
    private Integer idTipoCliente;
    private Integer idDoProduto;

    public static void main(String[] args) throws Exception {
        RepositorioDeProdutoInterface repositorioDeProduto = new RepositorioArrayDeProduto();
        RepositorioDeClienteInterface repositorioDeCliente = new RepositorioArrayDeCliente();
        Venda venda = new Venda(repositorioDeProduto, repositorioDeCliente);
        ValidaVenda validaVenda = new ValidaVenda();
        validaVenda.validar(venda);
        venda.efetuarVenda();

    }


}
