package com.meli.bootcampactivities.entity;

import lombok.Data;
import java.util.ArrayList;

@Data
public class Aluno {
    private String nome;
    private ArrayList<Disciplina> disciplina;

    public Aluno() {
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
