package cotiinformatica.repositories;

import cotiinformatica.entites.Produto;

import java.sql.DriverManager;

public class ProdutoRepository {

    public void inserir(Produto produto) {
        var host = "jdbc:postgresql://localhost:5434/controle_produtos";
        var user = "postgres";
        var pass = "postgres";

        try ( var connection = DriverManager.getConnection(host, user, pass)){

            var query = """
                    INSERT INTO produtos(id, nome, preco, quantidade, dataHoraCadastro, categoria)
                    VALUES(?,?,?,?,?,?) 
                    """;

            var statement = connection.prepareStatement(query);
            statement.setObject(1, produto.id);
            statement.setObject(2, produto.nome);
            statement.setObject(3, produto.preco);
            statement.setObject(4, produto. quantidade);
            statement.setObject(5, produto.dataHoraCadastro);
            statement.setObject(6, produto.categoria.toString());
            statement.execute();
            System.out.println("\nPRODUTO CADASTRADO COM SUCESSO!");

        }

        catch (Exception e) {
            System.out.println("\nFALHA AO INSERIR O PRODUTO.");
            System.out.println("ERRO: " + e.getMessage());


        }
    }
}
