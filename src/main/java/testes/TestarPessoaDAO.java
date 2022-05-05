package testes;

import dao.PessoaDAO;
import modelo.Pessoa;

public class TestarPessoaDAO {
    PessoaDAO pdao = new PessoaDAO();

    public void listarPessoas(){
        System.out.println("Lista de pessoas:");
        for (Pessoa p : pdao.retornarPessoas()){
            System.out.println(p);
        }
        System.out.println("Fim da lista de pessoas");
    }
    public static void main(String[] args) {
        TestarPessoaDAO teste = new TestarPessoaDAO();

        System.out.println("* Listar pessoas");
        teste.listarPessoas();

        System.out.println("* Incluir pessoa");
        System.out.println(teste.pdao.incluirPessoa(new Pessoa("12345678910", "jose da Silva",
                "teste@gmail.com", "47 9 92332 3332")));
        teste.listarPessoas();

        System.out.println("* Remover pessoa");
        System.out.println(teste.pdao.removerPessoa("João da Silva"));
        teste.listarPessoas();

        System.out.println("FIM DOS TESTES");
    }
}
