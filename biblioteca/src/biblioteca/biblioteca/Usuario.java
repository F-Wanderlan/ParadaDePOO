package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Usuario {

    Emprestimo emprestimo;

    private Map<String, Livro> emprestimos = new HashMap<>();



    private String nome, matricula, email;

    public Map<String, Livro> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Map<String, Livro> emprestimos) {
        this.emprestimos = emprestimos;
    }




    public Usuario(String nome, String matricula, String email){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;

    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getEmail() {
        return email;
    }
}
