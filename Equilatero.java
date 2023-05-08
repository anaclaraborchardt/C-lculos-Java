public class Equilatero extends Triangulo{
    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public  double calculoEquilatero(){
        area = (Math.sqrt(3)/4) * (lado1*lado1);
        return area;
    }
}
