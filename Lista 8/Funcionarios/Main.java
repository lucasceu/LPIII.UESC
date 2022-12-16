public class Main{
    public static void main(String[] args){
        Data d = new Data(10, 3, 2000);
        Pessoa p = new Pessoa("Lucas", 1234, d);

        System.out.println(p.toString());

        Data da = new Data(15, 12, 2019);
        Funcionario f = new Funcionario("Lucas", 12345, d, da, 800);
        System.out.println(f.toString());

        ChefeDeDepartamento c = new ChefeDeDepartamento("Lucas", 1234567, d, "Cientista da ciomputação", da);
        System.out.println(c.toString());
    }
}