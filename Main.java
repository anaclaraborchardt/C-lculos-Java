import java.util.Scanner;
public class Main {

    static Professor professorLogado = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        do{
                menuLogin();
        }while(true);
    }

    public static void menuLogin() {
        int tentativas = 0;

        Professor professor1 = new Professor(Professor.senha);
        professor1.cadastroProfessor();

        while (tentativas < 3) {
            System.out.println("Digite sua senha");
            String senha = sc.next();

            boolean encontrado = false;
            for (Professor professor : Professor.listaProfessores) {
                if (senha.equals(professor.getSenha())) {
                    encontrado = true;
                    escolhaForma();
                    professorLogado=professor;
                    System.out.println("Bem-vindo!");
                    break;
                } else {
                    System.out.println("Senha incorreta. Tente novamente.");
                    tentativas++;
                }
            }
        }

        System.out.println("Número de tentativas excedida");
    }

    public static void escolhaForma(){

        int opcao;
        do{
        System.out.println("Digite a opção desejada: " +
                "\n1- Círculo;" +
                "\n2- Triângulo;" +
                "\n3- Retângulo;" +
                "\n4- Quadrado;" +
                "\n5- Listar;" +
                "\n0- Logout.");
        opcao=sc.nextInt();

        switch(opcao) {
            case 0:
                logout();
            case 1:
                opcaoCirculo();
                break;
            case 2:
                triangulo();
                break;
            case 3:
                retangulo();
                break;
            case 4:
                quadrado();
                break;
            case 5:
                listarFormas();
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        }while (true) ;
    }
    public static void opcaoCirculo(){
        int opcaoCirculo;
        Circulo circulo = null;
        System.out.println("Qual você irá cadastrar:" +
                "\n1- Raio;" +
                "\n2- Diâmetro.");
        opcaoCirculo=sc.nextInt();

        switch(opcaoCirculo){
            case 1:
                System.out.println("Digite o raio:");
                double raio = sc.nextDouble();
                circulo = new Circulo(raio, 0);
                break;
            case 2:
                System.out.println("Digite o diâmetro:");
                double diametro = sc.nextDouble();
                circulo = new Circulo(0, diametro);
                break;
            default:
                System.out.println("Opção Inválida");
        }
        double perimetro = circulo.calculoPerimetro();
        System.out.println("O perímetro é " + perimetro);
        double area = circulo.calculoArea();
        System.out.println("A área é " + area);
        FormaGeometrica forma = new FormaGeometrica(area, perimetro, new Circulo(circulo.raio, circulo.diametro),
                null, null, null);;
        FormaGeometrica.cadastroFormas(forma);
    }

    public static void triangulo() {
        System.out.println("Lado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("Lado 2:");
        double lado2 = sc.nextDouble();
        System.out.println("Lado 3:");
        double lado3 = sc.nextDouble();

        Triangulo triangulo1 = new Triangulo(lado1, lado2, lado3);
        if(triangulo1.verificarLados()) {
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            double perimetro = triangulo.calculoPerimetro();
            System.out.println("O perímetro é " + perimetro);
            double area = triangulo.area();
            System.out.println("A área é " + area);

            FormaGeometrica forma = new FormaGeometrica(area, perimetro, null, null, null,
                    new Triangulo(lado1, lado2, lado3));
            FormaGeometrica.cadastroFormas(forma);

            System.out.println(Triangulo.classificacao(forma.getTriangulo().getLado1(), forma.getTriangulo().getLado2(),
                    forma.getTriangulo().getLado3()));

        } else {
            System.out.println("O triângulo não existe.");
        }
    }

    public static void retangulo(){
        System.out.println("Lado 1:");
        double lado1= sc.nextDouble();
        System.out.println("Lado 2:");
        double lado2= sc.nextDouble();

        Retangulo retangulo1 = new Retangulo(lado1, lado2);
        if(retangulo1.verificarLadosRetangulo()) {
            Retangulo retangulo = new Retangulo(lado1, lado2);

            double perimetro = retangulo.calculoPerimetro();
            System.out.println("O perímetro é " + perimetro);
            double area = retangulo.calculoArea();
            System.out.println("A área é " + area);
            FormaGeometrica forma = new FormaGeometrica(area, perimetro, null, new Retangulo(lado1, lado2),
                    null, null);
            FormaGeometrica.cadastroFormas(forma);
        }else{
            System.out.println("Retângulo não existe");
        }

    }

    public static void quadrado(){
        System.out.println("Lado 1:");
        double lado1= sc.nextDouble();

        Quadrado quadrado = new Quadrado(lado1);

        double perimetro = quadrado.calculoPerimetro();
        System.out.println("O perímetro é " + perimetro);
        double area = quadrado.calculoArea();
        System.out.println("A área é "+area);

        FormaGeometrica forma = new FormaGeometrica(area, perimetro, null, null,
                new Quadrado(lado1), null);
        FormaGeometrica.cadastroFormas(forma);
    }
    public static void logout(){
        int tentativas = 0;

        while (tentativas < 3) {
        System.out.println("Digite sua senha");
        String senha = sc.next();

        boolean encontrado = false;
        for (Professor professor : Professor.listaProfessores) {
            if (senha.equals(professor.getSenha())) {
                encontrado = true;
                professorLogado = null;
                System.out.println("Programa Finalizado");
                System.exit(0);
            }
        }
    }
    }

    public static void listarFormas(){
        int opcao;
        System.out.println("Digite a opção desejada: " +
                "\n1- Círculo;" +
                "\n2- Triângulo;" +
                "\n3- Retângulo;" +
                "\n4- Quadrado;" +
                "\n5- todas;" +
                "\n6- Voltar ao menu principal;" );
        opcao=sc.nextInt();

        switch(opcao){
            case 1:
                Circulo.listarCirculo();
                break;
            case 2:
                Triangulo.listarTriangulo();
                break;
            case 3:
                Retangulo.listarRetangulo();
                break;
            case 4:
                Quadrado.listarQuadrado();
                break;
            case 5:
                FormaGeometrica.listarTodasFormas();
                break;
            case 6:
                escolhaForma();
            default:
                System.out.println("Opção Inválida");

        }
    }

}