package com.cenfotec.universidad.ejb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cursoId;
	private String nombre;
	private String carrera;	
	private List<EstudianteXCurso> estudiantesXCurso;
		
	public Curso(){
		super();	
	}
	
	public Curso(int pcursoId, String pnombre, String pcarrera, List<EstudianteXCurso> pestudiantes) {
		this.cursoId = pcursoId;
		this.nombre = pnombre;
		this.carrera = pcarrera;
		this.estudiantesXCurso = pestudiantes;
	}

	public int getCursoId() {
		return cursoId;
	}

	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
	}	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public List<EstudianteXCurso> getEstudiantesXCurso() {
		return this.estudiantesXCurso;
	}	
	
	public void setEstudiantesXCurso(List<EstudianteXCurso> pestudiantes){
		this.estudiantesXCurso = pestudiantes;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
