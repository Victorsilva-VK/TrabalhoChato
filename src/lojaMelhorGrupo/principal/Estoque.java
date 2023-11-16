package lojaMelhorGrupo.principal;

import lojaMelhorGrupo.logistica.Geral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque implements Geral{

    private List<Produto> cria;
    private int quantidade;
    private String armazem;
    private String numeroDaPrateleira;

    private String nomeDoEstoque;

    private int quantidadeProdutos;

    private int quantidadeDeEstoques;
    private static int quebraLoopEstoque;
    private String nomeDoProduto;


    // Area dos Construtores

    public Estoque(){}

    public Estoque(int quantidade, String armazem, String numeroDaPrateleira, String nomeDoEstoque, String nomeDoProduto) {
        this.quantidade = quantidade;
        this.armazem = armazem;
        this.numeroDaPrateleira = numeroDaPrateleira;
        this.nomeDoEstoque = nomeDoEstoque;
        this.nomeDoProduto = nomeDoProduto;
    }

    // area das listas

    private List<Estoque> estoques = new ArrayList<>();
    List<Produto> produtos = Produto.getProdutos();

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

    public String getNomeDoEstoque() {
        return nomeDoEstoque;
    }

    public void setNomeDoEstoque(String nomeDoEstoque) {
        this.nomeDoEstoque = nomeDoEstoque;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public int getQuantidadeDeEstoques() {
        return quantidadeDeEstoques;
    }

    public void setQuantidadeDeEstoques(int quantidadeDeEstoques) {
        this.quantidadeDeEstoques = quantidadeDeEstoques;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    // Area dos Metodos

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do estoque: ");
        String nomeDoEstoque = scanner.nextLine();
        setNomeDoEstoque(nomeDoEstoque);

        System.out.print("Digite a quantidade de produtos a serem adicionados ao estoque: ");
        quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;

        for (Produto produto : produtos) {
            System.out.println("\nDigite o nome do Produto: ");
            this.nomeDoProduto = scanner.nextLine();

            if (produto.getNomeProduto().equalsIgnoreCase(nomeDoProduto)) {
                produtoEncontrado = produto;

                System.out.println("Digite o nome do Armazém:");
                this.armazem = scanner.nextLine();


                System.out.println("Digite o número da prateleira:");
                this.numeroDaPrateleira = scanner.nextLine();


                System.out.print("Digite a quantidade do produto: ");
                this.quantidade = scanner.nextInt();
                scanner.nextLine();

                Estoque gera = new Estoque(quantidade,armazem,numeroDaPrateleira,nomeDoEstoque,nomeDoProduto);
                estoques.add(gera);

                System.out.println("\nProduto registrado com sucesso!");
                System.out.println("\nInformações: ");
                System.out.println("\n***********************");
                System.out.println("Armazem: " + getArmazem());
                System.out.println("Produto: " + produto.getNomeProduto());
                System.out.println("quantidade: " + getQuantidade());
                System.out.println("Prateleira: " + getNumeroDaPrateleira());
                System.out.println("***********************");

            }
        }

        if (produtoEncontrado != null) {
        } else {
            System.out.println("Produto com o nome '" + nomeDoProduto + "' não encontrado na lista de produtos.");
        }
    }

    public void listar(){
        Scanner listando = new Scanner(System.in);
        System.out.println("************* Estoque " + getNomeDoEstoque() + " ***********************");
        for (Estoque gera: estoques){
            System.out.println("\n*********************");
            System.out.println("Nome do produto: " + gera.getNomeDoProduto());
            System.out.println("Armazem: " + gera.getArmazem());
            System.out.println("quantidade: " + gera.getQuantidade());
            System.out.println("Prateleira: " + gera.getNumeroDaPrateleira());
            System.out.println("*********************");
        }
    }

    @Override
    public void buscar() {
        Scanner atualiza = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja atualizar no estoque: ");
        String nome = atualiza.nextLine();
        for (Estoque gera: estoques){
            if (gera.getNomeDoProduto().equalsIgnoreCase(nome)){
                System.out.println("Produto encontrado. Atualize: ");

                System.out.println("Nome: ");
                String novoNomeDoProduto = atualiza.nextLine();
                gera.setNomeDoProduto(novoNomeDoProduto);

                System.out.println("Armazem: ");
                String novoArmazem = atualiza.nextLine();
                gera.setArmazem(novoArmazem);

                System.out.println("prateleira: ");
                String novoNumeroDaPrateleira = atualiza.nextLine();
                gera.setNumeroDaPrateleira(novoNumeroDaPrateleira);

                System.out.println("Quantiade: ");
                int novaQuantidade = atualiza.nextInt();
                gera.setQuantidade(novaQuantidade);

                System.out.println("Produto no estoque atualizado com sucesso!");
            }
        }
    }

    @Override
    public void deletar() {
        Scanner deletaEstoque = new Scanner(System.in);
        for (Estoque gera: estoques){
            System.out.println("Digite o nome do produto que deseja excluir do estoque: ");
            String nomeDeletado = deletaEstoque.nextLine();

            if (gera.getNomeDoProduto().equalsIgnoreCase(nomeDeletado)){
                System.out.println("\n*********************");
                System.out.println("Nome do produto: " + gera.getNomeDoProduto());
                System.out.println("Armazem: " + gera.getArmazem());
                System.out.println("quantidade: " + gera.getQuantidade());
                System.out.println("Prateleira: " + gera.getNumeroDaPrateleira());
                System.out.println("*********************");
                System.out.println("\nTem certeza que deseja deletar este produto do estoque?(S/N)");
                String certeza = deletaEstoque.nextLine().toLowerCase();

                if (certeza.equals("s")){
                    estoques.remove(gera);
                    System.out.println("Produto deletado do estoque com sucesso.");
                    return;
                }
            }
        }
        System.out.println("\n Produto no estoque'" + getNomeDoEstoque() + " de nome '" + getNomeDoProduto() + "' não foi encontrado.");
    }


    public void executarLoopEstoque() {
        while (quebraLoopEstoque!= 5) {
            Scanner ler = new Scanner(System.in);
            Introducao cEstoque = new Introducao();
            quebraLoopEstoque = ler.nextInt();

            switch (quebraLoopEstoque){

                case 1:
                    cadastrar();
                    System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 2:
                    buscar();
                    System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 3: listar();
                    System.out.println(cEstoque.getMenuEstoque());
                    break;
                case 4:
                    deletar();
                    System.out.println(cEstoque.getMenuEstoque());
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
