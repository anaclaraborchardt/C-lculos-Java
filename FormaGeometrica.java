import java.util.ArrayList;

public class FormaGeometrica {

    double area;
    double perimetro;
    private Circulo circulo;
    private Retangulo retangulo;
    private Quadrado quadrado;
    private Triangulo triangulo;
    static ArrayList<FormaGeometrica> todasFormas = new ArrayList<>();

    public FormaGeometrica(double area, double perimetro, Circulo circulo, Retangulo retangulo,
                           Quadrado quadrado, Triangulo triangulo){
        this.area = area;
        this.perimetro = perimetro;
        this.circulo = circulo;
        this.quadrado = quadrado;
        this.retangulo = retangulo;
        this.triangulo = triangulo;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "area=" + area +
                "perimetro=" + perimetro +
                "circulo=" + circulo +
                ", retangulo=" + retangulo +
                ", quadrado=" + quadrado +
                ", triangulo=" + triangulo +
                '}';
    }

    public FormaGeometrica() {

    }
    public static void cadastroFormas(FormaGeometrica formas){
        todasFormas.add(formas);
    }

    public Circulo getCirculo() {
        return circulo;
    }
    public Triangulo getTriangulo() {
        return triangulo;
    }
    public Retangulo getRetangulo() {
        return retangulo;
    }
    public Quadrado getQuadrado() {
        return quadrado;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return  perimetro;
    }

    public static void listarTodasFormas(){
        Circulo.listarCirculo();
        Triangulo.listarTriangulo();
        Retangulo.listarRetangulo();
        Quadrado.listarQuadrado();
    }

}
