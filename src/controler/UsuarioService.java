package controler;

import dao.UsuarioDAO;
import model.Usuario;

/**
 *
 * @author Jheni
 */
public class UsuarioService {
    public static boolean cadastrarUsuario(Usuario usuario){
        return UsuarioDAO.cadastrarUsuario(usuario);
    }
    
    public static boolean atualizarUsuario(Usuario usuarioAtualizado){
        return UsuarioDAO.atualizarUsuario(usuarioAtualizado);
    }
    
    public static boolean alterarStatusUsuario(Usuario usuario){
        return UsuarioDAO.alterarStatusUsuario(usuario);
    }
    
    public static Usuario buscaUsuarioCpf(String cpf){
        return UsuarioDAO.recuperaUsuarioCpf(cpf);
    }
}
