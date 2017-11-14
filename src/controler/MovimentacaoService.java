
package controler;

import dao.MovimentacaoDAO;
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
    
    public static List<Movimentacao> buscarMovimentacaoData(Date data){
        return null;
    }
    
}
