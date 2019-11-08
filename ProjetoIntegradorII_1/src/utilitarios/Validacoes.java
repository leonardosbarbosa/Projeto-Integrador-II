
package utilitarios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author lohan.ypyugue
   @author pedro.farantes
 */



public class Validacoes {
    
    public static ArrayList<String> mensagensErro = new ArrayList<>();
    
    //Cria uma Array para jogar os erros em um único campo
    public static ArrayList<String> getMensagensErro(){
        return mensagensErro;
    }
    
    // Método para retornar true caso exista erro
    public boolean hasError (){
        return mensagensErro.size() >0;
    }
    
    public static void campoVazio(JTextField txt) {
        
           if(txt.getText().trim().equals("")){
            mensagensErro.add("Campo "+txt.getName()+" vazio.\nFavor preencher");
            
        }
    }
    
    public static void validaNome(JTextField txt) {
        if(txt.getText().matches(".*[0-9].*")){
            JOptionPane.showMessageDialog(null, "Campo "+txt.getName()+" inválido. \nFavor digitar apenas letras");
        }
    }
    
    public static void validaNum(JTextField txt) {
        
        try {
            int num = Integer.parseInt(txt.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo "+txt.getName()+" inválido! Favor informar apenas números");
        }
        
    }
    
}    

