package br.com.jvs.sgce.repository;

import br.com.jvs.sgce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {
}
