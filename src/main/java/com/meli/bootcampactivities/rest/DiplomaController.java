package com.meli.bootcampactivities.rest;

import com.meli.bootcampactivities.data.DiplomaDto;
import com.meli.bootcampactivities.entity.Aluno;
import com.meli.bootcampactivities.service.DiplomaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DiplomaController {

    DiplomaService service;

    public DiplomaController(DiplomaService service) {
        this.service = service;
    }

    @PostMapping("/diploma")
    public DiplomaDto generateCertificate(@RequestBody Aluno aluno){
        return service.generateDiploma(aluno);
    }

    @GetMapping("/")
    public String testaApi(){
        return "Chegou na API";
    }
}
