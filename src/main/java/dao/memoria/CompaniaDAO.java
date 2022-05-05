package dao.memoria;

import dao.CompaniaDAOInterface;
import modelo.Compania;

import java.sql.*;
import java.util.ArrayList;

public class CompaniaDAO implements CompaniaDAOInterface {

    private ArrayList<Compania> companias = new ArrayList();
    public static final String URL = "jdbc:sqlite:/Users//andreicampigotto/Desktop/Prog IV/companies.db";

    @Override
    public ArrayList<Compania> retornarCompanias() {
        Connection con;
        Statement st;

        ArrayList result = new ArrayList<>();

        try {
            //Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            ResultSet resultFromQuery = st.executeQuery("SELECT * FROM compania");

            while (resultFromQuery.next()) {
                result.add(toEntity(resultFromQuery));
            }
        } catch (SQLException ex) {
            System.out.print("Erro no SQL: " + ex.getMessage());
        }
        return result;
    }

    private Compania toEntity(ResultSet result) {
        Compania compania = new Compania();
        try {
            compania.setId(result.getString(""));
            compania.setAno(result.getString("Year founded"));
            compania.setDominio(result.getString("domain"));
            compania.setEmpregados_atual(result.getInt("current employee estimate"));
            compania.setEmpregados_total(result.getInt("total employee estimate"));
            compania.setNome(result.getString("name"));
            compania.setIndustria(result.getString("industry"));
            compania.setLinkedin(result.getString("linkedin url"));
            compania.setPais(result.getString("country"));
            compania.setLocalizacao(result.getString("locality"));
            compania.setTamanho(result.getString("size range"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return compania;
    }

    @Override
    public boolean incluirCompania(Compania nova) {
        Connection con;
        Statement st;

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO compania (\"\",name,domain,\"year founded\",industry,\"size range\"," +
                            "locality,country,\"linkedin url\",\"current employee estimate\",\"total employee estimate\") " +
                            "VALUES(?,?,?,?,?,?,?,?,?,?,?)"
            );
            PreparedStatement pstmt = con.prepareStatement(st.toString());
            pstmt.setString(1, nova.getNome());
            pstmt.setString(2, nova.getDominio());
            pstmt.setString(3, nova.getAno());
            pstmt.setString(4, nova.getIndustria());
            pstmt.setString(5, nova.getTamanho());
            pstmt.setString(6, nova.getLocalizacao());
            pstmt.setString(7, nova.getPais());
            pstmt.setString(8, nova.getLinkedin());
            pstmt.setInt(9, nova.getEmpregados_atual());
            pstmt.setInt(10, nova.getEmpregados_total());
            pstmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("depuração: " + e.getMessage());
            return false;
        }
    }


//    @Override
//    public boolean removerCompania(String id) {
//        try {
//            int encontrado = -1; // variável para sinalizar sucesso da busca
//            for (int i = 0; i < companias.size(); i++) { // percorrer a lista
//                if (companias.get(i).getId().equals(id)) { // achou?
//                    encontrado = i; // sinaliza a posição da pessoa encontrada
//                    break; // interrompe a busca
//                }
//            }
//            if (encontrado >= 0) { // se achou...
//                companias.remove(encontrado);
//            } else {
//                return false;
//            }
//            return true;
//        } catch (Exception e) {
//            System.out.println("depuração: " + e.getMessage());
//            return false;
//        }
//    }
//
//    @Override
//    public Compania buscarCompania(String cpf) {
//        try {
//            for (int i = 0; i < companias.size(); i++) { // percorrer a lista
//                if (companias.get(i).getId().equals(cpf)) { // achou?
//                    return companias.get(i);
//                }
//            }
//            return null;
//        } catch (Exception e) {
//            System.out.println("depuração: " + e.getMessage());
//            return null;
//        }
//    }
//
//    @Override
//    public boolean AtualizarCompania(Compania novosDados) {
//        try {
//            int encontrado = -1; // variável para sinalizar sucesso da busca
//            for (int i = 0; i < companias.size(); i++) { // percorrer a lista
//                if (companias.get(i).getId().equals(novosDados.getId())) { // achou?
//                    encontrado = i; // sinaliza a posição da pessoa encontrada
//                    break; // interrompe a busca
//                }
//            }
//            if (encontrado >= 0) { // se achou...
//                companias.set(encontrado, novosDados); // atualiza a pessoa
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception e) {
//            System.out.println("depuração: " + e.getMessage());
//            return false;
//        }
//    }
}