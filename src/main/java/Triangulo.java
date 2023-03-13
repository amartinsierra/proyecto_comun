public class Triangulo extends Figura{
    private int base, altura;
    public Triangulo(int base, int altura, String color){
        super(color);
        this.altura=altura;
        this.base=base;
    }
    public double superficie(){
        return base*altura/2;
    }
}
