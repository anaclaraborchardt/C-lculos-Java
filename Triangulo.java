
public abstract class Triangulo extends FormaGeometrica {

    double lado1;
    double lado2;
    double lado3;


    public Triangulo(double lado1, double lado2, double lado3) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "area='" + area + '\'' +
                "perímetro='" + perimetro + '\'' +
                "lado 1='" + lado1 + '\'' +
                "lado 2='" + lado2 + '\'' +
                ", lado 3=" + lado3 +
                '}';
    }

    public boolean verificarLados() {
        boolean existe = true;
        if (lado2 - lado3 < lado1 && lado1 < lado2 + lado3) {
            existe = true;
        } else if (lado1 - lado3 < lado2 && lado2 < lado1 + lado3) {
            existe = true;
        } else if (lado1 - lado2 < lado3 && lado3 < lado1 + lado2) {
            existe = true;
        } else {
            return false;
        }
        return existe;
    }

    @Override
    public double calculoPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public static String classificacao(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado3!=lado1|| lado2 == lado3 && lado2!=lado1|| lado3 == lado1 && lado2!=lado3) {
            return "isóceles";
        } else if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else {
            return "escaleno";
        }
    }

    public static FormaGeometrica listarTriangulo(){
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma instanceof Triangulo) {
                return forma;
            }
        }
        return null;
    }

    @Override
    public double calculoArea() {
        return 0;
    }
}


