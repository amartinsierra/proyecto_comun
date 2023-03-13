public class Motor {
    public static void main(String[] args) {
        Circulo c=new Circulo(5);
        System.out.println("La superficie es: "+c.superficie());

        Triangulo tr=new Triangulo(7,10);
        System.out.println("La superficie es: "+tr.superficie());
    }
}
