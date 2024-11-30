package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRep extends CrudRepository<Professor, Integer> {
}
