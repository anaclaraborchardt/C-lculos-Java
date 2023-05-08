public class Circulo extends FormaGeometrica {

    double raio;
    double diametro;

    public Circulo(double raio, double diametro) {

        this.raio = raio;
        this.diametro = diametro;
    }

    public double getRaio() {
        return raio;
    }


    public double getDiametro() {
        return diametro;
    }

    public Circulo() {

    }

    public double calculoPerimetro() {
        if (raio != 0) {
            perimetro = 3.14 * 2 * raio;
        } else {
            perimetro = 3.14 * diametro;
        }
        return perimetro;
    }

    public double calculoArea() {
        if (raio == 0) {
            raio = diametro / 2;
        }
        area = 3.14 * raio * raio;
        return area;
    }

    public static void listarCirculo() {
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma.getCirculo() != null) {
                System.out.println("Círculo - Área: " + forma.getArea() + ", Perímetro: " + forma.getPerimetro());
                System.out.println("Raio: " + forma.getCirculo().getRaio() + ", Diâmetro: " + forma.getCirculo().getDiametro());
            }
        }
    }
}
