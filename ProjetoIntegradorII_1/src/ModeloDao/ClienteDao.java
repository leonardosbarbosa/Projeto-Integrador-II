package ModeloDao;

import ModeloBeans.ClienteBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import utilitarios.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.FrClientes;

public class ClienteDao {

    ConexaoBD conecta = new ConexaoBD();

    public void create(ClienteBeans c) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO clientes (nome, cpf, rg, nascimento, sexo, fixo, celular, email, rua, bairro, uf, cep, cidade)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            stmt.setString(1, c.getNome()); //passagem de paramentro para inserção(valores)
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getRg());
            stmt.setString(4, c.getNascimento());
            stmt.setString(5, c.getSexo());
            stmt.setString(6, c.getFixo());
            stmt.setString(7, c.getCelular());
            stmt.setString(8, c.getEmail());
            stmt.setString(9, c.getRua());
            stmt.setString(10, c.getBairro());
            stmt.setString(11, c.getUf());
            stmt.setString(12, c.getCep());
            stmt.setString(13, c.getCidade());
            stmt.executeUpdate(); //executa a inserção
            //executeUpdate serve para realizar insert, update e delete
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
    }

    public void update(ClienteBeans c) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE clientes SET fixo = ?, celular = ?, email = ?, rua = ?, "
                    + "bairro = ?, uf = ?, cep = ?, cidade = ? WHERE cpf = ?");
            stmt.setString(1, c.getFixo());
            stmt.setString(2, c.getCelular());//passagem de paramentro para atualização(valores)
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getRua());
            stmt.setString(5, c.getBairro());
            stmt.setString(6, c.getUf());
            stmt.setString(7, c.getCep());
            stmt.setString(8, c.getCidade());
            stmt.setString(9, c.getCpf());
            stmt.executeUpdate(); //executa a inserção
            //executeUpdate serve para realizar insert, update e delete
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + ex);
        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }
    }

}
