package utilitarios;

import ModeloBeans.VendasBeans;
import ModeloDao.VendasDao;
import javax.swing.table.AbstractTableModel;

/**
 * Classe responsável por gerar a tabela de vendas dos produtos
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
        VendasBeans venda;
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
