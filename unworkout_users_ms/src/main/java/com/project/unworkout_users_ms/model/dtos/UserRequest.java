package com.project.unworkout_users_ms.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    private String nombres;
    private String apellidos;
    private LocalDate fecha_nacimiento;
    private String sexo;
    private Long cel;
    private String email;
}
