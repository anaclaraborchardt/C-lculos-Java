public class Retangulo extends FormaGeometrica {

    double lado1;
    double lado2;

    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
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

    public double calculoPerimetro() {
        perimetro = (2*lado1) + (2*lado2);
        return perimetro;
    }

    public double calculoArea(){
        area = lado1*lado2;
        return area;
    }

    public static void listarRetangulo() {
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma.getRetangulo() != null) {
                System.out.println("Retângulo - Área: " + forma.getArea() + ", Perímetro: " + forma.getPerimetro());
                System.out.println("Lado1: " + forma.getRetangulo().getLado1() + "," +
                        "Lado2: " + forma.getRetangulo().getLado2());
            }
        }
    }

}