package com.meli.bootcampactivities.diploma.rest;

import com.meli.bootcampactivities.diploma.data.DiplomaDto;
import com.meli.bootcampactivities.diploma.entity.Aluno;

public interface DiplomaController {
    public DiplomaDto generateDiploma(Aluno aluno);
}
