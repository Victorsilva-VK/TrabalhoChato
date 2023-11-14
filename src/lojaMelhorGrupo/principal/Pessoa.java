package lojaMelhorGrupo.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
   private String id;
   private String nomePessoal;
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
   private String dataNascimento;

   // Configuração da data
    LocalDateTime dataCadastroPessoa = LocalDateTime.now();
    DateTimeFormatter dataEstilosa = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    private String dataFormatada = dataCadastroPessoa.format(dataEstilosa);

    // Area dos Construtores

    public Pessoa() {
        super();
    }
    public Pessoa(String id, String nomePessoal, String cnpj, String logradouro, String bairro, String cidade, String estado, String cep, String cpf, String rg, String telefone, String email, String dataNascimento, String dataFormatada) {
        this.id = id;
        this.nomePessoal = nomePessoal;
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
        this.dataNascimento = dataNascimento;
        this.dataFormatada = dataFormatada;
    }


    // Area dos Gets and Sets


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomePessoal() {
        return nomePessoal;
    }

    public void setNomePessoal(String nomePessoal) {
        this.nomePessoal = nomePessoal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}