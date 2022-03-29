package br.com.zup.handora.cadastrobasico4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.handora.cadastrobasico4.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}
