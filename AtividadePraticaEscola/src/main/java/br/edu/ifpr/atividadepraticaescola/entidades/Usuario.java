package br.edu.ifpr.atividadepraticaescola.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private String usuario;

    private String senha;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

}
