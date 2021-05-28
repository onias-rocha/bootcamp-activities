package com.meli.bootcampactivities.diploma.rest;

import com.meli.bootcampactivities.diploma.data.DiplomaDto;
import com.meli.bootcampactivities.diploma.entity.Aluno;
import com.meli.bootcampactivities.diploma.service.DiplomaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diploma")
public class DiplomaControllerImpl implements DiplomaController {

    DiplomaService service;

    public DiplomaControllerImpl(DiplomaService service) {
        this.service = service;
    }

    @GetMapping()
    public String testaApi(){
        return "Chegou na API";
    }

    @PostMapping()
    @Override
    public DiplomaDto generateDiploma(@RequestBody Aluno aluno) {
        return service.generateDiploma(aluno);
    }
}
