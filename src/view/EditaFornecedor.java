/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.FornecedorService;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Fornecedor;

/**
 *
 * @author Jheni
 */
public class EditaFornecedor extends javax.swing.JPanel {

    JPanel paineis;
    Fornecedor fornecedor;
    List<JLabel> labelsInvalidas;

    ConsultaFornecedorAtivo consultaFornecedorAtivo;
    ConsultaFornecedorInativo consultaFornecedorInativo;

    /**
     * Creates new form EditaFornecedor
     */
    public EditaFornecedor(JPanel paineis) {
        initComponents();
        this.paineis = paineis;

        labelsInvalidas = new ArrayList<>();
        labelsInvalidas.add(razaoSocialInvalida);
        labelsInvalidas.add(cnpjInvalido);
        labelsInvalidas.add(inscricaoEstadualInvalida);
        labelsInvalidas.add(telefoneInvalido);
        labelsInvalidas.add(enderecoInvalido);
        labelsInvalidas.add(emailInvalido);
        resetaLabelsCampoInvalido();
        
    }

    public void inserirInformacoesFornecedor(Fornecedor f) {
        razaoSocial.setText(f.getRazaoSocial());
        cnpj.setText(f.getCnpj());
        inscricaoEstadual.setText(f.getInscricaoEstadual());
        telefone.setText(f.getTelefone());
        endereco.setText(f.getEndereco());
        email.setText(f.getEmail());
    }

