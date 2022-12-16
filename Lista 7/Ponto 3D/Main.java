public class Main{
    public static void main(String[] args){
        Ponto3D p1 = new Ponto3D(2, 3, 4);
        Ponto3D p2 = new Ponto3D(1, 2, 3);

        System.out.println(p1.toString());
        System.out.println(p1.distance(p2));
    }
}