public class Fatura {

    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotalFatura() {
        if (quantidadeComprada < 0) {
            return 0;
        }
        if (preco < 0) {
            return 0.0;
        }
        return quantidadeComprada * preco;
    }
}
