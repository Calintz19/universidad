package com.cenfotec.universidad.ejb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Curso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cursoId;
	@Transient
	private String nombre;
	private String carrera;
	
	private List<Estudiante> estudiantes;
	
	@CollectionOfElements
    @JoinTable(
        table=@Table(name="STUDENT_COURSE"),
        joinColumns=@JoinColumn(name="COURSE_ID")
    )
    private Set<JoinedStudentCourse> joined = new HashSet<JoinedStudentCourse>();
			
	public Curso() {
		super();
	}

	public int getCursoId() {
		return cursoId;
	}

	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
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
