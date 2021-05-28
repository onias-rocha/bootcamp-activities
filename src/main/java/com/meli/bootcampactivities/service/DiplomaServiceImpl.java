package com.meli.bootcampactivities.service;

import com.meli.bootcampactivities.data.DiplomaDto;
import com.meli.bootcampactivities.entity.Aluno;
import com.meli.bootcampactivities.entity.Diploma;
import com.meli.bootcampactivities.entity.Disciplina;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DiplomaServiceImpl implements DiplomaService{

    DiplomaDto dto;

    public DiplomaServiceImpl(DiplomaDto dto) {
        this.dto = dto;
    }

    @Override
    public DiplomaDto generateDiploma(Aluno a1) {

        dto.setAluno(a1.getNome());

        for(Disciplina d1 : a1.getDisciplina()){
            Diploma diploma = new Diploma();
            String mensagem = null;
            Double soma = 0.0;
            Double media;

            for (Double nota : d1.getNotas()){
                soma += nota;
            }

            media = soma/d1.getNotas().size();

            mensagem = media >= 9.0 ? "Parabens " + a1.getNome() : "Nao fez mais que a obrigacao";

            diploma.setMensagem(mensagem);
            diploma.setMedia(media);
            diploma.setDisciplina(d1.getNome());
            ArrayList<Diploma> diplomas = dto.getDiploma();
            diplomas.add(diploma);
            dto.setDiploma(diplomas);
        }

        return dto;
    }

}
