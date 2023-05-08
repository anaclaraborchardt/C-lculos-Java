import java.util.ArrayList;

public class Professor {

    static String senha;
    static ArrayList<Professor> listaProfessores = new ArrayList<>();

    public Professor(String senha) {
        this.senha = senha;
    }


    public String getSenha() {
        return senha;
    }

    public void cadastroProfessor() {
        Professor professor1 = new Professor("123");
        listaProfessores.add(professor1);
    }
}
