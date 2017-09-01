/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Jheni
 */
public class Movimentacao {
    private int codigoProduto;
    private int quantidade;
    private String cpfUsuario;
    private int tipoMovimentacao;
    private Date data;
    private String observacao;
    
    public static final int ENTRADA = 1;
    public static final int SAIDA = 2;
    public static final int DEVOLUCAO = 3;

    public Movimentacao(){
    }
    
    public Movimentacao(int codigoProduto, int quantidade, String cpfUsuario, int tipoMovimentacao, Date data, String observacao) {
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.cpfUsuario = cpfUsuario;
        this.tipoMovimentacao = tipoMovimentacao;
        this.data = data;
        this.observacao = observacao;
    }
    
}
