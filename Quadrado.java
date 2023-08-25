
public class Quadrado extends FormaGeometrica {

    double lado1;

    public Quadrado(double area, double perimetro,double lado1){
        this.area = area;
        this.perimetro = perimetro;
        this.lado1 = lado1;
    }
    @Override
    public String toString() {
        return "Quadrado{" +
                "area='" + area + '\'' +
                "perímetro='" + perimetro + '\'' +
                ", lado 1=" + lado1 +
                '}';
    }

    @Override
    public double calculoPerimetro() {
        perimetro = (4*lado1);
        return perimetro;
    }

    @Override
    public double calculoArea(){
        area = lado1 * lado1;
        return area;
    }

    public static FormaGeometrica listarQuadrado(){
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma instanceof Quadrado) {
                return forma;
            }
        }
        return null;
    }
}
