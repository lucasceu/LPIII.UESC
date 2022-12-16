public class LivroLivraria extends Livro{
    private float preco;
    private int estoque;

    public LivroLivraria(String t, String a, int p, int aP, float pr, int est){
        super(t, a, p, aP);
        preco = pr;
        estoque = est;
    }

    public boolean isAvaliable(){
        if(estoque == 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return super.toString() + "Preço: " + preco + "\n";
    }

    public void sell(){
        if(isAvaliable()){
            System.out.println(toString());
        }
        System.out.println("Não foi possivel efetuar a venda!!");
    }
}