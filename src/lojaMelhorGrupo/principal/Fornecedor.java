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

    }

    @Override
    public void listar() {

    }

    @Override
    public void buscar() {

    }
    @Override
    public void deletar() {

    }
}
