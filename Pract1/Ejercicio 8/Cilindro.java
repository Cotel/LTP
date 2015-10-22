public class Cilindro extends Circulo {
    protected double a;
    
    public Cilindro(double x, double y, double radio, double altura) {
        super(x,y,radio);
        this.a = altura;
    }
    
    public Cilindro(Circulo c, double altura) {
        this(c.x, c.y, c.r, altura);
    }
    
    public double volumen() {
        return super.area()*a;
    }
    
    public double area() {
        Rectangulo rec = new Rectangulo(x,y,2*Math.PI*this.r, a);
        return rec.area() + 2*super.area();    
    }

}
