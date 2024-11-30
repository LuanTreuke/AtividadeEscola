package br.edu.ifpr.atividadepraticaescola.repositorios;

import br.edu.ifpr.atividadepraticaescola.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRep extends CrudRepository<Usuario, Integer> {
}
