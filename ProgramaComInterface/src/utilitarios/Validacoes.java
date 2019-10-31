
package utilitarios;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author lohan.ypyugue
   @author pedro.farantes
 */
public class Validacoes {
    
    public static void campoVazio(JTextField txt) {
        
           if(txt.getText().trim().equals("")){
            JOptionPane.showMessageDialog(txt, "Campo Nome vazio.\nFavor preencher");  
        } 
        
        
        
    }
    
    public static void validaNome(JTextField txt) {
        if(txt.getText().matches(".*[0-9].*")){
            JOptionPane.showMessageDialog(txt, "Campo Nome inválido. \nFavor digitar apenas letras");
        }
    }
    
}    

