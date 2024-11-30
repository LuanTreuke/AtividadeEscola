package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends CrudRepository<Usuario, Integer> {
}
