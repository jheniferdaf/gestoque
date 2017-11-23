/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.FornecedorService;
import controler.ProdutoService;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author Jheni
 */
public class CadastroProduto extends javax.swing.JPanel {
    JPanel paineis;
    private List<JLabel> labelsInvalidas;
    List<Fornecedor> listaFornecedores = new ArrayList<>();
    DefaultComboBoxModel<String> padraoFornecedores;

    public CadastroProduto(JPanel paineis) {
        initComponents();
        this.paineis = paineis;
        
        labelsInvalidas = new ArrayList<>();
        labelsInvalidas.add(descricaoInvalida);
        labelsInvalidas.add(categoriaInvalida);
        labelsInvalidas.add(precoCustoInvalido);
        labelsInvalidas.add(precoVendaInvalido);
        labelsInvalidas.add(estoqueMinimoInvalido);  
        labelsInvalidas.add(fornecedorInvalida);  
        
        resetaCamposInvalidos();
        
        atualizarListaFornecedores();

    }
    
    public void atualizarListaFornecedores(){
        listaFornecedores = FornecedorService.recuperaTodosFornecedoresAtivos();

        padraoFornecedores = new DefaultComboBoxModel();
        padraoFornecedores.addElement(null);
        for (Fornecedor f : listaFornecedores) {
            padraoFornecedores.addElement(f.getRazaoSocial());
        }
        listaFornecedores.add(0, null);
        fornecedor.setModel(padraoFornecedores);
    }
    
    private void resetaCamposInvalidos(){
        for (JLabel l : labelsInvalidas){
            l.setVisible(false);
        }
    }
    
