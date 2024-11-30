package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Turma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRep extends CrudRepository<Turma, Integer> {
}
