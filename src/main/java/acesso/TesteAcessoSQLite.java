package acesso;

import java.sql.*;

public class TesteAcessoSQLite {

    public static final String URL = "jdbc:sqlite:C:\\development\\java\\projects\\dw2ed\\bd\\java\\sqlite\\companies_1000.db";

    public static void main(String[] args) throws ClassNotFoundException {

        Connection con;
        Statement st;
        ResultSet result;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            result = st.executeQuery("select * from compania");
            while (result.next()) {
                for (int i = 1; i <= 11; i++) {
                    System.out.print(result.getString(i) + " | ");
                }
                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.print("Erro no SQL: " + ex.getMessage());
        }
    }
}
