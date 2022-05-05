package testes;

import modelo.Pessoa;

public class TestarPessoa {
    public static void main(String[] args) {
        System.out.println("Teste de pessoa");
        Pessoa p = new Pessoa("12345678910", "Teste teste",
                "teste@teste.com", "47 909912120");
        System.out.print(p);
    }
}
