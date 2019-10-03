/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import Modelos.ModeloProduto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lukas
 */
public class controle {

    conexaoBD conex = new conexaoBD();
    ModeloProduto mod = new ModeloProduto();

    public void salvar(ModeloProduto mod) throws SQLException {
        try {
            conex.conexao(); // conecta no banco de dados
            PreparedStatement pst = conex.con.prepareStatement("insert into produto values (?,?,?,?,?)");
            pst.setInt(1, mod.getCodProduto());
            pst.setString(2, mod.getProduto());
            pst.setString(3, mod.getDescProduto());
            pst.setInt(4, mod.getQuantProduto());
            pst.setString(5, mod.getFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os Dados!" + ex);
        }
    }
}
