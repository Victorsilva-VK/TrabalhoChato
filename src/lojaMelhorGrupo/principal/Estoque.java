package lojaMelhorGrupo.principal;

import lojaMelhorGrupo.logistica.Geral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque extends Produto implements Geral {
    private int quantidade;
    private String armazem;
    private String numeroDaPrateleira;

    private int quebraLoopEstoque;

    private List<Estoque> estoques = new ArrayList<>();
    // Area dos Construtores

    public Estoque(){}
    public Estoque(String idProduto, String codigo, String nomeProduto, String descricao, String nomeFornecedor, String dataFormatada, int quantidade, String armazem, String numeroDaPrateleira) {
        super(idProduto, codigo, nomeProduto, descricao, nomeFornecedor, dataFormatada);
        this.quantidade = quantidade;
        this.armazem = armazem;
        this.numeroDaPrateleira = numeroDaPrateleira;
    }


    // Area dos Gets and setters

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getArmazem() {
        return armazem;
    }

    public void setArmazem(String armazem) {
        this.armazem = armazem;
    }

    public String getNumeroDaPrateleira() {
        return numeroDaPrateleira;
    }

    public void setNumeroDaPrateleira(String numeroDaPrateleira) {
        this.numeroDaPrateleira = numeroDaPrateleira;
    }

    // Area dos Metodos

    public void cadastrar(){

    }

    public void executarLoopEstoque() {
        while (quebraLoopEstoque!= 5) {
            Scanner ler = new Scanner(System.in);
            Introducao cEstoque = new Introducao();
            quebraLoopEstoque = ler.nextInt();

            switch (quebraLoopEstoque){

                case 1:
                    System.out.println("Adicionar.");
                    //System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 2:
                    System.out.println("Atualizar");
                    //System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 3:
                    System.out.println("Listar");
                    //System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 4:
                    System.out.println("Deletar");
                    //System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 5:
                    System.out.println("Voltando...");
                    cEstoque.executarMenu();
                    break;
                default:
                    System.out.println("Numero invalido");
            }
        }
    }
}
