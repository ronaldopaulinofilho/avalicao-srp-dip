package promocao;

import exercicio.models.produto.Produto;
import exercicio.promocoes.PromocaoPessoaFisica;
import org.junit.jupiter.api.Test;

import static exercicio.models.produto.TipoProduto.PADRAO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromocaoPessoaFisicaTest {
    @Test
    public void deveDiminuirEm10(){
        Produto produto = new Produto(2, "produto1", 100, PADRAO, 1);
        new PromocaoPessoaFisica().aplicar(produto);
        assertEquals(90, produto.getPreco());
    }
}
