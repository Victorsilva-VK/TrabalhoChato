package lojaMelhorGrupo.principal;

import lojaMelhorGrupo.logistica.Geral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class Fornecedor extends Pessoa {

    private int idFornecedor;
    private String nomeFornecedor;
    private String cnpj;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String cpf;
    private String rg;
    private String telefone; 
    private String email;
    LocalDateTime dataCadastro = LocalDateTime.now();
    DateTimeFormatter dataEstilosa = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    private String dataFormatada = dataCadastro.format(dataEstilosa);
    LocalDateTime dataNascimento = LocalDateTime.now();
    DateTimeFormatter dataEstilosa2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    private String dataFormatada2 = dataCadastro.format(dataEstilosa);

    private boolean continuarCadastro = true;

    // Area dos construtores
    public Fornecedor() {
    }

    public Produto(int idFornecedor, String nomeFornecedor, String cnpj, String logradouro, String bairro, String cidade, String estado, String cep, String cpf, String rg, String telefone, String email, String dataFormatada, String dataFormatada2)
    this.idFornecedor = idFornecedor;
    this.nomeFornecedor = nomeFornecedor;
    this.cnpj = cnpj;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
    this.cpf = cpf;
    this.rg = rg;
    this.telefone = telefone;
    this.email = email;
    this.dataFormatada = dataFormatada;
    this.dataFormatada2 = dataFormatada2;

}
