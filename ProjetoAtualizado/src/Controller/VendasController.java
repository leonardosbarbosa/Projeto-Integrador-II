/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ModeloDao.VendasDao;
import ModeloBeans.VendasBeans;

/**
 * Classe responsável por obter os dados de venda e dar um "set" em cada um dos respectivos campos da tabela
 * @author leonardo.sbarbosa4
 */
public class VendasController {
    
    public static boolean salvar(String produto, int quantidade, double valorVenda) {
        VendasBeans venda = new VendasBeans();
        
        venda.setProduto(produto);
        venda.setQuantidade(quantidade);
        venda.setValor(valorVenda);
        
        VendasDao dao = new VendasDao();
        dao.addVendas(venda);
        
        return true;
    }
    
}
