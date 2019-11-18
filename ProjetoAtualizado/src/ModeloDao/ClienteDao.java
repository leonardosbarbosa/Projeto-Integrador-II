package ModeloDao;

import ModeloBeans.ClienteBeans;
//import java.awt.List;
import java.sql.PreparedStatement;
import utilitarios.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO clientes (nome, cpf, rg, nascimento, sexo, fixo, celular, email, rua, bairro, uf, cep, cidade)" //passagem do comando sql para inserção
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
            //verifica se o erro foi causado por existir um CPF já cadastrado 
            PreparedStatement CPFValida = conecta.conn.prepareStatement("SELECT * FROM clientes WHERE cpf ='" + c.getCpf() + "'");
            ResultSet cpfValida = CPFValida.executeQuery();
            if (cpfValida.next()) {
                JOptionPane.showMessageDialog(null, "CPF já existente");
            } else {
                //verifica se o erro foi causado por existir um RG já cadastrado 
                PreparedStatement RgValida = conecta.conn.prepareStatement("SELECT * FROM clientes WHERE rg ='" + c.getRg() + "'");
                ResultSet rgValida = RgValida.executeQuery();
                if (rgValida.next()) {
                    JOptionPane.showMessageDialog(null, "Rg já existente");
                } else {
                    // caso o erro não seja causado pelo cpf e nem pelo rg ele vai mostrar essa mensagem 
                    JOptionPane.showMessageDialog(null, "ERRO ao registrar cliente \n verifique se os dados estão corretos");
                }
            }
        }
    }

    public ClienteBeans pesquisarClienteNome(ClienteBeans c) throws SQLException {

        conecta.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conecta.conn.prepareStatement("SELECT * FROM CLIENTES WHERE nome ='" + c.getPesquisa() + "'");
            rs = stmt.executeQuery();
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
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);
        }

        conecta.desconectar();
        return c;
    }

    public ClienteBeans pesquisarClienteCpf(ClienteBeans c) throws SQLException {

        conecta.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conecta.conn.prepareStatement("SELECT * FROM CLIENTES WHERE cpf ='" + c.getPesquisa() + "'");
            rs = stmt.executeQuery();
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
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);
        }

        conecta.desconectar();
        return c;
    }

    //tabela de clientes
    public List<ClienteBeans> listar() throws SQLException {
        conecta.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ClienteBeans> clientes = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, nome, cpf FROM clientes");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ClienteBeans cliente = new ClienteBeans();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    //busca de dados na tabela pelo nome do cliente
    public List<ClienteBeans> pesquisarClienteNomeTabela(String nome) throws SQLException {

        conecta.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ClienteBeans> clientes = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT * FROM clientes WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ClienteBeans cliente = new ClienteBeans();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                clientes.add(cliente);
                //JOptionPane.showMessageDialog(null, "Busca realizada");
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);
        }

        conecta.desconectar();
        return clientes;
    }

    //busca de dados na tabela pelo cpf do cliente
    public List<ClienteBeans> pesquisarClienteCpfTabela(String cpf) throws SQLException {

        conecta.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ClienteBeans> clientes = new ArrayList<>();

        try {

            stmt = conecta.conn.prepareStatement("SELECT id, nome, cpf FROM clientes WHERE cpf=" + cpf);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ClienteBeans cliente = new ClienteBeans();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
        }

        conecta.desconectar();
        return clientes;
    }

}
