package data;

import entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class metodoUsuario {
    List<Usuario> listaUsuarios = new ArrayList<>();



    public void cadastraUsuario(Usuario usuario) {
            listaUsuarios.add(usuario);
    }

    public void buscaUsuario() {
        for (Usuario us : listaUsuarios) {
            System.out.println(us.toString());
        }
    }

    public void deletaUsuario(int id) {
        for (Usuario us : listaUsuarios) {
            if (us.getIdUsuario() == id) {
                listaUsuarios.remove(us);
            }
            else {
                System.out.println("Dados inválidos. Usuário não existe");
            }
        }
    }

    public void alteraUsuario(Usuario usuario) {
        for (Usuario us : listaUsuarios) {
            if (us.getIdUsuario() == usuario.getIdUsuario()) {
                listaUsuarios.remove(us);
                listaUsuarios.add(usuario);
            }
        }
    }
}
