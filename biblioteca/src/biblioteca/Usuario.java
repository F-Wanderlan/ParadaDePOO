package biblioteca;

public class Usuario {
    private String nome, matricula, email;


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



