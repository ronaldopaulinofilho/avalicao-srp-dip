package exercicio;

import exercicio.models.cliente.Cliente;
import exercicio.models.produto.Produto;
import exercicio.promocoes.PromocaoFuncionario;
import exercicio.promocoes.PromocaoPessoaFisica;
import exercicio.promocoes.PromocaoPessoaJuridica;
import exercicio.validacoes.ValidarProdutoNulo;
import exercicio.validacoes.ValidarCreditoCliente;
import exercicio.validacoes.ValidarQuantidadeProdutoEmEstoque;

import static exercicio.models.cliente.TipoCliente.*;
import static exercicio.TipoProduto.PADRAO;
import static exercicio.TipoProduto.SERVICO;

public class Venda {

    public Produto produto;
    public Cliente cliente;

    public Venda(Cliente cliente, Produto produto) {
        this.produto = produto;
        this.cliente = cliente;
    }
}
