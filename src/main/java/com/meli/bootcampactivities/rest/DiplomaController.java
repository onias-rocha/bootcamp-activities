package com.meli.bootcampactivities.rest;

import com.meli.bootcampactivities.data.DiplomaDto;
import com.meli.bootcampactivities.entity.Aluno;

public interface DiplomaController {
    public DiplomaDto generateDiploma(Aluno aluno);
}
