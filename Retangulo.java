public class Retangulo extends FormaGeometrica {

    double lado1;
    double lado2;

    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "area='" + area + '\'' +
                "perímetro='" + perimetro + '\'' +
                "lado 1='" + lado1 + '\'' +
                ", lado 2=" + lado2 +
                '}';
    }

    public boolean verificarLadosRetangulo() {
        boolean existe = true;
        if (lado1 != lado2) {
        }
        return existe;
    }

    @Override
    public double calculoPerimetro() {
        perimetro = (2*lado1) + (2*lado2);
        return perimetro;
    }

    @Override
    public double calculoArea(){
        area = lado1*lado2;
        return area;
    }

    public static FormaGeometrica listarRetangulo(){
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma instanceof Retangulo) {
                return forma;
            }
        }
        return null;
    }
}