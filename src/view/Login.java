/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.UsuarioService;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Jheni
 */
public class Login extends javax.swing.JPanel {

    JFrame frame;
    int xx;
    int yy;

    /**
     * Creates new form Login
     */
    public Login(JFrame frame) {
        initComponents();
        this.frame = frame;
        cpfInvalido.setVisible(false);
        senhaInvalida.setVisible(false);
    }

    public void resetaTudo() {
        cpfInvalido.setVisible(false);
        senhaInvalida.setVisible(false);
        erros.setText("");
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
        separadorSenha = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        separadorCpf = new javax.swing.JSeparator();
        cpf = new javax.swing.JFormattedTextField();
        entrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        senhaInvalida = new javax.swing.JLabel();
        cpfInvalido = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        erros = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 430));
        setMinimumSize(new java.awt.Dimension(700, 430));
        setPreferredSize(new java.awt.Dimension(700, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Login");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        separadorSenha.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 260, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Senha:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        separadorCpf.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 260, 10));

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
        add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 260, -1));

        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        entrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrar");
        entrar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Esqueci minha senha");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 430));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar.png"))); // NOI18N
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fecharMouseExited(evt);
            }
        });
        add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 0, -1, -1));

        senhaInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        senhaInvalida.setToolTipText("Senha não informada");
        add(senhaInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 30, 30));

        cpfInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fechar-mouse.png"))); // NOI18N
        cpfInvalido.setToolTipText("CPF inválido");
        add(cpfInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 30, 30));

        senha.setBorder(null);
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFocusLost(evt);
            }
        });
        add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 260, 20));

        erros.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        erros.setForeground(new java.awt.Color(204, 0, 0));
        erros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(erros, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 270, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
        boolean tudoCerto = true;
        resetaTudo();
        if (cpf.getText().replace(" ", "").length() < 14) {
            cpfInvalido.setVisible(true);
            tudoCerto = false;
        }

        if (senha.getPassword().length < 1) {
            senhaInvalida.setVisible(true);
            tudoCerto = false;
        }

        if (tudoCerto) {
            Usuario usuario = UsuarioService.buscaUsuarioCpf(cpf.getText());
            if (usuario == null) {
                erros.setText("Usuário não cadastrado.");
            } else {
                if (new String(senha.getPassword()).equals(usuario.getSenha())) {
                    if (usuario.isAtivo()) {
                        frame.getContentPane().removeAll();

                        if (usuario.isAdministrador()) {
                            TelaAdministrador principal = new TelaAdministrador(usuario);
                            frame.getContentPane().add(principal, BorderLayout.CENTER);
                            frame.setSize(principal.getPreferredSize());
                            frame.setLocationRelativeTo(null);
                        } else {
                            //colaborador
                        }
                    } else {
                        erros.setText("Usuário não está ativo.");
                    }
                } else {
                    erros.setText("Senha incorreta.");
                }
            }
        }
    }//GEN-LAST:event_entrarMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        frame.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        frame.setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        frame.setOpacity((float) 1.0);
    }//GEN-LAST:event_jPanel2MouseReleased

    private void fecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseEntered

    }//GEN-LAST:event_fecharMouseEntered

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked

    }//GEN-LAST:event_fecharMouseClicked

    private void fecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fecharMouseExited

    private void cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfFocusLost
        if (cpf.getText().replace(" ", "").length() < 14) {
            cpfInvalido.setVisible(true);
        } else {
            cpfInvalido.setVisible(false);
        }
    }//GEN-LAST:event_cpfFocusLost

    private void senhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusLost
        if (senha.getPassword().length < 1) {
            senhaInvalida.setVisible(true);
        } else {
            senhaInvalida.setVisible(false);
        }
    }//GEN-LAST:event_senhaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpfInvalido;
    private javax.swing.JPanel entrar;
    private javax.swing.JLabel erros;
    private javax.swing.JLabel fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaInvalida;
    private javax.swing.JSeparator separadorCpf;
    private javax.swing.JSeparator separadorSenha;
    // End of variables declaration//GEN-END:variables
}
