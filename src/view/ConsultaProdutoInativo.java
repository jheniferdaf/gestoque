/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.FornecedorService;
import controler.ProdutoService;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Produto;

/**
 *
 * @author Jheni
 */
public class ConsultaProdutoInativo extends javax.swing.JPanel {

    JPanel paineis;
    EditaProduto editaProduto;
    
    List<Produto> listaProdutos;
    DefaultComboBoxModel padraoProdutos;

    public ConsultaProdutoInativo(JPanel paineis, EditaProduto editaProduto) {
        initComponents();
        this.paineis = paineis;
        this.editaProduto = editaProduto;
        
        codigoInvalido.setVisible(false);
        
        atualizarProdutos();
    }
    
    public void atualizarProdutos() {
        listaProdutos = ProdutoService.pesquisaProdutosInativos();

        padraoProdutos = new DefaultComboBoxModel();
        for (Produto p : listaProdutos) {
            padraoProdutos.addElement(p.getDescricao());
        }
        produtos.setModel(padraoProdutos);
    }
    
    public void atualizarInformacoes() {
        if (produtos.getSelectedIndex() != -1) {
            Produto p = listaProdutos.get(produtos.getSelectedIndex());
            
            codigoInformacoes.setText(p.getCodigo() + "");
            descricao.setText(p.getDescricao());
            categoria.setText(p.getCategoria());
            precoCusto.setText("R$ " +p.getpCusto());
            precoVenda.setText("R$ " + p.getpVenda());
            estoqueMinimo.setText(p.getEstoqueMinimo() + "");
            fornecedor.setText(FornecedorService.consultaFornecedorCnpj(p.getCnpjFornec()).getRazaoSocial());
            quantidade.setText(p.getQuantidade() + "");
        }
    }

    public void limparInformacoes() {
        codigoInformacoes.setText("");
        descricao.setText("");
        categoria.setText("");
        precoCusto.setText("");
        precoVenda.setText("");
        estoqueMinimo.setText("");
        fornecedor.setText("");
        quantidade.setText("");
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
        separadorCodigo = new javax.swing.JSeparator();
        codigo = new javax.swing.JFormattedTextField();
        produtos = new javax.swing.JComboBox<>();
        editar = new javax.swing.JPanel();
        editarLabel = new javax.swing.JLabel();
        ativar = new javax.swing.JPanel();
        ativarLabel = new javax.swing.JLabel();
        codigoInvalido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        informacoes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codigoInformacoes = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        precoCusto = new javax.swing.JLabel();
        precoVenda = new javax.swing.JLabel();
        estoqueMinimo = new javax.swing.JLabel();
        fornecedor = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();

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

        separadorCodigo.setForeground(new java.awt.Color(51, 51, 51));
        add(separadorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, 10));

