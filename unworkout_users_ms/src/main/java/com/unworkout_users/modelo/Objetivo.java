package com.unworkout_users.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "objetivo")
public class Objetivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private Usuario usuario;

	@Column(name = "fecha_objetivo")
	private LocalDate fecha_objetivo;

	@Column(name = "objetivo")
	private String objetivo;

	@Column(name = "nivel")
	private int nivel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUser() {
		return usuario;
	}

	public void setUser(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getFecha_objetivo() {
		return fecha_objetivo;
	}

	public void setFecha_objetivo(LocalDate fecha_objetivo) {
		this.fecha_objetivo = fecha_objetivo;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Objetivo(Long id, Usuario usuario, LocalDate fecha_objetivo, String objetivo, int nivel) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fecha_objetivo = fecha_objetivo;
		this.objetivo = objetivo;
		this.nivel = nivel;
	}

	public Objetivo() {
		super();
	}

	

}
