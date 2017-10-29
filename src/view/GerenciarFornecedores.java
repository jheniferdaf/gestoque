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
public class GerenciarFornecedores extends javax.swing.JPanel {
    
    JPanel paineis;
    ConsultaFornecedorAtivo consultaFornecedorAtivo;
    ConsultaFornecedorInativo consultaFornecedorInativo;
    
    
    public GerenciarFornecedores(JPanel paineis, ConsultaFornecedorAtivo consultaFornecedorAtivo, ConsultaFornecedorInativo consultaFornecedorInativo) {
        initComponents();
        this.paineis = paineis;
        this.consultaFornecedorAtivo = consultaFornecedorAtivo;
        this.consultaFornecedorInativo = consultaFornecedorInativo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarFornecedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        consultarFornecedorAtivo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        consultarFornecedorInativo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarFornecedorMouseClicked(evt);
            }
        });
        cadastrarFornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Fornecedor");
        cadastrarFornecedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        add(cadastrarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 200));

        consultarFornecedorAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarFornecedorAtivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarFornecedorAtivoMouseClicked(evt);
            }
        });
        consultarFornecedorAtivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ativo");
        consultarFornecedorAtivo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Consultar Fornecedor");
        consultarFornecedorAtivo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 30));

        add(consultarFornecedorAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 200, 200));

        consultarFornecedorInativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarFornecedorInativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarFornecedorInativoMouseClicked(evt);
            }
        });
        consultarFornecedorInativo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inativo");
        consultarFornecedorInativo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consultar Fornecedor");
        consultarFornecedorInativo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 30));

        add(consultarFornecedorInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 200, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFornecedorMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "cadastroFornecedor");
    }//GEN-LAST:event_cadastrarFornecedorMouseClicked

    private void consultarFornecedorAtivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarFornecedorAtivoMouseClicked
        consultaFornecedorAtivo.atualizarFornecedores();
        consultaFornecedorAtivo.atualizarInformacoes();
        consultaFornecedorAtivo.editaFornecedor.retornar = EditaFornecedor.CONSULTA_ATIVOS;

        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "consultaFornecedorAtivo");
    }//GEN-LAST:event_consultarFornecedorAtivoMouseClicked

    private void consultarFornecedorInativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarFornecedorInativoMouseClicked
        consultaFornecedorInativo.atualizarFornecedores();
        consultaFornecedorInativo.atualizarInformacoes();
        consultaFornecedorInativo.editaFornecedor.retornar = EditaUsuario.CONSULTA_INATIVOS;

        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "consultaFornecedorInativo");
    }//GEN-LAST:event_consultarFornecedorInativoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cadastrarFornecedor;
    private javax.swing.JPanel consultarFornecedorAtivo;
    private javax.swing.JPanel consultarFornecedorInativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
