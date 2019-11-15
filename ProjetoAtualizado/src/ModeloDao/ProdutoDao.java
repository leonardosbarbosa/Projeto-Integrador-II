package ModeloDao;

import ModeloBeans.ProdutoBeans;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
