/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ferramentas.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Michel
 */
public class FornecedorDao {

    public static boolean cadastraFornecedor(Fornecedor novoFornecedor) {

        try (Connection con = FabricaConexao.criaConexao()) {

            String sql = "insert into fornecedor(cnpj,inscricao_estadual,telefone,"
                    + "endereco,email,razao_social,ativo)values(?,?,?,?,?,?,?)";

            PreparedStatement xx = con.prepareStatement(sql);

            xx.setString(1, novoFornecedor.getCnpj());
            xx.setString(2, novoFornecedor.getInscricaoEstadual());
            xx.setString(3, novoFornecedor.getTelefone());
            xx.setString(4, novoFornecedor.getEndereco());
            xx.setString(5, novoFornecedor.getEmail());
            xx.setString(6, novoFornecedor.getRazaoSocial());
            xx.setBoolean(7, true);

            xx.execute();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar fornecedor.");
            return false;
        }
    }

    public static boolean atualizaFornecedor(Fornecedor atual) {

        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "update fornecedor set razao_social = ?,telefone = ?,"
                    + " endereco = ?, email = ? where cnpj = ?";

            PreparedStatement xx = con.prepareStatement(sql);
            xx.setString(1, atual.getRazaoSocial());
            xx.setString(2, atual.getTelefone());
            xx.setString(3, atual.getEndereco());
            xx.setString(4, atual.getEmail());

            xx.execute();
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor.");
            return false;
        }
    }

    public static Fornecedor consultaFornecedorCnpj(String cnpjFornecedor) {
        Fornecedor retorno = null;

        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from fornecedor where cnpj = ?";
            PreparedStatement xx = con.prepareStatement(sql);

            xx.setString(1, cnpjFornecedor);
            ResultSet resultado = xx.executeQuery();

            while (resultado.next()) {
                retorno = new Fornecedor(resultado.getString("cnpj"),
                        resultado.getString("inscricao_estadual"),
                        resultado.getString("telefone"),
                        resultado.getString("endereco"),
                        resultado.getString("email"),
                        resultado.getString("razao_social"),
                        resultado.getBoolean("ativo"));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao consultar fornecedor por CNPJ.");
        }
        return retorno;
    }

    public static List<Fornecedor> ruperaTodosFornecedoresAtivos() {
        List<Fornecedor> retorno = new ArrayList<>();

        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from fornecedor where ativo = true";
            PreparedStatement xx = con.prepareStatement(sql);
            ResultSet resultado = xx.executeQuery();
            
            while(resultado.next()){
               retorno.add(new Fornecedor(resultado.getString("cnpj"),
                       resultado.getString("inscricao_estadual"),
                       resultado.getString("telefone"),
                       resultado.getString("endereco"),
                       resultado.getString("email"),
                       resultado.getString("razao_social"),
                       resultado.getBoolean("ativo")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao recuperar todos fornecedores ativos.");
        }
        return retorno;
    }
    
    public static List<Fornecedor> ruperaTodosFornecedoresInativos() {
        List<Fornecedor> retorno = new ArrayList<>();

        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from fornecedor where ativo = false";
            PreparedStatement xx = con.prepareStatement(sql);
            ResultSet resultado = xx.executeQuery();
            
            while(resultado.next()){
                retorno.add(new Fornecedor(resultado.getString("cnpj"),
                       resultado.getString("inscricao_estadual"),
                       resultado.getString("telefone"),
                       resultado.getString("endereco"),
                       resultado.getString("email"),
                       resultado.getString("razao_social"),
                       resultado.getBoolean("ativo")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao recuperar todos fornecedores inativos.");
        }
        return retorno;
    }

}
