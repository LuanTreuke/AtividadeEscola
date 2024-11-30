package br.edu.ifpr.atividadepraticaescola.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private String nome;

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas = new ArrayList<Turma>();

}
