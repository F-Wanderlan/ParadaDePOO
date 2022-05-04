package quadrinhos;

import java.text.SimpleDateFormat;

public class HQ {
    private String titulo, tipo, dataDePublicacao, volume, autor, idadeSugerida, descricao, editora, idioma, genero, isbn;

    @Override
    public String toString() {
        return "HQ{" +
                "dataDePublicacao='" + dataDePublicacao + '\'' +
                ", editora='" + editora + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDataDePublicacao() {
        return dataDePublicacao;
    }

    public String getVolume() {
        return volume;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdadeSugerida() {
        return idadeSugerida;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEditora() {
        return editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getGenero() {
        return genero;
    }

    public String getIsbn() {
        return isbn;
    }
}
