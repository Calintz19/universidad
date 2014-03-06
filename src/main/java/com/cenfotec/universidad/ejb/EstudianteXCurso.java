package com.cenfotec.universidad.ejb;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.service.jta.platform.internal.OC4JJtaPlatform;

@Entity
@Table(name = "estudiantes_x_curso", catalog = "universidad")
public class EstudianteXCurso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EstudianteXCursoId;
	private String profesor;
	private String fecha;	
	private Estudiante estudiante;
	private Curso curso;
		
	public EstudianteXCurso(){
	}
	
	public EstudianteXCurso(String pProfesor, String pFecha, Estudiante pEstudiante, Curso pCurso){
		this.profesor = pProfesor;
		this.fecha = pFecha;
		this.estudiante = pEstudiante;
		this.curso = pCurso;
	}
	
	public int getEstudianteXCursoId(){
		return this.EstudianteXCursoId;
	}
	
	public void setEstudianteXCursoId(int pid){
		this.EstudianteXCursoId = pid;
	}
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdEstudiante", nullable = false)
	public Estudiante getEstudiante() {
		return this.estudiante;
	}
	
	public void setEstudiante(Estudiante pEstudiante){
		this.estudiante = pEstudiante;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCurso", nullable = false)
	public Curso getCurso() {
		return this.curso;
	}
	
	public void setCurso(Curso pCurso){
		this.curso = pCurso;
	}
	
	public String getProfesor(){
		return this.profesor;
	}
	
	public void setProfesor(String pProfesor){
		this.profesor = pProfesor;
	}
	
	public String getFecha(){
		return this.fecha;
	}
	
	public void setFecha(String pFecha){
		this.fecha = pFecha;
	}
}
