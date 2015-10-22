public class Circulo extends Figura {
    protected double r;

    Circulo(double a, double b, double c) {
        super(a,b);
        r=c;
    }

    public double area(){
        return Math.pow(r,2)*Math.PI;
    }

    public String toString() {
        return "Circulo: \n\t"+
                super.toString()+
                "\n\tRadio: "+r;
    }

    public boolean equals(Object o){
        if(o instanceof Circulo &&
             ((Circulo)o).x == this.x &&
             ((Circulo)o).y == this.y &&
             ((Circulo)o).r == this.r) {
            return true;
        } else {
            return false;
        }
    }
}
