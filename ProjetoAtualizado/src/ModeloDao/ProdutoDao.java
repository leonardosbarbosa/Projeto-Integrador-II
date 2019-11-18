package ModeloDao;

import ModeloBeans.ClienteBeans;
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

public class ProdutoDao {

    ConexaoBD conecta = new ConexaoBD();

    public void addProduto(ProdutoBeans prod) throws SQLException {
        conecta.conectar();
        try {
            // TODO add your handling code here:

            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO produtos (descr, un, fornecedor, marca, vlr_compra, vlr_venda, qtd_estoque, categoria)"
                    + "values(?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, prod.getDescProduto());
            pst.setString(2, prod.getUniPorduto());
            pst.setString(3, prod.getFornecedor());
            pst.setString(4, prod.getMarca());
            pst.setFloat(5, prod.getValorCompraProduto());
            pst.setFloat(6, prod.getValorVendaProduto());
            pst.setInt(7, prod.getEstoque());
            pst.setString(8, (String) prod.getCategoria());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção de dados \n EERO:" + ex);
        }
        conecta.desconectar();
    }

    public ProdutoBeans pesquisa(ProdutoBeans p) throws SQLException {
        conecta.conectar();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("SELECT * FROM produtos WHERE descr ='" + p.getPesquisa() + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                p.setCodProduto(rs.getInt("id"));
                p.setDescProduto(rs.getString("descr"));
                p.setUniPorduto(rs.getString("un"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setMarca(rs.getString("marca"));
                p.setValorCompraProduto(Float.parseFloat(rs.getString("vlr_compra")));
                p.setValorVendaProduto(Float.parseFloat(rs.getString("vlr_venda")));
                p.setEstoque(rs.getInt("qtd_estoque"));
                p.setCategoria(rs.getString("categoria"));
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
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProdutoBeans> produtos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, descr, vlr_venda, qtd_estoque FROM produtos");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutoBeans produto = new ProdutoBeans();
                produto.setCodProduto(rs.getInt("id"));
                produto.setDescProduto(rs.getString("descr"));
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
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProdutoBeans> produtos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, descr, vlr_venda, qtd_estoque FROM produtos WHERE id = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutoBeans produto = new ProdutoBeans();
                produto.setCodProduto(rs.getInt("id"));
                produto.setDescProduto(rs.getString("descr"));
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
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProdutoBeans> produtos = new ArrayList<>();

        try {
            stmt = conecta.conn.prepareStatement("SELECT id, descr, vlr_venda, qtd_estoque FROM "
                    + "produtos WHERE descr like  '%" + descr + "%' order by id");
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutoBeans produto = new ProdutoBeans();
                produto.setCodProduto(rs.getInt("id"));
                produto.setDescProduto(rs.getString("descr"));
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
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conecta.conn.prepareStatement("SELECT * FROM produtos WHERE id =" + id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                p.setCodProduto(rs.getInt("id"));
                p.setDescProduto("descr"); 
                p.setUniPorduto("un");
                p.setFornecedor("fornecedor");
                p.setMarca("marca");
                p.setValorCompraProduto(rs.getFloat("vlr_compra"));
                p.setValorVendaProduto(rs.getFloat("vlr_venda"));
                p.setEstoque(rs.getInt("qtd_estoque"));
                p.setCategoria("categoria");
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
