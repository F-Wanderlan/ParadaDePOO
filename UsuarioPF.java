package br.ufpb.dcx.aps.atividades.atvXX.usuarios;

public class UsuarioPF extends UsuarioGenerico {

    private String cpf;


    @Override
    public String getIdentificador() {
        return cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}