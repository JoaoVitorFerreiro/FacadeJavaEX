public class Combo {
    private int tipo;

    Burguer burguer = new Burguer("", 0.0, 0);
    Sobremesa sobremesa = new Sobremesa("",0.0,"");
    Bebida bebida = new Bebida("", 0.0);

    @Override
    public  String toString()
    {
        return CriarCombo(tipo);
    }

    public String CriarCombo(int tipo) {

        if(tipo == 1) {
             burguer = new Burguer("Big Mac", 50.00, 400);
             sobremesa = new Sobremesa("Sorvete",10.30,"Grande");
             bebida = new Bebida("Coca-cola", 5.50);
        } else {
             burguer = new Burguer("Ultra big super ultimate Mac", 100.00, 800);
             sobremesa = new Sobremesa("Super Sorvete muito foda",30.00,"Gigante");
             bebida = new Bebida("Coca-cola", 5.50);
        }


        Double Valor =  burguer.getPreco() + sobremesa.getPreco() + bebida.getPreco();

    return "\nCombo escolhido\n"
            + "\nHamburguer: " + burguer.getDescricao()
            + "\nValor: R$ " + burguer.getPreco()
            + "\nPeso: " + burguer.getGramas() + " g\n"

            + "\nSobremesa: " + sobremesa.getDescricao()
            + "\nValor: R$ " + sobremesa.getPreco()
            + "\nTamanho: " + sobremesa.getTamanho() + " g\n"

            + "\nBebida: " + bebida.getDescricao()
            + "\nValor: R$ " + bebida.getPreco()
            + "\nTamanho: " + bebida.getMl() + " ml\n"

            + "\nValor do combo completo: R$ " + Valor ;
    }

}
