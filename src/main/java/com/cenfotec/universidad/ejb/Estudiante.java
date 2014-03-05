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
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estudianteId;
	@Transient
	private String nombre;
	private String email;
	private String telefono;
	
	//Relaciones
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="fk_cursoId")
	//private Set<JoinedStudentCourse> joined = new HashSet<JoinedStudentCourse>();
		
	//@CollectionOfElements
    //@JoinTable(
        //table=@Table(name="STUDENT_COURSE"),
        //joinColumns=@JoinColumn(name="STUDENT_ID")
    //)
 
	
	public Estudiante() {
		super();
	}
	
	public int getEstudianteId() {
		return estudianteId;
	}

	public void setEstudianteId(int estudianteId) {
		this.estudianteId = estudianteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
