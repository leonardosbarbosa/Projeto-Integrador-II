package ModeloDao;

import java.util.ArrayList;
import utilitarios.Vendas;

public class VendasDao {
    
    public static ArrayList<Vendas> listaVendas= new ArrayList<Vendas>();
    
    public static boolean addVendas(Vendas venda) {
        
        listaVendas.add(venda);
        for (int i = 0; i < listaVendas.size(); i++) {
            Vendas get = listaVendas.get(i);            
        }
        
        return true;
    }
    
    public static int conta () {
    
    return listaVendas.size();
    }
    
    public static Vendas linha (int i) {
    
    return listaVendas.get(i);
    }
    
    public void limpar() {
    
        for (int i = 0; i < listaVendas.size(); i++) {
           listaVendas.remove(i);
        }       
    }
}
