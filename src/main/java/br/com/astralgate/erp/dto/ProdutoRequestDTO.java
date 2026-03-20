package br.com.astralgate.erp.dto;

import java.math.BigDecimal;

public record ProdutoRequestDTO(
        String nome,
        int quantidade,
        BigDecimal valorVenda,
        BigDecimal valorCusto
) {}
