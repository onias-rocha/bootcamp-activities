package com.meli.bootcampactivities.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Diploma {
    private String mensagem;
    private Double media;
    private String disciplina;
}
