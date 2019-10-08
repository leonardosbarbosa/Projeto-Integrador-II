
package conexao;

import Modelos.ModeloProduto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class controle {

    conexaoBD conex = new conexaoBD();
    ModeloProduto mod = new ModeloProduto();

    public void salvar(ModeloProduto mod) throws SQLException {
        try {
            conex.conexao(); // conecta no banco de dados
            PreparedStatement pst = conex.con.prepareStatement("insert into produto values (?,?,?,?,?)"); // comando para inserir dados na tabela
            pst.setString(1, mod.getProduto()); // passando a posição da referencia do argumento em cada item
            pst.setString(2, mod.getDescProduto());
            pst.setInt(3, mod.getCodProduto());
            pst.setInt(4, mod.getQuantProduto());
            pst.setString(5, mod.getFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os Dados!" + ex);
        }
    }
}
