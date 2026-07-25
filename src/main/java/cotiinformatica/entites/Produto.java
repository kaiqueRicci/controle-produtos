package cotiinformatica.entites;

import cotiinformatica.enums.Categoria;

import java.time.LocalDateTime;
import java.util.UUID;

public class Produto {
    public UUID id;
    public String nome;
    public Double preco;
    public  Integer quantidade;
    public LocalDateTime dataHoraCadastro;
    public Categoria categoria;
}
