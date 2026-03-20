package br.com.astralgate.erp.repository;

import br.com.astralgate.erp.Produto;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

}
