package exercicio.models.imposto;

import exercicio.models.produto.TipoProduto;

import static exercicio.models.produto.TipoProduto.PADRAO;
import static exercicio.models.produto.TipoProduto.SERVICO;

public class ImpostoFactory {
    public static ImpostoInterface gerarImposto(TipoProduto tipoProduto) {
        if (PADRAO.equals(tipoProduto)) {
            return new ImpostoPadrao();
        } else if (SERVICO.equals(tipoProduto)) {
            return new ImpostoServico();
        }
        return new ImpostoPadrao();
    }
}
