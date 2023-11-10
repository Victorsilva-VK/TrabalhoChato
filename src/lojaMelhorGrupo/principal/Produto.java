package lojaMelhorGrupo.principal;

import lojaMelhorGrupo.logistica.Geral;

import java.util.Scanner;

public class Produto implements Geral{

    private String idProduto;
    private String codigo;
    private String nomeProduto;
    private String descricao;
    private String fornecedor;
    private String dataCadastro;

    private int quebraLoopProduto;


    // Area dos Contructors


    public Produto() {
    }

    public Produto(String idProduto, String codigo, String nomeProduto, String descricao, String fornecedor, String dataCadastro) {
        this.idProduto = idProduto;
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.dataCadastro = dataCadastro;
    }

    // Area dos Gets and setters


    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
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
    public void cadastrar() {
        Scanner ler = new Scanner(System.in);
        idProduto = validacao("Insira o Id do Produto(maximo: 6): ",7,true);
        codigo = validacao("Insira o codigo(maximo: 5): ", 6, true);
        nomeProduto = validacao("Insira o nome(maximo: 40): ", 40, false);
        descricao = validacao("Insira a descrição(maximo: 60): ", 61, false);
        fornecedor = validacao("Insira o nome do fornecedor(maximo: 20): ", 21, false);
        dataCadastro = validacao("Insira a data(maximo: 8: ", 9, true);

        Produto produto = new Produto(idProduto,codigo,nomeProduto,descricao,fornecedor,dataCadastro);
        String m = ("""
                   \n Produto gerado!
                    \nnome: %s.
                    codigo: %s.
                    id: %s.
                    descrição: %s.
                    fornecedor: %s.
                    data: %s.
                """).formatted(nomeProduto,codigo,idProduto,descricao,fornecedor,dataCadastro);

        System.out.println(m);
    }

    public String validacao(String mensagem, int tamanhoMaximo, boolean numeros){
        Scanner ler = new Scanner(System.in);
        String entrada;

        do {
            System.out.print(mensagem);
            entrada = ler.nextLine();
        } while (!tamanhoPermitido(entrada, tamanhoMaximo) || (numeros && !numeros(entrada)) || (!numeros && !letras(entrada)));

        return entrada;
    }
    public boolean tamanhoPermitido(String string, int tamanhoMaximo) {
        return string.length()<tamanhoMaximo;
    }
    public boolean letras(String string){
        return string.matches("[a-zA-ZçÇáéíóúÁÉÍÓÚâêîôûÂÊÎÔÛäëïöüÄËÏÖÜ. ]+");
    }

    public boolean numeros(String string){
        return string.matches("\\d +");
    }

    Scanner l = new Scanner(System.in);
    public void executarLoopProduto() {
        while (quebraLoopProduto!= 5) {

            quebraLoopProduto = l.nextInt();

            switch (quebraLoopProduto){

                case 1: cadastrar();
                    System.out.println("\nDeseja adicionar mais um produto?");
                    break;
                case 2:
                    System.out.println("buscar");
                    break;
                case 3:
                    System.out.println("Listar");
                break;
                case 4:
                    System.out.println("deletar");
                    break;

                case 5:
                    System.out.println("Voltando...");
                    Introducao c = new Introducao();
                    c.executarMenu();
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }
    }

}

