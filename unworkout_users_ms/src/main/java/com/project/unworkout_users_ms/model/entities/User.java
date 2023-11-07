package com.project.unworkout_users_ms.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    private String nombres;
    private String apellidos;
    private String documento;
    private LocalDate fecha_nacimiento;
    private String sexo;
    private Long cel;
    private String email;
/*
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Objetivo> objetivos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Medidas> medidas;

 */
    @Override
    public String toString() {
        return "Usuario{" +
                "id =" + id_usuario +
                ", nombres ='" + nombres + '\'' +
                ", apellidos ='" + apellidos + '\''
                + '}';
    }
}
