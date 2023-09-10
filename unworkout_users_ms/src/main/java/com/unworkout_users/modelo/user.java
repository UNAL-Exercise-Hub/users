package com.unworkout_users.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombres")
	private String nombres;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "fecha_nacimiento")
	private LocalDate fecha_nacimiento;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "cel")
	private int cel;

	@Column(name = "email")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public user(Long id, String nombres, String apellidos, LocalDate fecha_nacimiento, String sexo, int cel,
			String email) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.cel = cel;
		this.email = email;
	}

	public user(String nombres, String apellidos, LocalDate fecha_nacimiento, String sexo, int cel, String email) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.cel = cel;
		this.email = email;
	}

	public user() {
		super();
	}
	
	

}