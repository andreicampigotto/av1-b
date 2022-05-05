package dao;

import modelo.Compania;

import java.util.ArrayList;

public interface CompaniaDAOInterface {
    public ArrayList<Compania> retornarCompanias();
    public boolean incluirCompania(Compania nova);
//    public boolean removerCompania(String nome);
//    public Compania buscarCompania(String nome);
//    public boolean AtualizarCompania(Compania novosDados);
}
