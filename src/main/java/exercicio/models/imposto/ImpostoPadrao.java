package exercicio.models.imposto;


import exercicio.models.produto.Produto;

public class ImpostoPadrao implements ImpostoInterface {
    @Override
    public void gerar(Produto produto) {
       System.out.println("Aplicando Imposto para o produto escolhido");
       produto.setPreco(produto.getPreco() + 10);
    }
}
