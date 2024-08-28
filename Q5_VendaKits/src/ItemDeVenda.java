public class ItemDeVenda implements VendaComponent {
    private Produto produto;
    private int quantidade;

    public ItemDeVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double getPreco() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String emitirComprovante() {
        return String.format("%d %s %d x %.2f = %.2f%n",
            produto.getId(), produto.getNome(), quantidade, produto.getPreco(), getPreco());
    }
}
