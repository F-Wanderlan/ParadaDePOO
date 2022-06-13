package br.ufpb.dcx.aps.atividades.atvXX.usuarios;

import br.ufpb.dcx.aps.atividades.atvXX.Usuario;

public abstract class UsuarioGenerico implements Usuario {

    private String nome, endereco;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public abstract String getIdentificador() ;

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
