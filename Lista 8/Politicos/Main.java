public class Main{
    public static void main(String[] args) {
        Data d = new Data(1, 1, 2000);
        Prefeito p = new Prefeito("Lucas", 1234, d, "SPD", 1, "Sao Paulo");
        Governador g = new Governador("Leandro", 1235, d, "SPG", 3, "Sao Paulo");
       
        System.out.println(p.toString());
        System.out.println(g.toString());
        
    }
}