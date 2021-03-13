package imposto;

import exercicio.models.imposto.ImpostoServico;
import exercicio.models.produto.Produto;
import org.junit.jupiter.api.Test;

import static exercicio.models.produto.TipoProduto.SERVICO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImpostoServicoTest {
        @Test
        public void deveAumentarEm20Reais(){
            Produto produto = new Produto(1, "produto2", 100, SERVICO,2);
            new ImpostoServico().gerar(produto);
            assertEquals(120, produto.getPreco());
        }
}
