
package controler;

import dao.MovimentacaoDAO;
import model.Movimentacao;

/**
 *
 * @author Jheni
 */
public class MovimentacaoService {
    
    public static boolean cadastrarMovimentacao(Movimentacao m){
        return MovimentacaoDAO.cadastrarMovimentacao(m);
    }
    
}
