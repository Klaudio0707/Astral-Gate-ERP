package br.com.astralgate.erp;

import java.math.BigDecimal;

public class Peca extends Produto implements Venda{

    public Peca(String nome, BigDecimal valorCusto, BigDecimal valorVenda){
        super(nome,valorVenda,valorCusto);
    }
    @Override
    public void venda(){
        System.out.println("Venda");
        Venda.super.venda();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", valorVenda=" + getValorVenda() +
                ", valorCusto=" + getValorCusto() +
                ", ValorTotalEstoque=" + getValorVenda() +
                '}';
    }


}
