/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jheni
 */
public class ConsultaFornecedor extends javax.swing.JPanel {
    JPanel paineis;
    /**
     * Creates new form ConsultaFornecedores
     */
    public ConsultaFornecedor(JPanel paineis) {
        initComponents();
        this.paineis = paineis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar1.setText("Voltar");
        voltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar1MouseClicked(evt);
            }
        });
        add(voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void voltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar1MouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarFornecedores");
    }//GEN-LAST:event_voltar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel voltar1;
    // End of variables declaration//GEN-END:variables
}
