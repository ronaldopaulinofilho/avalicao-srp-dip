package exercicio.promocoes;


import exercicio.models.produto.Produto;

public class SemPromocao implements PromocaoInterface {

    public void aplicar(Produto produto){
        System.out.println("Você não se enquadra em nenhuma promoção");
        produto.setPreco(produto.getPreco());
    }

}