    private void resetaLabelsCampoInvalido() {
        for (JLabel l : labelsInvalidas) {
            l.setVisible(false);
        }
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
        jLabel5 = new javax.swing.JLabel();
        razaoSocial = new javax.swing.JTextField();
        separadorRazaoSocial = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        separadorCnpj = new javax.swing.JSeparator();
        cnpj = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        separadorInscricaoEstadual = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        separadorEmail = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        separadorTelefone = new javax.swing.JSeparator();
        botaoConfirmar = new javax.swing.JPanel();
        labelConfirmar = new javax.swing.JLabel();
        razaoSocialInvalida = new javax.swing.JLabel();
        cnpjInvalido = new javax.swing.JLabel();
        inscricaoEstadualInvalida = new javax.swing.JLabel();
        emailInvalido = new javax.swing.JLabel();
        telefoneInvalido = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        separadorEndereco = new javax.swing.JSeparator();
        enderecoInvalido = new javax.swing.JLabel();
        inscricaoEstadual = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar1.setText("Voltar");
        voltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar1MouseClicked(evt);
            }
        });
        add(voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Razão Social:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        razaoSocial.setEditable(false);
        razaoSocial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        razaoSocial.setForeground(new java.awt.Color(51, 51, 51));
        razaoSocial.setBorder(null);
        razaoSocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                razaoSocialFocusLost(evt);
            }
        });
        razaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razaoSocialActionPerformed(evt);
            }
        });
        razaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                razaoSocialKeyTyped(evt);
            }
        });
        add(razaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 20));

        separadorRazaoSocial.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 260, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CNPJ:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        separadorCnpj.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 260, 10));

        cnpj.setEditable(false);
        cnpj.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###.####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpj.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjActionPerformed(evt);
            }
        });
        add(cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Inscrição Estadual:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        separadorInscricaoEstadual.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 260, 10));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("E-mail:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.setBorder(null);
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 260, 20));

        separadorEmail.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 260, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefone:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        telefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        telefone.setForeground(new java.awt.Color(51, 51, 51));
        telefone.setBorder(null);
        add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 260, 20));

        separadorTelefone.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 260, 10));

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

        labelConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        labelConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirmar.setText("Confirmar");
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

        add(botaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 80, 30));

        razaoSocialInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        razaoSocialInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(razaoSocialInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 30, 30));

        cnpjInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        cnpjInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(cnpjInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 30, 30));

        inscricaoEstadualInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        inscricaoEstadualInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(inscricaoEstadualInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 30, 30));

        emailInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        emailInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(emailInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 30, 30));

        telefoneInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        telefoneInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(telefoneInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 30, 30));

        endereco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        endereco.setForeground(new java.awt.Color(51, 51, 51));
        endereco.setBorder(null);
        add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 260, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Endereço:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        separadorEndereco.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 260, 10));

        enderecoInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        enderecoInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(enderecoInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 30, 30));

        inscricaoEstadual.setEditable(false);
        inscricaoEstadual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            inscricaoEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inscricaoEstadual.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        inscricaoEstadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscricaoEstadualActionPerformed(evt);
            }
        });
        add(inscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void voltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar1MouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarFornecedores");
    }//GEN-LAST:event_voltar1MouseClicked

    private void razaoSocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_razaoSocialFocusLost
        //        String conteudo = jTextField1.getText();
        //        String conteudoAvaliado = conteudo.replaceAll("[^ A-z]", "");
        //        System.out.println(conteudoAvaliado);
        //        //POSSO USAR O MATCH AQUI
        //        if (conteudo.equals(conteudoAvaliado) == false){
        //            nomeInvalido.setText("Nome não pode conter números ou sinais de pontuação");
        //            nomeInvalido.setForeground(Color.red);
        //            imagemCampoInválido.setVisible(true);
        //        } else {
        //            nomeInvalido.setText("");
        //            imagemCampoInválido.setVisible(false);
        //        }
    }//GEN-LAST:event_razaoSocialFocusLost

    private void razaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razaoSocialActionPerformed

    private void razaoSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_razaoSocialKeyTyped

    }//GEN-LAST:event_razaoSocialKeyTyped

    private void cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjActionPerformed

    private void labelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseClicked
        resetaLabelsCampoInvalido();
        boolean tudoCerto = true;

        if (razaoSocial.getText().isEmpty()) {
            tudoCerto = false;
            razaoSocialInvalida.setVisible(true);
        }

        if (cnpj.getText().replace(" ", "").length() < 18) {
            tudoCerto = false;
            cnpjInvalido.setVisible(true);
        }

        if (inscricaoEstadual.getText().replace(" ", "").length() < 16) {
            tudoCerto = false;
            inscricaoEstadualInvalida.setVisible(true);
        }

        if (telefone.getText().length() < 8) {
            tudoCerto = false;
            telefoneInvalido.setVisible(true);
        }

        if (endereco.getText().length() < 1) {
            tudoCerto = false;
            enderecoInvalido.setVisible(true);
        }

        if (!email.getText().contains("@")) {
            tudoCerto = false;
            emailInvalido.setVisible(true);
        }

        if (tudoCerto) {
            Fornecedor fornecedor = new Fornecedor(cnpj.getText(), inscricaoEstadual.getText(), telefone.getText(), endereco.getText(), email.getText(), razaoSocial.getText(), true);
            if (FornecedorService.atualizaFonecedor(fornecedor) == true) {
                JOptionPane.showMessageDialog(null, "Fornecedor editado com sucesso.");
                
//                consultaFornecedorAtivo ;
//                consultaFornecedorInativo = ;
                
                razaoSocial.requestFocus();
                //                CardLayout cartoes = (CardLayout) paineis.getLayout();
                //                cartoes.show(paineis, "gerenciarUsuarios");
            }

        }
    }//GEN-LAST:event_labelConfirmarMouseClicked

    private void labelConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseEntered
        botaoConfirmar.setBackground(Color.gray);
        labelConfirmar.setForeground(Color.white);
    }//GEN-LAST:event_labelConfirmarMouseEntered

    private void labelConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseExited
        botaoConfirmar.setBackground(new Color(240, 240, 240));
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
        botaoConfirmar.setBackground(new Color(240, 240, 240));
        labelConfirmar.setForeground(Color.black);
    }//GEN-LAST:event_botaoConfirmarMouseExited

    private void inscricaoEstadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscricaoEstadualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inscricaoEstadualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botaoConfirmar;
    private javax.swing.JFormattedTextField cnpj;
    private javax.swing.JLabel cnpjInvalido;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailInvalido;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel enderecoInvalido;
    private javax.swing.JFormattedTextField inscricaoEstadual;
    private javax.swing.JLabel inscricaoEstadualInvalida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelConfirmar;
    private javax.swing.JTextField razaoSocial;
    private javax.swing.JLabel razaoSocialInvalida;
    private javax.swing.JSeparator separadorCnpj;
    private javax.swing.JSeparator separadorEmail;
    private javax.swing.JSeparator separadorEndereco;
    private javax.swing.JSeparator separadorInscricaoEstadual;
    private javax.swing.JSeparator separadorRazaoSocial;
    private javax.swing.JSeparator separadorTelefone;
    private javax.swing.JTextField telefone;
    private javax.swing.JLabel telefoneInvalido;
    private javax.swing.JLabel voltar1;
    // End of variables declaration//GEN-END:variables
}
