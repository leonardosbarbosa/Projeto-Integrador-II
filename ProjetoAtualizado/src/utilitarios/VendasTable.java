/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import ModeloDao.VendasDao;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author leonardo.sbarbosa4
 */
public class VendasTable extends AbstractTableModel {

    private String[] columnNames = {"Produto", "Quantidade", "Valor Unitário"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {

        return VendasDao.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        Vendas venda;
        venda = VendasDao.linha(row);
        if (col == 0) {
            return venda.getProduto();
        } else if (col == 1) {
            return venda.getQuantidade();
        } else {
            return venda.getValor();
        }
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
