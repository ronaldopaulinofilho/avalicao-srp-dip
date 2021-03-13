package exercicio.models.imposto;


import exercicio.models.produto.Produto;

public class ImpostoServico implements ImpostoInterface{

    @Override
    public void gerar(Produto produto) {
        System.out.println("Aplicando o Imposto para o produto escolhido");
        produto.setPreco(produto.getPreco()+20);

    }
}
