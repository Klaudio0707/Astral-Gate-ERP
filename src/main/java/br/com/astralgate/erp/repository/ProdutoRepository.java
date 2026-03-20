package br.com.astralgate.erp.repository;

import java.util.UUID;
import br.com.astralgate.erp.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

}
