package com.teaching.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PersonData {

    @NotBlank(message = "поле не может быть пустым")
    private String name;

    @NotNull(message = "поле не может быть пустым")
    private Integer age;

}
