package com.meli.bootcampactivities.data;

import com.meli.bootcampactivities.entity.Diploma;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
public class DiplomaDto {
    private String aluno;
    private ArrayList<Diploma> diploma;
}
