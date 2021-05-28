package com.meli.bootcampactivities.diploma.data;

import com.meli.bootcampactivities.diploma.entity.Diploma;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
public class DiplomaDto {
    private String aluno;
    private ArrayList<Diploma> diploma;
}
