package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

    private Map<String, Livro> acervo = new HashMap<String, Livro>();
    private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

    public Map<String, Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(Map<String, Livro> acervo) {
        this.acervo = acervo;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    public void cadastrarLivro(Livro livro){
        acervo.put(livro.isbn, livro);

    }
    public void cadastrarUsuario(Usuario usuario){
        usuarios.put(usuario.getMatricula(), usuario);

    }
    public Livro pedidoLivro(Livro livro, Usuario usuario){

            return livro;
    }

    public boolean devolverLivro(String isbn){

        return true;
    }

    public void listarEmprestimos(){

    }
}
