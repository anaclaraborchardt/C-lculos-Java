
public class Triangulo extends FormaGeometrica {

    double lado1;
    double lado2;
    double lado3;
    String classificacao;
    double area;

    public Triangulo(double lado1, double lado2, double lado3) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
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

    public double area() {
        double area;
        if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            Isoceles isoceles = new Isoceles(lado1, lado2, lado3);
            area = isoceles.calculoIsoceles();
        } else if (lado1 == lado2 && lado2 == lado3) {
            Equilatero equilatero = new Equilatero(lado1, lado2, lado3);
            area = equilatero.calculoEquilatero();
        } else {
            Escaleno escaleno = new Escaleno(lado1, lado2, lado3);
            area = escaleno.calculoEscaleno();
        }
        return area;
    }

    public double calculoPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public static void listarTriangulo() {
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma.getTriangulo() != null) {
                System.out.println("Triângulo - Área: " + forma.getArea() + ", Perímetro: " + forma.getPerimetro());
                System.out.println("Lado1: " + forma.getTriangulo().getLado1() + "," +
                        " Lado2: " + forma.getTriangulo().getLado2() +
                        "Lado3: " + forma.getTriangulo().getLado3());
                System.out.println(classificacao(forma.getTriangulo().getLado1(), forma.getTriangulo().getLado2(),
                        forma.getTriangulo().getLado3()));

            }
        }
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
}


