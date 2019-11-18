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

    // Método para retornar true caso exista erro
    public boolean hasError() {
        return mensagensErro.size() > 0;
    }

    public void campoVazio(JTextField txt) {

        if (txt.getText().trim().equals("")) {

            this.mensagensErro.add("Campo " + txt.getName() + " vazio, favor preencher.");
        }
    }

    public void validaNome(JTextField txt) {
        if (txt.getText().matches(".*[0-9].*")) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido, favor digitar apenas letras");
        }
    }

    public void validaNum(JTextField txt) {
//deixei comitado caso laguem fale q o q eu fiz ta errado OBS: o netbeans falou q o CPF era muito grade para int e para long 
//        try {
            //int num =Integer.parseInt(txt.getText());
            if (txt.getText().matches(".*[a-z].*") || txt.getText().matches(".*[,].*") ) {
                this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar apenas números inteiros!");
            }
//        } catch (NumberFormatException e) {
//            this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar apenas números inteiros!");
//        }

    }

    public void validaDouble(JTextField txt) {
        try {
            Double num = Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            this.mensagensErro.add("Campo " + txt.getName() + " inválido. Favor informar um valor válido.");
        }
    }

    public void limparMensagens() {

        this.mensagensErro.clear();
    }

}
