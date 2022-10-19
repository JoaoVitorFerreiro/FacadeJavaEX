public class Bebida extends Produto{
    private int ml;

    public Bebida(String descricao, Double preco) {
        super(descricao, preco);
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
}
