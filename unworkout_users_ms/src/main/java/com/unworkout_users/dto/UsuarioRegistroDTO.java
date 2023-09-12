package com.unworkout_users.dto;

import java.time.LocalDate;

public class UsuarioRegistroDTO {
	private Long id_user;
	private String nombres;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	private String sexo;
	private int cel;
	private String email;

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
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

	public UsuarioRegistroDTO(Long id_user, String nombres, String apellidos, LocalDate fecha_nacimiento, String sexo,
			int cel, String email) {
		super();
		this.id_user = id_user;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.cel = cel;
		this.email = email;
	}

	public UsuarioRegistroDTO(String nombres, String apellidos, LocalDate fecha_nacimiento, String sexo, int cel,
			String email) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.cel = cel;
		this.email = email;
	}

	public UsuarioRegistroDTO(String email) {
		super();
		this.email = email;
	}

	public UsuarioRegistroDTO() {
		super();
	}
}
