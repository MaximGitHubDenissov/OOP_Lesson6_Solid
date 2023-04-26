package solid.lsp;

public abstract class Orderable {

    protected int price;
    protected int qnt;

    public Orderable (int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }

    public abstract int getAmount();
    
}
