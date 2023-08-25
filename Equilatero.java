public class Equilatero extends Triangulo{
    public Equilatero(double area, double perimetro, double lado1, double lado2, double lado3) {
        super(area, perimetro, lado1, lado2, lado3);
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
