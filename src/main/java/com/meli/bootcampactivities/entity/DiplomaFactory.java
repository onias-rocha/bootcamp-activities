package com.meli.bootcampactivities.entity;

import com.meli.bootcampactivities.data.DiplomaDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DiplomaFactory {
    public String mensagem;
    public Double media;
    public String aluno;


    public void scoreProcessor(Aluno aluno){
        List<Double> notas = null;
        Double total = null;

        for (Double nota : notas){
            total+=nota;
        }

        this.media = total/notas.size();
        this.mensagem = this.media >=9.0 ? "Parabens" : "Nao fez mais que a obrigacao";
    }

    public DiplomaDto generateDiploma(Aluno aluno){
        scoreProcessor(aluno);
        DiplomaDto dto = new DiplomaDto();
        Diploma d1 = new Diploma();
        ArrayList<Diploma> diplomas = new ArrayList<>();

        dto.setAluno(this.aluno);
        d1.setMensagem(this.mensagem);
        d1.setMedia(this.media);
        diplomas.add(d1);
        dto.setDiploma(diplomas);
        return dto;
    }

}
