/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ProdutoService;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import model.Produto;

/**
 *
 * @author Jheni
 */
public class ProdutosEstoqueMinimo extends javax.swing.JPanel {
    JPanel paineis;

    public ProdutosEstoqueMinimo(JPanel paineis) {
        initComponents();
        this.paineis = paineis;
        
        atualizaProdutos();
        
    }

    public void atualizaProdutos(){
        tabela.setModel(new ModeloTabela(ProdutoService.produtosEstoqueMinimoAtingido()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 630, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarProdutos");
    }//GEN-LAST:event_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
