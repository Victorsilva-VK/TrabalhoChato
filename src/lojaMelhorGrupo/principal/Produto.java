package lojaMelhorGrupo.principal;

import lojaMelhorGrupo.logistica.Geral;

import java.util.Scanner;

public class Produto implements Geral{
    private String Idproduto;
    private String codigo;
    private String nomeProduto;
    private String descricao;
    private String fornecedor;
    private String dataCadastro;

    private int quebraLoopProduto =0;


    // Area dos Contructors

    // Area dos Gets and setters
    public String getIdproduto() {
        return Idproduto;
    }

    public void setIdproduto(String idproduto) {
        Idproduto = idproduto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    // Area dos metodos


    @Override
    public String cadastrar() {
        Scanner cria = new Scanner(System.in);
        System.out.println("insira o id do produto:");
        String idProduto = cria.nextLine();
        System.out.println("O valor foi: " + getIdproduto());
        cria.close();
        return (idProduto);

    }





}
