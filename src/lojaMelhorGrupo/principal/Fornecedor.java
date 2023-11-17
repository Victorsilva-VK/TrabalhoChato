package lojaMelhorGrupo.principal;
import lojaMelhorGrupo.logistica.Geral;

public class Fornecedor extends Pessoa implements Geral {

    //  Area dos Atributos

    // Area dos Construtores

    public Fornecedor() {
    }

    public Fornecedor(String id, String nomePessoal, String cnpj, String logradouro, String bairro, String cidade, String estado, String cep, String cpf, String rg, String telefone, String email, String dataNascimento, String dataFormatada) {
        super(id, nomePessoal, cnpj, logradouro, bairro, cidade, estado, cep, cpf, rg, telefone, email, dataNascimento, dataFormatada);
    }

    // Area dos metodos
    @Override
    public void cadastrar() {

        do {
            Scanner faz = new Scanner(System.in);
            System.out.println("Digite o id(6 números): ");
            String id = faz.nextLine();
            System.out.println("Digite o nome do fornecedor: ");
            String nomePessoal = faz.nextLine();
            System.out.println("Digite o cnpj do fornecedor: ");
            String cnpj = faz.nextLine();
            System.out.println("Digite o logradouro do fornecedor: ");
            String logradouro = faz.nextLine();
            System.out.println("Digite o bairro do fornecedor: ");
            String bairro = faz.nextLine();
            System.out.println("Digite a cidade do fornecedor: ");
            String cidade = faz.nextLine();
            System.out.println("Digite o estado do fornecedor: ");
            String estado = faz.nextLine();
            System.out.println("Digite o cep do fornecedor: ");
            String cep = faz.nextLine();
            System.out.println("Digite o cpf do fornecedor: ");
            String cpf = faz.nextLine();
            System.out.println("Digite o rg do fornecedor: ");
            String rg = faz.nextLine();
            System.out.println("Digite o telefone do fornecedor: ");
            String telefone = faz.nextLine();
            System.out.println("Digite o email do fornecedor: ");
            String email = faz.nextLine();
            System.out.println("Digite a data de nascimento do fornecedor: ");
            String dataNascimento = faz.nextLine();
            System.out.println("Digite a data de cadastro do fornecedor: ");
            String dataFormatada = faz.nextLine();

            Fornecedor criaFornecedor = new Fornecedor(id, nomePessoal, cnpj, logradouro, bairro, cidade, estado, cep, cpf, rg, telefone, email, dataNascimento, dataFormatada); 
            Fornecedor.add(criaFornecedor);
            System.out.println("\nFornecedor cadastrado com sucesso.");
            System.out.println("\nDeseja criar outro produto?(S/N)");
            String resposta = faz.nextLine().toLowerCase();

            if (resposta.equals("n")) {
                continuarCadastro = false;                
            }

        } while (continuarCadastro);

    }

    @Override
    public void listar() {
        Scanner escolha = new Scanner(System.in);
        System.out.println("Deseja a lista: \n\n1-Simplificada. \nDetalhada. ");
        int facilidade = escolha.nextInt();

        if (facilidade == 1) {
            system.out.println("Fornecedores registrados: ");
                for (Fornecedor criaFornecedor: fornecedor) {
                    System.out.println("\n*********************");
                    System.out.println("Id:" + criaFornecedor.getId());
                    System.out.println("Nome do fornecedor: " + criaFornecedor.getNomePessoal());
                    System.out.println("CPF: " + criaFornecedor.getCpf());
                    System.out.println("Email: " + criaFornecedor.getEmail());
                    System.out.println("*********************");
                }
        } else if (facilidade == 2) {
            system.out.println("Fornecedores registrados: ");
            for (Fornecedor criaFornecedor: fornecedor) {
                System.out.println("\n*********************");
                    System.out.println("Nome do fornecedor: " + criaFornecedor.getNomePessoal());
                    System.out.println("Id:" + criaFornecedor.getId());
                    System.out.println("CNPJ:" + criaFornecedor.getCnpj());
                    System.out.println("Logradouro:" + criaFornecedor.getLogradouro());
                    System.out.println("Bairro:" + criaFornecedor.getBairro());
                    System.out.println("Cidade: " + criaFornecedor.getCidade());
                    System.out.println("Estado: " + criaFornecedor.getEstado());
                    System.out.println("CEP: " + criaFornecedor.getCep());
                    System.out.println("CPF: " + criaFornecedor.getCpf());
                    System.out.println("RG: " + criaFornecedor.getRg());
                    System.out.println("Telefone: " + criaFornecedor.getTelefone());
                    System.out.println("Email: " + criaFornecedor.getEmail());
                    System.out.println("Data de nascimento: " + criaFornecedor.getDataNascimento());
                    System.out.println("Data de cadastro: " + criaFornecedor.getDataFormatada());
                    System.out.println("*********************");
            }
        }

    }

