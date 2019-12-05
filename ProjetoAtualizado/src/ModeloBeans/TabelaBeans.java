/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Classe responsável por gerar as tabelas com seus respectivos valores
 * @author phfar
 */
public class TabelaBeans extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    //metodo responsavel por indicar a quantidade de linhas e colunas da tabela
    public TabelaBeans(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
    }

    //pega a quantidade de linhas da tabela
    public ArrayList getLinhas() {
        return linhas;
    }

    //pega os dados das linhas da tabela
    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }

    //pega a quantidade de colunas da tabela
    public String[] getColunas() {
        return colunas;
    }

    //pega o nome das colunas da tabela
    public void setColunas(String[] nomes) {
        colunas = nomes;
    }

    //contagem do numero de caracteres no nome das colunas
    public int getColumnCount() {
        return colunas.length;
    }

    //contagem do numero de elemento dentro do Array
    public int getRowCount() {
        return linhas.size();
    }

    //pega o valor das colunas
    public String getColumnName(int numCol) {
        return colunas[numCol];
    }

    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
