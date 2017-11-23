/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.UsuarioService;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Usuario;

/**
 *
 * @author Jheni
 */
public class CadastroUsuario extends javax.swing.JPanel {
    private JPanel paineis;
    private List<JLabel> labelsInvalidas;
    private ButtonGroup grupoRadioButton;
    private boolean admin;

    public CadastroUsuario(JPanel paineis) {
        this.paineis = paineis;
        initComponents();
        
        labelsInvalidas = new ArrayList<>();
        labelsInvalidas.add(nomeInvalido);
        labelsInvalidas.add(cpfInvalido);
        labelsInvalidas.add(senhaInvalida);
        labelsInvalidas.add(emailInvalido);
        labelsInvalidas.add(telefoneInvalido);
        labelsInvalidas.add(funcaoInvalida);
        resetaCamposInvalidos();
        
        grupoRadioButton = new ButtonGroup();
        grupoRadioButton.add(colaborador);
        grupoRadioButton.add(administrador);
        
    }
    
    private void resetaCamposInvalidos(){
        for (JLabel l : labelsInvalidas){
            l.setVisible(false);
        }
    }
    
    private void resetaTudo(){
        nome.setText("");
        cpf.setText("");
        senha.setText("");
        email.setText("");
        telefone.setText("");
        grupoRadioButton.clearSelection();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        separadorNome = new javax.swing.JSeparator();
        funcaoInvalida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        separadorCpf = new javax.swing.JSeparator();
        cpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        separadorSenha = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        separadorEmail = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        separadorTelefone = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        administrador = new javax.swing.JRadioButton();
        colaborador = new javax.swing.JRadioButton();
        voltar = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JPanel();
        labelConfirmar = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        nomeInvalido = new javax.swing.JLabel();
        cpfInvalido = new javax.swing.JLabel();
        senhaInvalida = new javax.swing.JLabel();
        emailInvalido = new javax.swing.JLabel();
        telefoneInvalido = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 248, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 8, 10));
        jLabel5.setText("Nome:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        nome.setBackground(new java.awt.Color(244, 248, 250));
        nome.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 8, 10));
        nome.setBorder(null);
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeFocusLost(evt);
            }
        });
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeKeyTyped(evt);
            }
        });
        add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 300, 20));

        separadorNome.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 300, 10));

        funcaoInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        funcaoInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        funcaoInvalida.setToolTipText("Função não selecionada.");
        add(funcaoInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 30, 30));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 8, 10));
        jLabel4.setText("CPF:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        separadorCpf.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 300, 10));

        cpf.setBackground(new java.awt.Color(244, 248, 250));
        cpf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cpf.setForeground(new java.awt.Color(0, 8, 10));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 300, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 8, 10));
        jLabel2.setText("Senha:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        separadorSenha.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 300, 10));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 8, 10));
        jLabel3.setText("E-mail:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        email.setBackground(new java.awt.Color(244, 248, 250));
        email.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 8, 10));
        email.setBorder(null);
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 300, 20));

        separadorEmail.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 300, 10));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 8, 10));
        jLabel6.setText("Telefone:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        telefone.setBackground(new java.awt.Color(244, 248, 250));
        telefone.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        telefone.setForeground(new java.awt.Color(0, 8, 10));
        telefone.setBorder(null);
        add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 300, 20));

        separadorTelefone.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 300, 10));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 8, 10));
        jLabel7.setText("Função:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        administrador.setBackground(new java.awt.Color(244, 248, 250));
        administrador.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        administrador.setForeground(new java.awt.Color(0, 8, 10));
        administrador.setText("Administrador");
        administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradorActionPerformed(evt);
            }
        });
        add(administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        colaborador.setBackground(new java.awt.Color(244, 248, 250));
        colaborador.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        colaborador.setForeground(new java.awt.Color(0, 8, 10));
        colaborador.setText("Colaborador");
        colaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaboradorActionPerformed(evt);
            }
        });
        add(colaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Return_32px.png"))); // NOI18N
        voltar.setToolTipText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        labelConfirmar.setText("Confirmar");
        labelConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConfirmarMouseClicked(evt);
            }
        });
        botaoConfirmar.add(labelConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        add(botaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 80, 30));

        senha.setBackground(new java.awt.Color(244, 248, 250));
        senha.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 8, 10));
        senha.setBorder(null);
        add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 300, 20));

        nomeInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        nomeInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        nomeInvalido.setToolTipText("");
        add(nomeInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 30, 30));

        cpfInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        cpfInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(cpfInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 30, 30));

        senhaInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        senhaInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(senhaInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 30, 30));

        emailInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        emailInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(emailInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 30, 30));

        telefoneInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        telefoneInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        telefoneInvalido.setToolTipText("");
        add(telefoneInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusLost
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
        
    }//GEN-LAST:event_nomeFocusLost

    private void nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyTyped

    }//GEN-LAST:event_nomeKeyTyped

    private void administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradorActionPerformed
        admin = true;
    }//GEN-LAST:event_administradorActionPerformed

    private void labelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseClicked
        resetaCamposInvalidos();
        boolean tudoCerto = true;
        
        if (nome.getText().isEmpty()){
            tudoCerto = false;
            nomeInvalido.setVisible(true);
        }

        if (cpf.getText().replace(" ", "").length() < 14){
            tudoCerto = false;
            cpfInvalido.setToolTipText("CPF inválido.");
            cpfInvalido.setVisible(true);
        } else {
            if (UsuarioService.buscaUsuarioCpf(cpf.getText()) != null){
                tudoCerto = false;
                cpfInvalido.setToolTipText("CPF já cadastrado.");
                cpfInvalido.setVisible(true);
            }
        }
        
        if (senha.getPassword().length < 1){
            tudoCerto = false;
            senhaInvalida.setVisible(true);
        }
        
        if (!email.getText().contains("@")){
            tudoCerto = false;
            emailInvalido.setVisible(true);
        }

        if (telefone.getText().length() < 8){
            tudoCerto = false;
            telefoneInvalido.setVisible(true);
        }
        
        if (grupoRadioButton.getSelection() == null){
            tudoCerto = false;
            funcaoInvalida.setVisible(true);
        }
        
        if (tudoCerto){
            Usuario usuario = new Usuario(cpf.getText(), nome.getText(), new String(senha.getPassword()), email.getText(), telefone.getText(), admin, true);
            if (UsuarioService.cadastrarUsuario(usuario) == true){
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
                resetaTudo();
                nome.requestFocus();
//                CardLayout cartoes = (CardLayout) paineis.getLayout();
//                cartoes.show(paineis, "gerenciarUsuarios");
            }
            
        }
    }//GEN-LAST:event_labelConfirmarMouseClicked

    private void botaoConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseClicked

    }//GEN-LAST:event_botaoConfirmarMouseClicked

    private void botaoConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseEntered
    }//GEN-LAST:event_botaoConfirmarMouseEntered

    private void botaoConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseExited
    }//GEN-LAST:event_botaoConfirmarMouseExited

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarUsuarios");
    }//GEN-LAST:event_voltarMouseClicked

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void colaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaboradorActionPerformed
        admin = false;
    }//GEN-LAST:event_colaboradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton administrador;
    private javax.swing.JPanel botaoConfirmar;
    private javax.swing.JRadioButton colaborador;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpfInvalido;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailInvalido;
    private javax.swing.JLabel funcaoInvalida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelConfirmar;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nomeInvalido;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaInvalida;
    private javax.swing.JSeparator separadorCpf;
    private javax.swing.JSeparator separadorEmail;
    private javax.swing.JSeparator separadorNome;
    private javax.swing.JSeparator separadorSenha;
    private javax.swing.JSeparator separadorTelefone;
    private javax.swing.JTextField telefone;
    private javax.swing.JLabel telefoneInvalido;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
