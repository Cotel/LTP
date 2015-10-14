public class Triangulo extends Figura {
    private double base,altura;

    Triangulo (double cx, double cy, double b, double a) {
        super(cx, cy);
        base = b;
        altura = a;
    }

    public double area() {
        return base * altura / 2;
    }

    public String toString() {
        return "Triangulo:\n\t"+
                "Posicion: ("+x+","+y+
                ")\n\tBase: "+base+
                "\n\tAltura: "+altura;
    }

    public boolean equals(Object o){
        if(o instanceof Triangulo &&
             ((Triangulo)o).x == this.x &&
             ((Triangulo)o).y == this.y &&
             ((Triangulo)o).base == this.base &&
             ((Triangulo)o).altura == this.altura) {
            return true;
        } else {
            return false;
        }
    }
}
