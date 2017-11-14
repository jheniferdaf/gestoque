/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.FornecedorService;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import model.Fornecedor;

/**
 *
 * @author Jheni
 */
public class Relatorios extends javax.swing.JPanel {
    JPanel paineis;
    private ButtonGroup grupoRadioButton;

    List<Fornecedor> listaFornecedores = new ArrayList<>();
    DefaultComboBoxModel padraoFornecedores;
    
    public Relatorios(JPanel paineis) {
        initComponents();
        this.paineis = paineis;
        
        cnpjInvalido.setVisible(false);
        
        grupoRadioButton = new ButtonGroup();
        grupoRadioButton.add(pesquisarData);
        grupoRadioButton.add(pesquisarFornecedor);
    }
    
    public void atualizarFornecedores() {
        listaFornecedores = FornecedorService.recuperaTodosFornecedoresAtivos();

        padraoFornecedores = new DefaultComboBoxModel();
        for (Fornecedor f : listaFornecedores) {
            padraoFornecedores.addElement(f.getRazaoSocial());
        }
        fornecedores.setModel(padraoFornecedores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separadorCpf = new javax.swing.JSeparator();
        fornecedores = new javax.swing.JComboBox<>();
        cnpj = new javax.swing.JFormattedTextField();
        cnpjInvalido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisarFornecedor = new javax.swing.JRadioButton();
        pesquisarData = new javax.swing.JRadioButton();
        botaoConfirmar = new javax.swing.JPanel();
        labelConfirmar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 248, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separadorCpf.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, 10));

        fornecedores.setBackground(new java.awt.Color(244, 248, 250));
        fornecedores.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        fornecedores.setForeground(new java.awt.Color(0, 8, 10));
        fornecedores.setBorder(null);
        fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedoresActionPerformed(evt);
            }
        });
        add(fornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 560, 30));

        cnpj.setBackground(new java.awt.Color(244, 248, 250));
        cnpj.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cnpj.setForeground(new java.awt.Color(0, 8, 10));
        try {
            cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###.####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpj.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        cnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cnpjFocusLost(evt);
            }
        });
        cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjActionPerformed(evt);
            }
        });
        cnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnpjKeyReleased(evt);
            }
        });
        add(cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 130, 30));

        cnpjInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(cnpjInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 30, 30));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 8, 10));
        jLabel2.setText("CNPJ:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 70, -1));

        pesquisarFornecedor.setBackground(new java.awt.Color(244, 248, 250));
        pesquisarFornecedor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        pesquisarFornecedor.setForeground(new java.awt.Color(0, 8, 10));
        pesquisarFornecedor.setText("Pesquisar por Fornecedor");
        pesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarFornecedorActionPerformed(evt);
            }
        });
        add(pesquisarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 200, -1, -1));

        pesquisarData.setBackground(new java.awt.Color(244, 248, 250));
        pesquisarData.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        pesquisarData.setForeground(new java.awt.Color(0, 8, 10));
        pesquisarData.setText("Pesquisar por Data:");
        pesquisarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarDataActionPerformed(evt);
            }
        });
        add(pesquisarData, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 67, -1, -1));

        botaoConfirmar.setBackground(new java.awt.Color(181, 212, 222));
        botaoConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoConfirmarMouseExited(evt);
            }
        });
        botaoConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConfirmar.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        labelConfirmar.setForeground(new java.awt.Color(0, 8, 10));
        labelConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirmar.setText("Pesquisar");
        labelConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelConfirmarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelConfirmarMousePressed(evt);
            }
        });
        botaoConfirmar.add(labelConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        add(botaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedoresActionPerformed

    }//GEN-LAST:event_fornecedoresActionPerformed

    private void cnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnpjFocusLost
        String cnpj2 = cnpj.getText().replace(" ", "");
        boolean entrou = false;

        if (cnpj2.length() == 18) {
            cnpjInvalido.setVisible(false);
            for (Fornecedor f : listaFornecedores) {
                if (f.getCnpj().equals(cnpj2)) {
                    entrou = true;

                    System.out.println(f.getRazaoSocial());

                    fornecedores.setSelectedIndex(listaFornecedores.indexOf(f));
                    //padraoUsuarios.setSelectedItem(listaUsuarios.indexOf(u));
                    break;
                }
            }
            if (entrou == false) {
                cnpjInvalido.setVisible(true);
                cnpjInvalido.setToolTipText("Fornecedor não cadastrado.");
            }
        } else {
            cnpjInvalido.setVisible(true);
            cnpjInvalido.setToolTipText("CNPJ inválido.");
        }
    }//GEN-LAST:event_cnpjFocusLost

    private void cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjActionPerformed

    private void cnpjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjKeyReleased
        if (evt.getKeyCode() == '\n') {
            cnpj.transferFocus();
        }
    }//GEN-LAST:event_cnpjKeyReleased

    private void pesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarFornecedorActionPerformed
        cnpj.setEnabled(true);
        cnpjInvalido.setEnabled(true);
        fornecedores.setEnabled(true);
    }//GEN-LAST:event_pesquisarFornecedorActionPerformed

    private void pesquisarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarDataActionPerformed

        cnpj.setEnabled(false);
        cnpjInvalido.setVisible(false);
        fornecedores.setEnabled(false);
        
    }//GEN-LAST:event_pesquisarDataActionPerformed

    private void labelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseClicked
       
    }//GEN-LAST:event_labelConfirmarMouseClicked

    private void labelConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseEntered
        botaoConfirmar.setBackground(Color.gray);
        labelConfirmar.setForeground(Color.white);
    }//GEN-LAST:event_labelConfirmarMouseEntered

    private void labelConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseExited
        botaoConfirmar.setBackground(new Color(240,240,240));
        labelConfirmar.setForeground(Color.black);
    }//GEN-LAST:event_labelConfirmarMouseExited

    private void labelConfirmarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMousePressed
        botaoConfirmar.setBackground(Color.white);
        labelConfirmar.setForeground(Color.black);
    }//GEN-LAST:event_labelConfirmarMousePressed

    private void botaoConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseClicked

    }//GEN-LAST:event_botaoConfirmarMouseClicked

    private void botaoConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseEntered
        botaoConfirmar.setBackground(Color.gray);
        labelConfirmar.setForeground(Color.white);
    }//GEN-LAST:event_botaoConfirmarMouseEntered

    private void botaoConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseExited
        botaoConfirmar.setBackground(new Color(240,240,240));
        labelConfirmar.setForeground(Color.black);
    }//GEN-LAST:event_botaoConfirmarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botaoConfirmar;
    private javax.swing.JFormattedTextField cnpj;
    private javax.swing.JLabel cnpjInvalido;
    private javax.swing.JComboBox<String> fornecedores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelConfirmar;
    private javax.swing.JRadioButton pesquisarData;
    private javax.swing.JRadioButton pesquisarFornecedor;
    private javax.swing.JSeparator separadorCpf;
    // End of variables declaration//GEN-END:variables
}
