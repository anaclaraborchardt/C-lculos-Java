import java.util.ArrayList;

public abstract class FormaGeometrica {

    double area;
    double perimetro;

    static ArrayList<FormaGeometrica> todasFormas = new ArrayList<>();

    public FormaGeometrica() {

    }
    public static void cadastroFormas(FormaGeometrica formas){
        todasFormas.add(formas);
    }

    public static FormaGeometrica listarTodasFormas(){
        for (FormaGeometrica forma : FormaGeometrica.todasFormas) {
            if (forma != null) {
                return forma;
            }
        }
        return null;
    }

    public abstract double calculoPerimetro();

    public abstract double calculoArea();
}
