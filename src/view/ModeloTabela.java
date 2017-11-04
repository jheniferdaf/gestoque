/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produto;

/**
 *
 * @author Jheni
 */
public class ModeloTabela extends AbstractTableModel {

    private List<Produto> produtos;

    public ModeloTabela(List<Produto> listaProdutos) {
        //Carregar as informações do arquivo para MemoriaRAM
        this.produtos = new ArrayList<>();
        if (listaProdutos != null){
            this.produtos = listaProdutos;
        }
    }

    public void carregaProdutos(List<Produto> listaProdutos) {
        produtos = listaProdutos;
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0: {
                return produtos.get(linha).getCodigo();
            }
            case 1: {
                return produtos.get(linha).getDescricao();
            }
            case 2: {
                return produtos.get(linha).getQuantidade();
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return false;
    }

    @Override
    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0: {
                return "Código";
            }
            case 1: {
                return "Descrição";
            }
            case 2: {
                return "Em estoque";
            }
            default: {
                return null;
            }
        }
    }

//    @Override
//    public void setValueAt(Object novoValor, int linha, int coluna) {
//        
//        switch(coluna){
//            
//            case 0:{
//                // nome
//                int novoId = (Integer)novoValor;
//                this.produtos.get(linha).setCodigo(novoId);
//            }break;
//            
//            case 1:{
//                // preço
//                String novoNome = (String) novoValor;
//                this.produtos.get(linha).setNome(novoNome);
//            }break;
//            case 2:{
//                double novoPreco = (Double) novoValor;
//                this.produtos.get(linha).setPreco(novoPreco);
//            }break;
//            case 3:{
//                int novaQuantidade = (Integer) novoValor;
//                this.produtos.get(linha).setQuantidade(novaQuantidade);
//            }break;
//        }
//        
//        
//    }
//
    @Override
    public Class<?> getColumnClass(int coluna) {
        switch (coluna) {
            case 0: {
                return Integer.class;
            }
            case 1: {
                return String.class;
            }
            case 2: {
                return Double.class;
            }
            default: {
                return null;
            }
        }
    }
}
