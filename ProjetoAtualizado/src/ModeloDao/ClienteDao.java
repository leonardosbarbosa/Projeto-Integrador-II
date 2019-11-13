package ModeloDao;

import ModeloBeans.ClienteBeans;
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

    //FrClientes cliente = new FrClientes();
    public void addCliente(ClienteBeans c) throws SQLException {
        conecta.conectar();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO clientes (nome, cpf, rg, nascimento, sexo, fixo, celular, email, rua, bairro, uf, cep, cidade)" //passagem do comando sql para inserção
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pst.setString(1, c.getNome()); //passagem de paramentro para inserção(valores)
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getRg());
            pst.setString(4, c.getNascimento());
            pst.setString(5, c.getSexo());
            pst.setString(6, c.getFixo());
            pst.setString(7, c.getCelular());
            pst.setString(8, c.getEmail());
            pst.setString(9, c.getRua());
            pst.setString(10, c.getBairro());
            pst.setString(11, c.getUf());
            pst.setString(12, c.getCep());
            pst.setString(13, c.getCidade());
            pst.executeUpdate(); //executa a inserção

            JOptionPane.showMessageDialog(null, "Cliente Salvo com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(FrClientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cliente \n ERRO: " + ex);
        }
    }

    public ClienteBeans pesquisarClienteNome(ClienteBeans c) throws SQLException {
        conecta.conectar();

        try {

            PreparedStatement pst = conecta.con.prepareStatement("SELECT * FROM CLIENTES WHERE nome ='" + c.getPesquisa() + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setRg(rs.getString("rg"));
                c.setNascimento(rs.getString("nascimento"));
                c.setSexo(rs.getString("sexo"));
                c.setFixo(rs.getString("fixo"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("email"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setUf(rs.getString("uf"));
                c.setCep(rs.getString("cep"));
                c.setCidade(rs.getString("cidade"));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);
        }
        conecta.desconectar();
        return c;
    }


    public ClienteBeans pesquisarClienteCpf(ClienteBeans c) throws SQLException {
        conecta.conectar();

        try {

            PreparedStatement pst = conecta.con.prepareStatement("SELECT * FROM CLIENTES WHERE cpf ='" + c.getPesquisa() + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setRg(rs.getString("rg"));
                c.setNascimento(rs.getString("nascimento"));
                c.setSexo(rs.getString("sexo"));
                c.setFixo(rs.getString("fixo"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("email"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setUf(rs.getString("uf"));
                c.setCep(rs.getString("cep"));
                c.setCidade(rs.getString("cidade"));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);
        }
        conecta.desconectar();
        return c;
    }

}
