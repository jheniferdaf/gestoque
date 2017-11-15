
package dao;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    
    //busca movimentações a partir de certa data
    public static ResultSet buscarMovimentacaoData(Date data1, Date data2){
        //List<Movimentacao> movimentacoes = new ArrayList<>();
        ResultSet retorno = null;
        try (Connection conexao = FabricaConexao.criaConexao()) {
            String sql = "select * from produto inner join movimentacao on movimentacao.codigo_produto = produto.codigo where produto.codigo in (select codigo_produto from movimentacao where movimentacao.data between ? and ?)";
            PreparedStatement x = conexao.prepareStatement(sql);

            x.setDate(1, new java.sql.Date(data1.getTime()));
            x.setDate(2, new java.sql.Date(data2.getTime()));
            
            retorno = x.executeQuery();

        } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha ao buscas movimentações por data.");
        }
        return retorno;
    }
    
}
