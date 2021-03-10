package exercicio.models.cliente;

import exercicio.models.produto.Produto;

public interface RepositorioDeClienteInterface {

    public Cliente buscarPeloId(Integer idDoCLiente);

}
