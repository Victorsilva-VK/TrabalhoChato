package lojaMelhorGrupo.principal;

import com.sun.tools.javac.Main;
import lojaMelhorGrupo.console.Lobby;
import lojaMelhorGrupo.logistica.Geral;
import lojaMelhorGrupo.principal.Produto;

import java.util.Scanner;

public class Introducao {
    private int quebraLoop;
    private int voltar;
    private String menu = """
                \n********** Armazem Melhor Grupo **********
                
                Escolha:
                
                1- Gerenciar Produto.
                2- Gerenciar Estoque.
                3- Opções para Fornecedor.
                4- Sobre Nós.
                5- Sair.
                \n******************************************
                """;

    private String menuProduto = """
                \n ***********
                
                1- Cadastrar Produto.
                2- Buscar Produto por nome.
                3- Listar Produtos.
                4- Deletar Produtos.
                5- Voltar.
                \n ***********
                """;

    private String menuEstoque = """
                \n ***********
                
                1- Atualizar Estoque de produtos.
                2- Adicionar Estoque de Produtos.
                3- Remover Estoque de produtos.
                4- Listar Produtos disponiveis.
                5- Voltar.
                \n ***********
                """;

    private String menuFornecedor = """
                \n ***********
                
                1- Cadastrar Fornecedor.
                2- Buscar Fornecedor por Nome.
                3- Listar Fornecedor.
                4- Deletar Fornecedor.
                5- Voltar.
                \n ***********
                """;

    private String sobreNos = """
            \n **********************
            
                     Sócios:
                        
                  Victor Silva
                   Pedro Luiz
                  Elton Vinicius
                 Melanni Eduarda
                Guilherme Antonino
            \n **********************
            """;

    // Area dos Constructors

    public Introducao() {
        quebraLoop = 0;
    }

    // Area dos Gets and setters

    public String getMenu() {
        return menu;
    }

    public String getMenuProduto() {
        return menuProduto;
    }

    // area dos metodos

    Scanner ler = new Scanner(System.in);

    public void executarMenu(){
        System.out.println(getMenu());
    }

    public void voltarvoltar(){
        if (voltar == 5) {
            introduz();
        }
    }

    public void introduz(){
        executarMenu();
        executarLoop();
    }

    public void executarLoop(){
        while (quebraLoop != 5) {

            quebraLoop = ler.nextInt();

            switch (quebraLoop){

                case 1:
                    System.out.println(menuProduto);
                    Produto faz = new Produto();
                    faz.executarLoopProduto();
                    voltarvoltar();
                    break;
                case 2:
                    System.out.println(menuEstoque);
                    voltarvoltar();
                    break;
                case 3:
                    System.out.println(menuFornecedor);
                    voltarvoltar();
                    break;
                case 4:
                    System.out.println(sobreNos);
                    voltarvoltar();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Voce escolheu um numero invalido.");
                    executarMenu();
            }
        }
    }


}
