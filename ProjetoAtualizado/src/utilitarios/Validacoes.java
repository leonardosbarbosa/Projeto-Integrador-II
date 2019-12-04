package utilitarios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Classe responsável por fazer todas as validações de inserção de dados nos JtextField
 *  @author lohan.ypyugue
 *  @author pedro.farantes
 */
public class Validacoes {

    public ArrayList<String> mensagensErro = new ArrayList<>();

    /**
     * Cria uma Array para jogar os erros em um único campo
     * @return ArrayList com todos os erros encontrados
     */ 
    public String getMensagensErro() {
        String errosFormulario = "";

        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }

        if (!errosFormulario.equals("")) {
            this.limparMensagens();
        }

        return errosFormulario;
    }

    /** 
    * Método para retornar true caso exista erro
    * @return boolean - true: Possui Erro, false: Sem Erros
    */ 
    public boolean hasError() {
        return mensagensErro.size() > 0;
    }
    
    /**  
    * Método que valida se o JtextField esta vazio, caso esteja, gera aviso de erro!
    * @param txt - Campo de texto (JtextField)
    */
    public void campoVazio(JTextField txt) {

        if (txt.getText().trim().equals("")) {

            this.mensagensErro.add("Campo " + txt.getName() + " vazio, favor preencher.");
        }
    }
    
    /**  
    * Método que valida se o JtextField contém apenas letras, caso tenha algum número, gera aviso de erro!
    * @param txt - Campo de texto (JtextField)
    */
    public void validaNome(JTextField txt) {
        if (txt.getText().matches(".*[0-9].*")) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido, favor digitar apenas letras");
        }
    }

    /**  
    * Método que valida se o JtextField contém apenas números inteiros, caso tenha algo diferente disto, gera aviso de erro!
    * @param txt - Campo de texto (JtextField)
    */
    public void validaNum(JTextField txt) {
//deixei comitado caso alguem fale q o q eu fiz ta errado OBS: o netbeans falou q o CPF era muito grande para int e para long 
//        try {
            //int num =Integer.parseInt(txt.getText());
            if (txt.getText().matches(".*[a-z].*") || txt.getText().matches(".*[,].*") ) {
                this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar apenas números inteiros!");
            }
//        } catch (NumberFormatException e) {
//            this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar apenas números inteiros!");
//        }

    }
    
    /**  
    * Método que valida se o JtextField contém apenas números, caso tenha algo diferente disto, gera aviso de erro!
    * @param txt - Campo de texto (JtextField)
    */
    public void validaDouble(JTextField txt) {
        try {
            Double num = Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar um valor válido.");
        }
    }

    /**  
    * Método utilizado para limpar as mensagens de erro
    */
    public void limparMensagens() {

        this.mensagensErro.clear();
    }

}
