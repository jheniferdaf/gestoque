package dao;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Usuario;
import org.postgresql.util.PSQLException;

/**
 *
 * @author Jheni
 */
public class UsuarioDAO {

    public static boolean cadastrarUsuario(Usuario usuario) {
        try (Connection conexao = FabricaConexao.criaConexao()) {
            String sql = "insert into usuario (cpf, nome, senha, email, telefone, admin, ativo) values(?,?,?,?,?,?,?)";
            PreparedStatement x = conexao.prepareStatement(sql);

            x.setString(1, usuario.getCpf());
            x.setString(2, usuario.getNome());
            x.setString(3, usuario.getSenha());
            x.setString(4, usuario.getEmail());
            x.setString(5, usuario.getTelefone());
            x.setBoolean(6, usuario.isAdministrador());
            x.setBoolean(7, usuario.isAtivo());

            x.execute();

            return true;
        } catch (SQLException ex) {

            if (ex.getMessage().contains("duplicate key value violates unique constraint \"usuario_pkey\"")) {
                JOptionPane.showMessageDialog(null, "CPF j cadastrado.");
                return false;
            } else {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar usuário.");
                return false;
            }
        }
    }

    public static boolean atualizarUsuario(Usuario usuarioAtualizado) {
        try (Connection conexao = FabricaConexao.criaConexao()) {
            String sql = "update usuario set senha = ?, email = ?, telefone = ?, admin = ? where cpf = ?";

            PreparedStatement x = conexao.prepareStatement(sql);

            x.setString(1, usuarioAtualizado.getSenha());
            x.setString(2, usuarioAtualizado.getEmail());
            x.setString(3, usuarioAtualizado.getTelefone());
            x.setBoolean(4, usuarioAtualizado.isAdministrador());
            x.setString(5, usuarioAtualizado.getCpf());

            x.execute();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao atualizar usuário.");
            return false;
        }
    }

    public static boolean alterarStatusUsuario(Usuario usuarioAtualizado) {
        try (Connection conexao = FabricaConexao.criaConexao()) {
            String sql = "update usuario set ativo = ? where cpf = ?";

            PreparedStatement x = conexao.prepareStatement(sql);

            x.setBoolean(1, usuarioAtualizado.isAtivo());
            x.setString(2, usuarioAtualizado.getCpf());

            x.execute();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao alterar status do usuário.");
            return false;
        }
    }

    public static Usuario recuperaUsuarioCpf(String cpf) {
        Usuario usuario = null;
        try (Connection conexao = FabricaConexao.criaConexao()) {
            String sql = "select * from usuario where cpf = ?";
            PreparedStatement x = conexao.prepareStatement(sql);

            x.setString(1, cpf);
            ResultSet info = x.executeQuery();

            while (info.next()) {
                usuario = new Usuario(cpf, info.getString("nome"), info.getString("senha"), info.getString("email"), info.getString("telefone"), info.getBoolean("admin"), info.getBoolean("ativo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário.");
            ex.printStackTrace();
        }
        return usuario;
    }

}
