package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

    private Map<String, Livro> acervo = new HashMap<String, Livro>();
    private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

    public void cadastrarLivro(Livro livro){
        acervo.put(livro.isbn, livro);

    }
    public void cadastrarUsuario(Usuario usuario){
        usuarios.put(usuario.getMatricula(), usuario);

    }
    public Livro pedidoLivro(Livro livro, Usuario usuario){
        if(livro)

        return livro;
    }

    public boolean devolverLivro(String isbn){

        return true;
    }

    public void listarEmprestimos(){

    }
}
