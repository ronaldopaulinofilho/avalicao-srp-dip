package exercicio.models.produto;

public enum TipoProduto {
    PADRAO(1, "Produto padrao"),
    SERVICO(2, "Produto serviço");

    private int cod;
    private String descricao;

    private TipoProduto(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public static TipoProduto encontrarPeloId(Integer cod){
        if (cod==null){
            return null;
        }
        for (TipoProduto enumAtual : TipoProduto.values()){
            if (cod.equals(enumAtual.getCod())){
                return enumAtual;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + cod);
    }
}
