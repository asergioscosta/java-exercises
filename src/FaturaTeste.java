public class FaturaTeste {

    public static void main(String[] args) {
        Fatura f = new Fatura();
        f.setNumero("65430");
        f.setDescricao("Compra de Aparelho de TV");
        f.setQuantidadeComprada(3);
        f.setPreco(210.67);

        System.out.println("Total da fatura: R$" + f.getTotalFatura());

    }
}