    @Override
    public void buscar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        String nomeProcurado = scanner.nextLine();

        for (Fornecedor fornecedor : Fornecedores) {
            if (fornecedor.getNomePessoal().equals(nomeProcurado)) {
                System.out.println("\nFornecedor encontrado: " + fornecedor.getNomePessoal());
                System.out.println("\n*********************");
                System.out.println("Id: " + fornecedor.getId());
                System.out.println("CNPJ: " + fornecedor.getCnpj());
                System.out.println("Logradouro: " + fornecedor.getLogradouro());
                System.out.println("Bairro: " + fornecedor.getBairro());
                System.out.println("Cidade: " + fornecedor.getCidade());
                System.out.println("Estado: " + fornecedor.getEstado());
                System.out.println("CEP: " + fornecedor.getCep());
                System.out.println("CPF: " + fornecedor.getCpf());
                System.out.println("RG: " + fornecedor.getRg());
                System.out.println("Telefone: " + fornecedor.getTelefone());
                System.out.println("Email: " + fornecedor.getEmail());
                System.out.println("Data de nascimento: " + fornecedor.getDataNascimento());
                System.out.println("Data de cadastro: " + fornecedor.getDataFormatada());
                System.out.println("*********************");


            }
       }

       System.out.println("\nFornecedor com nome" + nomeProcurado + "não encontrado.");
    }
    @Override
    public void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do fornecedor: ");
        String nomeDelete = scanner.nextLine();

        for (Fornecedor f : fornecedores) {
            if (f.getNomePessoal().equals(nomeDelete)) {
                System.out.println("\nFornecedor encontrado: ");
                System.out.println("\n*********************");
                System.out.println("Nome do fornecedor: " + f.getNomePessoal());
                System.out.println("Id: " + f.getId());
                System.out.println("CNPJ: " + f.getCnpj());
                System.out.println("Logradouro: " + f.getLogradouro());
                System.out.println("Bairro: " + f.getBairro());
                System.out.println("Cidade: " + f.getCidade());
                System.out.println("Estado: " + f.getEstado());
                System.out.println("CEP: " + f.getCep());
                System.out.println("CPF: " + f.getCpf());
                System.out.println("RG: " + f.getRg());
                System.out.println("Telefone: " + f.getTelefone());
                System.out.println("Email: " + f.getEmail());
                System.out.println("Data de nascimento: " + f.getDataNascimento());
                System.out.println("Data de cadastro: " + f.getDataFormatada());
                System.out.println("*********************");
                System.out.println("\nTem certeza que deseja deletar este fornecedor? (S/N)");
                String certeza = scanner.nextLine().toLowerCase();

                if (certeza.equals("s")) {
                    fornecedores.remove(f);
                    System.out.println("\nFornecedor deletado com sucesso.");
                    return;
                }
            }
        }
        System.out.println("\nFornecedor com nome" + nomeDelete + "não encontrado.");

    }

    public void executarLoopFornecedor() {
        while (quebraLoopFornecedor!= 5) {
            Scanner ler = new Scanner(System.in);
            Introducao c = new Introducao();
            quebraLoopFornecedor = ler.nextInt();

            switch (quebraLoopFornecedor) {
                case 1:
                    cadastrar();
                    System.out.println(c.getMenuFornecedor());
                    break;
                case 2:

                    buscar();
                    System.out.println(c.getMenuFornecedor());
                    break;

                case 3:

                    listar();
                    System.out.println(c.getMenuFornecedor());
                    break;

                case 4:

                    deletar();
                    System.out.println(c.getMenuFornecedor());
                    break;

                case 5:

                    System.out.println("Voltando...");
                    c.executarMenu();
                    break;
            
                default:
                    System.out.println("Número invalido.");
            }
        }
    }
}

