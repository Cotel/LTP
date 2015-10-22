public class GrupoFiguras {
    static final int MAX_NUM_FIGURAS = 10;
    private Figura [] listaFiguras = new Figura [MAX_NUM_FIGURAS];
    private int numF=0;

    public int getNumF(){
        return numF;
    }

    public Figura getFig(int i){
        if(i>=0 && i<numF) {
            return listaFiguras[i];
        } else return null;
    }

    public double area() {
        double res = 0;
        for(int i=0; i<numF; i++) {
            res += listaFiguras[i].area();
        }
        return res;
    }

    public void anyadeFigura(Figura f) {
        listaFiguras[numF++]=f;
    }

    public String toString() {
        String s = "";
        for(int i=0; i<numF; i++) {
            s += "\n"+listaFiguras[i];
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
