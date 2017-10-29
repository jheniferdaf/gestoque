/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.UsuarioService;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Usuario;

public class ConsultaUsuarioInativo extends javax.swing.JPanel {

    JPanel paineis;
    EditaUsuario editaUsuario;
    List<Usuario> listaUsuarios;
    DefaultComboBoxModel padraoUsuarios;
    private ButtonGroup grupoRadioButton;

    public ConsultaUsuarioInativo(JPanel paineis, EditaUsuario editaUsuario) {
        initComponents();
        this.paineis = paineis;
        this.editaUsuario = editaUsuario;

        cpfInvalido.setVisible(false);
        atualizarUsuarios();

        grupoRadioButton = new ButtonGroup();
        grupoRadioButton.add(administrador);
        grupoRadioButton.add(colaborador);
    }

    public void atualizarUsuarios() {
        listaUsuarios = UsuarioService.recuperaTodosUsuariosInativos();

        padraoUsuarios = new DefaultComboBoxModel();
        for (Usuario u : listaUsuarios) {
            padraoUsuarios.addElement(u.getNome());
        }
        usuarios.setModel(padraoUsuarios);
    }

    public void atualizarInformacoes() {
        if (usuarios.getSelectedIndex() != -1) {
            Usuario u = listaUsuarios.get(usuarios.getSelectedIndex());
            nome.setText(u.getNome());
            cpfUsuario.setText(u.getCpf());
            email.setText(u.getEmail());
            telefone.setText(u.getTelefone());
            if (u.isAdministrador()) {
                administrador.setSelected(true);
            } else {
                colaborador.setSelected(true);
            }
        }
    }
    
    public void limparInformacoes() {
        nome.setText("");
        cpfUsuario.setText("");
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

        separadorCpf = new javax.swing.JSeparator();
        cpf = new javax.swing.JFormattedTextField();
        usuarios = new javax.swing.JComboBox<>();
        informacoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        cpfUsuario = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        administrador = new javax.swing.JRadioButton();
        colaborador = new javax.swing.JRadioButton();
        voltar = new javax.swing.JLabel();
        editar = new javax.swing.JPanel();
        editarLabel = new javax.swing.JLabel();
        ativar = new javax.swing.JPanel();
        ativarLabel = new javax.swing.JLabel();
        cpfInvalido = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separadorCpf.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 10));

        cpf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfFocusLost(evt);
            }
        });
        cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfKeyReleased(evt);
            }
        });
        add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 130, -1));

        usuarios.setBackground(new java.awt.Color(242, 242, 242));
        usuarios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        usuarios.setBorder(null);
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 70, 560, 30));

        informacoes.setBackground(new java.awt.Color(255, 255, 255));
        informacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Função:");

        nome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cpfUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        telefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        administrador.setBackground(new java.awt.Color(255, 255, 255));
        administrador.setText("Administrador");
        administrador.setEnabled(false);

        colaborador.setBackground(new java.awt.Color(255, 255, 255));
        colaborador.setText("Colaborador");
        colaborador.setEnabled(false);

        javax.swing.GroupLayout informacoesLayout = new javax.swing.GroupLayout(informacoes);
        informacoes.setLayout(informacoesLayout);
        informacoesLayout.setHorizontalGroup(
            informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(informacoesLayout.createSequentialGroup()
                        .addComponent(administrador)
                        .addGap(10, 10, 10)
                        .addComponent(colaborador)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        informacoesLayout.setVerticalGroup(
            informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacoesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(informacoesLayout.createSequentialGroup()
                        .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(informacoesLayout.createSequentialGroup()
                                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(informacoesLayout.createSequentialGroup()
                                        .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addComponent(cpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(colaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        add(informacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 128, -1, -1));

        voltar.setText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editarLabel.setText("Editar");
        editarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editarLabelMouseExited(evt);
            }
        });
        editar.add(editarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 80, 30));

        ativar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ativar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ativarLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ativarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ativarLabel.setText("Ativar");
        ativarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ativarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ativarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ativarLabelMouseExited(evt);
            }
        });
        ativar.add(ativarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        add(ativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 541, 80, 30));

        cpfInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        add(cpfInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfFocusLost
        String cpf2 = cpf.getText().replace(" ", "");
        boolean entrou = false;

        if (cpf2.length() == 14) {
            cpfInvalido.setVisible(false);
            for (Usuario u : listaUsuarios) {
                if (u.getCpf().equals(cpf2)) {
                    entrou = true;
                    System.out.println(u.getNome());
                    usuarios.setSelectedIndex(listaUsuarios.indexOf(u));
                    //padraoUsuarios.setSelectedItem(listaUsuarios.indexOf(u));
                    break;
                }
            }
            if (entrou == false) {
                cpfInvalido.setVisible(true);
                cpfInvalido.setToolTipText("Usuário não escontrado.");
            }
        } else {
            cpfInvalido.setVisible(true);
            cpfInvalido.setToolTipText("CPF inválido.");
        }
    }//GEN-LAST:event_cpfFocusLost

    private void cpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyReleased
        if (evt.getKeyCode() == '\n') {
            cpf.transferFocus();
        }
    }//GEN-LAST:event_cpfKeyReleased

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        //atualizarUsuarios();
        atualizarInformacoes();
    }//GEN-LAST:event_usuariosActionPerformed

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarUsuarios");
    }//GEN-LAST:event_voltarMouseClicked

    private void editarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseClicked
        if (usuarios.getSelectedIndex() != -1) {
            CardLayout cartoes = (CardLayout) paineis.getLayout();
            editaUsuario.resetaCamposInvalidos();
            editaUsuario.inserirInformacoesUsuario(listaUsuarios.get(usuarios.getSelectedIndex()));
            cartoes.show(paineis, "editaUsuario");
        }
    }//GEN-LAST:event_editarLabelMouseClicked

    private void editarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseEntered
        editarLabel.setForeground(Color.white);
    }//GEN-LAST:event_editarLabelMouseEntered

    private void editarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseExited
        editarLabel.setForeground(Color.black);
    }//GEN-LAST:event_editarLabelMouseExited

    private void ativarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativarLabelMouseClicked
        if (usuarios.getSelectedIndex() != -1) {

            Usuario u = listaUsuarios.get(usuarios.getSelectedIndex());
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja ativar o " + u.getNome() + "?");
            if (resposta == JOptionPane.OK_OPTION) {
                u.setAtivo(true);
                UsuarioService.alterarStatusUsuario(u);
                
                limparInformacoes();
                atualizarUsuarios();
                atualizarInformacoes();
                
                JOptionPane.showMessageDialog(this, u.getNome() + " foi ativado.");
            }
        }
    }//GEN-LAST:event_ativarLabelMouseClicked

    private void ativarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativarLabelMouseEntered
        ativarLabel.setForeground(Color.white);
    }//GEN-LAST:event_ativarLabelMouseEntered

    private void ativarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativarLabelMouseExited
        ativarLabel.setForeground(Color.black);
    }//GEN-LAST:event_ativarLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton administrador;
    private javax.swing.JPanel ativar;
    private javax.swing.JLabel ativarLabel;
    private javax.swing.JRadioButton colaborador;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpfInvalido;
    private javax.swing.JLabel cpfUsuario;
    private javax.swing.JPanel editar;
    private javax.swing.JLabel editarLabel;
    private javax.swing.JLabel email;
    private javax.swing.JPanel informacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nome;
    private javax.swing.JSeparator separadorCpf;
    private javax.swing.JLabel telefone;
    private javax.swing.JComboBox<String> usuarios;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
