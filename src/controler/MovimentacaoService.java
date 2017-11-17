
package controler;

import dao.MovimentacaoDAO;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import model.Movimentacao;

/**
 *
 * @author Jheni
 */
public class MovimentacaoService {
    
    public static boolean cadastrarMovimentacao(Movimentacao m){
        return MovimentacaoDAO.cadastrarMovimentacao(m);
    }
    
    public static ResultSet buscarMovimentacaoData(Date data1, Date data2){
        return MovimentacaoDAO.buscarMovimentacaoData(data1, data2);
    }
    
    public static ResultSet buscaMovimentacaoFornecedor(String cnpj){
        return MovimentacaoDAO.buscarMovimentacaoFornecedor(cnpj);
    }
}
