package Model;

public class Itens {

    private String produto_nome;
    private int quantidade;
    private double preco;

    public Itens(){
    }

    public Itens(String produto_nome, int quantidade, double preco){
        this.produto_nome = produto_nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getProduto_nome() {
        return produto_nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "Nome: " + produto_nome + " Quantidade: " + quantidade + " Preço: " + preco;
    }
}
