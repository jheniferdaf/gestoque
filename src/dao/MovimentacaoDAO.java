
package dao;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Movimentacao;

/**
 *
 * @author Jheni
 */
public class MovimentacaoDAO {
    public static boolean cadastrarMovimentacao(Movimentacao m){
        try (Connection conexao = FabricaConexao.criaConexao()) {
            String sql = "insert into movimentacao (codigo_produto, quantidade, cpf_usuario, tipo_movimentacao, data, observacao) values(?,?,?,?,?,?)";
            PreparedStatement x = conexao.prepareStatement(sql);

            x.setInt(1, m.getCodigoProduto());
            x.setDouble(2, m.getQuantidade());
            x.setString(3, m.getCpfUsuario());
            x.setInt(4, m.getTipoMovimentacao());
            x.setDate(5, new java.sql.Date(m.getData().getTime()));
            x.setString(6, m.getObservacao());

            x.execute();

            return true;
        } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar movimentação.");
                return false;
            
        }
    }
    
    public static boolean buscarMovimentacao(Movimentacao m){
        
        return true;
    }
    
}
