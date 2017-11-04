/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Usuario;

/**
 *
 * @author Jheni
 */
public class TelaAdministrador extends javax.swing.JPanel {

    Usuario usuario;
    java.util.List<JPanel> botoesLaterais;
    List<JLabel> labelsLaterais;
    JPanel botaoAtivo;
    Color corPadraoBotao = new Color(102, 102, 102);
    Color corOverBotao = new Color(204, 204, 204);
    Color corBotaoAtivo = new Color(255, 255, 255);

    Color corPadraoLabel = new Color(249, 249, 249);
    Color corOverLabel = new Color(204, 204, 204);
    Color corLabelAtivo = new Color(51, 51, 51);

    public TelaAdministrador(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        nomeUsuario.setText(usuario.getNome());
        
        inicializaMovimentacoes();

        inicializaProdutos();
        
        inicializaFornecedores();

        paineis.add(new Relatorios(paineis), "relatorios");

        inicializaUsuarios();
        
        paineis.add(new Opcoes(paineis), "opcoes");

        botoesLaterais = new ArrayList<JPanel>();
        botoesLaterais.add(botaoMovimentacoes);
        botoesLaterais.add(botaoProdutos);
        botoesLaterais.add(botaoFornecedores);
        botoesLaterais.add(botaoRelatorios);
        botoesLaterais.add(botaoUsuarios);
        botoesLaterais.add(botaoOpcoes);

        labelsLaterais = new ArrayList<>();
        labelsLaterais.add(labelMovimentacoes);
        labelsLaterais.add(labelProdutos);
        labelsLaterais.add(labelFornecedores);
        labelsLaterais.add(labelRelatorios);
        labelsLaterais.add(labelUsuarios);
        labelsLaterais.add(labelOpcoes);

    }

    public void inicializaMovimentacoes(){
        Baixa baixa = new Baixa(paineis, usuario);
        Entrada entrada = new Entrada(paineis, usuario);
        Devolucao devolucao = new Devolucao(paineis, usuario);
        
        paineis.add(new Movimentacoes(paineis, baixa, entrada, devolucao), "movimentacoes");
        paineis.add(entrada, "entrada");
        paineis.add(baixa, "baixa");
        paineis.add(devolucao, "devolucao");
    }
    
    public void inicializaProdutos(){
        EditaProduto editaProduto = new EditaProduto(paineis);
        ConsultaProdutoAtivo consultaProdutoAtivo = new ConsultaProdutoAtivo(paineis, editaProduto);
        ConsultaProdutoInativo consultaProdutoInativo = new ConsultaProdutoInativo(paineis, editaProduto);
        
        CadastroProduto cadastroProduto = new CadastroProduto(paineis);
        ProdutosEstoqueMinimo produtosEstoqueMinimo = new ProdutosEstoqueMinimo(paineis);
        
        editaProduto.consultaProdutoAtivo = consultaProdutoAtivo;
        editaProduto.consultaProdutoInativo = consultaProdutoInativo;
        
        paineis.add(new GerenciarProdutos(paineis, consultaProdutoAtivo, consultaProdutoInativo, cadastroProduto, produtosEstoqueMinimo), "gerenciarProdutos");
        paineis.add(cadastroProduto, "cadastroProduto");
        paineis.add(consultaProdutoAtivo, "consultaProdutoAtivo");
        paineis.add(consultaProdutoInativo, "consultaProdutoInativo");
        paineis.add(editaProduto, "editaProduto");
        
        paineis.add(produtosEstoqueMinimo, "produtosEstoqueMinimo");
    }
    
    public void inicializaFornecedores(){
        EditaFornecedor editaFornecedor = new EditaFornecedor(paineis);
        ConsultaFornecedorAtivo consultaFornecedorAtivo = new ConsultaFornecedorAtivo(paineis, editaFornecedor);
        ConsultaFornecedorInativo consultaFornecedorInativo = new ConsultaFornecedorInativo(paineis, editaFornecedor);
        
        editaFornecedor.consultaFornecedorAtivo = consultaFornecedorAtivo;
        editaFornecedor.consultaFornecedorInativo = consultaFornecedorInativo;
        
        paineis.add(new GerenciarFornecedores(paineis, consultaFornecedorAtivo, consultaFornecedorInativo), "gerenciarFornecedores");
        paineis.add(new CadastroFornecedor(paineis), "cadastroFornecedor");
        paineis.add(consultaFornecedorAtivo, "consultaFornecedorAtivo");
        paineis.add(consultaFornecedorInativo, "consultaFornecedorInativo");
        paineis.add(editaFornecedor, "editaFornecedor");
    }
    
