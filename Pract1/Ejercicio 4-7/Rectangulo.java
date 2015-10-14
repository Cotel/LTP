public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double x, double y, double b, double a) {
        super(x,y);
        this.base = b;
        this.altura = a;
    }

    public double area() {
        return base * altura;
    }

    public String toString() {
        return "Rectangulo:\n\t"+
                "Posicion: ("+x+","+y+
                ")\n\tBase: "+base+
                "\n\tAltura: "+altura;
    }

    public boolean equals(Object o) {
        if(o instanceof Rectangulo){
            Rectangulo r = (Rectangulo)o;
            if(r.x == this.x && r.y == this.y &&
                r.base == this.base &&
                r.altura == this.altura){
                    return true;
            }else return false;
        } else return false;
    }
}
