package imposto;

import exercicio.models.imposto.ImpostoPadrao;
import exercicio.models.produto.Produto;
import org.junit.jupiter.api.Test;

import static exercicio.models.produto.TipoProduto.PADRAO;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ImpostoPadraoTest {
        @Test
        public void deveAumentarEm10Reais(){
            Produto produto = new Produto(1, "produto2", 100, PADRAO,2);
            new ImpostoPadrao().gerar(produto);
            assertEquals(110, produto.getPreco());
        }
    }