    public void inicializaUsuarios(){
        EditaUsuario editaUsuario = new EditaUsuario(paineis);
        ConsultaUsuarioAtivo consultaUsuarioAtivo = new ConsultaUsuarioAtivo(paineis, editaUsuario);
        ConsultaUsuarioInativo consultaUsuarioInativo = new ConsultaUsuarioInativo(paineis, editaUsuario);

        editaUsuario.consultaUsuarioAtivo = consultaUsuarioAtivo;
        editaUsuario.consultaUsuarioInativo = consultaUsuarioInativo;
        
        paineis.add(new GerenciarUsuarios(paineis, consultaUsuarioAtivo, consultaUsuarioInativo), "gerenciarUsuarios");
        paineis.add(new CadastroUsuario(paineis), "cadastroUsuario");
        paineis.add(consultaUsuarioAtivo, "consultaUsuarioAtivo");
        paineis.add(consultaUsuarioInativo, "consultaUsuarioInativo");
        paineis.add(editaUsuario, "editaUsuario");
    }
    
    public void resetaBotoes() {
        for (JPanel b : botoesLaterais) {
            b.setBackground(corPadraoBotao);
        }
    }

    public void resetaLabels() {
        for (JLabel l : labelsLaterais) {
            l.setForeground(corPadraoLabel);
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

        barraLateral = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomeUsuario = new javax.swing.JTextArea();
        botaoMovimentacoes = new javax.swing.JPanel();
        labelMovimentacoes = new javax.swing.JLabel();
        botaoOpcoes = new javax.swing.JPanel();
        labelOpcoes = new javax.swing.JLabel();
        botaoUsuarios = new javax.swing.JPanel();
        labelUsuarios = new javax.swing.JLabel();
        botaoRelatorios = new javax.swing.JPanel();
        labelRelatorios = new javax.swing.JLabel();
        botaoProdutos = new javax.swing.JPanel();
        labelProdutos = new javax.swing.JLabel();
        botaoLogoff = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botaoFornecedores = new javax.swing.JPanel();
        labelFornecedores = new javax.swing.JLabel();
        paineis = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1080, 650));
        setMinimumSize(new java.awt.Dimension(1080, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraLateral.setBackground(new java.awt.Color(51, 51, 51));
        barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(231, 243, 239));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(249, 249, 249));
        jLabel17.setText("Administrador");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);

        nomeUsuario.setEditable(false);
        nomeUsuario.setBackground(new java.awt.Color(102, 102, 102));
        nomeUsuario.setColumns(20);
        nomeUsuario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuario.setLineWrap(true);
        nomeUsuario.setRows(5);
        nomeUsuario.setWrapStyleWord(true);
        nomeUsuario.setBorder(null);
        nomeUsuario.setDisabledTextColor(new java.awt.Color(255, 102, 0));
        nomeUsuario.setOpaque(false);
        nomeUsuario.setSelectionColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(nomeUsuario);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 50));

        barraLateral.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 100));

        botaoMovimentacoes.setBackground(new java.awt.Color(102, 102, 102));
        botaoMovimentacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMovimentacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMovimentacoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoMovimentacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoMovimentacoesMouseExited(evt);
            }
        });
        botaoMovimentacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMovimentacoes.setBackground(new java.awt.Color(231, 243, 239));
        labelMovimentacoes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelMovimentacoes.setForeground(new java.awt.Color(249, 249, 249));
        labelMovimentacoes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMovimentacoes.setText("Movimentações");
        botaoMovimentacoes.add(labelMovimentacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 34));

        barraLateral.add(botaoMovimentacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 70));

        botaoOpcoes.setBackground(new java.awt.Color(102, 102, 102));
        botaoOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoOpcoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoOpcoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoOpcoesMouseExited(evt);
            }
        });
        botaoOpcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelOpcoes.setBackground(new java.awt.Color(231, 243, 239));
        labelOpcoes.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelOpcoes.setForeground(new java.awt.Color(249, 249, 249));
        labelOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOpcoes.setText("Opções");
        botaoOpcoes.add(labelOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 34));

        barraLateral.add(botaoOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 220, 70));

        botaoUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        botaoUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoUsuariosMouseExited(evt);
            }
        });
        botaoUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuarios.setBackground(new java.awt.Color(231, 243, 239));
        labelUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelUsuarios.setForeground(new java.awt.Color(249, 249, 249));
        labelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelUsuarios.setText("Usuários");
        botaoUsuarios.add(labelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 34));

        barraLateral.add(botaoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 220, 70));

        botaoRelatorios.setBackground(new java.awt.Color(102, 102, 102));
        botaoRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoRelatoriosMouseExited(evt);
            }
        });
        botaoRelatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRelatorios.setBackground(new java.awt.Color(231, 243, 239));
        labelRelatorios.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelRelatorios.setForeground(new java.awt.Color(249, 249, 249));
        labelRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelRelatorios.setText("Relatórios");
        botaoRelatorios.add(labelRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 34));

        barraLateral.add(botaoRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 70));

        botaoProdutos.setBackground(new java.awt.Color(102, 102, 102));
        botaoProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoProdutosMouseExited(evt);
            }
        });
        botaoProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelProdutos.setBackground(new java.awt.Color(231, 243, 239));
        labelProdutos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelProdutos.setForeground(new java.awt.Color(249, 249, 249));
        labelProdutos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelProdutos.setText("Produtos");
        botaoProdutos.add(labelProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 34));

        barraLateral.add(botaoProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 70));

        botaoLogoff.setBackground(new java.awt.Color(102, 102, 102));
        botaoLogoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoLogoffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoLogoffMouseExited(evt);
            }
        });
        botaoLogoff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 243, 239));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Fechar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        botaoLogoff.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        barraLateral.add(botaoLogoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 220, 70));

        botaoFornecedores.setBackground(new java.awt.Color(102, 102, 102));
        botaoFornecedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFornecedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoFornecedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoFornecedoresMouseExited(evt);
            }
        });
        botaoFornecedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFornecedores.setBackground(new java.awt.Color(231, 243, 239));
        labelFornecedores.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelFornecedores.setForeground(new java.awt.Color(249, 249, 249));
        labelFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFornecedores.setText("Fornecedores");
        botaoFornecedores.add(labelFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 34));

        barraLateral.add(botaoFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 70));

        add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        paineis.setBackground(new java.awt.Color(249, 249, 249));
        paineis.setLayout(new java.awt.CardLayout());
        add(paineis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 860, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMovimentacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMovimentacoesMouseEntered
//        if(botaoAtivo != botaoMovimentacoes){
        botaoMovimentacoes.setBackground(corOverBotao);
//        }
    }//GEN-LAST:event_botaoMovimentacoesMouseEntered

    private void botaoMovimentacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMovimentacoesMouseExited
        if (botaoMovimentacoes == botaoAtivo) {
            botaoMovimentacoes.setBackground(corBotaoAtivo);
            labelMovimentacoes.setForeground(corLabelAtivo);

        } else {
            botaoMovimentacoes.setBackground(corPadraoBotao);
            labelMovimentacoes.setForeground(corPadraoLabel);

        }
    }//GEN-LAST:event_botaoMovimentacoesMouseExited

    private void botaoOpcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOpcoesMouseEntered
        botaoOpcoes.setBackground(corOverBotao);
    }//GEN-LAST:event_botaoOpcoesMouseEntered

    private void botaoOpcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOpcoesMouseExited
        if (botaoOpcoes == botaoAtivo) {
            botaoOpcoes.setBackground(corBotaoAtivo);
            labelOpcoes.setForeground(corLabelAtivo);

        } else {
            botaoOpcoes.setBackground(corPadraoBotao);
            labelOpcoes.setForeground(corPadraoLabel);

        }

    }//GEN-LAST:event_botaoOpcoesMouseExited

    private void botaoUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoUsuariosMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarUsuarios");

        resetaBotoes();
        botaoUsuarios.setBackground(corBotaoAtivo);
        resetaLabels();
        labelUsuarios.setForeground(corLabelAtivo);
        botaoAtivo = botaoUsuarios;
    }//GEN-LAST:event_botaoUsuariosMouseClicked

    private void botaoUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoUsuariosMouseEntered
        botaoUsuarios.setBackground(corOverBotao);
    }//GEN-LAST:event_botaoUsuariosMouseEntered

    private void botaoUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoUsuariosMouseExited
        if (botaoUsuarios == botaoAtivo) {
            botaoUsuarios.setBackground(corBotaoAtivo);
            labelUsuarios.setForeground(corLabelAtivo);

        } else {
            botaoUsuarios.setBackground(corPadraoBotao);
            labelUsuarios.setForeground(corPadraoLabel);

        }
    }//GEN-LAST:event_botaoUsuariosMouseExited

    private void botaoRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatoriosMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "relatorios");

        resetaBotoes();
        botaoRelatorios.setBackground(corBotaoAtivo);
        resetaLabels();
        labelRelatorios.setForeground(corLabelAtivo);
        botaoAtivo = botaoRelatorios;
    }//GEN-LAST:event_botaoRelatoriosMouseClicked

    private void botaoRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatoriosMouseEntered
        botaoRelatorios.setBackground(corOverBotao);
    }//GEN-LAST:event_botaoRelatoriosMouseEntered

    private void botaoRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRelatoriosMouseExited
        if (botaoRelatorios == botaoAtivo) {
            botaoRelatorios.setBackground(corBotaoAtivo);
            labelRelatorios.setForeground(corLabelAtivo);
        } else {
            botaoRelatorios.setBackground(corPadraoBotao);
            labelRelatorios.setForeground(corPadraoLabel);
        }
    }//GEN-LAST:event_botaoRelatoriosMouseExited

    private void botaoProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProdutosMouseEntered
        botaoProdutos.setBackground(corOverBotao);
    }//GEN-LAST:event_botaoProdutosMouseEntered

    private void botaoProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProdutosMouseExited
        if (botaoProdutos == botaoAtivo) {
            botaoProdutos.setBackground(corBotaoAtivo);
            labelProdutos.setForeground(corLabelAtivo);
        } else {
            botaoProdutos.setBackground(corPadraoBotao);
            labelProdutos.setForeground(corPadraoLabel);
        }
    }//GEN-LAST:event_botaoProdutosMouseExited

    private void botaoLogoffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLogoffMouseEntered
        botaoLogoff.setBackground(corOverBotao);
    }//GEN-LAST:event_botaoLogoffMouseEntered

    private void botaoLogoffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLogoffMouseExited
        botaoLogoff.setBackground(corPadraoBotao);
    }//GEN-LAST:event_botaoLogoffMouseExited

    private void botaoFornecedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFornecedoresMouseEntered
        botaoFornecedores.setBackground(corOverBotao);
    }//GEN-LAST:event_botaoFornecedoresMouseEntered

    private void botaoFornecedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFornecedoresMouseExited
        if (botaoFornecedores == botaoAtivo) {
            botaoFornecedores.setBackground(corBotaoAtivo);
            labelFornecedores.setForeground(corLabelAtivo);
        } else {
            botaoFornecedores.setBackground(corPadraoBotao);
            labelFornecedores.setForeground(corPadraoLabel);
        }
    }//GEN-LAST:event_botaoFornecedoresMouseExited

    private void botaoMovimentacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMovimentacoesMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "movimentacoes");

        resetaBotoes();
        botaoMovimentacoes.setBackground(corBotaoAtivo);
        resetaLabels();
        labelMovimentacoes.setForeground(corLabelAtivo);
        botaoAtivo = botaoMovimentacoes;
    }//GEN-LAST:event_botaoMovimentacoesMouseClicked

    private void botaoProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProdutosMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarProdutos");

        resetaBotoes();
        botaoProdutos.setBackground(corBotaoAtivo);
        resetaLabels();
        labelProdutos.setForeground(corLabelAtivo);
        botaoAtivo = botaoProdutos;
    }//GEN-LAST:event_botaoProdutosMouseClicked

    private void botaoFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFornecedoresMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "gerenciarFornecedores");

        resetaBotoes();
        botaoFornecedores.setBackground(corBotaoAtivo);
        resetaLabels();
        labelFornecedores.setForeground(corLabelAtivo);
        botaoAtivo = botaoFornecedores;
    }//GEN-LAST:event_botaoFornecedoresMouseClicked

    private void botaoOpcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoOpcoesMouseClicked
        CardLayout cartoes = (CardLayout) paineis.getLayout();
        cartoes.show(paineis, "opcoes");

        resetaBotoes();
        botaoOpcoes.setBackground(corBotaoAtivo);
        resetaLabels();
        labelOpcoes.setForeground(corLabelAtivo);
        botaoAtivo = botaoOpcoes;
    }//GEN-LAST:event_botaoOpcoesMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraLateral;
    private javax.swing.JPanel botaoFornecedores;
    private javax.swing.JPanel botaoLogoff;
    private javax.swing.JPanel botaoMovimentacoes;
    private javax.swing.JPanel botaoOpcoes;
    private javax.swing.JPanel botaoProdutos;
    private javax.swing.JPanel botaoRelatorios;
    private javax.swing.JPanel botaoUsuarios;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFornecedores;
    private javax.swing.JLabel labelMovimentacoes;
    private javax.swing.JLabel labelOpcoes;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JLabel labelRelatorios;
    private javax.swing.JLabel labelUsuarios;
    private javax.swing.JTextArea nomeUsuario;
    private javax.swing.JPanel paineis;
    // End of variables declaration//GEN-END:variables
}
