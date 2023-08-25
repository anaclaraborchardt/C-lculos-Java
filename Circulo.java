public class Circulo extends FormaGeometrica {

    double raio;
    double diametro;

    public Circulo(double raio, double diametro) {
        super();

        this.raio = raio;
        this.diametro = diametro;

    }

    public Circulo() {

    }

    @Override
    public double calculoPerimetro() {
        if (raio != 0) {
            perimetro = 3.14 * 2 * raio;
        } else {
            perimetro = 3.14 * diametro;
        }
        return perimetro;
    }

    @Override
    public double calculoArea() {
        if (raio == 0) {
            raio = diametro / 2;
        }
        area = 3.14 * raio * raio;
        return area;
    }

    public static FormaGeometrica listarCirculo(){
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma instanceof Circulo) {
                return forma;
            }
        }
        return null;
    }
}
