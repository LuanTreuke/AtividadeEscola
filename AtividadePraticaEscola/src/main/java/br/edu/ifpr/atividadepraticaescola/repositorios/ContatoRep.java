package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Contato;
import org.springframework.data.repository.CrudRepository;

public interface ContatoRep extends CrudRepository<Contato, Integer> {
}
