package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Responsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRep extends CrudRepository<Responsavel, Integer> {
}
