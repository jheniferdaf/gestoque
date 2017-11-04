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
    private double quantidade;
    private String cpfUsuario;
    private int tipoMovimentacao;
    private Date data;
    private String observacao;
    
    public static final int ENTRADA = 1;
    public static final int BAIXA = 2;
    public static final int DEVOLUCAO = 3;

    public Movimentacao(){
    }
    
    public Movimentacao(int codigoProduto, double quantidade, String cpfUsuario, int tipoMovimentacao, Date data, String observacao) {
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.cpfUsuario = cpfUsuario;
        this.tipoMovimentacao = tipoMovimentacao;
        this.data = data;
        this.observacao = observacao;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public int getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(int tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
