public class Burguer extends Produto{
    private int Gramas;

    public Burguer(String descricao, Double preco, int gramas) {
        super(descricao, preco);
        this.Gramas = gramas;
    }

    public int getGramas() {
        return Gramas;
    }

    public void setGramas(int gramas) {
        Gramas = gramas;
    }
}