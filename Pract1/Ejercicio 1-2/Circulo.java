public class Circulo {
    private double x, y;
    private double r;

    Circulo(double a, double b, double c) {
        x=a;
        y=b;
        r=c;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double getR(){
        return this.r;
    }
    
    public String toString() {
        return "Circulo: \n\t"+
                "Posicion: ("+x+","+y+
                ")\n\tRadio: "+r;
    }

    public boolean equals(Object o){
        if(o instanceof Circulo &&
             ((Circulo)o).getX() == this.x &&
             ((Circulo)o).getY() == this.y &&
             ((Circulo)o).getR() == this.r) {
            return true;         
        } else {
            return false;
        }
    }
}
