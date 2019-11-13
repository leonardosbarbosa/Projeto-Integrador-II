package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {

    private static final String DRIVER = "con.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3308/sistemavendas";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("ERRO NA CONEXÃO: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public Connection con;
//    private Statement st;
//
//    public void conectar() throws SQLException {
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemavendas?zeroDateTimeBehavior=convertToNull", "root", "");
//            st = (java.sql.Statement) con.createStatement();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados.");
//        }
//    }
//
//    public void desconectar() {
//        try {
//            con.close(); // fecha o BD
//            // JOptionPane.showMessageDialog(null, "BD desconctado com sucesso! ");
//        } catch (SQLException ex) {
//            // JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD: " + ex.getMessage());
//        }
//
//    }
//    
//    public void inserir(String sql) throws SQLException {   
//    try {
//            st.executeUpdate(sql);
//            JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Registro não gravado.");
//        }
//    }
}
