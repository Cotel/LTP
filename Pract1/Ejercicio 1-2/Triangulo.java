public class Triangulo {
    private double x,y,base,altura;

    Triangulo (double cx, double cy, double b, double a) {
        x=cx;
        y=cy;
        base = b;
        altura = a;
    }

     public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
     public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public String toString() {
        return "Triangulo:\n\t"+
                "Posicion: ("+x+","+y+
                ")\n\tBase: "+base+
                "\n\tAltura: "+altura;
    }

    public boolean equals(Object o){
        if(o instanceof Triangulo &&
             ((Triangulo)o).getX() == this.x &&
             ((Triangulo)o).getY() == this.y &&
             ((Triangulo)o).getBase() == this.base &&
             ((Triangulo)o).getAltura() == this.altura) {
            return true;         
        } else {
            return false;
        }
    }
}
