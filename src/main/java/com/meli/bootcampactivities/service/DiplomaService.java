package com.meli.bootcampactivities.service;

import com.meli.bootcampactivities.data.DiplomaDto;
import com.meli.bootcampactivities.entity.Aluno;

public interface DiplomaService {
    public DiplomaDto generateDiploma(Aluno aluno);
}
