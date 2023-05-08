public class Escaleno extends Triangulo {
    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    double semiperimetro;

    public double calculoEscaleno(){

        semiperimetro = calculoPerimetro()/2;
        area = Math.sqrt(semiperimetro*(semiperimetro - lado1) *
                (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;

        //Área = √semiperimetro. (semiperimetro − lado1). (semiperimetro − lado2). (semiperimetro − lado3)
    }
}
