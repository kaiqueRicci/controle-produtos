package cotiinformatica.services;

import cotiinformatica.entites.Produto;
import cotiinformatica.enums.Categoria;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class ProdutoService {
    /*
    Método para fazer com que o usuário entre com os dados do produto
    para realizar o seu cadastro
     */

    public void cadastrarProduto(){
        //Criando um objeto da classe scaner
        var scanner = new Scanner(System.in);


        //Criando o objeto de classe produto.
        var produto = new Produto();

        produto.id = UUID.randomUUID();
        produto.dataHoraCadastro = LocalDateTime.now();

        System.out.println("\nCADASTRO DE PRODUTOS: \n");

        System.out.print("Informe o nome do Produto: ");
        produto.nome = scanner.nextLine();

        System.out.print("Informe o preço do Produto: ");
        produto.preco = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe a Quantidade do produto: ");
        produto.quantidade = Integer.parseInt(scanner.nextLine());

        for(var item : Categoria.values()){
            System.out.println("\t"  + item);
        }

        System.out.print("INFORME A CATEGORIA: ");
        produto.categoria = Categoria.valueOf( scanner.nextLine().toUpperCase());

        //TODO Gravação em banco de dados.
    }
}
