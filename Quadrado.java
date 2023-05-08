
public class Quadrado extends FormaGeometrica {

    double lado1;

    public Quadrado(double lado1){
        this.lado1 = lado1;
    }
    @Override
    public String toString() {
        return "Quadrado{" +
                ", lado 1=" + lado1 +
                '}';
    }

    public double getLado1() {
        return lado1;
    }

    public double calculoPerimetro() {
        perimetro = (4*lado1);
        return perimetro;
    }

    public double calculoArea(){
        area = lado1 * lado1;
        return area;
    }
    public static void listarQuadrado() {
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma.getQuadrado() != null) {
                System.out.println("Quadrado - Área: " + forma.getArea() + ", Perímetro: " + forma.getPerimetro());
                System.out.println("Lado: " + forma.getQuadrado().getLado1());
            }
        }
    }
}
