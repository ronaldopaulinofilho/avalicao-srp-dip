package exercicio;

import exercicio.models.cliente.Cliente;
import exercicio.models.cliente.RepositorioArrayDeCliente;
import exercicio.models.cliente.RepositorioDeClienteInterface;
import exercicio.models.cliente.TipoCliente;
import exercicio.models.imposto.ImpostoFactory;
import exercicio.models.imposto.ImpostoInterface;
import exercicio.models.produto.Produto;
import exercicio.models.produto.RepositorioArrayDeProduto;
import exercicio.models.produto.RepositorioDeProdutoInterface;
import exercicio.models.produto.TipoProduto;
import exercicio.promocoes.PromocaoFactory;
import exercicio.promocoes.PromocaoInterface;
import exercicio.validacoes.ValidaVenda;
import terminal.EntradaTerminal;

public class Venda {
    public Produto produto;
    public Cliente cliente;
    RepositorioDeProdutoInterface repositorioDeProduto = new RepositorioArrayDeProduto();
    RepositorioDeClienteInterface repositorioDeCliente = new RepositorioArrayDeCliente();

    public Venda(RepositorioDeProdutoInterface repositorioDeProduto, RepositorioDeClienteInterface repositorioDeCliente) {
        this.repositorioDeProduto = repositorioDeProduto;
        this.repositorioDeCliente = repositorioDeCliente;
    }

    public Venda() {

    }

    public void efetuarVenda(){
        Integer idDoProduto = EntradaTerminal.entradaInteira("Escolha o seu produto!\n 1 - Camisa\n 2 - Calça\n 3 - Meia");
        Produto produto = repositorioDeProduto.buscarPeloId(idDoProduto);
        Integer idDoCliente = EntradaTerminal.entradaInteira("Escolha o seu tipo de Cliente\n 1 - Pessoa Física\n 2- Pessoa Jurídica\n 3 - Funcionário");
        Cliente cliente = repositorioDeCliente.buscarPeloId(idDoCliente);
        TipoCliente tipoDoCliente = cliente.getTipo();
        TipoProduto tipoDoProduto = produto.getTipo();
        PromocaoInterface promocao = PromocaoFactory.criarPromocao(tipoDoCliente);
        ImpostoInterface imposto = ImpostoFactory.gerarImposto(tipoDoProduto);
        imposto.gerar(produto);
        promocao.aplicar(produto);
        cliente.diminuirCredito(produto);
        produto.diminuirQuantidade();

        // 1 (2P) - DIP - Criar Interface de Repositorio de Produto e injeta-la no construtor
        // Obs: Fazer o new na Classe Main
        // Utilizar o exemplo do repositorio de produto
        // 2 (1P) - Acoplamento e testabilidade - Extrair New da classe Venda para a classe Main e Injeta-la no construtor
        // 3 (1P) - Agrupar Acoplamento - Separar classes de validacoes em uma classe com a responsabilidade de instancia-las
        // 4 (2P) - SRP - Criar classes separadas para cada imposto
        // Responsabilidade: Calcular cada imposto separadamente em sua classe
        // 5 (4P) - SRP e DIP - Aplicar Factory e Strategy em promoção
        // Responsabilidade: Separar escolha de promoção para a factory
        // Acoplamento/DIP: Retirar dependencias das classes indivicuais de promocoes
        // fazendo com que a classe atual dependa apenas da interface PromocaoInterface
        // Factory - Chave para dizer qual promocao dar o NEW a partir do cliente carregado
        // Strategy - Utilizado para nunca mais mexer aqui.
        // 7 (0,3P) - Aplicar encapsulamento mandando o produto diminuor 1 quantidade (diminuir estoque)
        // 8 (0,3P) - Transferir metodo para a classe venda (A venda possui tudo o que é utilizado aqui então é responsabilidade apenas dela)
        // Efetuar a venda
        System.out.print("=====\nValor do produto na Venda: " + produto.getPreco() + "\n");
        System.out.print("Credito do cliente na Venda: " + cliente.getCredito() + "\n=====\n");
    }

}




