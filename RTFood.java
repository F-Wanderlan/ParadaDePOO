package br.ufpb.dcx.aps.atividades.atvXX;

import java.util.HashMap;
import java.util.Map;


public class RTFood {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void addUsuario(Usuario user){
        usuarios.put(user.getIdentificador(), user);
    }

    public Map<String, Usuario> getListaUsuarios(){
        return this.usuarios;
    }

    public Usuario getUsuario(String identificador){
        if(usuarios.containsKey(identificador)){
            return usuarios.get(identificador);
        }
        return null;
    }


}
