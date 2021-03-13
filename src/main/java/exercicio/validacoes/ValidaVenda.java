package exercicio.validacoes;

import exercicio.Venda;

public  class ValidaVenda implements ValidaVendaInterface {
    public void validar(Venda venda) {
        new ValidarProdutoNulo();
        new ValidarCreditoCliente();
        new ValidarQuantidadeProdutoEmEstoque();
    }
        }