    private void resetaTudo(){
        descricao.setText("");
        categoria.setSelectedIndex(0);
        precoCusto.setText("");
        precoVenda.setText("");
        estoqueMinimo.setText("");
        fornecedor.setSelectedIndex(0);
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
        jLabel5 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        separadorDescricao = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        separadorPrecoCusto = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        separadorEmail = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        separadorTelefone = new javax.swing.JSeparator();
        botaoConfirmar = new javax.swing.JPanel();
        labelConfirmar = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        estoqueMinimo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        precoVenda = new javax.swing.JFormattedTextField();
        precoCusto = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        categoriaInvalida = new javax.swing.JLabel();
        precoCustoInvalido = new javax.swing.JLabel();
        precoVendaInvalido = new javax.swing.JLabel();
        estoqueMinimoInvalido = new javax.swing.JLabel();
        descricaoInvalida = new javax.swing.JLabel();
        fornecedor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        fornecedorInvalida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 248, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Return_32px.png"))); // NOI18N
        voltar.setToolTipText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 8, 10));
        jLabel5.setText("Descrição:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        descricao.setBackground(new java.awt.Color(244, 248, 250));
        descricao.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        descricao.setForeground(new java.awt.Color(0, 8, 10));
        descricao.setBorder(null);
        descricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descricaoFocusLost(evt);
            }
        });
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });
        descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descricaoKeyTyped(evt);
            }
        });
        add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 300, 20));

        separadorDescricao.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 300, 10));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 8, 10));
        jLabel4.setText("Categoria:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 8, 10));
        jLabel2.setText("Preço de Custo:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        separadorPrecoCusto.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorPrecoCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 300, 10));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 8, 10));
        jLabel3.setText("Preço de Venda:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        separadorEmail.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 300, 10));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 8, 10));
        jLabel6.setText("Estoque Mínimo:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        separadorTelefone.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 300, 10));

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

        categoria.setBackground(new java.awt.Color(244, 248, 250));
        categoria.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        categoria.setForeground(new java.awt.Color(0, 8, 10));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Açougue", "Bebidas", "Frios/Laticínios", "Higiene Pessoal", "Hortifrutigranjeiros", "Mercearia", "Mercearia Seca", "Limpeza", "Outros", "Padaria" }));
        categoria.setBorder(null);
        add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 300, 30));

        estoqueMinimo.setBackground(new java.awt.Color(244, 248, 250));
        estoqueMinimo.setBorder(null);
        estoqueMinimo.setForeground(new java.awt.Color(0, 8, 10));
        estoqueMinimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        estoqueMinimo.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(estoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 300, 20));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 8, 10));
        jLabel1.setText("R$");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 50, 20));

        precoVenda.setBackground(new java.awt.Color(244, 248, 250));
        precoVenda.setBorder(null);
        precoVenda.setForeground(new java.awt.Color(0, 8, 10));
        precoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        precoVenda.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(precoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 260, 20));

        precoCusto.setBackground(new java.awt.Color(244, 248, 250));
        precoCusto.setBorder(null);
        precoCusto.setForeground(new java.awt.Color(0, 8, 10));
        precoCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        precoCusto.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(precoCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 260, 20));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 8, 10));
        jLabel7.setText("R$");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 50, 20));

        categoriaInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        categoriaInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(categoriaInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 30, 30));

        precoCustoInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        precoCustoInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(precoCustoInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 30, 30));

        precoVendaInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        precoVendaInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(precoVendaInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 30, 30));

        estoqueMinimoInvalido.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        estoqueMinimoInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(estoqueMinimoInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 30, 30));

        descricaoInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        descricaoInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(descricaoInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 30, 30));

        fornecedor.setBackground(new java.awt.Color(244, 248, 250));
        fornecedor.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        fornecedor.setForeground(new java.awt.Color(0, 8, 10));
        fornecedor.setBorder(null);
        add(fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 300, 30));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 8, 10));
        jLabel8.setText("Fornecedor:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, -1, -1));

        fornecedorInvalida.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        fornecedorInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(fornecedorInvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarProdutos");
    }//GEN-LAST:event_voltarMouseClicked

    private void descricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descricaoFocusLost

    }//GEN-LAST:event_descricaoFocusLost

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void descricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaoKeyTyped

    }//GEN-LAST:event_descricaoKeyTyped

    private void labelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseClicked
        resetaCamposInvalidos();
        boolean tudoCerto = true;
        
        if (descricao.getText().isEmpty()){
            tudoCerto = false;
            descricaoInvalida.setVisible(true);
        }

        if (categoria.getSelectedIndex() == 0){
            tudoCerto = false;
            categoriaInvalida.setVisible(true);
        }
        System.out.println(fornecedor.getSelectedIndex());//***********************************************ARRUMAAAAA
        if (fornecedor.getSelectedIndex() < 1){
            tudoCerto = false;
            fornecedorInvalida.setVisible(true);
        }
        
        if (precoCusto.getText().length() < 1){
            tudoCerto = false;
            precoCustoInvalido.setVisible(true);
        }
                
        if (precoVenda.getText().length() < 1){
            tudoCerto = false;
            precoVendaInvalido.setVisible(true);
        }

        if (estoqueMinimo.getText().length() < 1){
            tudoCerto = false;
            estoqueMinimoInvalido.setVisible(true);
        }
        
        if (tudoCerto){
            Produto produto = new Produto(descricao.getText(), (String)categoria.getSelectedItem(), Double.parseDouble(precoCusto.getText().replace(",", ".")), Double.parseDouble(precoVenda.getText().replace(",", ".")), Double.parseDouble(estoqueMinimo.getText().replace(",",".")), listaFornecedores.get(fornecedor.getSelectedIndex()).getCnpj());
            if (ProdutoService.cadastraProduto(produto) == true){
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
                resetaTudo();
                descricao.requestFocus();
                
//                CardLayout cartoes = (CardLayout) paineis.getLayout();
//                cartoes.show(paineis, "gerenciarUsuarios");
            }
        }
    }//GEN-LAST:event_labelConfirmarMouseClicked

    private void labelConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseEntered
    }//GEN-LAST:event_labelConfirmarMouseEntered

    private void labelConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMouseExited
    }//GEN-LAST:event_labelConfirmarMouseExited

    private void labelConfirmarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConfirmarMousePressed
    }//GEN-LAST:event_labelConfirmarMousePressed

    private void botaoConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseClicked

    }//GEN-LAST:event_botaoConfirmarMouseClicked

    private void botaoConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseEntered
    }//GEN-LAST:event_botaoConfirmarMouseEntered

    private void botaoConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoConfirmarMouseExited
    }//GEN-LAST:event_botaoConfirmarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botaoConfirmar;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JLabel categoriaInvalida;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel descricaoInvalida;
    private javax.swing.JFormattedTextField estoqueMinimo;
    private javax.swing.JLabel estoqueMinimoInvalido;
    private javax.swing.JComboBox<String> fornecedor;
    private javax.swing.JLabel fornecedorInvalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelConfirmar;
    private javax.swing.JFormattedTextField precoCusto;
    private javax.swing.JLabel precoCustoInvalido;
    private javax.swing.JFormattedTextField precoVenda;
    private javax.swing.JLabel precoVendaInvalido;
    private javax.swing.JSeparator separadorDescricao;
    private javax.swing.JSeparator separadorEmail;
    private javax.swing.JSeparator separadorPrecoCusto;
    private javax.swing.JSeparator separadorTelefone;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
