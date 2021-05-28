package com.meli.bootcampactivities.data;

import com.meli.bootcampactivities.entity.Diploma;
import lombok.Data;
import java.util.ArrayList;

@Data
public class DiplomaDto {
    private String aluno;
    private ArrayList<Diploma> diploma;

    public DiplomaDto() {
        this.diploma = new ArrayList<Diploma>();
    }
}
