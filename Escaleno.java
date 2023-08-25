public class Escaleno extends Triangulo {
    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public double calculoArea() {
        if(verificarLados()) {
            if (lado1 == lado2 && lado2 == lado3) {
                area = (Math.sqrt(3) / 4) * (lado1 * lado1);
            }
        }
        return area;
    }

}
