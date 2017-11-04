/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.ProdutoDao;
import static dao.ProdutoDao.BAIXA;
import java.util.List;
import model.Produto;

/**
 *
 * @author saozi_000
 */
public class ProdutoService {

    public static boolean cadastraProduto(Produto novo) {
        return ProdutoDao.cadastraProduto(novo);
    }

    public static List<Produto> consultaProdutoDescricao(String descricao) {
        return ProdutoDao.consultaProdutoNome(descricao);
    }

    public static Produto consultaProdutoCodigo(int codigo) {
        return ProdutoDao.consultaProdutoCod(codigo);
    }

    //Apenas produtos ATIVOS com estoque mínimo atingido.
    public static List<Produto> produtosEstoqueMinimoAtingido(){
        return ProdutoDao.produtosEstoqueMinimoAtingido();
    }
    
    public static List<Produto> pesquisaProdutosAtivos() {
        return ProdutoDao.recuperaTodosProdutosAtivos();
    }

    public static List<Produto> pesquisaProdutosInativos() {
        return ProdutoDao.recuperaTodosProdutosInativos();
    }

    public static boolean atualizaProduto(Produto p){
        return ProdutoDao.atualizaProduto(p);
    }
    
    public static boolean alterarStatusProduto(Produto p){
        return ProdutoDao.alteraStatusProduto(p);
    }
    
    public static boolean modificaQuantidade(int codigo, int Novaquantidade, int opcao) {
        if (opcao == BAIXA) {
            Novaquantidade = Novaquantidade * -1;
        }
        return ProdutoDao.atualizaQuantidade(codigo, Novaquantidade);
    }

}
