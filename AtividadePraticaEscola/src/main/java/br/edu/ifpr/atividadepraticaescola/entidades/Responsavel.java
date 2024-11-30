package br.edu.ifpr.atividadepraticaescola.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Responsavel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private String nome;

    private String endereco;

    @ManyToMany(mappedBy = "responsaveis")
    private List<Aluno> alunos;

}
