package biblioteca;

import java.util.Map;

public class BibliotecaFacade {
    Biblioteca biblioteca;


    public int verificaDisponibilidade(String isbn, Biblioteca biblioteca){
        for (Livro livro : biblioteca.getAcervo().values()){
            if (isbn.equals(livro.isbn)) {
                return livro.getQuantidade();
            }
        }
        return 0;
    }

    public void efetuarEmprestimo(Usuario usuario, String isbn, Biblioteca biblioteca){
        for (Livro livro : biblioteca.getAcervo().values()){
            if(isbn.equals(livro.isbn)){
                livro.setQuantidade(livro.quantidade -1);
                usuario.getEmprestimos().put(isbn , livro);
            }
        }
    }

    public Emprestimo consultarEmprestimo(Usuario usuario){
        return usuario.emprestimo;

    }

    public Livro consultarLivro(String isbn, Biblioteca biblioteca) {
        for (Livro livro1 : biblioteca.getAcervo().values()) {
            if (livro1.isbn.equals(biblioteca.getAcervo().values())) {
                return livro1;
            }

        }
        return null;
    }


    public void devolverLivro(String isbn, Usuario usuario){
        for(Livro livro : usuario.getEmprestimos().values()){
            if(isbn.equals(livro.isbn)){
                livro.setQuantidade(livro.quantidade + 1);
                usuario.getEmprestimos().remove(isbn);

            }
        }

    }


}
