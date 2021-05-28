package com.meli.bootcampactivities.diploma.entity;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Disciplina  {
    private String nome;
    private ArrayList<Double> notas;

    public Disciplina(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public Disciplina() {
    }
}
