package ModeloDao;

import ModeloBeans.ProdutoBeans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.ConexaoBD;

/**
 * Classe responsável por obter todos os dados e fornecé-los dos campos dos produtos no banco de dados
 * @author lohan.ypyugue
 */
public class ProdutoDao {

    ConexaoBD conecta = new ConexaoBD();

    public void addProduto(ProdutoBeans prod) throws SQLException {
        conecta.conectar();
        try {
            

            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO produtos (categoria, nome, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque, descr)"
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, (String) prod.getCategoria());
            pst.setString(2, prod.getNomeProduto());
            pst.setString(3, prod.getUniPorduto());
            pst.setString(4, prod.getFornecedor());
            pst.setString(5, prod.getMarca());
            pst.setFloat(6, prod.getValorCompraProduto());
            pst.setFloat(7, prod.getValorVendaProduto());
            pst.setInt(8, prod.getEstoque());
            pst.setString(9, (String) prod.getDescProduto());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção de dados \n EERO:" + ex);
        }
        conecta.desconectar();
    }

    public void excluir(ProdutoBeans prod) throws SQLException {
        conecta.conectar();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM produtos WHERE descr = ?");

            pst.setString(1, prod.getDescProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto \n ERRO: " + ex);
        }

        conecta.desconectar();

    }
    
    public void alterar (ProdutoBeans prod) throws SQLException {
    try {
        conecta.conectar();
            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE produtos SET categoria = ?, nome = ?, un = ?, fornecedor = ?, "
                    + "marca = ?, vlr_compra = ?, vlr_venda = ?, qtd_estoque = ?, descr = ? WHERE id = " + prod.getCodProduto());

            pst.setString(1, prod.getCategoria());
            pst.setString(2, prod.getNomeProduto());
            pst.setString(3, prod.getUniPorduto());
            pst.setString(4, prod.getFornecedor());
            pst.setString(5, prod.getMarca());
            pst.setDouble(6, prod.getValorCompraProduto());
            pst.setDouble(7, prod.getValorVendaProduto());
            pst.setInt(8, prod.getEstoque());
            pst.setString(9, prod.getDescProduto());            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar produto.");
        }
    }

    public ProdutoBeans pesquisa(ProdutoBeans p) throws SQLException {
        conecta.conectar();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("SELECT * FROM produtos WHERE nome ='" + p.getPesquisa() + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                p.setCodProduto(rs.getString("id"));
                p.setDescProduto(rs.getString("descr"));
                p.setUniPorduto(rs.getString("un"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setMarca(rs.getString("marca"));
                p.setValorCompraProduto(Float.parseFloat(rs.getString("vlr_compra")));
                p.setValorVendaProduto(Float.parseFloat(rs.getString("vlr_venda")));
                p.setEstoque(rs.getInt("qtd_estoque"));
                p.setCategoria(rs.getString("categoria"));
                p.setNomeProduto("nome");
                pst.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);

        }
        conecta.desconectar();
        return p;
    }

    public List<ProdutoBeans> listar() throws SQLException {
        conecta.conectar();
        PreparedStatement stmt;
        ResultSet rs;

        List<ProdutoBeans> produtos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, nome, vlr_venda, qtd_estoque FROM produtos");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutoBeans produto = new ProdutoBeans();
                produto.setCodProduto(rs.getString("id"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setValorVendaProduto(rs.getFloat("vlr_venda"));
                produto.setEstoque(rs.getInt("qtd_estoque"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }

    public List<ProdutoBeans> listarProdutosId(int id) throws SQLException {
        conecta.conectar();
        PreparedStatement stmt;
        ResultSet rs;

        List<ProdutoBeans> produtos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, nome, vlr_venda, qtd_estoque FROM produtos WHERE id = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutoBeans produto = new ProdutoBeans();
                produto.setCodProduto(rs.getString("id"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setValorVendaProduto(rs.getFloat("vlr_venda"));
                produto.setEstoque(rs.getInt("qtd_estoque"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }

    public List<ProdutoBeans> listarProdutosDescr(String descr) throws SQLException {
        conecta.conectar();
        PreparedStatement stmt;
        ResultSet rs;

        List<ProdutoBeans> produtos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, nome, vlr_venda, qtd_estoque FROM "
                    + "produtos WHERE descr like  '%" + descr + "%' order by id");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutoBeans produto = new ProdutoBeans();
                produto.setCodProduto(rs.getString("id"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setValorVendaProduto(rs.getFloat("vlr_venda"));
                produto.setEstoque(rs.getInt("qtd_estoque"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }

    public ProdutoBeans preencherForm(ProdutoBeans p, int id) throws SQLException {

        conecta.conectar();
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = conecta.conn.prepareStatement("SELECT * FROM produtos WHERE id =" + id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                p.setCodProduto(rs.getString("id"));
                p.setDescProduto("descr");
                p.setUniPorduto("un");
                p.setFornecedor("fornecedor");
                p.setMarca("marca");
                p.setValorCompraProduto(rs.getFloat("vlr_compra"));
                p.setValorVendaProduto(rs.getFloat("vlr_venda"));
                p.setEstoque(rs.getInt("qtd_estoque"));
                p.setCategoria("categoria");
                p.setNomeProduto("nome");
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Busca realizada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca de dados \n EERO:" + ex);
        }

        conecta.desconectar();
        return p;
    }
}
