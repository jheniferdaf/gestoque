/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Jheni
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        separadorNome = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        nome1 = new javax.swing.JTextField();
        separadorNome1 = new javax.swing.JSeparator();
        cpf = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Login");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        separadorNome.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 260, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Senha:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        nome1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nome1.setForeground(new java.awt.Color(51, 51, 51));
        nome1.setBorder(null);
        nome1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome1FocusLost(evt);
            }
        });
        nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome1ActionPerformed(evt);
            }
        });
        nome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nome1KeyTyped(evt);
            }
        });
        add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 260, 20));

        separadorNome1.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 260, 10));

        cpf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 260, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 100, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Esqueci minha senha");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/usuario.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 60, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void nome1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome1FocusLost
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
      
    }//GEN-LAST:event_nome1FocusLost

    private void nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome1ActionPerformed

    private void nome1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome1KeyTyped

    }//GEN-LAST:event_nome1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nome1;
    private javax.swing.JSeparator separadorNome;
    private javax.swing.JSeparator separadorNome1;
    // End of variables declaration//GEN-END:variables
}