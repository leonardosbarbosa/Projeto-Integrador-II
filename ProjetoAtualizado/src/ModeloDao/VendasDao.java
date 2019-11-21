package ModeloDao;

import java.util.ArrayList;
import ModeloBeans.VendasBeans;

public class VendasDao {

    public static ArrayList<VendasBeans> listaVendas = new ArrayList<VendasBeans>();

    public static boolean addVendas(VendasBeans venda) {

        listaVendas.add(venda);
        for (int i = 0; i < listaVendas.size(); i++) {
            VendasBeans get = listaVendas.get(i);
        }

        return true;
    }

    public static int conta() {

        return listaVendas.size();
    }

    public static VendasBeans linha(int i) {

        return listaVendas.get(i);
    }

    public void limpar() {
        listaVendas.clear();
    }
}
