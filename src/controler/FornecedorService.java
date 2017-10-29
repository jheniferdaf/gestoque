/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import dao.FornecedorDao;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author Michel
 */
public class FornecedorService {
    
    public static boolean cadastrarFornecedor(Fornecedor f){
        return FornecedorDao.cadastraFornecedor(f);
    }
    
    public static boolean atualizaFonecedor(Fornecedor atual){
       return FornecedorDao.atualizaFornecedor(atual);
        
    }
    
    public static boolean alterarStatusFornecedor(Fornecedor atual){
        return FornecedorDao.alterarStatusFornecedor(atual);
    }
    
    public static Fornecedor consultaFornecedorCnpj(String cnpjFornecedor){
        return FornecedorDao.consultaFornecedorCnpj(cnpjFornecedor);
    }
    
    public static Fornecedor consultaFornecedorInscricao(String inscricaoFornecedor){
        return FornecedorDao.consultaFornecedorInscricao(inscricaoFornecedor);
    }

    public static Fornecedor consultaFornecedorRazaoSocial(String razaoSocial){
        return FornecedorDao.consultaFornecedorRazaoSocial(razaoSocial);
    }

    
    public static List<Fornecedor> recuperaTodosFornecedoresAtivos(){
        return FornecedorDao.ruperaTodosFornecedoresAtivos();
    }
    
    public static List<Fornecedor> recuperaTodosFornecedoresInativos(){
        return FornecedorDao.ruperaTodosFornecedoresInativos();
    }
}
