
package ModeloDao;


import ModeloBeans.ClienteBeans;
import java.sql.PreparedStatement;
import conexao.ConexaoBD;
import java.sql.SQLException;


public class ClienteDao {
     ConexaoBD conecta = new ConexaoBD();
    public  void addCliente (ClienteBeans c ) throws SQLException{
       
        PreparedStatement pst = conecta.con.prepareStatement("INSERT INTO clientes (nome, cpf, rg, nascimento, sexo, fixo, celular, email, rua, bairro, uf, cep, cidade)" //passagem do comando sql para inserção
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, c.getNome()); //passagem de paramentro para inserção(valores)
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getRg());
            pst.setString(4, c.getNascimento());
            pst.setString(5, c.getSexo());
            pst.setString(6, c.getFixo());
            pst.setString(7, c.getFixo());
            pst.setString(8, c.getEmail());
            pst.setString(9, c.getRua());
            pst.setString(10, c.getBairro());
            pst.setString(11, c.getUf());
            pst.setString(12, c.getCep());
            pst.setString(13, c.getCidade());
            pst.executeUpdate(); //executa a inserção
    }
}
