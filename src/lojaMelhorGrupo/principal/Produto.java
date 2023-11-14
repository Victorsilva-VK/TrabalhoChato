package lojaMelhorGrupo.principal;

import lojaMelhorGrupo.logistica.Geral;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Produto implements Geral{

        private String idProduto;
        private String codigo;
        private String nomeProduto;
        private String descricao;
        //private Fornecedor fornecedor;
        private String nomeFornecedor;
        private int quebraLoopProduto;

        // Configurações da Data
        LocalDateTime dataCadastroProduto = LocalDateTime.now();
        DateTimeFormatter dataEstilosa = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        private String dataFormatada = dataCadastroProduto.format(dataEstilosa);

        // Area dos Contructors

        public Produto() {
        }

        public Produto(String idProduto, String codigo, String nomeProduto, String descricao, String nomeFornecedor, String dataFormatada) {
            this.idProduto = idProduto;
            this.codigo = codigo;
            this.nomeProduto = nomeProduto;
            this.descricao = descricao;
            this.nomeFornecedor = nomeFornecedor;
            this.dataFormatada = dataFormatada;
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

        public String getNomeFornecedor() {
            return nomeFornecedor;
        }

        public void setNomeFornecedor(String nomeFornecedor) {
            this.nomeFornecedor = nomeFornecedor;
        }

        public String getDataFormatada() {
            return dataFormatada;
        }

        public void setDataFormatada(String dataFormatada) {
            this.dataFormatada = dataFormatada;
        }

        // Area dos metodos
        private List<Produto> produtos = new ArrayList<>();

        private boolean continuarCadastro = true;
        @Override
        public void cadastrar() {
            while (continuarCadastro){
                Scanner faz = new Scanner(System.in);
                System.out.println("Digite o id(6 números): ");
                idProduto = faz.nextLine();
                System.out.println("Digite o código(4 números: ");
                codigo = faz.nextLine();
                System.out.println("Digite o nome do produto: ");
                nomeProduto = faz.nextLine();
                System.out.println("Descrição do produto: ");
                descricao = faz.nextLine();
                System.out.println("Nome do Fornecedor: ");
                nomeFornecedor = faz.nextLine();

                Produto cria = new Produto(idProduto,codigo,nomeProduto,descricao,nomeFornecedor,dataFormatada);
                produtos.add(cria);
                System.out.println("Produto gerado com sucesso!");
                System.out.println("\nDeseja criar outro protudo?(S/N)");
                String resposta = faz.nextLine().toLowerCase();

                if (resposta.equals("n")) {
                    continuarCadastro = false;
                }
            }
        }

        @Override
        public void listar() {
            Scanner escolha = new Scanner(System.in);
            System.out.println("Deseja a lista:\n\n1-Simplificada.\n2-Detalhada. ");
            int facilidade = escolha.nextInt();

            if (facilidade ==1){
                System.out.println("Produtos registrados:");
                    for (Produto cria: produtos) {
                    System.out.println("\n*********************");
                    System.out.println("Nome do produto: " + cria.getNomeProduto());
                    System.out.println("Id:" + cria.getIdProduto());
                    System.out.println("Fornecedor: "+ cria.getNomeFornecedor());
                    System.out.println("Data: "+cria.getDataFormatada());
                    System.out.println("*********************");
                }

            } else if (facilidade == 2){
                System.out.println("Produtos registrados:");
                for (Produto cria: produtos) {
                    System.out.println("\n*********************");
                    System.out.println("Nome do produto: " + cria.getNomeProduto());
                    System.out.println("Id:" + cria.getIdProduto());
                    System.out.println("Código: " + cria.getCodigo());
                    System.out.println("Descrição: "+ cria.getDescricao());
                    System.out.println("Fornecedor: "+ cria.getNomeFornecedor());
                    System.out.println("Data: "+cria.getDataFormatada());
                    System.out.println("*********************");
                }
            }

        }

       @Override
        public void buscar(){
           Scanner scanner = new Scanner(System.in);
           System.out.print("Digite o nome do produto: ");
           String nomeProcurado = scanner.nextLine();

           for (Produto produto : produtos) {
               if (produto.getNomeProduto().equals(nomeProcurado)) {
                   System.out.println("\nProduto encontrado: " + produto.getNomeProduto());
                   System.out.println("\n*********************");
                   System.out.println("Id:" + produto.getIdProduto());
                   System.out.println("Código: " + produto.getCodigo());
                   System.out.println("Descrição: "+ produto.getDescricao());
                   System.out.println("Fornecedor: "+ produto.getNomeFornecedor());
                   System.out.println("Data: "+ produto.getDataFormatada());
                   System.out.println("*********************");
                   return;
               }
           }

           System.out.println("Produto com o nome '" + nomeProcurado + "' não foi encontrado.");
       }

        @Override
        public void deletar() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do produto: ");
            String nomeDelete = scanner.nextLine();

            for (Produto p : produtos) {
                if (p.getNomeProduto().equals(nomeDelete)) {
                    System.out.println("\nProduto encontrado: ");
                    System.out.println("\n*********************");
                    System.out.println("Nome do produto: " + p.getNomeProduto());
                    System.out.println("Id:" + p.getIdProduto());
                    System.out.println("Código: " + p.getCodigo());
                    System.out.println("Descrição: "+ p.getDescricao());
                    System.out.println("Fornecedor: "+ p.getNomeFornecedor());
                    System.out.println("Data: "+ p.getDataFormatada());
                    System.out.println("*********************");
                    System.out.println("\nTem certeza que deseja deletar este produto?(S/N)");
                    String certeza = scanner.nextLine().toLowerCase();

                    if (certeza.equals("s")) {
                        produtos.remove(p);
                        System.out.println("Produto deletado com sucesso.");
                        return;
                    }

                }
            }
            System.out.println("\nProduto com o ID '" + idProduto + "' não encontrado.");
        }

        public void executarLoopProduto() {
            while (quebraLoopProduto!= 5) {
                Scanner ler = new Scanner(System.in);
                Introducao c = new Introducao();
                quebraLoopProduto = ler.nextInt();

                switch (quebraLoopProduto){

                    case 1:
                        cadastrar();
                        System.out.println(c.getMenuProduto());
                        break;
                    case 2:
                        buscar();
                        System.out.println(c.getMenuProduto());
                        break;
                    case 3:
                        listar();
                        System.out.println(c.getMenuProduto());
                        break;
                    case 4:
                        deletar();
                        System.out.println(c.getMenuProduto());
                        break;
                    case 5:
                        System.out.println("Voltando...");
                        c.executarMenu();
                        break;
                    default:
                        System.out.println("Numero invalido");
                }
            }
        }
    }
