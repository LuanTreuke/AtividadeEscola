package br.edu.ifpr.atividadepraticaescola.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private String nome;

    private LocalDate nascimento;

    private String endereco;

    private String numero_matricula;

    private String cpf;

    @OneToMany(mappedBy = "aluno")
    private List<Contato> contatos = new ArrayList<Contato>();

    @ManyToMany
    @JoinTable(
            name = "aluno_turma",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "turma_id")
    )
    private List<Turma> turmas;

    @ManyToMany
    @JoinTable(
            name = "aluno_responsavel",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "responsavel_id")
    )
    private List<Responsavel> responsaveis;

    @OneToOne(mappedBy = "aluno")
    private Usuario usuario;

}
