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
        jLabel4 = new javax.swing.JLabel();
        consultarFornecedorInativo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 248, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarFornecedor.setBackground(new java.awt.Color(244, 248, 250));
        cadastrarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarFornecedorMouseClicked(evt);
            }
        });
        cadastrarFornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add User Group Man Man_100px.png"))); // NOI18N
        jLabel1.setText("Cadastrar Fornecedor");
        cadastrarFornecedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 100));

        add(cadastrarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 470, 100));

        consultarFornecedorAtivo.setBackground(new java.awt.Color(244, 248, 250));
        consultarFornecedorAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarFornecedorAtivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarFornecedorAtivoMouseClicked(evt);
            }
        });
        consultarFornecedorAtivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find User Male_100px.png"))); // NOI18N
        jLabel4.setText("Consultar Fornecedor Ativo");
        consultarFornecedorAtivo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        add(consultarFornecedorAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 550, 90));

        consultarFornecedorInativo.setBackground(new java.awt.Color(244, 248, 250));
        consultarFornecedorInativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarFornecedorInativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarFornecedorInativoMouseClicked(evt);
            }
        });
        consultarFornecedorInativo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find User Male_100px.png"))); // NOI18N
        jLabel5.setText("Consultar Fornecedor Inativo");
        consultarFornecedorInativo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 90));

        add(consultarFornecedorInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 580, 90));
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
