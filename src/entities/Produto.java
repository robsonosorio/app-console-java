package entities;

public class Produto {

    public int idProduto;
    public String nome;
    public float preco;

    public Produto(int idProduto, String nome, float preco){
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "PRODUTO[idProduto: " + getIdProduto() + " | nome: '" + getNome() + " | preco: R$" + getPreco() + "]";
    }
}