        codigo.setBackground(new java.awt.Color(244, 248, 250));
        codigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        codigo.setForeground(new java.awt.Color(0, 8, 10));
        try {
            codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        codigo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFocusLost(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
        });
        add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 30));

        produtos.setBackground(new java.awt.Color(244, 248, 250));
        produtos.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        produtos.setForeground(new java.awt.Color(0, 8, 10));
        produtos.setBorder(null);
        produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosActionPerformed(evt);
            }
        });
        add(produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 560, 30));

        editar.setBackground(new java.awt.Color(181, 212, 222));
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarLabel.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        editarLabel.setForeground(new java.awt.Color(0, 8, 10));
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

        add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 80, 30));

        ativar.setBackground(new java.awt.Color(181, 212, 222));
        ativar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ativar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ativarLabel.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        ativarLabel.setForeground(new java.awt.Color(0, 8, 10));
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

        add(ativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 80, 30));

        codigoInvalido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Attention_32px.png"))); // NOI18N
        add(codigoInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 30, 30));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 8, 10));
        jLabel2.setText("Código:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 70, -1));

        informacoes.setBackground(new java.awt.Color(255, 255, 255));
        informacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 8, 10));
        jLabel1.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 8, 10));
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 8, 10));
        jLabel4.setText("Categoria:");

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 8, 10));
        jLabel5.setText("Preço de Custo:");

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 8, 10));
        jLabel6.setText("Preço de Venda:");

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 8, 10));
        jLabel7.setText("Estoque Mínimo:");

        jLabel8.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 8, 10));
        jLabel8.setText("Fornecedor:");

        jLabel9.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 8, 10));
        jLabel9.setText("Estoque atual:");

        codigoInformacoes.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        codigoInformacoes.setForeground(new java.awt.Color(0, 8, 10));

        descricao.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        descricao.setForeground(new java.awt.Color(0, 8, 10));

        categoria.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        categoria.setForeground(new java.awt.Color(0, 8, 10));

        precoCusto.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        precoCusto.setForeground(new java.awt.Color(0, 8, 10));

        precoVenda.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        precoVenda.setForeground(new java.awt.Color(0, 8, 10));

        estoqueMinimo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        estoqueMinimo.setForeground(new java.awt.Color(0, 8, 10));

        fornecedor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        fornecedor.setForeground(new java.awt.Color(0, 8, 10));

        quantidade.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        quantidade.setForeground(new java.awt.Color(0, 8, 10));

        javax.swing.GroupLayout informacoesLayout = new javax.swing.GroupLayout(informacoes);
        informacoes.setLayout(informacoesLayout);
        informacoesLayout.setHorizontalGroup(
            informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacoesLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoCusto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estoqueMinimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        informacoesLayout.setVerticalGroup(
            informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacoesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacoesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacoesLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estoqueMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140))
        );

        add(informacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 740, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarProdutos");
    }//GEN-LAST:event_voltarMouseClicked

    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
        String codigo2 = codigo.getText().replace(" ", "");
        boolean entrou = false;
        if (codigo2.length() > 1 && codigo2.equals("0") == false) {
            codigoInvalido.setVisible(false);
            for (Produto p : listaProdutos) {
                if (p.getCodigo() == Integer.parseInt(codigo2)) {
                    entrou = true;
                    produtos.setSelectedIndex(listaProdutos.indexOf(p));
                    //padraoUsuarios.setSelectedItem(listaUsuarios.indexOf(u));
                    break;
                }
            }
            if (entrou == false) {
                codigoInvalido.setVisible(true);
                codigoInvalido.setToolTipText("Código não cadastrado.");
            }
        } else {
            codigoInvalido.setVisible(true);
            codigoInvalido.setToolTipText("Código inválido.");
        }
    }//GEN-LAST:event_codigoFocusLost

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        if (evt.getKeyCode() == '\n') {
            codigo.transferFocus();
        }
    }//GEN-LAST:event_codigoKeyReleased

    private void produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosActionPerformed
        //atualizarUsuarios();
        atualizarInformacoes();
    }//GEN-LAST:event_produtosActionPerformed

    private void editarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseClicked
        if (produtos.getSelectedIndex() != -1) {
            CardLayout cartoes = (CardLayout) paineis.getLayout();
            editaProduto.atualizarListaFornecedores();
            editaProduto.resetaCamposInvalidos();
            editaProduto.inserirInformacoesProduto(listaProdutos.get(produtos.getSelectedIndex()));
            cartoes.show(paineis, "editaProduto");
        }
    }//GEN-LAST:event_editarLabelMouseClicked

    private void editarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseEntered
    }//GEN-LAST:event_editarLabelMouseEntered

    private void editarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseExited
    }//GEN-LAST:event_editarLabelMouseExited

    private void ativarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativarLabelMouseClicked
        if (produtos.getSelectedIndex() != -1) {

            Produto p = listaProdutos.get(produtos.getSelectedIndex());
            int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja ativar o " + p.getDescricao() + "?");
            if (resposta == JOptionPane.OK_OPTION) {
                p.setAtivo(true);
                ProdutoService.alterarStatusProduto(p);

                limparInformacoes();
                atualizarProdutos();
                atualizarInformacoes();

                JOptionPane.showMessageDialog(this, p.getDescricao() + " foi ativado.");
            }

        }
    }//GEN-LAST:event_ativarLabelMouseClicked

    private void ativarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativarLabelMouseEntered
    }//GEN-LAST:event_ativarLabelMouseEntered

    private void ativarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ativarLabelMouseExited
    }//GEN-LAST:event_ativarLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ativar;
    private javax.swing.JLabel ativarLabel;
    private javax.swing.JLabel categoria;
    private javax.swing.JFormattedTextField codigo;
    private javax.swing.JLabel codigoInformacoes;
    private javax.swing.JLabel codigoInvalido;
    private javax.swing.JLabel descricao;
    private javax.swing.JPanel editar;
    private javax.swing.JLabel editarLabel;
    private javax.swing.JLabel estoqueMinimo;
    private javax.swing.JLabel fornecedor;
    private javax.swing.JPanel informacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel precoCusto;
    private javax.swing.JLabel precoVenda;
    private javax.swing.JComboBox<String> produtos;
    private javax.swing.JLabel quantidade;
    private javax.swing.JSeparator separadorCodigo;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
