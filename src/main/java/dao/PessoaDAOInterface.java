package dao;

import modelo.Pessoa;

import java.util.ArrayList;

public interface PessoaDAOInterface {
    public ArrayList<Pessoa> retornarPessoas();
    public boolean incluirPessoa(Pessoa nova);
    public boolean removerPessoa(String nome);
    public Pessoa buscarPessoa(String nome);
    public boolean AtualizarPessoa(Pessoa novosDados);
}
