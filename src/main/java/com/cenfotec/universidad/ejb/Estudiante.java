package com.cenfotec.universidad.ejb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;

@Entity
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int estudianteId;
	private String nombre;
	private String email;
	private String telefono;	
	private List<EstudianteXCurso> estudiantesXCurso;
		
		public Estudiante() {
		super();
	}
	
	public Estudiante(int pid, String pnombre, String pemail, String ptelefono, List<EstudianteXCurso> pestudiantes) {
		this.estudianteId = pid;
		this.nombre = pnombre;
		this.email = pemail;
		this.telefono = ptelefono;
		this.estudiantesXCurso = pestudiantes;
	}
	
	public int getEstudianteId() {
		return estudianteId;
	}

	public void setEstudianteId(int estudianteId) {
		this.estudianteId = estudianteId;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estudiante")
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
