package cadastroproduto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

class Produto {
    public static ArrayList listaProdutos = new ArrayList();
        private String desc, undMedida, apresentacao, codBarras, ultimoAumento, valPromo, nomeReduz, nome;
        private int tipoProduto, vendaProduto, estoqOnline, convenio, cod;
        private boolean promocao;
        private double comissao, valorPromo, valorCompra,custoOper, margLucro, valorVista, valorDesconto, estoqueMax, estoqueMin;

    public Produto() {
    }

    public Produto(int cod, String desc, String undMedida, String apresentacao, String codBarras, String ultimoAumento, String valPromo, String nomeReduz, String nome, int tipoProduto, int vendaProduto, int estoqOnline, int convenio, boolean promocao, double comissao, double valorPromo, double valorCompra, double custoOper, double margLucro, double valorVista, double valorDesconto, double estoqueMax, double estoqueMin) {
        this.desc = desc;
        this.cod = cod;
        this.undMedida = undMedida;
        this.apresentacao = apresentacao;
        this.codBarras = codBarras;
        this.ultimoAumento = ultimoAumento;
        this.valPromo = valPromo;
        this.nomeReduz = nomeReduz;
        this.nome = nome;
        this.tipoProduto = tipoProduto;
        this.vendaProduto = vendaProduto;
        this.estoqOnline = estoqOnline;
        this.convenio = convenio;
        this.promocao = promocao;
        this.comissao = comissao;
        this.valorPromo = valorPromo;
        this.valorCompra = valorCompra;
        this.custoOper = custoOper;
        this.margLucro = margLucro;
        this.valorVista = valorVista;
        this.valorDesconto = valorDesconto;
        this.estoqueMax = estoqueMax;
        this.estoqueMin = estoqueMin;
    }

    public static ArrayList getListaProdutos() {
        return listaProdutos;
    }

    public static void setListaProdutos(ArrayList listaProdutos) {
        Produto.listaProdutos = listaProdutos;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUndMedida() {
        return undMedida;
    }

    public void setUndMedida(String undMedida) {
        this.undMedida = undMedida;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getUltimoAumento() {
        return ultimoAumento;
    }

    public void setUltimoAumento(String ultimoAumento) {
        this.ultimoAumento = ultimoAumento;
    }

    public String getValPromo() {
        return valPromo;
    }

    public void setValPromo(String valPromo) {
        this.valPromo = valPromo;
    }

    public String getNomeReduz() {
        return nomeReduz;
    }

    public void setNomeReduz(String nomeReduz) {
        this.nomeReduz = nomeReduz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(int vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public int getEstoqOnline() {
        return estoqOnline;
    }

    public void setEstoqOnline(int estoqOnline) {
        this.estoqOnline = estoqOnline;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorPromo() {
        return valorPromo;
    }

    public void setValorPromo(double valorPromo) {
        this.valorPromo = valorPromo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getCustoOper() {
        return custoOper;
    }

    public void setCustoOper(double custoOper) {
        this.custoOper = custoOper;
    }

    public double getMargLucro() {
        return margLucro;
    }

    public void setMargLucro(double margLucro) {
        this.margLucro = margLucro;
    }

    public double getValorVista() {
        return valorVista;
    }

    public void setValorVista(double valorVista) {
        this.valorVista = valorVista;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getEstoqueMax() {
        return estoqueMax;
    }

    public void setEstoqueMax(double estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    public double getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(double estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    public void InserirProdutos (Produto pProdutoInserido){
        try{
            Produto.listaProdutos.add(pProdutoInserido);
        }catch(Exception e){
            System.out.println("ERRO: "+ e.getMessage());
        }
    }        
    public Produto PesquisarProd(String pNome){
     Produto pAux = new Produto();
     if(this.listaProdutos != null){
         for(int i =0; i<listaProdutos.size();i++){
             pAux = (Produto)listaProdutos.get(i);
             if(pAux.getNomeReduz().equals(pNome)){
                 return pAux;
             }
         }
     }
            return pAux;
    }
        public void RemoverProduto(String pNome){
        try{
        Produto pAux = new Produto();
        if(this.listaProdutos !=null){
            for(int i = 0; i<listaProdutos.size(); i++){
                pAux = (Produto)listaProdutos.get(i);
                if(pAux.getNomeReduz().equals(pNome)){
                    this.listaProdutos.remove(i);
                }
            }
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao remover produto!!!");
    }
            }

}  
