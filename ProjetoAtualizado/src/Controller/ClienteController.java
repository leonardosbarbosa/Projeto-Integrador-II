
package Controller;

import ModeloBeans.ClienteBeans;
import ModeloDao.ClienteDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável por obter os dados do cliente e dar um "set" em cada um dos respectivos campos da tabela
 * @author pedro.hfarantes
 */
public class ClienteController {

    public static boolean salvar(String nome, String cpf, String rg, String nascimento, String sexo, String fixo, String celular,
            String email, String rua, String bairro, String uf, String cep, String cidade) {
        ClienteBeans cliente = new ClienteBeans();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setRg(rg);
        cliente.setNascimento(nascimento);
        cliente.setSexo(sexo);
        cliente.setFixo(fixo);
        cliente.setCelular(celular);
        cliente.setEmail(email);
        cliente.setRua(rua);
        cliente.setBairro(bairro);
        cliente.setUf(uf);
        cliente.setCep(cep);
        cliente.setCidade(cidade);

        ClienteDao dao = new ClienteDao();

        try {
            dao.addCliente(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

}
