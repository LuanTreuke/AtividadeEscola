package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRep extends CrudRepository<Aluno, Integer> {
}
