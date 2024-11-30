package br.edu.ifpr.atividadepraticaescola;

import br.edu.ifpr.atividadepraticaescola.entidades.Responsavel;
import br.edu.ifpr.atividadepraticaescola.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadePraticaEscolaApplication {

	@Autowired
	private AlunoRep alunoRep;

	@Autowired
	private ContatoRep contatoRep;

	@Autowired
	private CursoRep cursoRep;

	@Autowired
	private DisciplinaRep disciplinaRep;

	@Autowired
	private ProfessorRep professorRep;

	@Autowired
	private ResponsavelRep responsavelRep;

	@Autowired
	private TurmaRep turmaRep;

	@Autowired
	private UsuarioRep usuarioRep;

	public static void main(String[] args) {
		SpringApplication.run(AtividadePraticaEscolaApplication.class, args);
	}

}
