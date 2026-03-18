package br.com.astralgate.erp;

import java.math.BigDecimal;

public class Produto  {

    private Long id = 1L;
    private static Long contador = 1l;
    private String nome;
    private BigDecimal valorVenda;
    private BigDecimal valorCusto;
    private BigDecimal ValorTotalEstoque;

    public Produto (String nome, BigDecimal valorVenda, BigDecimal valorCusto){
        this.id =contador ++;
        this.nome = nome;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
    }
    public void exibirItem(){
        System.out.println("Nome do Produto: " + this.nome);
    }
    public Long getId(){
        return this.id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(BigDecimal valorCusto) {
        this.valorCusto = valorCusto;
    }

    public BigDecimal getValorTotalEstoque() {
        return ValorTotalEstoque;
    }

    public void setValorTotalEstoque(BigDecimal valorTotalEstoque) {
        ValorTotalEstoque = valorTotalEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valorVenda=" + valorVenda +
                ", valorCusto=" + valorCusto +
                ", ValorTotalEstoque=" + ValorTotalEstoque +
                '}';
    }
}
