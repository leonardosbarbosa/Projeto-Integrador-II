
package conexao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaoBD {

    public Statement stm; // responsavel pela pesquisa no banco de dados
    public ResultSet rs; // armazenar o resultado da pesquisa
    private final String driver = "com.mysql.jdbc.Driver"; // banco de dados que vai trabalhar
    private final String caminho = "jdbc:mysql://localhost:3307/loja?;"; // caminho do banco de dados
    private final String usuario = "root"; // administrador do worchbench
    private final String senha = ""; // senha do worchbench

    public Connection con; // conexao com banco de dados

    public void conexao() throws SQLException {
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            // JOptionPane.showMessageDialog(null, "Connexão efetuada com Sucesso!"); // teste sua conexao 
        } catch (SQLException ex) {
            //  JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco!\n" + ex); 

        }
    }

    public void desconecta() {
        try {
            con.close(); // fecha o BD
            // JOptionPane.showMessageDialog(null, "BD desconctado com sucesso! ");
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD: " + ex.getMessage());
        }

    }
}
