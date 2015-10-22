public class UsoDeGrupoFiguras {
    public static void main(String[] args) {
        GrupoFiguras g = new GrupoFiguras();
        g.anyadeFigura(new Circulo(10, 5, 3.5));
        g.anyadeFigura(new Triangulo(10, 5, 6.5, 32));
        g.anyadeFigura(new Rectangulo(3,3,2.5,1.6));
        System.out.println(g);
    }
}
