package com.project.unworkout_users_ms.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "measure")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Measure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;


    private LocalDate fecha_medidas;
    private int peso;
    private int altura;
    private int grasa_corporal;
    private int cuello;
    private int hombro;
    private int pecho;
    private int biceps_der;
    private int biceps_izq;
    private int antebrazo_der;
    private int antebrazo_izq;
    private int cintura;
    private int caderas;
    private int muslo_der;
    private int muslo_izq;
    private int gemelo_der;
    private int gemelo_izq;
}
