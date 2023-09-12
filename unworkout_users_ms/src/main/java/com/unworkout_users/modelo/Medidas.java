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
@Table(name = "Medidas")
public class Medidas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user") 
    private Usuario usuario;


	@Column(name = "fecha_medidas")
	private LocalDate fecha_medidas;

	@Column(name = "peso")
	private int peso;

	@Column(name = "altura")
	private int altura;

	@Column(name = "grasa_corporal")
	private int grasa_corporal;

	@Column(name = "cuello")
	private int cuello;

	@Column(name = "hombro")
	private int hombro;

	@Column(name = "pecho")
	private int pecho;

	@Column(name = "biceps_der")
	private int biceps_der;

	@Column(name = "biceps_izq")
	private int biceps_izq;

	@Column(name = "antebrazo_der")
	private int antebrazo_der;

	@Column(name = "antebrazo_izq")
	private int antebrazo_izq;

	@Column(name = "cintura")
	private int cintura;

	@Column(name = "caderas")
	private int caderas;

	@Column(name = "muslo_der")
	private int muslo_der;

	@Column(name = "muslo_izq")
	private int muslo_izq;

	@Column(name = "gemelo_der")
	private int gemelo_der;

	@Column(name = "gemelo_izq")
	private int gemelo_izq;

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

	public LocalDate getFecha_medidas() {
		return fecha_medidas;
	}

	public void setFecha_medidas(LocalDate fecha_medidas) {
		this.fecha_medidas = fecha_medidas;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getGrasa_corporal() {
		return grasa_corporal;
	}

	public void setGrasa_corporal(int grasa_corporal) {
		this.grasa_corporal = grasa_corporal;
	}

	public int getCuello() {
		return cuello;
	}

	public void setCuello(int cuello) {
		this.cuello = cuello;
	}

	public int getHombro() {
		return hombro;
	}

	public void setHombro(int hombro) {
		this.hombro = hombro;
	}

	public int getPecho() {
		return pecho;
	}

	public void setPecho(int pecho) {
		this.pecho = pecho;
	}

	public int getBiceps_der() {
		return biceps_der;
	}

	public void setBiceps_der(int biceps_der) {
		this.biceps_der = biceps_der;
	}

	public int getBiceps_izq() {
		return biceps_izq;
	}

	public void setBiceps_izq(int biceps_izq) {
		this.biceps_izq = biceps_izq;
	}

	public int getAntebrazo_der() {
		return antebrazo_der;
	}

	public void setAntebrazo_der(int antebrazo_der) {
		this.antebrazo_der = antebrazo_der;
	}

	public int getAntebrazo_izq() {
		return antebrazo_izq;
	}

	public void setAntebrazo_izq(int antebrazo_izq) {
		this.antebrazo_izq = antebrazo_izq;
	}

	public int getCintura() {
		return cintura;
	}

	public void setCintura(int cintura) {
		this.cintura = cintura;
	}

	public int getCaderas() {
		return caderas;
	}

	public void setCaderas(int caderas) {
		this.caderas = caderas;
	}

	public int getMuslo_der() {
		return muslo_der;
	}

	public void setMuslo_der(int muslo_der) {
		this.muslo_der = muslo_der;
	}

	public int getMuslo_izq() {
		return muslo_izq;
	}

	public void setMuslo_izq(int muslo_izq) {
		this.muslo_izq = muslo_izq;
	}

	public int getGemelo_der() {
		return gemelo_der;
	}

	public void setGemelo_der(int gemelo_der) {
		this.gemelo_der = gemelo_der;
	}

	public int getGemelo_izq() {
		return gemelo_izq;
	}

	public void setGemelo_izq(int gemelo_izq) {
		this.gemelo_izq = gemelo_izq;
	}

	public Medidas(Long id, Usuario usuario, LocalDate fecha_medidas, int peso, int altura, int grasa_corporal, int cuello,
			int hombro, int pecho, int biceps_der, int biceps_izq, int antebrazo_der, int antebrazo_izq, int cintura,
			int caderas, int muslo_der, int muslo_izq, int gemelo_der, int gemelo_izq) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fecha_medidas = fecha_medidas;
		this.peso = peso;
		this.altura = altura;
		this.grasa_corporal = grasa_corporal;
		this.cuello = cuello;
		this.hombro = hombro;
		this.pecho = pecho;
		this.biceps_der = biceps_der;
		this.biceps_izq = biceps_izq;
		this.antebrazo_der = antebrazo_der;
		this.antebrazo_izq = antebrazo_izq;
		this.cintura = cintura;
		this.caderas = caderas;
		this.muslo_der = muslo_der;
		this.muslo_izq = muslo_izq;
		this.gemelo_der = gemelo_der;
		this.gemelo_izq = gemelo_izq;
	}

	public Medidas() {
		super();
	}

	

}
