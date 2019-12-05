package utilitarios;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados e poder executar as querys do MySQL
 * @author lpeterma
 */
public class ConexaoBD {

    public Statement st; //prepar e realizar pesquisas no banco de dados
    public ResultSet rs; //armazena resultados de uma pesquisa passada para o statement
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String CAMINHO = "jdbc:mysql://localhost:3306/sistemavendas";
    private final String USER = "root";
    private final String SENHA = "";
    public Connection conn;

    /**
     * @throws SQLException
     * Método utilizado para realizar a conexão com o banco de dados
     */
    public void conectar() throws SQLException {
        try {
            System.setProperty("jdbc.Drivers", DRIVER);
            conn = DriverManager.getConnection(CAMINHO,USER,SENHA);
            ///JOptionPane.showMessageDialog(null, "Conectado ao banco de dados");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados" + ex.getMessage());
        }
    }
    
    /**
     * 
     * @param sql 
     */
    public void executaSQL(String sql) {
        try {
            st = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro no executaSQL " + ex.getMessage());
        }
    }
    
    /**
     * Método para encerrar conexão com o banco de dados
     */
    public void desconectar() {
        try {
            conn.close(); // fecha o BD
           // JOptionPane.showMessageDialog(null, "BD desconctado com sucesso! ");
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD: " + ex.getMessage());
        }

    }

}
