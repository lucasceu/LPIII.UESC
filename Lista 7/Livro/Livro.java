public class Livro{
    private String titulo;
    private String autor;
    private int paginas;
    private int anoPublicacao;

    public Livro(String t, String a, int p, int aP){
        titulo = t;
        autor = a;
        paginas = p;
        anoPublicacao = aP;
    }

    public String toString(){
        return "Livro\n\nTitulo: " + titulo + "\nAutor: " + autor + "\nPaginas" + paginas + "\nAno da Publicação" + anoPublicacao + "\n";
    }

    public boolean isOlder(){
        if(anoPublicacao < 1970){
            return true;
        }
        return false;
    }
}