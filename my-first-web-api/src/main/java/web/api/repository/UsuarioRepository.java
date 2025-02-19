package web.api.repository;

import org.springframework.stereotype.Repository;
import web.api.handler.BusinessException;
import web.api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getLogin()==null) throw new BusinessException("O campo login é obrigatório");
        if(usuario.getPassword()==null) throw new BusinessException("O campo password é obrigatório");

        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("luis","password"));
        usuarios.add(new Usuario("joao","senha123"));
        return usuarios;
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("GET/Username - Recebendo o login: %s para localizar um usuário", username));
        return new Usuario("luis","password");
    }

}
