
package utilitarios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * @author lohan.ypyugue
   @author pedro.farantes
 */



public class Validacoes {
    
    public ArrayList<String> mensagensErro = new ArrayList<>();
    
    //Cria uma Array para jogar os erros em um único campo
    public String getMensagensErro(){
        String errosFormulario = "";
        
        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            this.limparMensagens();
        }     
        
        return errosFormulario;
    }
    
    // Método para retornar true caso exista erro
    public boolean hasError (){
        return mensagensErro.size() >0;
    }
    
    public void campoVazio(JTextField txt) {
        
           if(txt.getText().trim().equals("")){
               
            this.mensagensErro.add("Campo "+txt.getName()+" vazio, favor preencher.");       
        }
    }
    
    public void validaNome(JTextField txt) {
        if(txt.getText().matches(".*[0-9].*")){
            this.mensagensErro.add("Campo "+txt.getName()+" inválido, favor digitar apenas letras");
        }
    }
    
    public void validaNum(JTextField txt) {
        
        try {
            int num = Integer.parseInt(txt.getText());
        } catch (NumberFormatException e) {
            this.mensagensErro.add("Campo "+txt.getName()+" inválido. Favor informar apenas números!");
        }
        
    }
    
     public void limparMensagens(){
     
         this.mensagensErro.clear();
     }
   
}    

