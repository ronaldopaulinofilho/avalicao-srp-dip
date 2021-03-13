package promocao;

import exercicio.models.produto.Produto;
import exercicio.promocoes.PromocaoPessoaJuridica;
import org.junit.jupiter.api.Test;

import static exercicio.models.produto.TipoProduto.PADRAO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromocaoPessoaJuridicaTest {
    @Test
    public void deveDiminuirEm20(){
        Produto produto = new Produto(2, "produto1", 100, PADRAO, 1);
        new PromocaoPessoaJuridica().aplicar(produto);
        assertEquals(80, produto.getPreco());
    }
}
