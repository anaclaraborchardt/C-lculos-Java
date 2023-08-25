import java.util.Scanner;
public class Main {

    static Professor professorLogado = null;
    static Scanner sc = new Scanner(System.in);
    static double area = 0;
    static double perimetro = 0;

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
            case 0-> logout();
            case 1-> circulo();
            case 2-> triangulo();
            case 3-> retangulo();
            case 4-> quadrado();
            case 5-> listarFormas();
            default-> System.out.println("Opção Inválida");
            }
        }while (true) ;
    }

    public static void circulo(){
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
                circulo = new Circulo(0, (int) diametro);
                break;
            default:
                System.out.println("Opção Inválida");
        }
        perimetro = circulo.calculoPerimetro();
        System.out.println("O perímetro é " + perimetro);
        area = circulo.calculoArea();
        System.out.println("A área é " + area);
        FormaGeometrica.cadastroFormas(new Circulo());
    }

    public static void triangulo() {
        System.out.println("Lado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("Lado 2:");
        double lado2 = sc.nextDouble();
        System.out.println("Lado 3:");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            Isoceles isoceles = new Isoceles(lado1, lado2, lado3);
                area = isoceles.calculoArea();
                perimetro = isoceles.calculoPerimetro();
            FormaGeometrica.cadastroFormas(new Isoceles(lado1, lado2, lado3));
        } else if (lado1 == lado2 && lado2 == lado3) {
            Equilatero equilatero = new Equilatero(lado1, lado2, lado3);
            FormaGeometrica.cadastroFormas(new Equilatero(lado1, lado2, lado3));
            area = equilatero.calculoArea();
            perimetro = equilatero.calculoPerimetro();
        } else {
            Escaleno escaleno = new Escaleno(lado1, lado2, lado3);
                FormaGeometrica.cadastroFormas(new Escaleno(lado1, lado2, lado3));
            area = escaleno.calculoArea();
            perimetro = escaleno.calculoPerimetro();
        }
        System.out.println("A área é " + area);
        System.out.println("O perímetro é " + perimetro);

    }

    public static void retangulo(){
        System.out.println("Lado 1:");
        double lado1= sc.nextDouble();
        System.out.println("Lado 2:");
        double lado2= sc.nextDouble();

            Retangulo retangulo = new Retangulo(lado1, lado2);

            perimetro = retangulo.calculoPerimetro();
            System.out.println("O perímetro é " + perimetro);
            area = retangulo.calculoArea();
            System.out.println("A área é " + area);
            FormaGeometrica.cadastroFormas(new Retangulo(lado1, lado2));
        }

    public static void quadrado(){
        System.out.println("Lado 1:");
        double lado1= sc.nextDouble();

        Quadrado quadrado = new Quadrado(lado1);

        perimetro = quadrado.calculoPerimetro();
        System.out.println("O perímetro é " + perimetro);
        area = quadrado.calculoArea();
        System.out.println("A área é " + area);

        FormaGeometrica.cadastroFormas(new Quadrado(lado1));
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
            case 1-> System.out.println(Circulo.listarCirculo());
            case 2-> System.out.println(Triangulo.listarTriangulo());
            case 3-> System.out.println(Retangulo.listarRetangulo());
            case 4-> System.out.println(Quadrado.listarQuadrado());
            case 5-> System.out.println(FormaGeometrica.listarTodasFormas());
        }

  }

}
