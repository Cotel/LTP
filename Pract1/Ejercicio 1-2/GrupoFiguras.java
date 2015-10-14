public class GrupoFiguras {
    static final int MAX_NUM_FIGURAS = 10;
    // private Circulo [] listaC = new Circulo [MAX_NUM_FIGURAS/2];
    // private Triangulo [] listaT = new Triangulo [MAX_NUM_FIGURAS/2];
    private Object [] listaFiguras = new Object [MAX_NUM_FIGURAS];
    // private int numC=0, numT=0;
    private int numF=0;
    
    public int getNumF(){
        return numF;
    }
    
    public void anyadeFigura(Object o) {
        if(o instanceof Circulo){
            listaFiguras[numF++] = (Circulo)o;
        } else if (o instanceof Triangulo) {
            listaFiguras[numF++] = (Triangulo)o;
        }
    }

   public void anyadeCirculo(Circulo c) {
        listaFiguras[numF++] = c;
    }

    public void anyadeTriangulo(Triangulo t) {
        listaFiguras[numF++] = t;
    }

    public String toString() {
        String s = "Circulos: \n";
        for(int i=0; i<numF; i++) {
            if (listaFiguras[i] instanceof Circulo)
                s += "\n"+listaFiguras[i].toString();
        }
        s += "\nTriangulos: \n";
        for(int i=0; i<numF; i++){
            if (listaFiguras[i] instanceof Triangulo)
                s += "\n"+listaFiguras[i].toString();
        }
        return s;
    }

    public boolean equals(Object o) {
        if(o instanceof GrupoFiguras) {
            boolean encontrado1 = false;
            for(int i=0; i<numF; i++){
                encontrado1 = false;
                for(int j=0;j<((GrupoFiguras)o).getNumF();j++){
                    if(((GrupoFiguras)o).listaFiguras[j].equals(this.listaFiguras[i])){
                        encontrado1 = true;
                        break;
                    }
                } 
                if(encontrado1==false){
                    return false;
                }
            }
            boolean encontrado2 = false;
            for(int i=0; i<((GrupoFiguras)o).getNumF(); i++){
                encontrado2 = false;
                for(int j=0;j<numF;j++){
                    if(((GrupoFiguras)o).listaFiguras[i].equals(this.listaFiguras[j])){
                        encontrado2 = true;
                        break;
                    }
                } 
                if(encontrado2==false){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
