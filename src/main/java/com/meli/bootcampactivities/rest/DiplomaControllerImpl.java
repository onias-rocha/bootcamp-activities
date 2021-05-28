package com.meli.bootcampactivities.rest;

import com.meli.bootcampactivities.data.DiplomaDto;
import com.meli.bootcampactivities.entity.Aluno;
import com.meli.bootcampactivities.service.DiplomaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DiplomaControllerImpl implements DiplomaController {

    DiplomaService service;

    public DiplomaControllerImpl(DiplomaService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String testaApi(){
        return "Chegou na API";
    }

    @PostMapping("/diploma")
    @Override
    public DiplomaDto generateDiploma(@RequestBody Aluno aluno) {
        return service.generateDiploma(aluno);
    }
}
