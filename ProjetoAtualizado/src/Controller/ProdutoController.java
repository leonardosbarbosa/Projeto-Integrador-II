package Controller;

import ModeloBeans.ProdutoBeans;
import ModeloDao.ProdutoDao;
import java.sql.SQLException;

public class ProdutoController {
    
    public static boolean salvar(String describe, String unidade, String fornecedor, String marca, Float vlr_compra, Float vlr_venda, int qtd_estoque, String categoria) throws SQLException {
        
        ProdutoBeans prod = new ProdutoBeans();
        prod.setDescProduto(describe);
        prod.setUniPorduto(unidade);
        prod.setFornecedor(fornecedor);
        prod.setMarca(marca);
        prod.setValorCompraProduto(vlr_compra);
        prod.setValorVendaProduto(vlr_venda);
        prod.setEstoque(qtd_estoque);
        prod.setCategoria(categoria);
        
        ProdutoDao dao = new ProdutoDao();
        
        dao.addProduto(prod);
        return true;
        
    }
}
