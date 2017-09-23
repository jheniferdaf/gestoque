/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author saozi_000
 */
public class Produto {

    private int codigo;
    private String descricao;
    private String categoria;
    private int quantidade;
    private double pCusto;
    private double pVenda;
    private int estoqueMinimo;
    private String cnpjFornec;
    private boolean ativo;

    public Produto() {

    }

    public Produto(int codigo, String descricao, String categoria, int quantidade, double pCusto, double pVenda, int estoqueMinimo, String cnpjFornec, boolean ativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.pCusto = pCusto;
        this.pVenda = pVenda;
        this.estoqueMinimo = estoqueMinimo;
        this.cnpjFornec = cnpjFornec;
        this.ativo = ativo;
    }

    public Produto(String descricao, String categoria, int quantidade, double pCusto, double pVenda, int estoqueMinimo, String cnpjFornec, boolean ativo) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.pCusto = pCusto;
        this.pVenda = pVenda;
        this.estoqueMinimo = estoqueMinimo;
        this.cnpjFornec = cnpjFornec;
        this.ativo = ativo;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getpCusto() {
        return pCusto;
    }

    public void setpCusto(double pCusto) {
        this.pCusto = pCusto;
    }

    public double getpVenda() {
        return pVenda;
    }

    public void setpVenda(double pVenda) {
        this.pVenda = pVenda;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getCnpjFornec() {
        return cnpjFornec;
    }

    public void setCnpjFornec(String cnpjFornec) {
        this.cnpjFornec = cnpjFornec;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
