package br.ufpb.dcx.aps.atividades.atvXX.usuarios;

public class UsuarioPJ extends UsuarioGenerico {

    private String  cnpj;


    @Override
    public String getIdentificador() {
        return cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
