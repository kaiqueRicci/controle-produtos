-- script para  criaçã de tabela de produtos



CREATE TABLE produtos (
    id             UUID PRIMARY KEY,
    nome           VARCHAR(150) NOT NULL,
    preco          NUMERIC(10, 2) NOT NULL, CHECK ( preco > 0),
    quantidade     INT NOT NULL, CHECK (quantidade >= 0),
    dataHoraCadastro TIMESTAMP NOT NULL,
    categoria      VARCHAR(25) NOT NULL CHECK (
        categoria IN (
                      'INFORMATICA',
                      'ELETRONICOS',
                      'GAMES',
                          'LIVRARIA',
                          'OUTROS'
       )

     )
);


