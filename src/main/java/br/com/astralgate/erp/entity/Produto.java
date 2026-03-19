package br.com.astralgate.erp.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private int quantidade;
    @Column(name = "valor_venda")
    private BigDecimal valorVenda;
    @Column(name = "valor_custo")
    private BigDecimal valorCusto;

}
