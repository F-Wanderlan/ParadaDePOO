package biblioteca;

import org.codehaus.groovy.transform.SourceURIASTTransformation;

import javax.swing.*;

public class BibliotecaSistema extends Biblioteca {

    public static void main (String[]args){

        Biblioteca biblioteca = new Biblioteca();
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade();

        while (true){
        JOptionPane.showMessageDialog(null, "Bem vindo a Biblioteca, que operações deseja fazer?");
        Object[] itens = { "Cadastrar livro", "Cadastrar usuario", "Encontrar livro", "Encontrar usuario" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um item", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]); //
        if ("Cadastrar livro".equals(selectedValue)) {
            String titulo = JOptionPane.showInputDialog("Qual o titulo do livro?");
            String autor = JOptionPane.showInputDialog("Qual o nome do autor?");
            String isbn = JOptionPane.showInputDialog("Qual o ISBN do livro?");
            Livro livro = new Livro();
            livro.isbn = isbn;
            livro.autor = autor;
            livro.titulo = titulo;
            biblioteca.cadastrarLivro(livro);

        }
        else if("Encontrar livro".equals(selectedValue)){
            String isbn = JOptionPane.showInputDialog("Qual o ISBN do seu livro?");
            Livro livro = bibliotecaFacade.consultarLivro(isbn, biblioteca);

        }

    }}
}
