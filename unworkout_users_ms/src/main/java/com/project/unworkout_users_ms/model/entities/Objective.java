package com.project.unworkout_users_ms.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "objective")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Objective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    private LocalDate fecha_objetivo;
    private String objetivo;
    private int nivel;
}
