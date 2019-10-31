/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author phfar
 */
public class ConexaoBd {

    public Statement stm; //prepara e realiza pesquisas no banco de dados
    public ResultSet rs; //armazena o resultado de uma pesquisa passada para o statement
    private String driver = "com.mysql.jdbc"; //identifica o banco de dados e prepara a conexão
    private String caminho = "jdbc:mysql://127.0.0.1:3307/sistemaVendas"; //setar o local do banco de dados
    private String usuario = "root";
    private String senha = "";
    public Connection conn; //realiza a conexão com o banco de dados

    public void conexao() {//método responsavel por realizar a conexão com o banco de dados

        try {//tentativa inicial
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão com o banco de dados
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");//caixa de mensagem caso a conexão seja bem sucedida
        } catch (SQLException ex) {//excessão em caso de erro no try
            JOptionPane.showMessageDialog(null, "Erro de conexão \n " + ex.getMessage());//caixa de mensagem caso a conexão seja mal sucedida
        }
    }

    public void executaSQL(String sql) { //A String sql é o comando do sql

        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL \n " + ex.getMessage());
        }

    }

    //executeUpdate() = executa uma atualização/inserção/delete no banco
    //executeQuery() = executa uma pesquisa no banco
    public void desconexao() {//metodo de desconexao
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar \n " + ex.getMessage());
        }
    }
}
