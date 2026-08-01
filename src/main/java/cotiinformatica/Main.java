package cotiinformatica;

import cotiinformatica.repositories.ProdutoRepository;
import cotiinformatica.services.ProdutoService;

public class Main {
    static void main() {


        //Criando um objeto da classe de serviço.
        var produtoService = new ProdutoService();

        //Executando o método para cadastrar o produto.
        produtoService.cadastrarProduto();
    }
}
