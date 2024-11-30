package br.edu.ifpr.atividadepraticaescola.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private String nome;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Turma> turmas;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Curso> cursos;

}
