/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author phfar
 */
public class ModeloTabela extends AbstractTableModel {

    private ArrayList linhas = null; //similar a um vetor 
    private String[] colunas; //vetor com as colunas

    //metodo responsavel por indicar a quantidade de linhas e colunas
    public ModeloTabela(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }

    public String[] geColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) { //preenche o nome das colunas
        colunas = nomes;
    }

    public int getColumnCount() { //conta o numero de colunas
        return colunas.length;
    }

    public int getRowCount() { //retorna a quantidade de linhas 
        return linhas.size();  
    }
    
    public String getColumName(int numCol){
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol]; 
    }
    
    
}
