package com.meli.bootcampactivities.diploma.service;

import com.meli.bootcampactivities.diploma.data.DiplomaDto;
import com.meli.bootcampactivities.diploma.entity.Aluno;

public interface DiplomaService {
    public DiplomaDto generateDiploma(Aluno aluno);
}
