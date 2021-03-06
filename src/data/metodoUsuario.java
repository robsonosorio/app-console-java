package data;

import entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class metodoUsuario {
    List<Usuario> listaUsuarios = new ArrayList<>();

    public void cadastraUsuario(Usuario usuario) {
            listaUsuarios.add(usuario);
            System.out.println(usuario + "\n");
    }

    public void buscaUsuario() {
        if(listaUsuarios.isEmpty()){
            System.out.println("\nLista não possui usuário cadastrado!\n");
        } else {
            for (Usuario us : listaUsuarios) {
                System.out.println(us);
            }
        }
    }

    public void deletaUsuario(int id) {
        for (Usuario us : listaUsuarios) {
            if (us.getIdUsuario() == id) {
                listaUsuarios.remove(us);
                System.out.println("\nUsuário deletado com sucesso!\n");
                return;
            }
        }
    }

    public void alteraUsuario(Usuario usuario) {
        for (Usuario us : listaUsuarios) {
            if (us.getIdUsuario() == usuario.getIdUsuario()) {
                us.setIdUsuario(usuario.idUsuario);
                us.setNome(usuario.nome);
                us.setEmail(usuario.email);
                System.out.println("\nAlteração realizada com sucesso!\n");
            }
        }
    }
}
