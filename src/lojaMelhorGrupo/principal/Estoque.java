package lojaMelhorGrupo.principal;

public class Estoque{
    private int quantidade;
    private String armazem;
    private int numeroDaPrateleira;

    private Produto produto;


    // Area dos Construtores


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

    public int getNumeroDaPrateleira() {
        return numeroDaPrateleira;
    }

    public void setNumeroDaPrateleira(int numeroDaPrateleira) {
        this.numeroDaPrateleira = numeroDaPrateleira;
    }
}
