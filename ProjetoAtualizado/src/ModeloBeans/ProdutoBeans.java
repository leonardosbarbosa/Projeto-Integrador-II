package ModeloBeans;

/**
 * Classe responsável por obter todos os dados dos campos dos produtos com get e set
 * @author lohan.ypyugue
 */
public class ProdutoBeans {

    private int estoque;
    private String DescProduto;
    private String codProduto;
    private String fornecedor;
    private String uniPorduto;
    private String marca;
    private float valorCompraProduto;
    private float valorVendaProduto;
    private String categoria;
    private String pesquisa;
    private String nomeProduto;
    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDescProduto() {
        return DescProduto;
    }

    public void setDescProduto(String DescProduto) {
        this.DescProduto = DescProduto;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getUniPorduto() {
        return uniPorduto;
    }

    public void setUniPorduto(String uniPorduto) {
        this.uniPorduto = uniPorduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValorCompraProduto() {
        return valorCompraProduto;
    }

    public void setValorCompraProduto(float valorCompraProduto) {
        this.valorCompraProduto = valorCompraProduto;
    }

    public float getValorVendaProduto() {
        return valorVendaProduto;
    }

    public void setValorVendaProduto(float valorVendaProduto) {
        this.valorVendaProduto = valorVendaProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPesquisa() {
        
       return pesquisa;
    }

}
