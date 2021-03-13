package promocao;

import exercicio.models.produto.Produto;
import exercicio.promocoes.PromocaoFuncionario;
import org.junit.jupiter.api.Test;

import static exercicio.models.produto.TipoProduto.PADRAO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromocaoFuncionarioTest {
    @Test
    public void deveDiminuirEm30(){
        Produto produto = new Produto(2, "produto1", 100, PADRAO, 1);
        new PromocaoFuncionario().aplicar(produto);
        assertEquals(70, produto.getPreco());
    }
}
