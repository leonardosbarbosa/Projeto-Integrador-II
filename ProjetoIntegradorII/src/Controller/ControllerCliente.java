/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ModeloBeans.ClienteBeans;
import ModeloDao.ClienteDao;
import java.sql.SQLException;

/**
 *
 * @author lukas.mpereira
 */
public class ControllerCliente {

    public boolean salvar(int id, String nome, String cpf, String rg, String nascimento, String sexo, String fixo, String celular, String email, String rua, String bairro,
            String uf, String cep, String cidade) throws SQLException {
        ClienteBeans cliente = new ClienteBeans();
        ClienteDao dao = new ClienteDao();
        dao.addCliente(cliente);
        cliente.setId(id);
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
        return true;
    }
}
