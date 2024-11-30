package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Disciplina;
import org.springframework.data.repository.CrudRepository;

public interface DisciplinaRep extends CrudRepository<Disciplina, Integer> {
}
