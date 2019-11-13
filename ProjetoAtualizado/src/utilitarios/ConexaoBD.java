package utilitarios;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Connection con;
    private Statement st;

    public void conectar() throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemavendas?zeroDateTimeBehavior=convertToNull", "root", "");
            st = (java.sql.Statement) con.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados.");
        }
    }

    public void desconectar() {
        try {
            con.close(); // fecha o BD
            // JOptionPane.showMessageDialog(null, "BD desconctado com sucesso! ");
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD: " + ex.getMessage());
        }

    }
    
    public void inserir(String sql) throws SQLException {   
    try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro não gravado.");
        }
    }
    
  
}
