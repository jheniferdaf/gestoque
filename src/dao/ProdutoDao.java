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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author saozi_000
 */
public class ProdutoDao {

    public static final int ENTRADA = 1;
    public static final int BAIXA = 2;

    public static boolean cadastraProduto(Produto novoProduto) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "insert into produto(descricao,categoria,preco_custo,preco_venda,estoque_minimo,ativo,cnpj_fornecedor, estoque_atual) values (?,?,?,?,?,?,?,?)";
            PreparedStatement x = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            x.setString(1, novoProduto.getDescricao());
            x.setString(2, novoProduto.getCategoria());
            x.setDouble(3, novoProduto.getpCusto());
            x.setDouble(4, novoProduto.getpVenda());
            x.setInt(5, novoProduto.getEstoqueMinimo());
            x.setBoolean(6, true);
            x.setString(7, novoProduto.getCnpjFornec());
            x.setInt(8, 0);

            x.execute();
            
            ResultSet codGerados = x.getGeneratedKeys();
            while (codGerados.next()) {
                int novoCodigo = codGerados.getInt("codigo");
                novoProduto.setCodigo(novoCodigo);
            }
            
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto.");
            return false;
        }

    }

    public static Produto consultaProdutoCod(int codigo) {
        Produto retorno = null;
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * produto where codigo = ?";
            PreparedStatement x = con.prepareStatement(sql);
            x.setInt(1, codigo);
            ResultSet pesquisaBD = x.executeQuery();

            while (pesquisaBD.next()) {
                retorno = new Produto(pesquisaBD.getInt("codigo"),
                        pesquisaBD.getString("descricao"),
                        pesquisaBD.getString("categoria"),
                        pesquisaBD.getInt("quantidade"),
                        pesquisaBD.getDouble("preco_custo"),
                        pesquisaBD.getDouble("preco_venda"),
                        pesquisaBD.getInt("estoque_minimo"),
                        pesquisaBD.getString("cnpj_fornecedor"),
                        pesquisaBD.getBoolean("ativo"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return retorno;
    }

    public static List<Produto> consultaProdutoNome(String nome) {
        List<Produto> retorno = new ArrayList<>();

        try (Connection con = FabricaConexao.criaConexao()) {

            String sql = "select * from produto where nome = %?%";

            PreparedStatement x = con.prepareStatement(sql);
            x.setString(1, nome);

            ResultSet pesquisaBD = x.executeQuery();

            while (pesquisaBD.next()) {
                Produto temp = new Produto(pesquisaBD.getInt("codigo"),
                        pesquisaBD.getString("descricao"),
                        pesquisaBD.getString("categoria"),
                        pesquisaBD.getInt("quantidade"),
                        pesquisaBD.getDouble("preco_custo"),
                        pesquisaBD.getDouble("preco_venda"),
                        pesquisaBD.getInt("estoque_minimo"),
                        pesquisaBD.getString("cnpj_fornecedor"),
                        pesquisaBD.getBoolean("ativo"));

                retorno.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro na sql...");
        }
        return retorno;
    }

    public static List<Produto> recuperaTodosProdutosAtivos() {
        List<Produto> retorno = new ArrayList<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select *from produto where ativo = true";
            PreparedStatement x = con.prepareStatement(sql);
            ResultSet pesquisaBD = x.executeQuery();
            while (pesquisaBD.next()) {
                retorno.add(new Produto(pesquisaBD.getInt("codigo"),
                        pesquisaBD.getString("descricao"),
                        pesquisaBD.getString("categoria"),
                        pesquisaBD.getInt("quantidade"),
                        pesquisaBD.getDouble("preco_custo"),
                        pesquisaBD.getDouble("preco_venda"),
                        pesquisaBD.getInt("estoque_minimo"),
                        pesquisaBD.getString("cnpj_fornecedor"),
                        pesquisaBD.getBoolean("true")));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro na sql...");

        }
        return retorno;
    }

    public static List<Produto> recuperaTodosProdutosInativos() {
        List<Produto> retorno = new ArrayList<>();
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select *from produto where ativo = false";
            PreparedStatement x = con.prepareStatement(sql);
            ResultSet pesquisaBD = x.executeQuery();
            while (pesquisaBD.next()) {
                retorno.add(new Produto(pesquisaBD.getInt("codigo"),
                        pesquisaBD.getString("descricao"),
                        pesquisaBD.getString("categoria"),
                        pesquisaBD.getInt("quantidade"),
                        pesquisaBD.getDouble("preco_custo"),
                        pesquisaBD.getDouble("preco_venda"),
                        pesquisaBD.getInt("estoque_minimo"),
                        pesquisaBD.getString("cnpj_fornecedor"),
                        pesquisaBD.getBoolean("false")));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro na sql...");

        }
        return retorno;
    }

    public static boolean atualizaPrecoCusto(int codigo, double novoPrecoCusto) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "update produto set preco_custo = ? where codigo =?";
            PreparedStatement x = con.prepareStatement(sql);
            x.setDouble(1, novoPrecoCusto);
            x.setInt(2, codigo);
            x.execute();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao executar a sql...");
            return false;

        }

    }

    public static boolean atualizaPrecoVenda(int codigo, double novoPrecoVenda) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "update produto set preco_venda =? where codigo =?";
            PreparedStatement x = con.prepareStatement(sql);
            x.setDouble(1, novoPrecoVenda);
            x.setInt(2, codigo);
            x.execute();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao executar a sql...");
            return false;

        }
    }

    public static boolean atualizaQuantidade(int codigo, int novaQuantidade) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "update produto set quantidade = quantidade + ? where codigo= ?";
            PreparedStatement x = con.prepareStatement(sql);
           
            x.setInt(1, novaQuantidade);
            x.setInt(2, codigo);

            x.execute();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao executar a sql...");
            return false;

        }

    }

   /* public static boolean baixaEstoque(int codigo, int novoEstoque) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "update produto set quantidade = quantidade = ? where codigo = ? and quantidade >= ?";
            PreparedStatement x = con.prepareStatement(sql);
            

            
                x.setInt(1, codigo);
                x.setInt(2, novoEstoque);
                x.execute();

           
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Erro ao executar a sql...");
            return false;

        }
    }*/

}
